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
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.NewHibernateUtil;
import pojo.Carveitem;
 
public class DAOCarveItem {
    
    
    public void deleteCarveitem(Integer ciId)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Carveitem ctm=(Carveitem)session.load(Carveitem.class, new Integer(ciId));
            session.delete(ctm);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public List<Carveitem> getbyID(Integer ciId)
    {
        List<Carveitem> cv1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Carveitem where ciId= :ciId");
            query.setInteger("ciId", ciId);
            cv1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return cv1;
    }
    
    public List<Carveitem> showCarveitem()
    {
       
        List carved=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Carveitem");
            carved=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return carved;
    }
    
   
    public List<Carveitem> getCarveitemByMonsterId(Integer lmId) {
        List<Carveitem> carveItems = new ArrayList<>();
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(Carveitem.class);
            criteria.createAlias("largemonster", "lm");
            criteria.add(Restrictions.eq("lm.lmId", lmId));
            carveItems = criteria.list();
            trans.commit();
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return carveItems;
    }
}
