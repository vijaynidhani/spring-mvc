package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	
   @RequestMapping("/welcome")
   public String main() {
	   return "main";
   }
}
