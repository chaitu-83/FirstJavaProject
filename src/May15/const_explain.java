package May15;

public class const_explain {

    public int roll =0;


    public const_explain()
    {
        System.out.println("I am a Constructor");
         roll= 100;
    }



    public static void main(String args[]) throws Exception
    {
        const_explain obj = new const_explain();
        System.out.println("Roll is =="+obj.roll);
        System.out.println("This output is from roll() Method  " + obj.roll());
    }

    public int roll()
    {
        return 10;
    }
}
