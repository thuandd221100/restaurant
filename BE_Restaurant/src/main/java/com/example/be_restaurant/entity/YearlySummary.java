package com.example.be_restaurant.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "yearly_summary", indexes = {
        @Index(name = "idx_year", columnList = "year")
})
@Getter
@Setter
@NoArgsConstructor
public class YearlySummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "total_before")
    private Double totalBefore;

    @Column(name = "total_discount")
    private Double totalDiscount;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "total_order")
    private Integer totalOrder;

    @OneToMany(mappedBy = "yearlySummary", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MonthlySummary> monthlySummaries = new ArrayList<>();

    @OneToMany(mappedBy = "yearlySummary", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<YearlySoldItem> soldItems = new ArrayList<>();
}
