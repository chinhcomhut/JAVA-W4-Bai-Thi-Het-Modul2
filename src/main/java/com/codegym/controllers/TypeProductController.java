package com.codegym.controllers;

import com.codegym.model.TypeProduct;
import com.codegym.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TypeProductController {

    @Autowired
    private TypeProductService typeProductService;

    @GetMapping(value = "/create-type")
    public ModelAndView showCreateTypeProductForm(){
        ModelAndView modelAndView = new ModelAndView("type-product/create");
        modelAndView.addObject("typeProduct", new TypeProduct());
        return modelAndView;
    }

    @PostMapping(value = "/create-type")
    public String createTypeProduct(@Validated @ModelAttribute TypeProduct typeProduct, RedirectAttributes redirect) {
        typeProductService.save(typeProduct);
        redirect.addFlashAttribute("message", "Create New Type Product Successfully");
        return "redirect:/create-type";
    }
}
