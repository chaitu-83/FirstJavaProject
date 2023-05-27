package may25_ArrayList;

import java.util.ArrayList;

public class array_List {
    public static void main(String args[]) throws Exception {
        array_List obj = new array_List();
       // obj.implement_ArrayLIst_StudentName();
        obj.implement_Employee_ID();


    }

    public void implement_ArrayLIst_StudentName() {
        ArrayList<String> stuName = new ArrayList<>();
        stuName.add("ravi1"); // array[0]
        stuName.add("ravi2");
        stuName.add("ravi3");
        stuName.add("ravi4");
        stuName.add("ravi5");
        stuName.add("ravi6");
        stuName.add("ravi7");
        stuName.add("ravi8");
        stuName.add("ravi9");
        stuName.add("ravi10");

        System.out.println(stuName);

        // accessing arraylist by Index
        try {
            System.out.println(stuName.get(10));


        } catch (Exception e) {
            System.out.println("Index OutOfBound Exception" +e);
        }

        System.out.println(stuName.get(9)); // array[10]
        System.out.println(stuName.get(0));


        // reset the hello of an arrayalist
        stuName.set(0,"Sachin");
        stuName.set(9,"Raghu");
        System.out.println(stuName);
        System.out.println(stuName.get(9)); // array[10]
        System.out.println(stuName.get(0));


        // remove data from arraylist
        stuName.remove(9);
        System.out.println(stuName.get(8)); // array[10]
        System.out.println(stuName.get(0));

        //Printing arraylist using loop
        for(String student_Name: stuName)
        {
            System.out.println("The student name is ==>"+student_Name);
        }


    }
    public void implement_Employee_ID()

    {
        ArrayList<Integer> empID = new ArrayList<>();
        empID.add(001);
        empID.add(002);
        empID.add(003);
        empID.add(004);
        empID.add(005);
        empID.add(006);
        empID.add(007);



        System.out.println(empID);
        System.out.println(empID.get(5));
        System.out.println(empID.get(2));
        empID.set(1,20);
        System.out.println(empID.get(1));

      for(Integer employeeNo : empID)
      {
          System.out.println("The Employee Number is ====>"+employeeNo);
      }




    }
}
