package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan;

public class BusinessLoan extends Loan {

  @Override
  public void setInterestRate(double rate) {
    this.rate = rate;
  }
}
