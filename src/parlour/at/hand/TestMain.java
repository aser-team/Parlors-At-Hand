/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand;

import java.util.List;
import parlour.at.hand.dao.FactoryDao;
import parlour.at.hand.model.parlor;
import parlour.at.hand.util.StaticVariables;

/**
 *
 * @author shakiba
 */
public class TestMain {
    FactoryDao fdao;
    public static void main(String[] args)
    {
        new TestMain().myresult();
    }
    public void myresult()
    {
        fdao=new FactoryDao();
       List bylocationlist= fdao.getParlorData(StaticVariables.BY_LOCATION_COLUMN,"Mohammadpur");
       List bynamelist= fdao.getParlorData(StaticVariables.BY_NAME_COLUMN,"Henna by Tasnim");
       List bynamepfor= fdao.getParlorData(StaticVariables.BY_GENDER_COLUMN,"male");
       List byservice= fdao.getParlorData(StaticVariables.BY_SERVICE_COLUMN,"At My Place");
       
       for(Object object:bylocationlist)
       {
           parlor p=(parlor) object;
           System.out.println("Location:"+p.getPowner());
           System.out.println("Location:"+p.getPservicel());
           
                   
       }
       
    }
    
}
