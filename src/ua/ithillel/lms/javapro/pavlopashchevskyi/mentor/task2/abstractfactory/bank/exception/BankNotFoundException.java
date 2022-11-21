package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.exception;

public class BankNotFoundException extends Exception {

  public BankNotFoundException(String bank) {
    super("Bank with the name of \"" + bank + "\" has not been found");
  }
}
