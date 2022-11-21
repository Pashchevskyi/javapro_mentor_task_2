package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.AbstractFactory;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .NotForRequestedObjectsException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.exception
    .LoanNotTakenException;

public class LoanFactory extends AbstractFactory {

  @Override
  public Bank getBank(String bank) throws NotForRequestedObjectsException {
    throw new NotForRequestedObjectsException();
  }

  @Override
  public Loan getLoan(String loan) throws LoanNotTakenException {
    if (loan.equalsIgnoreCase("Home")) {
      return new HomeLoan();
    } else if (loan.equalsIgnoreCase("Business")) {
      return new BusinessLoan();
    } else if (loan.equalsIgnoreCase("Education")) {
      return new EducationLoan();
    }
    throw new LoanNotTakenException(loan);
  }
}
