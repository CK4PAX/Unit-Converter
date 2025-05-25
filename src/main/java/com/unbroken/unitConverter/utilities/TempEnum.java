package com.unbroken.unitConverter.utilities;

public enum TempEnum {
    CELSIUS("C",100, 0, 100),
    FAHRENHEIT("F",180,32,212),
    KELVIN("K",100,273.15,373.15),
    RANKINE("Ra",180,491.67,671.67);
    
    private final String abbreviation;
    private final int grades;
    private final double fusion;
    private final double melting;

    private TempEnum(String abbreviation,
            int grades, double fusion, double melting) {
        this.abbreviation = abbreviation;
        this.grades = grades;
        this.fusion = fusion;
        this.melting = melting;
    }

    public int getGrades() {
        return grades;
    }

    public double getFusion() {
        return fusion;
    }

    public double getMelting() {
        return melting;
    }


    public String getAbbreviation() {
        return abbreviation;
    }
}
