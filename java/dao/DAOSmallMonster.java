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
import pojo.Smallmonster;
 
public class DAOSmallMonster {
    
    public void addSM(Smallmonster small)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(small);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteSM(Integer SM_ID)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Smallmonster sm=(Smallmonster)session.load(Smallmonster.class, new Integer(SM_ID));
            session.delete(sm);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public List<Smallmonster> getbyID(Integer SM_ID)
    {
        List<Smallmonster> sm1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Smallmonster where SM_ID= :SM_ID");
            query.setInteger("SM_ID", SM_ID);
            sm1 = query.list();
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return sm1;
    }
    
    public List<Smallmonster> showSM()
    {
       
        List small=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Smallmonster");
            small=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return small;
    }
    
    public void updateSM(Smallmonster small)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(small);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }   
}