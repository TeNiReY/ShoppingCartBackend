package com.dreamshops.dto;

import com.dreamshops.model.Category;
import com.dreamshops.model.Image;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category; // 1 product 1 category
    private List<ImageDto> images; //cuz 1 product can have many images

}
