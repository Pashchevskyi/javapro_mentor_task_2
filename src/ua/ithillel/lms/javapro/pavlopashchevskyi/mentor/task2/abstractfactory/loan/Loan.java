package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan;

public abstract class Loan {

  protected double rate;

  public abstract void setInterestRate(double rate);

  /**
   * Calculate the monthly loan payment i.e. EMI
   *
   * @param loanAmount loan amount
   * @param years      years count to divide loan amount by
   * @return EMI
   */
  public double calculateLoanPayment(double loanAmount, int years) {
    /*
     * rate=annual interest rate/12*100;
     * n=number of monthly installments;
     * 1 year=12 months.
     * so, n=years*12;
     */
    int n = years * 12;
    rate = rate / 1200;
    return ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
  }
}
