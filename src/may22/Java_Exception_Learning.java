package may22;

public class Java_Exception_Learning {

    public static void main(String args[])
    {
        Java_Exception_Learning obj = new Java_Exception_Learning();
        obj.launchAmazon();
        obj.validate_Amazon_Logo();
        obj.validate_Amazon_Header_Navigations();
        obj.login_Amazon();
        obj.validate_Amazon_Footer_Navigations();
        obj.quit_Amazon();
    }
    public void launchAmazon()
    {
        System.out.println("Launching Amazon");
    }

    public void validate_Amazon_Logo()
    {
        try {
            int a = 5 / 0;
       } catch (Exception e){
          System.out.println("There is some problem during logo validation and the error is ===>" + e);

       }
    }

    public void validate_Amazon_Header_Navigations()
    {
        System.out.println(" Validating Header Navigations");
    }
    public void login_Amazon()
    {
        System.out.println("login into Amazon");
    }
    public void validate_Amazon_Footer_Navigations()
    {
        System.out.println("Launching Amazon Footer Navigations");

    }
    public void quit_Amazon()
    {
        System.out.println("Quiting Amazon");
    }
}
