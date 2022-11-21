package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.exception
    .BankNotFoundException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .NotForRequestedObjectsException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.Loan;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.exception
    .LoanNotTakenException;

public abstract class AbstractFactory {

  public abstract Bank getBank(String bank) throws BankNotFoundException,
      NotForRequestedObjectsException;

  public abstract Loan getLoan(String loan) throws NotForRequestedObjectsException,
      LoanNotTakenException;
}
