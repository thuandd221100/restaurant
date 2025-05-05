package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String role;

}
