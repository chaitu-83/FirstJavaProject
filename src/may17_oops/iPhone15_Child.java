package may17_oops;

public class iPhone15_Child extends iPhone14_Parents
{
    public static void main(String args[]) throws Exception
    {
        iPhone15_Child  ip15 = new iPhone15_Child();
        ip15.call_using_Phone();
        ip15.HD_Picture();
        ip15.Unlock_By_FaceID();

    }
    public void security_By_FingerPrint()
    {
        System.out.println("We can unlock using finger Touch");
    }
    public void HD_Picture()
    {
        System.out.println("We can capture HD Picture");
    }
    public void Lock_By_DoubleShake()
    {
        System.out.println("We can lock using double shake");
    }
}
