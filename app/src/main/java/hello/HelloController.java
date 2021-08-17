package hello;

import java.time.Month;
import java.time.YearMonth;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public int index() {
         
    	 YearMonth currentYearMonth = YearMonth.now();
    	  

        return currentYearMonth;
    }   
}
