package com.turkcell.mini_e_commere_hw2.dto.product;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductListingDto {
    private Integer id;
    private String name;
    private BigDecimal unitPrice;
    private int stock;
    private Integer categoryId;
    private String categoryName;
    private String description;
    private String image;
}
