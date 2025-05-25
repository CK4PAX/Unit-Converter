package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.MassForm;
import com.unbroken.unitConverter.utilities.MassEnum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class MassServiceTest {
    
    private MassForm form = Mockito.mock(MassForm.class);
    private MassService service = new MassService();
    
    public MassServiceTest() {
    }

    @Test
    public void testConvertMethod() {
        Mockito.when(form.getValue()).thenReturn((double)1);
        Mockito.when(form.getFrom()).thenReturn(MassEnum.KILOGRAMO);
        Mockito.when(form.getTo()).thenReturn(MassEnum.GRAMO);
        
        double result = service.converter(form);
        
        assertEquals(1000, result);
        
        
    }
    
}
