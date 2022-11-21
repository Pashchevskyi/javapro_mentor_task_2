package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

public class DomesticPlan extends Plan {

  protected final double rate = 3.50;

  @Override
  public double getRate() {
    return rate;
  }
}
