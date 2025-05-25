package com.unbroken.unitConverter.forms;

import com.unbroken.unitConverter.utilities.LengthEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class LengthForm {
    
    @NotNull
    @Min(0)
    private Double value;
    private LengthEnum from;
    private LengthEnum to;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LengthEnum getFrom() {
        return from;
    }

    public void setFrom(LengthEnum from) {
        this.from = from;
    }

    public LengthEnum getTo() {
        return to;
    }

    public void setTo(LengthEnum to) {
        this.to = to;
    }
}
