package com.example.supplyhouse.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "special_hours")
public class SpecialHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter@Setter
    @Column(nullable = false)
    private LocalDate splHrsStartDate;     //from which date special hours will start

    @Getter@Setter
    @Column(nullable = false)
    private LocalDate splHrsEndDate;       // until when special hours will remain active

    @Getter@Setter
    @Column(nullable = false)
    private String startTime;              // special hrs start time Ex: "7am"

    @Getter@Setter
    @Column(nullable = false)
    private String endTime;                // special hrs end time Ex: "8pm"

    @Getter@Setter
    @Column(nullable = false)
    private String message;                // reason for special hrs

}
