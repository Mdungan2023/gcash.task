import java.util.Scanner;





public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        double tCashout = 0.0;
        boolean isRunning = true;

        System.out.println(" 1. Cash in 2. Cash out 3.total Cash out 4. Exit");
        System.out.print("Pick");
        int choice = sc.nextInt();

        while(isRunning){
            switch(choice){
                case 1:
                    System.out.print("Enter cash in amount: ");
                    double cashin = sc.nextDouble();
                    balance = balance + cashin;
                    System.out.println("Your Balance is now:" + balance);
                    System.out.println(
                            " 1. Cash in " +
                            "2. Cash out" +
                            " 3.total Cash out" +
                            " 4. Exit");
                    System.out.print("Pick:");
                    choice = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter cash out amount: ");
                    double cashout = sc.nextDouble();
                    if (balance >= cashout) {
                        balance = balance - cashout;
                        tCashout = tCashout + cashout;
                        System.out.println("Your total balance  is now:"+ balance);
                    }
                    else {
                        System.out.print("Insufficient balance!");
                    }
                    break;
                    case 3:
                        System.out.println("Total Cash out = "+ tCashout);
                        System.out.println(" 1. Cash in 2. Cash out 3.total Cash out 4. Exit ");
                        System.out.print(" Pick: ");
                        choice = sc.nextInt();
                            break;
                    case 4:
                            isRunning = false;
                            break;

                        default:
                            System.out.println(" Invalid Choice! ");
                            System.out.println(" 1. Cash in 2. Cash out 3.total Cash out 4. Exit ");
                            System.out.print(" Pick: ");
                            choice = sc.nextInt();
                            break;


                    }


            }
        }

    }

