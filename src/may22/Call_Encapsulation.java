package may22;

public class Call_Encapsulation {

    // you want to see mobile data here

    public static void main(String args[])
    {
        Encapsulation_Learn obj = new Encapsulation_Learn();
        obj.setMobileData(12345, "#123*");
        obj.setMobileData(124,"*45t6");
        System.out.println("You still have balance of ==>" + obj.getMobileData()+" " + "GB");
        System.out.println("Your Hike This year is==>" + obj.getHike());

    }
}
