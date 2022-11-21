package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

public class InstitutionalPlan extends Plan {

  protected final double rate = 5.50;

  @Override
  public double getRate() {
    return rate;
  }
}
