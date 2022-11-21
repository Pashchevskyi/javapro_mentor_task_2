package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

public abstract class Plan {

  protected double rate;

  public abstract double getRate();

  public double calculateBill(int units) {
    return units * getRate();
  }
}
