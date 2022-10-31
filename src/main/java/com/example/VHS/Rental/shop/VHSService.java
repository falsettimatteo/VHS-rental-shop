package com.example.VHS.Rental.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VHSService {

    @Autowired
    private VHSRepository vhsRepository;


    public List<VHS> getAllVhs(){
        List<VHS> allVhs = new ArrayList<>();
        vhsRepository.findAll().forEach(allVhs::add);
        return allVhs;
    }

    public void addVhs(VHS vhs) {
        vhsRepository.save(vhs);
    }

    public Optional<VHS> getVhs(Long id){
        return vhsRepository.findById(id);
    }

    public void updateVhs (VHS vhs){
        vhsRepository.save(vhs);
    }

    public void deleteByIdVhs (Long id){
        vhsRepository.deleteById(id);
    }

    public boolean existById(Long id){
        if( vhsRepository.findById(id).get() != null){
            return true;
        }return false;
    }
}
