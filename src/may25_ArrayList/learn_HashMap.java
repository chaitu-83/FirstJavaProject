package may25_ArrayList;

import java.util.HashMap;

public class learn_HashMap {

    public static void main(String args[]) throws Exception
    {
        learn_HashMap obj = new learn_HashMap();
        obj.implement_Hash_Map();
    }
    public void implement_Hash_Map()
    {
        HashMap<Integer,String>  emp_details = new HashMap<>();
        emp_details.put(1, "Sachin");
        emp_details.put(2, "gita");
        emp_details.put(3, "gita");
        emp_details.put(4, "Pavan");
        System.out.println(emp_details);
       

    }
}
