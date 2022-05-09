
package ViewCompInfo;


public class User {
    
    private int ID;
    private String company_name;
    private String owner_name;
    private String comp_number;
    private String owner_number;
    private String meter_number;
    private String email;
    private String city;
    private String units;
    private String month;
    private String amount;
   
    public User(int ID , String company_name, String owner_name , String comp_number , String owner_number , String meter_number , String email , String city ,String units, String month , String amount)
    {
        this.ID=ID;
        this.company_name=company_name;
        this.owner_name=owner_name;
        this.comp_number=comp_number;
        this.owner_number=owner_number;
        this.meter_number=meter_number;
        this.email=email;
        this.city=city;
        this.units=units;
        this.month=month;
        this.amount=amount;
    }
    public int getID()
    {
        return ID;
    }
    
    public String getcompany_name()
    {
        return company_name;
    }
    
     public String getowner_name()
    {
        return owner_name;
    }
     
      public String getcomp_number()
    {
        return comp_number;
    }
      
      public String getowner_number()
    {
        return owner_number;
    }
      public String getmeter_number()
    {
        return meter_number;
    }
      
      public String getemail()
    {
        return email;
    }
      
      public String getcity()
    {
        return city;
    }
      
      public String getunits()
    {
        return units;
    }
      
      public String getmonth()
    {
        return month;
    }
      
      public String getamount()
    {
        return amount;
    }
}
