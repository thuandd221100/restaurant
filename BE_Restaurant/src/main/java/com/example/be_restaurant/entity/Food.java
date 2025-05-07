package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "food")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "status")
    private Boolean status;

    // category
}
