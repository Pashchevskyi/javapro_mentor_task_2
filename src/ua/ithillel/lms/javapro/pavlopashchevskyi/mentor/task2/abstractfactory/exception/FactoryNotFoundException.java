package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception;

public class FactoryNotFoundException extends Exception {

  public FactoryNotFoundException(String goal) {
    super("Factory for " + goal + " has not been found");
  }
}
