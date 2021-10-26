package universitystudentmanagementsystem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teacher extends Student {
    @Override
    public void add()
    {
        Scanner input = new Scanner(System.in);
        String name, dept, email, occupation;
        int number;

        System.out.println("Enter your Name: ");
        name = input.nextLine();
        System.out.println("Enter your Occupation: ");
        occupation = input.nextLine();
        System.out.println("Enter your Dept: ");
        dept = input.nextLine();
        System.out.println("Enter your number: ");
        number = input.nextInt();
        System.out.println("Enter your Email: ");
        email= input.next();

        String data = "Name: "+ name + "\n" + "Occupation: " + occupation + "\n" + "Number: " + number + "\n" + "Email: " + email + "\n" + "Department: " + dept + "\n\n";

        try {
            FileWriter writer = new FileWriter("teacher.txt", true);
            writer.write(data);
            System.out.println("Data is insert successfully.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void read() {
        char[] data = new char[200];

        try {
            FileReader reader = new FileReader("teacher.txt");
            reader.read(data);
            System.out.println("Data received successfully");
            System.out.print(data);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
