package com.unbroken.unitConverter.utilities;

public enum MassEnum {
    TONELADA("t"),
    KILOGRAMO("kg"),
    GRAMO("g"),
    MILIGRAMO("mg"),
    MICROGRAMO("ug"),
    LIBRA("lb"),
    ONZA("oz");

    private final String abbreviation;

    private MassEnum(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }
}
