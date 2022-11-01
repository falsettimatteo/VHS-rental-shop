package com.example.VHS.Rental.shop;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "rental")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentalId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "vhs_id")
    private VHS vhs;
    private Date dateOfRental;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Rental rental = (Rental) o;
        return rentalId != null && Objects.equals(rentalId, rental.rentalId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

