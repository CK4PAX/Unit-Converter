package com.unbroken.unitConverter.forms;

import com.unbroken.unitConverter.utilities.MassEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class MassForm {

    @NotNull
    @Min(0)
    private Double value;
    private MassEnum from;
    private MassEnum to;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public MassEnum getFrom() {
        return from;
    }

    public void setFrom(MassEnum from) {
        this.from = from;
    }

    public MassEnum getTo() {
        return to;
    }

    public void setTo(MassEnum to) {
        this.to = to;
    }
}
