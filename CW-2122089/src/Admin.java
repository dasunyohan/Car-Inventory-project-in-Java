import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Admin implements Serializable {
    String modelNo;
    String model;
    int mileage;
    int year;
    String ownerDetails;
    double price;
    double askingPrice;
    String sold;

    Admin(String modelNo, String model, int mileage, int year, String ownerDetails, double price, double askingPrice, String sold) {
        this.modelNo = modelNo;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.ownerDetails = ownerDetails;
        this.price = price;
        this.askingPrice = askingPrice;
        this.sold = sold;
    }

    public String toString(){
        return modelNo+"    "+model+"   "+mileage+"km   "+year+"    "+ownerDetails+" Owner    Rs."+price+" mil (Selling Price)"+"    "+askingPrice+"   Sold: "+sold;
    }


    public String adminOperations() throws Exception {
        int option = -1;
        Scanner o = new Scanner(System.in);//for int
        Scanner o1 = new Scanner(System.in);//for string
        Scanner o2 = new Scanner(System.in);//for double

        //this is for the car details
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>) ois.readObject();
            ois.close();
        }
        System.out.println("Enter how many cars you want to add: ");
        int n = o.nextInt();
        //adding new car details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " details");

            System.out.print("Enter Model Number: ");
            String modelNo = o1.nextLine();

            System.out.print("Enter Model Name: ");
            String model = o1.nextLine();

            System.out.print("Enter Mileage in KM: ");
            int mileage = o.nextInt();

            System.out.print("Enter the year: ");
            int year = o.nextInt();

            System.out.print("Enter owner details: ");
            String ownerDetails = o1.nextLine();

            System.out.print("Enter the selling price in millions: ");
            double price = o2.nextDouble();

            System.out.print("Enter the asking price in millions: ");
            double askingPrice = o2.nextDouble();

            System.out.print("Enter the availability: ");
            String sold = o1.nextLine();

            //the new car detail is adding to the ArrayList
            al.add(new Admin(modelNo, model, mileage, year, ownerDetails, price, askingPrice, sold));

        }
        //the new car detail Array list is writing into the text file
        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(al);
        oos.close();
        return null;
    }
    public String adminOperations1() throws Exception {
        Scanner o = new Scanner(System.in);//for int
        Scanner o1 = new Scanner(System.in);//for string
        Scanner o2 = new Scanner(System.in);//for double

        //this is for the car details
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>)ois.readObject();
            ois.close();
        }
        if (file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>) ois.readObject();
            ois.close();

            System.out.println("--------------------------------------------------------");
            li = al.listIterator();
            while (li.hasNext()){
                System.out.println(li.next());
            }
            System.out.println("------------------------------------");
        }else {
            System.out.println("File not exists.......!");
        }
        return null;
    }
    public String adminOperations2() throws Exception{

        Scanner o1 = new Scanner(System.in);//for string


        //this is for the car details
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>)ois.readObject();
            ois.close();
        }

        if (file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>)ois.readObject();
            ois.close();

            boolean found = false;
            System.out.print("Enter the Model No to Update the availability: ");
            String modelNo = o1.nextLine();
            System.out.println("------------------------------------");
            li = al.listIterator();
            while (li.hasNext()){
                Admin a = (Admin) li.next();
                if (a.modelNo.equals(modelNo)){

                    System.out.print("Enter the availability: ");
                    String sold = o1.nextLine();

                    li.set(new Admin(modelNo, a.model, a.mileage, a.year, a.ownerDetails, a.price, a.askingPrice,sold));
                    found = true;
                }
            }
            if (found) {
                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(al);
                oos.close();
                System.out.println("Record Updated Successfully...!");

            }else {
                System.out.println("Record not found....!");
            }
            System.out.println("-----------------------------");
        }else {
            System.out.println("File not exists....!");
        }
        return null;
    }
    public String adminOperations3() throws Exception{

        File file1 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\appointments.txt");
        ArrayList<customerAppointment> al1 = new ArrayList<customerAppointment>();
        ObjectOutputStream oos1 = null;
        ObjectInputStream ois1 = null;
        ListIterator li1 = null;

        if (file1.isFile()) {
            ois1 = new ObjectInputStream(new FileInputStream(file1));
            al1 = (ArrayList<customerAppointment>) ois1.readObject();
            ois1.close();

            System.out.println("-------------------------");
            li1 = al1.listIterator();
            while (li1.hasNext()) {
                System.out.println(li1.next());
            }
            System.out.println("---------------------------");
        } else {
            System.out.println("File not exists...!");
        }
        return null;
    }
    public String adminOperations4() throws Exception{

        Scanner o1 = new Scanner(System.in);//for string

        File file1 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\appointments.txt");
        ArrayList<customerAppointment> al1 = new ArrayList<customerAppointment>();
        ObjectOutputStream oos1 = null;
        ObjectInputStream ois1 = null;
        ListIterator li1 = null;

        if (file1.isFile()){
            ois1 = new ObjectInputStream(new FileInputStream(file1));
            al1 = (ArrayList<customerAppointment>)ois1.readObject();
            ois1.close();

            boolean found = false;
            System.out.print("Enter the model number to change status of appointment: ");
            String moduleNo1 = o1.nextLine();
            System.out.println("------------------------------------");
            li1 = al1.listIterator();
            while (li1.hasNext()){
                customerAppointment ca = (customerAppointment) li1.next();
                if (ca.moduleNo1.equals(moduleNo1)){

                    System.out.print("Enter the status of appointment:");
                    String status = o1.nextLine();

                    li1.set(new customerAppointment(moduleNo1, ca.cName, ca.date, ca.time,status));
                    found = true;
                }
            }
            if (found) {
                oos1 = new ObjectOutputStream(new FileOutputStream(file1));
                oos1.writeObject(al1);
                oos1.close();
                System.out.println("Record Updated Successfully...!");

            }else {
                System.out.println("Record not found....!");
            }
            System.out.println("-----------------------------");
        }else {
            System.out.println("File not exists....!");
        }
        return null;
    }
}
