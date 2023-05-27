package may23_Review;

public class add_Concat {
    public void add_two_numbers( int a,int b) {
        int c = a + b;
        System.out.println("The number is "+ c);

    }
    public String add_three_numbers( int a, int b,int c)
    {
        int sum = a+b+c;
        return String.valueOf(sum);
    }


    public static void main(String args[]) throws Exception
    {
        add_Concat obj = new add_Concat();
        obj.add_two_numbers(5,8);
        System.out.println(obj.add_three_numbers(5,8,9) );
    }
}
