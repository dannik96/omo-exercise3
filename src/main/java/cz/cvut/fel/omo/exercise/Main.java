package cz.cvut.fel.omo.exercise;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TransactionCreator transactionCreator = new TransactionCreator(new Calculator());

        List<Object> commissions = new ArrayList<>();
        List<Object> installments = new ArrayList<>();
        List<Object> results = new ArrayList<>();

        commissions.add(new CompanyBrokerage(LocalDate.of(2023, 10, 10),
                LocalDate.of(2023, 10, 10),
                LocalDate.of(2024, 4, 9),
                "C-12345",
                new BigDecimal(25000)));
        commissions.add(new PersonBrokerage(LocalDate.of(2023, 10, 10),
                LocalDate.of(2023, 10, 10),
                LocalDate.of(2024, 4, 9),
                "P-1",
                new BigDecimal(5000)));
        commissions.add(new CompanyBrokerage(LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 10, 9),
                "C-12345",
                new BigDecimal(25000)));
        commissions.add(new PersonBrokerage(LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 10, 9),
                "P-1",
                new BigDecimal(5000)));

        installments.add(new Instalment(LocalDate.of(2023, 10, 10),
                LocalDate.of(2023, 10, 10),
                LocalDate.of(2024, 4, 9),
                new BigDecimal(100000)));
        installments.add(new Instalment(LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 4, 10),
                LocalDate.of(2024, 10, 9),
                new BigDecimal(100000)));


        transactionCreator.calculateTransaction(commissions, "COMM", results);
        transactionCreator.calculateTransaction(installments, "PREM", results);

        for (Object object : results) {
            if (object instanceof Transaction transaction) {
                System.out.println(transaction);
            } else {
                System.out.println("Missmatch");
                // TODO some error - add error handling
            }
        }

    }

}
