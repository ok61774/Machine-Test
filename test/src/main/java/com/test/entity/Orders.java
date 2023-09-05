package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

//@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String orderDate;
    private String orderStatus;
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Items> items;
//     private Collection<Items> items;
    //private Set<Tutorial> tutorials = new HashSet<>();
   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   private Items items;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", items=" + items +
                '}';
    }
}
