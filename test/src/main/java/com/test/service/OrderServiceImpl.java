package com.test.service;

import com.test.dto.OrdersDTO;
import com.test.entity.Orders;
import com.test.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Orders> addOrders(List<OrdersDTO> ordersDTO) {
        List<Orders> orders = new ArrayList<>();
        for (OrdersDTO order : ordersDTO){
            Orders orders1 = new Orders();
            orders1.setOrderDate(order.getOrderDate());
            orders1.setOrderStatus(order.getOrderStatus());
            orders1.setItems(order.getItems());
            orders.add(orders1);
        }
      return orderRepository.saveAll(orders);
    }

    @Override
    public Orders retreiveOrdersByOrderId(int orderId) {
    Optional<Orders> order = orderRepository.findByOrderId(orderId);
    if (!order.isPresent()){
        throw new RuntimeException("order is not found");
    }
    Orders order1 = order.get();
    return order1;

    }

    @Override
    public List<Orders> retreiveAllOrders() {
        List<Orders> orders = orderRepository.findAll();
         if(orders.isEmpty()){
             throw new RuntimeException("orders are not found");
         }
         return orders;
    }

    // public ResponseEntity<Object> getAllUsers() {
    //        List<Users> dbUsers = usersRepository.findAll();
    //        if (dbUsers.isEmpty()) {
    //            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //        }
    //       // TODO Auto-generated method stub
    //        return new ResponseEntity<>(dbUsers, HttpStatus.OK);
    //    }

}
