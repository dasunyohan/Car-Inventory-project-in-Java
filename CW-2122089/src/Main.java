import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int option = -1;
        Scanner o = new Scanner(System.in);

        //objects
        Admin admin1 = new Admin(null, null, 0, 0, null, 0,0, null);
        customerAppointment customer1 = new customerAppointment(null,null,null,null,null);
        Technician technician1 = new Technician(null,null,null,null,null,null,0);
        Owner owner1 = new Owner();

        Scanner op = new Scanner(System.in);
        System.out.print("\n1.Admin\n2.Customer\n3.Owner\n4.Technician\nEnter the Number related to the which user you are: ");
        int optionNo = op.nextInt();

        if (optionNo == 1) {
            do {
                boolean isLogin = adminLogin();
                if (isLogin) {
                    System.out.println("Login Successful");
                    do {
                        System.out.println("\n1.Adding a new Car information");
                        System.out.println("2.View Car Information");
                        System.out.println("3.Updating Car information");
                        System.out.println("4.Check customer appointments");
                        System.out.println("5.Change the status of appointment");
                        System.out.println("0.Exit");
                        System.out.print("Enter your option: ");
                        option = o.nextInt();

                        switch (option) {
                            case 1:
                                admin1.adminOperations();
                                break;
                            case 2:
                                admin1.adminOperations1();
                                break;
                            case 3:
                                admin1.adminOperations2();
                                break;
                            case 4:
                                admin1.adminOperations3();
                                break;
                            case 5:
                                admin1.adminOperations4();
                                break;
                        }
                    }while (option != 0);
                    break;
                } else {
                    System.out.println("Login Failed");
                }
            } while (true);
        }
        if (optionNo == 2){
            do {
                boolean isLogin = customerLogin();
                if (isLogin) {
                    System.out.println("Login Successful");
                    do {
                        System.out.println("\n1.View Car Information");
                        System.out.println("2.Any Specific mileage");
                        System.out.println("3.Any Specific Price");
                        System.out.println("4.Make an Appointment for test drive");
                        System.out.println("5.Show appointments");
                        System.out.println("0.Exit");
                        System.out.print("Enter your option: ");
                        option = o.nextInt();

                        switch (option) {
                            case 1:
                                customer1.customerOperation();
                                break;
                            case 2:
                                customer1.customerOperation1();
                                break;
                            case 3:
                                customer1.customerOperation2();
                                break;
                            case 4:
                                customer1.customerOperation3();
                                break;
                            case 5:
                                customer1.customerOperation4();
                                break;
                        }
                    }while (option != 0);
                    break;
                } else {
                    System.out.println("Login Failed");
                }
            } while (true);
        }
        if (optionNo == 3){
            do {
                boolean isLogin = ownerLogin();
                if (isLogin) {
                    System.out.println("Login Successful");
                    do {
                        System.out.println("\nView Monthly Report\n1.View Top 5 Sold Car Models in each month");
                        System.out.println("2.View number of cars sold in each month");
                        System.out.println("3.View Monthly Profits");
                        System.out.println("0.Exit");

                        System.out.print("Enter your option: ");
                        option = o.nextInt();

                        switch (option) {
                            case 1:
                                owner1.ownerOperation1();
                                break;
                            case 2:
                                owner1.ownerOperation2();
                                break;
                            case 3:
                                owner1.ownerOperation3();
                                break;
                        }
                    }while (option != 0);
                    break;
                } else {
                    System.out.println("Login Failed");
                }
            } while (true);
        }
        if (optionNo == 4){
            do {
                boolean isLogin = technicianLogin();
                if (isLogin) {
                    System.out.println("Login Successful");
                    do {
                        System.out.println("\n1.Add new maintenance");
                        System.out.println("2.View previous maintenance ");
                        System.out.println("0.Exit");
                        System.out.print("Enter your option: ");
                        option = o.nextInt();

                        switch (option) {
                            case 1:
                                technician1.technicianOperations();
                                break;
                            case 2:
                                technician1.technicianOperations1();
                                break;
                        }
                    }while (option != 0);
                    break;
                } else {
                    System.out.println("Login Failed");
                }
            } while (true);
        }
    }

    private static boolean adminLogin() {
        boolean isAdmin = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();


        String adminFilepath = "C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\adminLoginDetails.txt";


        File adminFile = new File(adminFilepath);

        try
        {
            Scanner inputData = new Scanner(adminFile);

            while (inputData.hasNext())
            {
                String line = inputData.nextLine();
                String [] values = line.split(",");

                if (values[0].equals(username))
                {
                    if (values[1].equals(password))
                    {
                        isAdmin = true;
                    }
                }
            }
        }
        catch (FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        return isAdmin;
    }
    private static boolean customerLogin() {
        boolean isCustomer = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();


        String customerFilepath = "C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\customerLoginDetails.txt";


        File customerFile = new File(customerFilepath);

        try
        {
            Scanner inputData = new Scanner(customerFile);

            while (inputData.hasNext())
            {
                String line = inputData.nextLine();
                String [] values = line.split(",");

                if (values[0].equals(username))
                {
                    if (values[1].equals(password))
                    {
                        isCustomer = true;
                    }
                }
            }
        }
        catch (FileNotFoundException c)
        {
            c.printStackTrace();
        }
        return isCustomer;
    }
    private static boolean ownerLogin() {
        boolean isOwner = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();


        String ownerFilepath = "C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\ownerLoginDetails.txt";


        File ownerFile = new File(ownerFilepath);

        try
        {
            Scanner inputData = new Scanner(ownerFile);

            while (inputData.hasNext())
            {
                String line = inputData.nextLine();
                String [] values = line.split(",");

                if (values[0].equals(username))
                {
                    if (values[1].equals(password))
                    {
                        isOwner = true;
                    }
                }
            }
        }
        catch (FileNotFoundException o)
        {
            o.printStackTrace();
        }
        return isOwner;
    }
    private static boolean technicianLogin() {
        boolean isTechnician = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();


        String technicianFilepath = "C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\technicianLoginDetails.txt";


        File technicianFile = new File(technicianFilepath);

        try
        {
            Scanner inputData = new Scanner(technicianFile);

            while (inputData.hasNext())
            {
                String line = inputData.nextLine();
                String [] values = line.split(",");

                if (values[0].equals(username))
                {
                    if (values[1].equals(password))
                    {
                        isTechnician = true;
                    }
                }
            }
        }
        catch (FileNotFoundException o)
        {
            o.printStackTrace();
        }
        return isTechnician;
    }
}
