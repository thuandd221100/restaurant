package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "shift_summary")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ShiftSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_before")
    private Double totalBefore;

    @Column(name = "total_discount")
    private Double totalDiscount;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "total_order")
    private Integer totalOrder;

    @Column(name = "status")
    private Boolean status;

    // shift
}
