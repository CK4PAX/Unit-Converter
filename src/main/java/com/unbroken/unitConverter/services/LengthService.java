package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.LengthForm;
import com.unbroken.unitConverter.utilities.Utilities;
import java.nio.file.Path;
import org.springframework.stereotype.Service;

@Service
public class LengthService {
    
    Path uri = Path.of("src/main/resources/data/lengthConverterTable.csv");
    String[][] table = Utilities.getTable(Utilities.readLines(uri));
    
    public double convert(LengthForm form){
        double factor = Double.valueOf(
                table[form.getTo().ordinal()][form.getFrom().ordinal()]);
        double value = Double.valueOf(form.getValue());
        return factor * value;
    }
}
