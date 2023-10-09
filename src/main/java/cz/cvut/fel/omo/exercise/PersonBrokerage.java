package cz.cvut.fel.omo.exercise;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class PersonBrokerage {
    private String personNumber;
    private LocalDate dueDate;
    private LocalDate start;
    private LocalDate end;
    private BigDecimal PersonBrokerage;

    public PersonBrokerage(LocalDate dueDate, LocalDate start, LocalDate end, String personNumber, BigDecimal personBrokerage) {
        this.personNumber = personNumber;
        this.dueDate = dueDate;
        this.start = start;
        this.end = end;
        PersonBrokerage = personBrokerage;
    }
}
