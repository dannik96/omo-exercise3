package cz.cvut.fel.omo.exercise;

import java.math.BigDecimal;

public class Calculator {


    public void getCalculation(Transaction transaction) {

        transaction.setAmount(transaction.getAmount().add(new BigDecimal(20)));

    }
}
