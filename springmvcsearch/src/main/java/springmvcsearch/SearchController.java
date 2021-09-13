package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController{
	
	@RequestMapping("/user/{userId}/{userName}")
	public String handleForm(@PathVariable("userId") int userId,@PathVariable("userName") String userName
	) {
		
		System.out.println(userId+""+userName);
		return "home";
	}
	
	
	
@RequestMapping("/home")
	public String home() {
	System.out.println("going to home views....");
		return"home";
	}
@RequestMapping("/search")
public RedirectView search(@RequestParam("querybox") String query) {
	String url="http://www.google.com/search?q="+query;
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl(url);
	return redirectView;
	
}
}
