package serialClasses;

import java.io.*;

public class SerialSample implements Serializable {

    class Employee implements Serializable {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        SerialSample ss = new SerialSample();
        SerialSample.Employee kani = ss.new Employee(1,"kani");
        SerialSample.Employee meena = ss.new Employee(2,"meena");
        SerialSample.Employee suresh = ss.new Employee(3,"suresh");

        //Serialize and write to a file
        try {
            FileOutputStream fos = new FileOutputStream("src/main/resources/employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(kani);
            oos.writeObject(meena);
            oos.writeObject(suresh);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Deserialize to display
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SerialSample.Employee KANI = (SerialSample.Employee) ois.readObject();
            System.out.println(KANI);
            SerialSample.Employee MEENA = (SerialSample.Employee) ois.readObject();
            System.out.println(MEENA);
            SerialSample.Employee SURESH = (SerialSample.Employee) ois.readObject();
            System.out.println(SURESH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
