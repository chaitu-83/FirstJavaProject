package may22;

public class Learn_Method_OverLoading {
    public static void main(String args[]) throws Exception
    {
        Learn_Method_OverLoading obj = new Learn_Method_OverLoading();
        System.out.println(obj.AddNumbers(5,2,"multi"));
    }

    public int AddNumbers(int a,int b)
    {
        return a+b;
    }
    public int AddNumbers(int a,int b, int c)
    {
        return a+b+c;
    }
    public int AddNumbers(int a,int b, String typeOfCalculation)
    {
        int c = 0;
        if(typeOfCalculation.equals("add"))
        {
            c = a+b;
        }
        if(typeOfCalculation.equals("subs"))
        {
            c = a-b;
        }
        if (typeOfCalculation.equals("multi"))
        {
            c = a * b;
        }
        return c;
    }
}
