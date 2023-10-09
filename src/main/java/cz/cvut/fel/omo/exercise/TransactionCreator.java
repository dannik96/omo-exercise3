package cz.cvut.fel.omo.exercise;

import java.util.List;

public class TransactionCreator {

    private final Calculator calculator;

    public TransactionCreator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void calculateTransaction(List<Object> commissions, String type, List<Object> results) {
        for (Object object : commissions) {
            if (type.equals(Transaction.commission)) {
                if (object instanceof CompanyBrokerage companyBrokerage) {
                    Transaction transaction = new Transaction();

                    transaction.setAmount(companyBrokerage.getCompanyBrokerage());
                    transaction.setDueDate(companyBrokerage.getDueDate());
                    transaction.setCoverFrom(companyBrokerage.getStart());
                    transaction.setCoverTo(companyBrokerage.getEnd());
                    transaction.setPayer(companyBrokerage.getCompanyNumber());
                    transaction.setType("COMM");
                    calculator.getCalculation(transaction);
                    results.add(transaction);
                } else if (object instanceof PersonBrokerage personBrokerage) {
                    Transaction transaction = new Transaction();

                    transaction.setAmount(personBrokerage.getPersonBrokerage());
                    transaction.setDueDate(personBrokerage.getDueDate());
                    transaction.setCoverFrom(personBrokerage.getStart());
                    transaction.setCoverTo(personBrokerage.getEnd());
                    transaction.setPayer(personBrokerage.getPersonNumber());
                    transaction.setType("COMM");
                    calculator.getCalculation(transaction);
                    results.add(transaction);
                }
            } else if (type.equals(Transaction.premium)) {
                Instalment instalment = (Instalment) object;
                Transaction transaction = new Transaction();

                transaction.setAmount(instalment.getTermPremium());
                transaction.setDueDate(instalment.getDueDate());
                transaction.setCoverFrom(instalment.getStart());
                transaction.setCoverTo(instalment.getEnd());
                transaction.setPayer("OWNER"); // TODO - TBD fix to the next year
                transaction.setType("PREM");
                calculator.getCalculation(transaction);
                results.add(transaction);
            } else {
                // TODO - wut?? There are more types??? Now it works, fix later in case of bug...
            }
        }
    }
}
