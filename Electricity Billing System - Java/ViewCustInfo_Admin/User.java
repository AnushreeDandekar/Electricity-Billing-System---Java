
package ViewCustInfo_Admin;


public class User {
    
    private int u_usernameID;
    private String fn;
    private String ln;
    private String meter_no;
    private String phone_no;
    private String email;
    private String city;
    private String Res_Units;
    private String Month;
    private String Amount;
   
    public User(int u_usernameID , String fn, String ln , String meter_no , String phone_no , String email , String city , String Res_Units , String Month , String Amount)
    {
        this.u_usernameID=u_usernameID;
        this.fn =fn;
        this.ln =ln;
        this.meter_no =meter_no;
        this.phone_no =phone_no;
        this.email =email;
        this.city =city;
        this.Res_Units =Res_Units;
        this.Month =Month;
        this.Amount=Amount;
    }
    public int getu_usernameID()
    {
        return u_usernameID;
    }
    
    public String getfn()
    {
        return fn;
    }
    
     public String getln()
    {
        return ln;
    }
     
      public String getmeter_no()
    {
        return meter_no;
    }
      
      public String getphone_no()
    {
        return phone_no;
    }
      public String getemail()
    {
        return email;
    }
      
      public String getcity()
    {
        return city;
    }
      
      public String getRes_Units()
    {
        return Res_Units;
    }
      
      public String getMonth()
    {
        return Month;
    }
      
      public String getAmount()
    {
        return Amount;
    }
}
