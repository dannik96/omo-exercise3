package cz.cvut.fel.omo.exercise;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
public class Transaction {

    public static final String commission = "COMM";
    public static final String premium = "PREM";

    private BigDecimal amount;
    private LocalDate dueDate;
    private LocalDate coverFrom;
    private LocalDate coverTo;
    private String payer;
    private String type;

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", dueDate=" + dueDate +
                ", coverFrom=" + coverFrom +
                ", coverTo=" + coverTo +
                ", payer='" + payer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
