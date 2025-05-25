package com.unbroken.unitConverter.controllers;

import com.unbroken.unitConverter.forms.LengthForm;
import com.unbroken.unitConverter.utilities.LengthEnum;
import com.unbroken.unitConverter.services.LengthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/length")
public class LengthControler {
    
    @Autowired
    private LengthService service;
    
    @ModelAttribute("magnitudes")
    public LengthEnum[] populateMagnitudes(){
        return LengthEnum.values();
    }
    
    @GetMapping
    public String getForm(HttpServletRequest request, Model model){
        model.addAttribute("type", "length");
        model.addAttribute("request", request);
        model.addAttribute("form", new LengthForm());
        return "main";
    }
    
    @PostMapping
    public String submitForm(HttpServletRequest request, 
            @ModelAttribute LengthForm form,
            Model model){
        model.addAttribute("form", form);
        model.addAttribute("request", request);
        model.addAttribute("result", service.convert(form));
        return "main";
    }
}
