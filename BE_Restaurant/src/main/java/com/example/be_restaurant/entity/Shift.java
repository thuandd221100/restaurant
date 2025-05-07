package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "shift")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "start_cash")
    private Double startCash;

    @Column(name = "status")
    private Boolean status;

    // user
}
