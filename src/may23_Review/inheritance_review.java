package may23_Review;

public class inheritance_review extends review_1{
    public static void main(String args[]) throws Exception
    {
        inheritance_review obj1 =new inheritance_review();
        obj1.total_Cost= String.valueOf(Integer.parseInt(obj1.cost) + Integer.parseInt(obj1.tax));
        System.out.println(obj1.total_Cost);

    }
}
