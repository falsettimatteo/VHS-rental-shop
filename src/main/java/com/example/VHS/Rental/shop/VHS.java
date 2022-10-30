package com.example.VHS.Rental.shop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vhs")
public class VHS {

    @Id
    private String vhsId;
    private String vhsTitle;
    private Integer availability;

    public VHS(){}
    public VHS(String id, String title, Integer numbOfVhs){
        super();
        this.vhsId = id;
        this. vhsTitle = title;
        this.availability = numbOfVhs;
    }

    @Id
    public String getVhsId(){
        return vhsId;
    }
    public void setVhsId(String id) {
        this.vhsId = id;
    }

    @Column(name= "vhsTitle")
    public String getVhsTitle(){
        return vhsTitle;
    }
    public void setVhsTitle(String title){
        this.vhsTitle = title;
    }

    @Column(name= "availability")
    public Integer getAvailability(){
        return availability;
    }
    public void setAvailability( Integer num){
        this.availability = num;
    }
}