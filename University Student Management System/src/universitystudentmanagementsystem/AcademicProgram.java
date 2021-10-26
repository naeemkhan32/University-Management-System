package universitystudentmanagementsystem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AcademicProgram {

    void undergraduateAdd()
    {
        Scanner input = new Scanner(System.in);
        String programName;

        System.out.println("Enter your Program Name: ");
        programName = input.nextLine();

        String data = programName+"\n";

        try {
            FileWriter writer = new FileWriter("undergraduate.txt", true);
            writer.write(data);
            System.out.println("Data is insert successfully.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    void undergraduateRead()
    {
        char[] data = new char[200];

        try {
            FileReader reader = new FileReader("undergraduate.txt");
            reader.read(data);
            System.out.println("Data received successfully");
            System.out.print(data);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void graduateAdd()
    {
        Scanner input = new Scanner(System.in);
        String programName;

        System.out.println("Enter your Program Name: ");
        programName = input.nextLine();

        String data = programName+"\n";

        try {
            FileWriter writer = new FileWriter("graduate.txt", true);
            writer.write(data);
            System.out.println("Data is insert successfully.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    void graduateRead()
    {
        char[] data = new char[200];

        try {
            FileReader reader = new FileReader("graduate.txt");
            reader.read(data);
            System.out.println("Data received successfully");
            System.out.print(data);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
