import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Technician implements Serializable {
    private String modelNo1;
    private String mName;
    private String cName1;
    private String mDate;
    private String mTime;
    private String description;
    private int cost;

    public Technician(String modelNo1, String mName, String cName1, String mDate, String mTime, String description, int cost) {
        this.modelNo1 = modelNo1;
        this.mName = mName;
        this.cName1 = cName1;
        this.mDate = mDate;
        this.mTime = mTime;
        this.description = description;
        this.cost = cost;
    }

    public String getModelNo1() {
        return modelNo1;
    }

    public void setModelNo1(String modelNo1) {
        this.modelNo1 = modelNo1;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getcName1() {
        return cName1;
    }

    public void setcName1(String cName1) {
        this.cName1 = cName1;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return modelNo1 + "   " + mName + "   " + cName1 + "  " + mDate + "   " + mTime + "    Description: " + description + "    Cost: Rs." + cost + "/=    ";
    }

    public String technicianOperations() throws IOException, ClassNotFoundException{

        Scanner t = new Scanner(System.in); //for strings
        Scanner t1 = new Scanner(System.in); //for int

        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\Maintaince.txt");
        ArrayList<Technician> al = new ArrayList<Technician>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al= (ArrayList<Technician>) ois.readObject();
            ois.close();
        }

        System.out.print("Enter Model Number: ");
        String modelNo1 = t.nextLine();

        System.out.print("Enter Model Name: ");
        String mName = t.nextLine();

        System.out.print("Enter the customer Name: ");
        String cName1 = t.nextLine();

        System.out.print("Enter the date: ");
        String mDate = t.nextLine();

        System.out.print("Enter the time: ");
        String mTime = t.nextLine();

        System.out.print("Enter the description: ");
        String description = t.nextLine();

        System.out.print("Enter the cost(Rs): ");
        int cost = t1.nextInt();

        al.add(new Technician(modelNo1, mName, cName1, mDate, mTime, description, cost));

        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(al);
        oos.close();
        return modelNo1;
    }
    public String technicianOperations1() throws IOException, ClassNotFoundException{
        File file = new File("C:\\Users\\pc\\Desktop\\IIT\\AI & DS\\1st year\\2nd sem\\Programming Fundamentals 2\\CW with JUnit\\Maintaince.txt");
        ArrayList<Technician> al = new ArrayList<Technician>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Technician>) ois.readObject();
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
}