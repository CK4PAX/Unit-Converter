package com.unbroken.unitConverter.utilities;

public enum LengthEnum {
        MILIMETROS("mm"),
        CENTIMETROS("cm"),
        METROS("m"),
        KILOMETROS("km"),
        PULGADAS("in"),
        PIES("ft"),
        YARDAS("yd"),
        MILLAS("mi");
        private final String abbreviation;

        private LengthEnum(String abbreviation) {
            this.abbreviation = abbreviation;
        }
        
        public String getAbbreviation(){
            return this.abbreviation;
        }
}
