package cz.cvut.fel.omo.exercise;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class CompanyBrokerage {
    private LocalDate dueDate;
    private LocalDate start;
    private LocalDate end;
    private String companyNumber;
    private BigDecimal companyBrokerage;

    public CompanyBrokerage(LocalDate dueDate, LocalDate start, LocalDate end, String companyNumber, BigDecimal companyBrokerage) {
        this.dueDate = dueDate;
        this.start = start;
        this.end = end;
        this.companyNumber = companyNumber;
        this.companyBrokerage = companyBrokerage;
    }
}
