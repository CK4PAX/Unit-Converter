package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.TempForm;
import com.unbroken.unitConverter.utilities.TempEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TempServiceTest {
    
    private TempService service = new TempService();
    private TempForm form = Mockito.mock(TempForm.class);
            
    public TempServiceTest() {
    }

    @Test
    public void testConvertMethod() {
        Mockito.when(form.getValue()).thenReturn((double)100);
        Mockito.when(form.getFrom()).thenReturn(TempEnum.CELSIUS);
        Mockito.when(form.getTo()).thenReturn(TempEnum.FAHRENHEIT);
        
        double result = service.convert(form);
        
        Assertions.assertEquals(212, result);
    }
    
}
