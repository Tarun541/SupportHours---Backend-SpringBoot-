package com.example.supplyhouse.api;

import com.example.supplyhouse.entities.SpecialHours;
import com.example.supplyhouse.service.SpecialHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/special-hours")
public class SpecialHoursController {

    @Autowired
    private SpecialHoursService specialHoursService;

    @GetMapping
    public Object getAllSpecialHours(@RequestParam Map<String, String> queryParams) {
        //we can filter special hours by date mentioned in the queryparams and return the response correspondingly
        // if no date is mentioned, we assume to return all the special hrs
        List<SpecialHours> specialHoursList = specialHoursService.getAllSpecialHours();
        return specialHoursList;
    }


    @PostMapping
    public Object addSpecialHours(@RequestBody SpecialHours specialHours) {
        // for adding new special hours
        SpecialHours createdSpecialHours = specialHoursService.addSpecialHours(specialHours);
        return createdSpecialHours;
    }

    @PutMapping("/{id}")
    public Object updateSpecialHours(@PathVariable("id") Long id, @RequestBody SpecialHours specialHours) {
        //updating the existing special hours
        SpecialHours updatedSpecialHours = specialHoursService.updateSpecialHours(id, specialHours);
        return updatedSpecialHours;
    }

    @DeleteMapping("/{id}")
    public void deleteSpecialHoursById(@PathVariable("id") Long id) {
        //deleting the special hours
        specialHoursService.deleteSpecialHoursById(id);
        return ;
    }


}
