package com.example.pc_builder.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PC_Builds")
public class PCBuild {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buildId;

    @Column(nullable = false)
    private String buildName;

    @Column(nullable = false)
    private Double totalPrice;

    public void setBuildId(Long buildId) {
        this.buildId = buildId;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getBuildId() {
        return buildId;
    }

    public String getBuildName() {
        return buildName;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
}
