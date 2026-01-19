package org.allitov.wiremocksandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @EqualsAndHashCode.Exclude
    private Integer id;

    private String title;

    private Double price;

    private String description;

    private String category;

    @EqualsAndHashCode.Exclude
    private String image;
}
