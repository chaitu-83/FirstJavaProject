package may22;

import java.sql.Date;

public class Encapsulation_Learn {
       // this is  the place where AT&T are keeping private data for every customer...
    private int mobileData = 0;
    private float hike = 0;
    public float getHike()
    {
        return hike;
    }
    public void setHike(int empId, Date dob,String Password)
    {
        this.hike = getHikeDataFromDB(empId, dob, Password);
    }

    // getter method
    public int getMobileData()
    {
        return mobileData;
    }

    // setter method
    public void setMobileData(int MobileNumber, String Code) {
        this.mobileData = getTheDataFromPrivateDataBase(MobileNumber, Code);
    }
    private int getTheDataFromPrivateDataBase(int MobileNumber , String Code)
    {
        int data = 0;
        // data = SqlData
        return 12;
    }
    private float  getHikeDataFromDB(int  empID, Date Dob, String Password )
    {
        float individual_Hike = 0;
        // Individual_Hike = SqlData
        return 8.2f;
    }
}
