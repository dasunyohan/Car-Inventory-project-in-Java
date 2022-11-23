import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


class customerAppointment implements Serializable{
    String moduleNo1;
    String cName;
    String date;
    String time;
    String status;

    public customerAppointment(String moduleNo1, String cName, String date, String time, String status) {
        this.moduleNo1 = moduleNo1;
        this.cName = cName;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    public String toString(){
        return moduleNo1+"   "+cName+"    Date: "+date+"    Time: "+time+"    Status: "+status;
    }




    public String customerOperation() throws Exception {
        int choice = -1;
        int sort = 0;
        Scanner o = new Scanner(System.in); //for strings
        Scanner o1 = new Scanner(System.in); //for int
        Scanner o2 = new Scanner(System.in); //for double
        //this is customer part
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;


        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>) ois.readObject();
            ois.close();

            System.out.println("---------------------------------");
            li = al.listIterator();
            while (li.hasNext()) {
                Admin a = (Admin) li.next();
                if (a.sold.equals("no"))
                    System.out.println(a);
            }
            System.out.println("------------------------------------");
        } else {
            System.out.println("File not exists.......!");
        }
        return null;
    }

    public String customerOperation1() throws Exception{
        Scanner o1 = new Scanner(System.in);

        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>) ois.readObject();
            ois.close();

            boolean found = false;
            System.out.print("Enter Mileage to sort(KM): ");
            int mileage = o1.nextInt();
            System.out.println("-------------------------");
            li = al.listIterator();
            while (li.hasNext()) {
                Admin c = (Admin) li.next();
                if (c.mileage <= mileage && c.sold.equals("no")) {
                    System.out.println(c);
                    found = true;
                }
            }
            System.out.println("--------------------------");
        } else {
            System.out.println("File not exists...!");
        }
        return null;
    }

    public String customerOperation2() throws Exception{
        Scanner o2 = new Scanner(System.in);

        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\carDetails.txt");
        ArrayList<Admin> al = new ArrayList<Admin>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Admin>) ois.readObject();
            ois.close();

            boolean found = false;
            System.out.print("Enter Price to sort(Millions): ");
            double price = o2.nextDouble();
            System.out.println("--------------------------");
            li = al.listIterator();
            while (li.hasNext()) {
                Admin c1 = (Admin) li.next();
                if (c1.price <= price && c1.sold.equals("no")) {
                    System.out.println(c1);
                    found = true;
                }
            }
            System.out.println("--------------------------");
        } else {
            System.out.println("File not exists...!");
        }
        return null;
    }

    public String customerOperation3() throws Exception{
        Scanner o = new Scanner(System.in);

        File file1 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\appointments.txt");
        ArrayList<customerAppointment> al1 = new ArrayList<customerAppointment>();
        ObjectOutputStream oos1 = null;
        ObjectInputStream ois1 = null;
        ListIterator li1 = null;

        if (file1.isFile()) {
            ois1 = new ObjectInputStream(new FileInputStream(file1));
            al1 = (ArrayList<customerAppointment>) ois1.readObject();
            ois1.close();
        }
        System.out.print("Enter the Model Number: ");
        String moduleNo1 = o.next();

        System.out.print("Enter your name: ");
        String cName = o.next();

        System.out.print("Enter the date: ");
        String date = o.next();

        System.out.print("Enter the time: ");
        String time = o.next();

        String status = "Pending";

        al1.add(new customerAppointment(moduleNo1, cName, date, time, status));

        oos1 = new ObjectOutputStream(new FileOutputStream(file1));
        oos1.writeObject(al1);
        oos1.close();

        System.out.println("Appointment added successfully...!");

        return moduleNo1;
    }
    public String customerOperation4() throws Exception{
        File file1 = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\appointments.txt");
        ArrayList<customerAppointment> al1 = new ArrayList<customerAppointment>();
        ObjectOutputStream oos1 = null;
        ObjectInputStream ois1 = null;
        ListIterator li1 = null;

        if (file1.isFile()) {
            ois1 = new ObjectInputStream(new FileInputStream(file1));
            al1 = (ArrayList<customerAppointment>) ois1.readObject();
            ois1.close();
        }

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
}