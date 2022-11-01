package com.example.VHS.Rental.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;


    public void addRental(Rental rental) {
        rentalRepository.save(rental);
    }

    public Optional<Rental> getRental(Long id){
        return rentalRepository.findById(id);
    }

    public void updateRental (Rental rental){
        rentalRepository.save(rental);
    }

    public void deleteRentalById (Long id){
        rentalRepository.deleteById(id);
    }

}
