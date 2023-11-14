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
import pojo.Admin;
 
public class DAOAdmin {
    
    public void addAdmin(Admin admin)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(admin);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteAdmin(Integer adminId)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Admin adm=(Admin)session.load(Admin.class, new Integer(adminId));
            session.delete(adm);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
  public List<Admin> getbyID(Integer adminId) {
        List<Admin> admins = new ArrayList<>();

        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin where adminId = :adminId");
            query.setParameter("adminId",adminId);
            admins = query.list();
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return admins;
    }
    
    public List<Admin> showAdmin()
    {
       
        List admin=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Admin");
            admin=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return admin;
    }
    
    public void updateAdmin(Admin admin)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(admin);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    } 
        public List<Admin> validateLogin(String username, String password)
    {
        List<Admin> admins=new ArrayList();
       
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Admin where username= :username and password= :password");
            query.setString("username", username);
            query.setString("password", password);
            admins=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return admins;
    }
}  
   