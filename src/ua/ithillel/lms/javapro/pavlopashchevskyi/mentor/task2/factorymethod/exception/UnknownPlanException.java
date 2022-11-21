package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod.exception;

public class UnknownPlanException extends Exception {

  public UnknownPlanException(String planType) {
    super("Unable to create the plan of \"" + planType + "\", because it was not defined");
  }
}
