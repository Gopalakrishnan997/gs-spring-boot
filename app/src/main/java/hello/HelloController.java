package hello;

import java.time.Month;
import java.time.YearMonth;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
public  String CreditCardDetails() {

   	 YearMonth currentYearMonth = YearMonth.now();
   	   
   	   
   	    YearMonth creditCardExpiry = YearMonth.of(2078, Month.FEBRUARY);
   	    
   	 String monthyear = "Days in month year:    "+ currentYearMonth;
   	 String noofdays = "No of days:   "+currentYearMonth.lengthOfMonth();
   	 String cardexpires = "Your credit card expires on:    "+ creditCardExpiry;
   	 String expiresdays = "No of days:    "+creditCardExpiry.lengthOfMonth();
   	   return monthyear+noofdays+cardexpires+expiresdays;
	}  
}
