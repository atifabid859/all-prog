package springmvc.controller;




import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class ReController {

	@RequestMapping("/one")
//	public String one() {
//		System.out.println("this is one call");
//		return "redirect:welcome";
//	}
//	public RedirectView one() {
//		System.out.println("this is a handler");
//		RedirectView redirectView=new RedirectView();
//		redirectView.setUrl("welcome");
//		return redirectView;
		
	//}
	public String one(HttpServletResponse response) throws IOException
	
	{
		response.sendRedirect("");
		return null;
		
	}
	@RequestMapping("/welcome")
	public String tow() {
		System.out.println("this is tow ");
		return "contact";
	}
}
