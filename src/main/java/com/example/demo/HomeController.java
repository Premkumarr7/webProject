package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("home")
//	@ResponseBody
	public ModelAndView home(Aliean aliean) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",aliean);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	@RequestMapping("add")
	public String add(@ModelAttribute Aliean a) {

		return "result";
	}
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliens");
//		return "result";
	}

}
