package universitystudentmanagementsystem;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    void project ()
    {
        int c;
        do{
            System.out.print("\n");
            System.out.println("1. Student Information");
            System.out.println("2. Teacher Information");
            System.out.println("3. Course Information");
            System.out.println("4. Academic Programs");
            System.out.println("5. Scholarship at Admission");
            System.out.println("6. About University");
            System.out.println("7. Exit");

            System.out.println("Choose any option: ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();

            switch(c)
            {
                case 1:
                    do{
                        System.out.println("1. Add");
                        System.out.println("2. Show");
                        System.out.println("3. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        Student student = new Student();
                        switch (c)
                        {
                            case 1:
                                student.add();
                                break;
                            case 2:
                                student.read();
                                break;
                            case 3:
                                Main main =new Main();
                                main.project ();
                                break;
                        }
                        break;
                    }while (c!=0);
                    break;
                case 2:
                    do{
                        System.out.println("1. Add");
                        System.out.println("2. Show");
                        System.out.println("3. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        Student teacher = new Teacher();
                        switch (c)
                        {
                            case 1:
                                teacher.add();
                                break;
                            case 2:
                                teacher.read();
                                break;
                            case 3:
                                Main main=new Main();
                                main.project();
                                break;

                        }
                        break;
                    }while (c!=0);
                    break;
                case 3:
                    do{
                        System.out.println("1. BSC in CSE");
                        System.out.println("2. BSC in EEE");
                        System.out.println("3. BSC in CEE");
                        System.out.println("4. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        switch (c)
                        {
                            case 1:
                                do{
                                    System.out.println("1. 1st Semester");
                                    System.out.println("2. 2nd Semester");
                                    System.out.println("3. 3rd Semester");
                                    System.out.println("4. 4th Semester");
                                    System.out.println("5. 5th Semester");
                                    System.out.println("6. 6th Semester");
                                    System.out.println("7. 7th Semester");
                                    System.out.println("8. 8th Semester");
                                    System.out.println("9. 9th Semester");
                                    System.out.println("10. 10th Semester");
                                    System.out.println("11. 11th Semester");
                                    System.out.println("12. 12th Semester");
                                    System.out.println("13. All semester");
                                    System.out.println("14. Exit");

                                    System.out.println("Choose any option: ");

                                    c = in.nextInt();
                                    Course course = new Course();
                                    switch (c)
                                    {
                                        case 1:
                                            course.firstCSE();
                                            break;
                                        case 2:
                                            course.secondCSE();
                                            break;
                                        case 3:
                                            course.threeCSE();
                                            break;
                                        case 4:
                                            course.fourCSE();
                                            break;
                                        case 5:
                                            course.fiveCSE();
                                            break;
                                        case 6:
                                            course.sixCSE();
                                            break;
                                        case 7:
                                            course.sevenCSE();
                                            break;
                                        case 8:
                                            course.eightCSE();
                                            break;
                                        case 9:
                                            course.nineCSE();
                                            break;
                                        case 10:
                                            course.tenCSE();
                                            break;
                                        case 11:
                                            course.elevenCSE();
                                            break;
                                        case 12:
                                            course.towelveCSE();
                                            break;
                                        case 13:
                                            course.allCSESem();
                                            break;
                                        case 14:
                                            Main main=new Main();
                                            main.project();
                                            break;

                                    }

                                }while (c!=0);
                                break;
                            case 2:
                            case 3:
                                break;
                            case 4:
                                Main main=new Main();
                                main.project();
                                break;

                        }

                    }while (c!=0);
                    break;
                case 4:
                    do {
                        System.out.println("1. Undergraduate");
                        System.out.println("2. Graduate");
                        System.out.println("3. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        switch (c) {
                            case 1:
                                System.out.println("1. Add");
                                System.out.println("2. Show");
                                System.out.println("3. Exit");

                                System.out.println("Choose any option: ");

                                c = in.nextInt();
                                AcademicProgram program = new AcademicProgram();
                                switch (c) {
                                    case 1:
                                        program.undergraduateAdd();
                                        break;
                                    case 2:
                                        program.undergraduateRead();
                                        break;
                                    case 3:
                                        Main main = new Main();
                                        main.project();
                                        break;
                                }
                            case 2:
                                System.out.println("1. Add");
                                System.out.println("2. Show");
                                System.out.println("3. Exit");

                                System.out.println("Choose any option: ");

                                c = in.nextInt();
                                AcademicProgram p = new AcademicProgram();
                                switch (c) {
                                    case 1:
                                        p.graduateAdd();
                                        break;
                                    case 2:
                                        p.graduateRead();
                                        break;
                                    case 3:
                                        Main main = new Main();
                                        main.project();
                                        break;
                                }
                                    break;

                            case 3:
                                Main main =new Main();
                                main.project();
                                break;
                        }
                    }while (c!=0);
                    break;
                case 5:
                    do {
                        System.out.println("1. Scholarship");
                        System.out.println("2. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        //Scholarship scholarship = new Scholarship();
                        switch (c)
                        {
                            case 1:
                                Scholarship scholarship = new Scholarship();
                                scholarship.scholarship();
                                break;
                            case 2:
                                Main main = new Main();
                                main.project();
                                break;
                        }
                    }while (c!=0);
                    break;
                case 6:
                    do{
                        System.out.println("1. Administrative");
                        System.out.println("2. Board Of Trusties");
                        System.out.println("3. Exit");

                        System.out.println("Choose any option: ");

                        c = in.nextInt();
                        AboutUniversity about = new AboutUniversity();
                        switch (c)
                        {
                            case 1:
                                do {
                                    System.out.println("1. Office of the VC");
                                    System.out.println("2. Office of the Treasurer");
                                    System.out.println("3. Office Of The Registrar");
                                    System.out.println("4. HR Section");
                                    System.out.println("5. Logistic Section");
                                    System.out.println("6. Admission Section");
                                    System.out.println("7. Exit");

                                    System.out.println("Choose any option: ");

                                    c = in.nextInt();
                                    switch (c)
                                    {
                                        case 1:
                                            about.OfficeOfTheVC();
                                            break;
                                        case 2:
                                            about.officeOfTheTreasurer();
                                            break;
                                        case 3:
                                            about.OfficeOfTheRegistrar();
                                            break;
                                        case 4:
                                            about.HRSection();
                                            break;
                                        case 5:
                                            about.logisticSection();
                                            break;
                                        case 6:
                                            about.admissionSection();
                                            break;
                                        case 7:
                                            Main main=new Main();
                                            main.project();
                                            break;

                                    }

                                }while (c!=0);
                                break;
                            case 3:
                                Main main=new Main();
                                main.project();
                                break;


                        }

                    }while (c!=0);
                    break;
            }

        }while (c!=0);

        //StudentInfo studentInfo = new StudentInfo();
        //studentInfo.add();

        //studentInfo.read();



    }




    public static void main(String[] args) throws IOException
    {
        Main m = new Main();
        m.project();

    }


}
