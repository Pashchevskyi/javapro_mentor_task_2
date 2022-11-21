package ua.ithillel.lms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.AbstractFactory;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.FactoryCreator;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.api.Bank;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.bank.exception
    .BankNotFoundException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .FactoryNotFoundException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.exception
    .NotForRequestedObjectsException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.Loan;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.abstractfactory.loan.exception
    .LoanNotTakenException;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod.BillGenerator;
import ua.ithillel.lms.javapro.pavlopashchevskyi.mentor.task2.factorymethod.exception
    .UnknownPlanException;

public class Main {

  public static void main(String[] args) {
    System.out.println("Example of which pattern would you like to watch?");
    System.out.println("Press \"a\" or \"A\" for Abstract Factory example ");
    System.out.println("Press \"m\" or \"M\" for Factory Method example ");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String example = br.readLine();
      if ("M".equalsIgnoreCase(example)) {
        //Factory method example
        System.out.print("Enter the name of plan for which the bill will be generated: ");

        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        System.out.println(BillGenerator.generateBill(planName, units));
        // end Factory Method example
      }
      if ("A".equalsIgnoreCase(example)) {
        //Abstract Factory example
        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan (home loan, business loan or education loan: ");

        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.setInterestRate(rate);
        double EMI = l.calculateLoanPayment(loanAmount, years);
        System.out.println(
            "your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
        // end Abstract Factory example
      }
    } catch (IOException | UnknownPlanException | FactoryNotFoundException | BankNotFoundException |
             NotForRequestedObjectsException | LoanNotTakenException e) {
      System.out.println(e.getMessage());
    }
  }
}