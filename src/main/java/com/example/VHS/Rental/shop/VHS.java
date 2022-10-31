package com.example.VHS.Rental.shop;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "vhs")
public class VHS {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long vhsId;
    private String vhsTitle;
    private Integer availability;

    public VHS(){}
    public VHS( String title, Integer numbOfVhs){
        super();
        this. vhsTitle = title;
        this.availability = numbOfVhs;
    }

}