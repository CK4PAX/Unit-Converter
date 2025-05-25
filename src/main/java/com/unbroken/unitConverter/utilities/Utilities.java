package com.unbroken.unitConverter.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilities {
    
    public static List<String> readLines(Path uri){
        List<String> rows = null;
        try {
            rows = Files.readAllLines(uri);
        } catch (IOException ex) {
            Logger.getLogger(Utilities.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return rows;
    }
    
    public static String[][] getTable(List<String> rows){
        String[][] table = new String[rows.size()][];
        
        for (int i = 0; i < rows.size(); i++) {
            table[i] = rows.get(i).split(",");
        }
        return table;
    }
}