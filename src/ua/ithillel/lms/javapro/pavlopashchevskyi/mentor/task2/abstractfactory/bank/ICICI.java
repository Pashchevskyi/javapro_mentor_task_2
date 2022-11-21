package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;

public class ICICI implements Bank {

  private final String bankName;

  public ICICI() {
    bankName = "ICICI BANK";
  }

  @Override
  public String getBankName() {
    return bankName;
  }
}
