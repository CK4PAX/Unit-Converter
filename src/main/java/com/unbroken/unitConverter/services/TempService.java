package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.TempForm;
import com.unbroken.unitConverter.utilities.TempEnum;
import org.springframework.stereotype.Service;

@Service
public class TempService {
    public double convert(TempForm form){
        double value = Double.valueOf(form.getValue());
        TempEnum from = form.getFrom();
        TempEnum to = form.getTo();
        return ((value - from.getFusion()) / 
                from.getGrades() * to.getGrades()) + to.getFusion();
    }
}
