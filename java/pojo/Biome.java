package pojo;

import dao.DAOBiome;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;

/**
 * Biome generated by hbm2java
 */
@ManagedBean(name = "guh")
public class Biome implements java.io.Serializable {

    private Integer biomeId;
    private String biomeName;
    private String biomeDesc;
    private Set mainquests = new HashSet(0);
    private Set subquests = new HashSet(0);

    public Biome() {
    }

    public Biome(String biomeName, String biomeDesc) {
        this.biomeName = biomeName;
        this.biomeDesc = biomeDesc;
    }

    public Biome(String biomeName, String biomeDesc, Set mainquests, Set subquests) {
        this.biomeName = biomeName;
        this.biomeDesc = biomeDesc;
        this.mainquests = mainquests;
        this.subquests = subquests;
    }

    public Integer getBiomeId() {
        return this.biomeId;
    }

    public void setBiomeId(Integer biomeId) {
        this.biomeId = biomeId;
    }

    public String getBiomeName() {
        return this.biomeName;
    }

    public void setBiomeName(String biomeName) {
        this.biomeName = biomeName;
    }

    public String getBiomeDesc() {
        return this.biomeDesc;
    }

    public void setBiomeDesc(String biomeDesc) {
        this.biomeDesc = biomeDesc;
    }

    public Set getMainquests() {
        return this.mainquests;
    }

    public void setMainquests(Set mainquests) {
        this.mainquests = mainquests;
    }

    public Set getSubquests() {
        return this.subquests;
    }

    public void setSubquests(Set subquests) {
        this.subquests = subquests;
    }

    public void save() {
        DAOBiome bdao = new DAOBiome();
        bdao.addBiome(this);
    }

    public void delete(Integer biomeId) {
        DAOBiome bdao = new DAOBiome();
        bdao.deleteBiome(biomeId);
    }

    public List<Biome> getbyid() {
        DAOBiome bdao = new DAOBiome();
        List<Biome> bio = bdao.getByID(biomeId);
        biomeName = bio.get(0).biomeName;
        biomeDesc = bio.get(0).biomeDesc;
        return bio;
    }

    public List<Biome> getAllRecords() {
        DAOBiome bdao = new DAOBiome();
        List<Biome> bio = bdao.retrieveBiome();
        return bio;
    }

    public void update() {
        DAOBiome bdao = new DAOBiome();
        bdao.updateBiome(this);
    }
}

