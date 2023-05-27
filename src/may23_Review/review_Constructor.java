package may23_Review;

public class review_Constructor {

 int a;
 int b;

    public  review_Constructor()
    {
         a = 5;
         b = 10;
    }

    public static void main(String args[]) throws Exception
    {
        review_Constructor obj = new review_Constructor();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
