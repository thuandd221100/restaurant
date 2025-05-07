package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "yearly_sold_item", indexes = {
        @Index(name = "idx_yearly_summary_id", columnList = "yearly_summary_id"),
        @Index(name = "idx_food", columnList = "food")
})
@Getter
@Setter
@NoArgsConstructor
public class YearlySoldItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yearly_summary_id", nullable = false)
    private YearlySummary yearlySummary;

    @Column(name = "food", nullable = false)
    private String food;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "discount")
    private Double discount;
}