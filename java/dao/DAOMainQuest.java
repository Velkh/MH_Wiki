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
import pojo.Mainquest;
 
public class DAOMainQuest {
    
    
    public List <Mainquest> getbyID(Integer MQ_ID)
    {
        List<Mainquest> mq1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Mainquest where MQ_ID= :MQ_ID");
            query.setInteger("MQ_ID", MQ_ID);
            mq1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return mq1;
    }
    
    public List<Mainquest> showMQ()
    {
       
        List main=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Mainquest");
            main=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return main;
    }
    
   
    public List<Mainquest> getMainquestByMonsterId(Integer lmId) {
        List<Mainquest> mainquest = new ArrayList<>();
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(Mainquest.class);
            criteria.createAlias("largemonster", "lm");
            criteria.add(Restrictions.eq("lm.lmId", lmId));
            mainquest = criteria.list();
            trans.commit();
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return mainquest;
    }
    
}