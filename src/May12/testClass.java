package May12;

public class testClass {
    public String applicationToken = null;

    public static void main(String[] args) throws Exception
    {
        testClass obj = new testClass();
        obj.applicationToken = obj.applicationTokenNumber();
        actionClass act = new actionClass(obj.applicationToken);
        System.out.println("The Value Of Global Token Number=="+ act.global_Token_Number);

    }

        public String applicationTokenNumber ()
        {
            return "AAAAA0687";
        }
    }

