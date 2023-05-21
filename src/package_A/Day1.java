package package_A;

import package_B.May_10_Basics;

public class Day1 {
    String studentName = "Ravi";
    int studentRoll = 1;
    String address = "4028 logan ridge";
    float marks = 9.5f;
    boolean grade_result = true;


    public static void main(String[] args) throws Exception
    {
        System.out.println("I am learing java...");
        Day1 obj = new Day1();     // creating An object of Day1 class
        May_10_Basics obj2 = new May_10_Basics();   // creating An object of  May_10_Basics class
        obj.add_two_numbers();    // calling add_two_numbers method in Day1 class in package_A
        System.out.println("Student Name is   " + obj.studentName);
        System.out.println(" Student Roll is =" + obj.studentRoll);
        System.out.println(" address is  "+ obj.address);
        System.out.println( obj.marks);
        System.out.println(obj.grade_result);
        System.out.println(" The School Address is " + obj2.schollAddress);  // public datatype from May_10_Basics class
        obj2.rateofBankInterest();     // calling  rateofBankInterest public method  from May_10_Basics class in package_B
       System.out.println(obj.aStringtypeprogram());
       System.out.println(obj.anintegertypeprogram());



    }

    public void add_two_numbers() {
        int sum = 5 + 5;
        System.out.println(sum);
    }

    public String  aStringtypeprogram()
    {
        return "Welcome to java";
    }

    public  int anintegertypeprogram()
    {
        return 20;
    }


}
