package pojo;
// Generated Oct 5, 2023 4:41:40 PM by Hibernate Tools 4.3.1

import dao.DAOMainQuest;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 */
@ManagedBean (name="mq")
@Entity
@Table("mainquest")
public class Mainquest  implements java.io.Serializable {

    @Id
     private Integer mqId;
     private Mainquest mq;
    @Column
     private Integer biomeId;
     private Biome biome;
    @Column
     private Integer lmId;
     private Largemonster largemonster;
    @Column
     private String mqName;

    public Mainquest() {
    }

    public Integer getBiomeId() {
        return biomeId;
    }

    public void setBiomeId(Integer biomeId) {
        this.biomeId = biomeId;
    }

    public Integer getLmId() {
        return lmId;
    }

    public void setLmId(Integer lmId) {
        this.lmId = lmId;
    }
    
    public Mainquest(Biome biome, Largemonster largemonster, String mqName) {
       this.biome = biome;
       this.largemonster = largemonster;
       this.mqName = mqName;
    }
   
    public Integer getMqId() {
        return this.mqId;
    }
    
    public void setMqId(Integer mqId) {
        this.mqId = mqId;
    }
    public Biome getBiome() {
        return this.biome;
    }
    
    public void setBiome(Biome biome) {
        this.biome = biome;
    }
    public Largemonster getLargemonster() {
        return this.largemonster;
    }
    
    public void setLargemonster(Largemonster largemonster) {
        this.largemonster = largemonster;
    }
    public String getMqName() {
        return this.mqName;
    }

     public List<Mainquest> getbyid() {
        DAOMainQuest mqdao = new DAOMainQuest();
        List<Mainquest> mquest = mqdao.getbyID(mqId);
        biome = mquest.get(0).biome;
        largemonster = mquest.get(0).largemonster;
        mqName= mquest.get(0).mqName;
        return mquest;
    }

    public List<Mainquest> getAllRecords() {
        DAOMainQuest mqdao = new DAOMainQuest();
        List<Mainquest> mquest = mqdao.showMQ();
        return mquest;
    }
    
    public void setMqName(String mqName) {
        this.mqName = mqName;
    }
     public Mainquest getMqById(int id) {
        DAOMainQuest mqdao = new DAOMainQuest();
        try {
            List<Mainquest> mquest = mqdao.getbyID(id);
            if (!mquest.isEmpty()) {
                mq = mquest.get(0);
            } else {
                mqId = null; // Set objek monster menjadi null jika tidak ada monster dengan ID yang sesuai
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ganti ini dengan penanganan eksepsi yang sesuai
            mq = null; // Set objek monster menjadi null jika terjadi eksepsi
        }
        return mq;
    }
     public List<Mainquest> getMainquestByMonsterId(Integer lmId) {
        List<Mainquest> mainquest = null;
        DAOMainQuest mqdao = new DAOMainQuest();
        try {
            mainquest = mqdao.getMainquestByMonsterId(lmId);
            for (Mainquest quest : mainquest) {
                quest.setLargemonster(quest.getLargemonster());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ganti ini dengan penanganan eksepsi yang sesuai
            mainquest = null; // Set objek carveItems menjadi null jika terjadi eksepsi
        }
        return mainquest;
    }       
}
