package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name = "floor")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Boolean status;
}
