package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.exception;

public class LoanNotTakenException extends Exception {

  public LoanNotTakenException(String goal) {
    super("Loan for " + goal + " has not been taken");
  }
}
