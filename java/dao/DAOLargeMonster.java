/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 *
 * @author
 */
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.NewHibernateUtil;
import pojo.Largemonster;
import dao.DAOCarveItem;
 
public class DAOLargeMonster {
    
    public void addLM(Largemonster large)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(large);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteLM(Integer lmId)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Largemonster lm=(Largemonster)session.load(Largemonster.class, new Integer(lmId));
            session.delete(lm);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public List<Largemonster> getbyID(Integer lmId)
    {
        List<Largemonster> lm1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Largemonster where lmId= :lmId");
            query.setInteger("lmId", lmId);
            lm1 = query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return lm1;
    }
    
    public List<Largemonster> showLM()
    {
       
        List lm=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Largemonster");
            lm=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return lm;
    }
    
    public void updateLM(Largemonster large)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(large);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }  
    
}