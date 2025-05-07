package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "shift_sold_item")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ShiftSoldItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // shift summary

    @Column(name = "food")
    private String food;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "discount")
    private Double discount;

}
