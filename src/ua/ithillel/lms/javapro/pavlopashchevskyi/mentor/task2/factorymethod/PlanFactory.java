package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod.exception.UnknownPlanException;

public class PlanFactory {

  public Plan getPlan(String planType) throws UnknownPlanException {
    if (planType.equalsIgnoreCase("DOMESTIC")) {
      return new DomesticPlan();
    } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
      return new CommercialPlan();
    } else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
      return new InstitutionalPlan();
    }
    throw new UnknownPlanException(planType);
  }
}
