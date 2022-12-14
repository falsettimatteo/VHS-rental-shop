package com.example.VHS.Rental.shop;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "vhs")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class VHS {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private Integer availability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VHS vhs = (VHS) o;
        return id != null && Objects.equals(id, vhs.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}