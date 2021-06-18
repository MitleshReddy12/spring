
package com.cts.ebilling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ebilling.model.Consumer;
import com.cts.ebilling.service.ConsumerService;

@Controller
public class ConsumerController {
	
	 @Autowired
	    private ConsumerService service;

	    @GetMapping("/ind")
	    public String viewHomePage(Model model) {
	        List<Consumer> listconsumer = service.listAll();
	        model.addAttribute("listconsumer", listconsumer);
	        System.out.print("Get / ");	
	        return "ind";
	    }

	    @GetMapping("/addnewconsumers")
	    public String add(Model model) {
	        model.addAttribute("consumer", new Consumer());
	        return "addnewconsumers";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveConsumer(@ModelAttribute("consumer") Consumer con) {
	        service.save(con);
	        return "redirect:/ind";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditConsumerPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("addnewconsumers");
	        Consumer con = service.get(id);
	        mav.addObject("consumer", con);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteconsumer(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/ind";
	    }
	  
	    
}
