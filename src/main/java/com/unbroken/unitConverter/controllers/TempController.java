package com.unbroken.unitConverter.controllers;

import com.unbroken.unitConverter.forms.TempForm;
import com.unbroken.unitConverter.services.TempService;
import com.unbroken.unitConverter.utilities.TempEnum;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/temp")
public class TempController {
    
    @Autowired
    private TempService service;
    
    @ModelAttribute("magnitudes")
    public TempEnum[] populateMagnitudes(){
        return TempEnum.values();
    }
    
    @GetMapping
    public String getForm(HttpServletRequest request, Model model){
        model.addAttribute("type", "temperature");
        model.addAttribute("request", request);
        model.addAttribute("form", new TempForm());
        return "main";
    }
    
    @PostMapping
    public String submitForm(HttpServletRequest request, 
            @ModelAttribute TempForm form,
            Model model){
        model.addAttribute("form", form);
        model.addAttribute("request", request);
        model.addAttribute("result", service.convert(form));
        return "main";
    }
    
}
