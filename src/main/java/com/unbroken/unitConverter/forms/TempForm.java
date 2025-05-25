package com.unbroken.unitConverter.forms;

import com.unbroken.unitConverter.utilities.TempEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TempForm {
    
    @NotNull
    @Min(0)
    private Double value;
    private TempEnum from;
    private TempEnum to;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

  

    public TempEnum getFrom() {
        return from;
    }

    public void setFrom(TempEnum from) {
        this.from = from;
    }

    public TempEnum getTo() {
        return to;
    }

    public void setTo(TempEnum to) {
        this.to = to;
    }

}
