/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 *
 * @author RHYZONE
 */
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.NewHibernateUtil;
import pojo.Subquest;
 
public class DAOSubQuest {
    
    public List<Subquest> getbyID(Integer Sub_ID)
    {
        List<Subquest> sq1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Subquest where Sub_ID= :Sub_ID");
            query.setInteger("Sub_ID", Sub_ID);
            sq1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return sq1;
    }
    
    public List<Subquest> showSQ()
    {
       
        List squest=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Subquest");
            squest=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return squest;
    }
}