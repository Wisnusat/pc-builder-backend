package com.example.pc_builder.dto;

import java.util.List;

public class PCBuildDTO {
    private String buildName;
    private Double totalPrice;
    private List<ComponentDTO> components;

    public PCBuildDTO(String buildName, Double totalPrice, List<ComponentDTO> components) {
        this.buildName = buildName;
        this.totalPrice = totalPrice;
        this.components = components;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ComponentDTO> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentDTO> components) {
        this.components = components;
    }
}
