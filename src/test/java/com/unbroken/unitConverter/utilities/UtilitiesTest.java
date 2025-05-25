package com.unbroken.unitConverter.utilities;

import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {
    
    Path uri = Path.of("src/main/resources/data/lengthConverterTable.csv");

    public UtilitiesTest() {
    }

    @Test
    public void testReadLines() {
        assertNotNull(Utilities.readLines(uri));
    }
    
    @Test
    public void testGetTable(){
        List<String> rows = Utilities.readLines(uri);
        String first = Utilities.getTable(rows)[0][0];
        assertEquals("1.0", first);
    }
    
}
