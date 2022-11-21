package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.BankFactory;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .FactoryNotFoundException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.LoanFactory;

public class FactoryCreator {

  public static AbstractFactory getFactory(String choice) throws FactoryNotFoundException {
    if (choice.equalsIgnoreCase("Bank")) {
      return new BankFactory();
    } else if (choice.equalsIgnoreCase("Loan")) {
      return new LoanFactory();
    }
    throw new FactoryNotFoundException(choice);
  }
}
