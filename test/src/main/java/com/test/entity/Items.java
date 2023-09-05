package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    private String itemName;

    private float itemUnitPrice;

    private int itemQuantity;

}
