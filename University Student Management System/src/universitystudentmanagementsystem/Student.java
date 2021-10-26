package universitystudentmanagementsystem;

import java.io.*;
import java.util.Scanner;

public class Student {

    public void add()
    {
        Scanner input = new Scanner(System.in);
        String name, sec, dept;
        int id, batch;

        System.out.println("Enter your Name: ");
        name = input.nextLine();
        System.out.println("Enter your Dept: ");
        dept = input.nextLine();
        System.out.println("Enter your id: ");
        id = input.nextInt();
        System.out.println("Enter your Section: ");
        sec = input.next();
        System.out.println("Enter your Batch: ");
        batch = input.nextInt();


        String data = "Name: "+ name + "\n" + "ID: " + id + "\n" + "Section: " + sec + "\n" + "Batch: " + batch + "\n" + "Department: " + dept + "\n\n";

        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write(data);
            System.out.println("Data is insert successfully.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void read() {
        char[] data = new char[200];

        try {
            FileReader reader = new FileReader("student.txt");
            reader.read(data);
            System.out.println("Data received successfully");
            System.out.print(data);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}