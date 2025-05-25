/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.LengthForm;
import com.unbroken.unitConverter.utilities.LengthEnum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class LengthServiceTest {
    
    private LengthForm form = Mockito.mock(LengthForm.class);
    
    private LengthService service = new LengthService();
    
    @Test
    public void testConvertMethod() {
        Mockito.when(form.getValue()).thenReturn((double)20);
        Mockito.when(form.getFrom()).thenReturn(LengthEnum.METROS);
        Mockito.when(form.getTo()).thenReturn(LengthEnum.MILIMETROS); //metros a mm
        
        
        double result = service.convert(form);
        
        assertEquals((double)20000, result);
    }

    
}
