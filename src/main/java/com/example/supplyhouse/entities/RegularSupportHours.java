package com.example.supplyhouse.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "operating_hours")
public class RegularSupportHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter@Setter
    @Column(nullable = false)
    private String days;       // "Mon-Thur" or "Fri" or "Sat-Sun"

    @Getter @Setter
    @Column(nullable = false)
    private String startTime;  // "7am"

    @Getter@Setter
    @Column(nullable = false)
    private String endTime;   // "8.45pm"

}

