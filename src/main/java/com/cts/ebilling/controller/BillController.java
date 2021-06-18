package com.cts.ebilling.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ebilling.model.Bill;
import com.cts.ebilling.model.Consumer;
//import com.cts.ebilling.model.Consumer;
import com.cts.ebilling.service.BillService;

@Controller
@ComponentScan
public class BillController {

	@Autowired
	BillService billService;
/*
	@GetMapping("/home")
    public String viewHomePage(Model model) {
        List<Bill> listbill = billService.listAll();
        model.addAttribute("listconsumer", listbill);
        System.out.print("Get / ");	
        return "home";
    }
	*/
	@GetMapping("/GenerateBill")
	    public String add(Model model) {
	        model.addAttribute("bill", new Bill());
	        return "GenerateBill";
	    }
	@RequestMapping(value="/generateBill", method=RequestMethod.POST)
	public ModelAndView generateBill(@Valid Bill bill, BindingResult bindingResult, ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		// Check for the validations
		if(bindingResult.hasErrors()) {
			modelAndView.addObject("successMessage", "Please give correct reading");
			modelMap.addAttribute("bindingResult", bindingResult);
		}
		else if(BillService.isBillAlreadyPresent(bill)){
			modelAndView.addObject("successMessage", "bill already exists!");			
		}
		// we will save the user if, no binding errors
		else {
			billService.generateBill(bill);
			modelAndView.addObject("successMessage", "bill is generated successfully!");
		}
		modelAndView.addObject("bill", new Bill());
		modelAndView.setViewName("generate");
		return modelAndView;
	}
}
