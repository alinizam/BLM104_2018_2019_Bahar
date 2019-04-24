/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fsmblm0
 */
@Entity
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findByPersonelId", query = "SELECT p FROM Personel p WHERE p.personelId = :personelId")
    , @NamedQuery(name = "Personel.findByName", query = "SELECT p FROM Personel p WHERE p.name = :name")
    , @NamedQuery(name = "Personel.findBySurname", query = "SELECT p FROM Personel p WHERE p.surname = :surname")
    , @NamedQuery(name = "Personel.findBySalary", query = "SELECT p FROM Personel p WHERE p.salary = :salary")
    , @NamedQuery(name = "Personel.findByUnvanId", query = "SELECT p FROM Personel p WHERE p.unvanId = :unvanId")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERSONEL_ID")
    private Integer personelId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "SALARY")
    private Integer salary;
    @Column(name = "UNVAN_ID")
    private Integer unvanId;

    public Personel() {
    }

    public Personel(Integer personelId) {
        this.personelId = personelId;
    }

    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(Integer unvanId) {
        this.unvanId = unvanId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personelId != null ? personelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.personelId == null && other.personelId != null) || (this.personelId != null && !this.personelId.equals(other.personelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sorular.Personel[ personelId=" + personelId + " ]";
    }
    
}
