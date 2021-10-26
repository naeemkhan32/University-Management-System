package universitystudentmanagementsystem;

import java.util.Scanner;

public class Scholarship {
    void scholarship()
    {
        try{
            Scanner input = new Scanner(System.in);

            Double hsc, ssc, both;
            String golden1, golden2;

            System.out.println("Enter your HSC GPA: ");
            hsc = input.nextDouble();
            System.out.println("Enter your SSC GPA: ");
            ssc = input.nextDouble();
            both = hsc + ssc;
            if(both==10.00)
                System.out.println("50% Tuition waiver");
            else if(both>=9.0 && both<10.00)
                System.out.println("30% Tuition waiver");
            else if(both>=8.0 && both<9.00)
                System.out.println("15% Tuition waiver");
            else if(both>=7.0 && both<8.00)
                System.out.println("10% Tuition waiver");


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("N.B");
            System.out.println("If You have 2 Golden GPA 5.00 -> 75% waiver");
            System.out.println("If You have 1 Golden GPA 5.00 -> 60% waiver");
            System.out.println("If you are Female -> 10% waiver");
            System.out.println("If you are Siblings -> 30% waiver");
            System.out.println("If you are Teacher's children or Physically disabled -> 10% waiver\n");
        }

    }

   
}
