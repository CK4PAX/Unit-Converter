package com.unbroken.unitConverter.services;

import com.unbroken.unitConverter.forms.MassForm;
import com.unbroken.unitConverter.utilities.Utilities;
import java.nio.file.Path;
import org.springframework.stereotype.Service;

@Service
public class MassService {
    Path uri = Path.of("src/main/resources/data/massConverterTable.csv");
    private final String[][] table = Utilities.getTable(Utilities.readLines(uri));
    
    public double converter(MassForm form){
        double factor = Double.valueOf(
                table[form.getFrom().ordinal()][form.getTo().ordinal()]);
        double value = Double.valueOf(form.getValue());
        return factor * value;
    }
}
