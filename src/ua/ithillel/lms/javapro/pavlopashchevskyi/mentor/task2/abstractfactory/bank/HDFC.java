package ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank;

import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;

public class HDFC implements Bank {

  private final String bankName;

  public HDFC() {
    this.bankName = "HDFC BANK";
  }

  @Override
  public String getBankName() {
    return bankName;
  }
}
