/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class User {
    
    String sname,sprice,sdes,pname;
    
    User(String sname,String sprice,String sdes,String pname)
    {
        this.sname=sname;
        this.sprice=sprice;
        this.sdes=sdes;
        this.pname=pname;
     }
        
    public String get_sname()
    {
    	return this.sname;
    }
    public String get_sprice()
    {
       return this.sprice;
    }
    public String get_sdes()
    {
       return this.sdes;
    }
    public String get_pname()
    {
       return this.pname;
    }
 
}