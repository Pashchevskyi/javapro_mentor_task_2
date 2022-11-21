package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

public class CommercialPlan extends Plan {

  protected final double rate = 7.50;

  @Override
  public double getRate() {
    return rate;
  }
}
