package com.example.VHS.Rental.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VHSRepository extends CrudRepository<VHS, Long> {
}
