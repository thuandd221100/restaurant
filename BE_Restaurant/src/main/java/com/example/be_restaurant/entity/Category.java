package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "can_up_size")
    private Boolean canUpSize;

    @Column(name = "status")
    private Boolean status;

}
