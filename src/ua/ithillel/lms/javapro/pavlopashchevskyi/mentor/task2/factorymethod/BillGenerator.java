package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod.exception
    .UnknownPlanException;

public class BillGenerator {

  public static String generateBill(String planName, int units) throws UnknownPlanException {
    PlanFactory planFactory = new PlanFactory();

    Plan p = planFactory.getPlan(planName);

    return "Bill amount for " + planName + " of  " + units + " unit(s) with price per unit "
        + p.getRate() +
        " is: " + p.calculateBill(units);
  }
}
