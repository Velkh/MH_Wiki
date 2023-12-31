package pojo;
// Generated Oct 5, 2023 4:41:40 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import dao.DAOLargeMonster;
import java.util.List;
import javax.faces.bean.ManagedBean;


/**
 * Largemonster generated by hbm2java
 */
@ManagedBean (name="lm")
public class Largemonster  implements java.io.Serializable {


     private Integer lmId;
     private String lmName;
     private String lmType;
     private Largemonster monster;
     private Set mainquests = new HashSet(0);
     private Set carveitems = new HashSet(0);

    public Largemonster() {
    }

	
    public Largemonster(String lmName, String lmType) {
        this.lmName = lmName;
        this.lmType = lmType;
    }
    public Largemonster(String lmName, String lmType, Set mainquests, Set carveitems) {
       this.lmName = lmName;
       this.lmType = lmType;
       this.mainquests = mainquests;
       this.carveitems = carveitems;
    }

    public Largemonster(int lmId, String lmName, String lmType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Integer getLmId() {
        return this.lmId;
    }
    
    public void setLmId(Integer lmId) {
        this.lmId = lmId;
    }
    public String getLmName() {
        return this.lmName;
    }
    
    public void setLmName(String lmName) {
        this.lmName = lmName;
    }
    public String getLmType() {
        return this.lmType;
    }
    
    public void setLmType(String lmType) {
        this.lmType = lmType;
    }
    public Set getMainquests() {
        return this.mainquests;
    }

    public Largemonster getMonster() {
        return monster;
    }

    public void setMonster(Largemonster monster) {
        this.monster = monster;
    }
    
    public void setMainquests(Set mainquests) {
        this.mainquests = mainquests;
    }
    public Set getCarveitems() {
        return this.carveitems;
    }
    
    public void setCarveitems(Set carveitems) {
        this.carveitems = carveitems;
    }
 public void save() {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        lmdao.addLM(this);
    }

    public void delete(Integer lmId) {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        lmdao.deleteLM(lmId);
    }

    public List<Largemonster> getbyid() {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        List<Largemonster> large = lmdao.getbyID(lmId);
        lmName = large.get(0).lmName;
        lmType = large.get(0).lmType;
        return large;
    }
    public List<Largemonster> getAllRecords() {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        List<Largemonster> large = lmdao.showLM();
        return large;
    }

    public void update() {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        lmdao.updateLM(this);
    }
    public Largemonster getMonsterById(int id) {
        DAOLargeMonster lmdao = new DAOLargeMonster();
        try {
            List<Largemonster> large = lmdao.getbyID(id);
            if (!large.isEmpty()) {
                monster = large.get(0);
            } else {
                lmId = null; // Set objek monster menjadi null jika tidak ada monster dengan ID yang sesuai
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ganti ini dengan penanganan eksepsi yang sesuai
            monster = null; // Set objek monster menjadi null jika terjadi eksepsi
        }
        return monster;
    }
}



