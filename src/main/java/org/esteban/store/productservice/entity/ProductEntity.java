package org.esteban.store.productservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Data

public class ProductEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private double unitPrice;
}
