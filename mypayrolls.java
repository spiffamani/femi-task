import java.util.Scanner; 


String name = ""; 
double payRate = 9.75;
double hoursWorked = 0;
double federalTax = 0.20;
double stateTax = 0.09;
double grossPay = 0;
double netPay = 0;

void setEmployee() { 
    Scanner input = new Scanner(System.in);
    name = input.nextLine(); 
    hoursWorked = input.nextDouble(); 
}

void hourlyPay() { 
    if (hoursWorked < 0) {
        System.out.println(" something went wrong");
    } else {
        double amount = hoursWorked * payRate;
        System.out.println("Pay is: $" + amount); 
    }
}

void federalDeduction() {
    double tax = grossPay * federalTax; 
    System.out.println("Federal tax deduction: $" + tax);
}

void stateDeduction() { 
    double tax = grossPay * stateTax; 
    System.out.println("State tax deduction: $" + tax);
}

void calculatePay() { 
    grossPay = hoursWorked * payRate; 
    System.out.println("Gross pay is: $" + grossPay);
}

void calculateNetPay() { 
    federalDeduction();  
    stateDeduction();
    netPay = grossPay - (federalTax + stateTax); 
    System.out.println("Net pay is: $" + netPay);

}

public static void main(String[] args)
    Scanner input = new Scanner(System.in);

    setEmployee(); 
    calculatePay();
    calculateNetPay();

    System.out.println("Do you want to continue? (yes/no) ");
    String choice = input.next(); 
    if (!choice.equals("yes")) {
        System.out.println("Ok bye!");
        break;
    }
}