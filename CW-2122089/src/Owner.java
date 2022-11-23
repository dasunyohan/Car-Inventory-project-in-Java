import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;
import java.util.Scanner;

class Owner {

    public Owner() {
    }

    public String ownerOperation1() throws FileNotFoundException{
        File file1 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\Top5Cars.txt");

        Scanner s1 = new Scanner(file1);
        for (int i = 0; i <6 ;i++) {
            String line = s1.next();
            String values[] = line.split(",",2);

            System.out.println(values[0]+" | "+values[1]);
        }
        return null;
    }

    public String ownerOperation2() throws FileNotFoundException{
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\noOfCarsSold.txt");

        Scanner s = new Scanner(file);

        System.out.println("\nY-axis/Month(2022)");
        System.out.println("    ^");

        for (int i = 0; i <6 ;i++) {
            String line = s.next();
            String values[] = line.split(",");

            int carSold = Integer.parseInt(values[1]);
            carSold = Math.round(carSold/5);

            System.out.print(values[0]+" | ");

            for (int star = 1; star<=carSold;star++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("    0 --------------------> X-axis/No.of sold cars(* = average 5 cars)");
        return null;
    }
    public String ownerOperation3() throws FileNotFoundException{
        File file2 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\MonthlyProfit.txt");

        Scanner s2 = new Scanner(file2);

        System.out.println("\nY-axis/Month(2022)");
        System.out.println("    ^");

        for (int i = 0; i <6 ;i++) {
            String line = s2.next();
            String values[] = line.split(",");

            double profit = Double.parseDouble(values[1]);
            profit = Math.round(profit/5);

            System.out.print(values[0]+" | ");

            for (int star = 1; star<=profit;star++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("    0 --------------------> X-axis/Profit(* = 5 million)");
        return null;
    }

}