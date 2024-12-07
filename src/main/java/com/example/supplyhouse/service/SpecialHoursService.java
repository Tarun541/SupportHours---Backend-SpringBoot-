package com.example.supplyhouse.service;

import com.example.supplyhouse.entities.SpecialHours;

import java.time.LocalDate;
import java.util.List;

public interface SpecialHoursService {

    List<SpecialHours> getAllSpecialHours();                               // Fetch all special hours

    SpecialHours addSpecialHours(SpecialHours specialHours);              // Add new special hours

    SpecialHours updateSpecialHours(Long id, SpecialHours specialHours);  // Update special hours by ID

    void deleteSpecialHoursById(Long id);                                 // Delete special hours by ID
}
