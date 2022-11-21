package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.AbstractFactory;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.exception
    .BankNotFoundException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .NotForRequestedObjectsException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.Loan;

public class BankFactory extends AbstractFactory {

  @Override
  public Bank getBank(String bank) throws BankNotFoundException {
    if (bank.equalsIgnoreCase("HDFC")) {
      return new HDFC();
    } else if (bank.equalsIgnoreCase("ICICI")) {
      return new ICICI();
    } else if (bank.equalsIgnoreCase("SBI")) {
      return new SBI();
    }
    throw new BankNotFoundException(bank);
  }

  @Override
  public Loan getLoan(String loan) throws NotForRequestedObjectsException {
    throw new NotForRequestedObjectsException();
  }
}
