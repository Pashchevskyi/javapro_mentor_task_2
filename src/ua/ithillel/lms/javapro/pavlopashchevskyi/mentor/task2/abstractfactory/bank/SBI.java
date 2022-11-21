package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;

public class SBI implements Bank {

  private final String bankName;

  public SBI() {
    bankName = "SBI BANK";
  }

  @Override
  public String getBankName() {
    return bankName;
  }
}
