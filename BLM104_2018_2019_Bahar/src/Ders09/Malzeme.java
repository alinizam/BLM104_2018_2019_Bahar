/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alinizam
 */
@Entity
@Table(name = "MALZEME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malzeme.findAll", query = "SELECT m FROM Malzeme m")
    , @NamedQuery(name = "Malzeme.findByMalzemeId", query = "SELECT m FROM Malzeme m WHERE m.malzemeId = :malzemeId")
    , @NamedQuery(name = "Malzeme.findByAdi", query = "SELECT m FROM Malzeme m WHERE m.adi = :adi")
    , @NamedQuery(name = "Malzeme.findByTuru", query = "SELECT m FROM Malzeme m WHERE m.turu = :turu")})
public class Malzeme implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MALZEME_ID")
    private Integer malzemeId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "TURU")
    private String turu;

    public Malzeme() {
    }

    public Malzeme(Integer malzemeId) {
        this.malzemeId = malzemeId;
    }

    public Integer getMalzemeId() {
        return malzemeId;
    }

    public void setMalzemeId(Integer malzemeId) {
        Integer oldMalzemeId = this.malzemeId;
        this.malzemeId = malzemeId;
        changeSupport.firePropertyChange("malzemeId", oldMalzemeId, malzemeId);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        String oldTuru = this.turu;
        this.turu = turu;
        changeSupport.firePropertyChange("turu", oldTuru, turu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (malzemeId != null ? malzemeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malzeme)) {
            return false;
        }
        Malzeme other = (Malzeme) object;
        if ((this.malzemeId == null && other.malzemeId != null) || (this.malzemeId != null && !this.malzemeId.equals(other.malzemeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders09.Malzeme[ malzemeId=" + malzemeId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
