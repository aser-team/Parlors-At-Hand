/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author shakiba
 */
public class HibernetSession {

   public Session getSession()
   {
       Session session=null;
       SessionFactory factory=new Configuration().configure().buildSessionFactory();
       session=factory.openSession();
       return session;
   }
}
