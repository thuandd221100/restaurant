package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Boolean status;
}
