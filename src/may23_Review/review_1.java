package may23_Review;

public class review_1 {
    String cost = "100";
    String tax = "10";
    String total_Cost = null;

     public static void main(String[] args) throws Exception {
         review_1 obj = new review_1();
         obj.total_Cost = String.valueOf(Integer.parseInt(obj.cost) + Integer.parseInt(obj.tax));
         System.out.println(obj.total_Cost);
     }
}
