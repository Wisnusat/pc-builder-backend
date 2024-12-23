package com.example.pc_builder.dto;

import lombok.Data;

@Data
public class ComponentDTO {
    private Long componentId;
    private String name;
    private String category;
    private Double price;
}
