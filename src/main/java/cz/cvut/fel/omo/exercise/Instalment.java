package cz.cvut.fel.omo.exercise;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
public class Instalment {
    private LocalDate dueDate;
    private LocalDate start;
    private LocalDate end;
    private BigDecimal termPremium;

    public Instalment(LocalDate dueDate, LocalDate start, LocalDate end, BigDecimal termPremium) {
        this.dueDate = dueDate;
        this.start = start;
        this.end = end;
        this.termPremium = termPremium;
    }
}
