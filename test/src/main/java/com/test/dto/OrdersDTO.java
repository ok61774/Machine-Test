package com.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.entity.Items;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersDTO {
    private int orderId;
    private String orderDate;
    private String orderStatus;
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Items> items;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Items items;
}
