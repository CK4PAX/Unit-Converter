package com.unbroken.unitConverter.controllers;

import com.unbroken.unitConverter.utilities.MassEnum;
import com.unbroken.unitConverter.forms.MassForm;
import com.unbroken.unitConverter.services.MassService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mass")
public class MassController {
    
    @Autowired
    private MassService service;
    
    @ModelAttribute("magnitudes")
    public MassEnum[] populateMagnitudes(){
        return MassEnum.values();
    }
    
    @GetMapping
    public String getForm(HttpServletRequest request, Model model){
        model.addAttribute("type", "mass");
        model.addAttribute("form",new MassForm());
        model.addAttribute("request", request);
        return "main";
    }
    
    @PostMapping
    public String submitForm(HttpServletRequest request,
        @ModelAttribute MassForm form, Model model){
        model.addAttribute("form", form);
        model.addAttribute("request", request);
        model.addAttribute("result",service.converter(form));
        return "main";
    }
    
}
