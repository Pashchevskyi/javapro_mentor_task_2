package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception;

public class NotForRequestedObjectsException extends Exception {

  public NotForRequestedObjectsException() {
    super("This factory is not for production of objects like you required");
  }
}
