package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("this is show controller");
		return "complex";
	}

@RequestMapping(path="/handleform" ,method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("userfom") UserForm userForm,Model model,BindingResult result) {
		
		model.addAttribute("user", userForm);
		if(result.hasErrors()) {
			return "complex";
		}
		System.out.println("this is form handler"+userForm);
		return "success";
		
	}
	

}







/*
 * public String formHandler(@RequestParam("fName") String
 * fname,@RequestParam("lName") String lname,@RequestParam("address") String
 * adaress,@RequestParam("email") String email,@RequestParam("password")String
 * password,
 * 
 * @RequestParam("mobile") String mobile,@RequestParam("date") Date
 * birthdaytime,@RequestParam("gender")String gender , Model model) { UserForm
 * form=new UserForm(); form.setfName(fname); form.setlName(lname);
 * form.setEmail(email); form.setPassword(password); form.setAddress(gender);
 * form.setDate(birthdaytime); form.setMobile(mobile); form.setAddress(adaress);
 * model.addAttribute("form", form);
 */