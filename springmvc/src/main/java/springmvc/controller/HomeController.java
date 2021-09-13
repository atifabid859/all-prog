package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {//sending the data controller to view
@RequestMapping("/home")
	public String home( Model model) {//(Model)addAttribute(String key Object Value)
	model.addAttribute("name", "Atif Abid");
	model.addAttribute("Id", 101);
	List<String> friends=new ArrayList<String>();
	friends.add("sakib");
	friends.add("Aamir");
	friends.add("mohammmad");
	model.addAttribute("f", friends);
	
		System.out.println("this is home url");
		return "index";
	}
@RequestMapping("/help")
public ModelAndView help() {
	System.out.println("This is Help Controller");
	//create model and view object
	ModelAndView modelAndView=new ModelAndView();
	//setting the data
modelAndView.addObject("name", "Ehtesham");
modelAndView.addObject("roolNumber", 2345);
modelAndView.addObject("City", "Lucknow");
LocalDateTime nowDateTime=LocalDateTime.now();
modelAndView.addObject("time", nowDateTime);


//marks
List<Integer> list=new ArrayList<Integer>();
list.add(78);
list.add(90);
list.add(80);
list.add(70);
list.add(50);
modelAndView.addObject("marks", list);
//setting the name view
modelAndView.setViewName("help");

return modelAndView;

}
}
