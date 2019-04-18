/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import parlour.at.hand.model.parlor;

/**
 *
 * @author shakiba
 */
public class FactoryDao {

    public List getParlorData(String columnName, String columnValue) {
        Session session = new HibernetSession().getSession();
        String hql = "FROM parlor WHERE " + columnName + " = '" + columnValue + "'";
        session.getTransaction().begin();
        Query query = session.createQuery(hql);
        List results = query.list();
       
        return results;

    }

}
