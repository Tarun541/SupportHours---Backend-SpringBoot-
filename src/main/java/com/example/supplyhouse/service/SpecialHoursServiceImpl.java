package com.example.supplyhouse.service;

import com.example.supplyhouse.entities.SpecialHours;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class SpecialHoursServiceImpl implements SpecialHoursService {

    @Override
    public List<SpecialHours> getAllSpecialHours() {
        // Fetch all special hours or query by date
        return null;
    }


    @Override
    public SpecialHours addSpecialHours(SpecialHours specialHours) {
        //  Add new special hours
        return null;
    }

    @Override
    public SpecialHours updateSpecialHours(Long id, SpecialHours specialHours) {
        // Update existing special hours by ID
        return null;
    }

    @Override
    public void deleteSpecialHoursById(Long id) {
        // Delete special hours by ID
    }
}

