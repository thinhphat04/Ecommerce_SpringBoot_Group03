package com.phat.e.project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "priceDeals")
public class PriceDeal {
    @Id
    private String id;
    @DBRef
    private Product product;
    @DBRef
    private User customer;
    private float proposedPrice;
    private String status;
    @DBRef
    private User admin;
    private Date createdAt;
    private Date updatedAt;

}