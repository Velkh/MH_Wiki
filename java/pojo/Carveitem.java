package pojo;

import dao.DAOCarveItem;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean(name = "ci")
@Entity
@Table(name = "carveitem")
public class Carveitem implements java.io.Serializable {

    @Id
    private Integer ciId;
    private Carveitem carve;
    @Column(name = "LM_ID")
    private Integer lmId;
    private Largemonster largemonster;
    @Column(name = "Item_Name")
    private String itemName;

    public Carveitem() {
    }

    public Integer getLmId() {
        return lmId;
    }

    public void setLmId(Integer lmId) {
        this.lmId = lmId;
    }

    public Carveitem(Largemonster largemonster, String itemName) {
        this.largemonster = largemonster;
        this.itemName = itemName;
    }

    public Integer getCiId() {
        return this.ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public Largemonster getLargemonster() {
        return this.largemonster;
    }

    public void setLargemonster(Largemonster lmons) {
        this.largemonster = lmons;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public void delete(Integer ciId) {
        DAOCarveItem cidao = new DAOCarveItem();
        cidao.deleteCarveitem(ciId);
    }

    public List<Carveitem> getbyid() {
        DAOCarveItem cidao = new DAOCarveItem();
        List<Carveitem> item = cidao.getbyID(ciId);
        largemonster = item.get(0).largemonster;
        itemName = item.get(0).itemName;
        return item;
    }

    public List<Carveitem> getAllRecords() {
        DAOCarveItem cidao = new DAOCarveItem();
        List<Carveitem> item = cidao.showCarveitem();
        return item;
    }


    public List<Carveitem> getCarveitemByMonsterId(Integer lmId) {
        List<Carveitem> carveItems = null;
        DAOCarveItem cidao = new DAOCarveItem();
        try {
            carveItems = cidao.getCarveitemByMonsterId(lmId);
            for (Carveitem item : carveItems) {
                item.setLargemonster(item.getLargemonster());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ganti ini dengan penanganan eksepsi yang sesuai
            carveItems = null; // Set objek carveItems menjadi null jika terjadi eksepsi
        }
        return carveItems;
    }
}