package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {

		m.addAttribute("Header", "Student Register Form");
		m.addAttribute("Desc", "Form submited");
	}

	@RequestMapping("/contact")
	public String shoeForm() {

		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if (user.getUname().isBlank()) {

			return "redirect:/contect";
		}

		this.userService.createUser(user);

		return "succes";
	}

}

/*
 * }
 * 
 * @RequestMapping(path ="/processForm",method = RequestMethod.POST) public
 * String handlerForm(@RequestParam("uname")String userName,
 * 
 * @RequestParam("email")String userEmail ,@RequestParam("password")String
 * userPassword, Model model) {
 * 
 * 
 * User user=new User();
 * 
 * user.setUname(userName); user.setEmail(userEmail);
 * user.setPassword(userPassword);
 * 
 * System.out.println(user);
 * 
 * 
 * 
 * //System.out.println("user name"+userName);
 * //System.out.println("user email"+userEmail);
 * //System.out.println("user password"+userPassword); //
 * //model.addAttribute("uname",userName);
 * //model.addAttribute("email",userEmail);
 * //model.addAttribute("password",userPassword); model.addAttribute("user",
 * user);
 * 
 * return "succes"; }
 * 
 * }
 * 
 */
