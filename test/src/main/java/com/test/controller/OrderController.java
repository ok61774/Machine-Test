package com.test.controller;

import com.test.dto.OrdersDTO;
import com.test.entity.Orders;
import com.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

        @PostMapping("/orders")
        public ResponseEntity<List<Orders>> createOrders(@RequestBody List<OrdersDTO> ordersDTO){
//        return  new ResponseEntity<>(orderService.addOrders(ordersDTO), HttpStatus.OK);
            return ResponseEntity.ok(orderService.addOrders(ordersDTO));
        }
        @GetMapping("/orders/{orderId}")
        public ResponseEntity<Orders> getOrdersByOrderId(@PathVariable("orderId") int orderId){
        return new ResponseEntity<>(orderService.retreiveOrdersByOrderId(orderId), HttpStatus.OK);
//         return ResponseEntity.ok(orderService.retreiveOrdersByOrderId(orderId));
        }

        @GetMapping("/orders")
        public ResponseEntity<List<Orders>> getAllOrders(){
       return new ResponseEntity<>(orderService.retreiveAllOrders(), HttpStatus.OK);
        }
 }
