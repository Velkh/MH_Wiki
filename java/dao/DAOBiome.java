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
import pojo.Biome;
 
public class DAOBiome {
    
    public void addBiome(Biome biome) {
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(biome);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public void updateBiome(Biome biomes){
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.update(biomes);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Biome> getByID(Integer biomeId) {
        List<Biome> biomes = new ArrayList<>();

        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Biome where biomeId = :biomeId");
            query.setParameter("biomeId",biomeId);
            biomes = query.list();
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return biomes;
    }
    
    public void deleteBiome(Integer biomeId){
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Biome bio = (Biome)session.load(Biome.class, new Integer(biomeId));
            session.delete(bio);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Biome> retrieveBiome(){
        List biom = new ArrayList();
        Transaction trans = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Biome");
            biom = query.list();
            trans.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return biom;
    }
}
