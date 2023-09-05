package com.test.service;

import com.test.dto.OrdersDTO;
import com.test.entity.Orders;

import java.util.List;
import java.util.Optional;

public interface OrderService {


    List<Orders> addOrders(List<OrdersDTO> ordersDTO);

    Orders retreiveOrdersByOrderId(int orderId);

    List<Orders> retreiveAllOrders();
}
