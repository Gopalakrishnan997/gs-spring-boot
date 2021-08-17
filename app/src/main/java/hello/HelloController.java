package hello;

import java.time.Month;
import java.time.YearMonth;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
         
    	 YearMonth currentYearMonth = YearMonth.now();
    	    System.out.printf("Days in month year %s: No of days: %s \n",
    	        currentYearMonth, currentYearMonth.lengthOfMonth());
    	    YearMonth creditCardExpiry = YearMonth.of(2078, Month.FEBRUARY);
    	    System.out.printf("Your credit card expires on %s: No of days: %s \n",
    	        creditCardExpiry, creditCardExpiry.lengthOfMonth());


        return currentYearMonth.lengthOfMonth();
    }   
}
