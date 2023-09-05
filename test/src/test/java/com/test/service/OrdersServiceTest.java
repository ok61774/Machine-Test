//package com.test.service;
//
//import com.test.dto.OrdersDTO;
//import com.test.entity.Orders;
//import com.test.repository.OrderRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class OrdersServiceTest {
//
//    @InjectMocks
//    OrderServiceImpl services;
//    @Mock
//    OrderRepository orderRepo;
//    Orders order;
//    List<Orders> orders;
//    OrdersDTO ordersDTO;
//    List<OrdersDTO> ordersDTOs;
//
//    @Before
//    public void setup() {
//        order = new Orders(1, "29/8/2023", "New", );
//        order = new Orders(2, "28/8/2023", "New", );
//        orders = new ArrayList<Orders>();
//        orders.add(order);
//        orders.add(order);
//
//        ordersDTO = new OrdersDTO(3, "29/8/2023", "New", );
//        ordersDTO = new OrdersDTO(4, "28/8/2023", "New", );
//        ordersDTOs = new ArrayList<OrdersDTO>();
//        ordersDTOs.add(ordersDTO);
//        ordersDTOs.add(ordersDTO);
//    }
//
//    @Test
//    public void addOrdersServiceTest() {
////        when(usersRepo.findById(anyString())).thenReturn(Optional.ofNullable(user));
//        services.addOrders((OrdersDTO) ordersDTOs);
//    }
//
//    @Test
//    public void getOrdersByOrderIdServiceTest1() {
//
//        when(orderRepo.findById(Integer.valueOf(anyString()))).thenReturn(Optional.of(order));
//        Orders order1 = services.retreiveOrdersByOrderId(Integer.parseInt("7"));
//        assertEquals(order1, order);
//    }
//
//    @Test
//    public void getOrdersByOrderIdServiceTest2() {
//        when(orderRepo.findById(Integer.valueOf(anyString()))).thenReturn(Optional.empty());
//        Assertions.assertThatThrownBy(() -> services.retreiveOrdersByOrderId(Integer.parseInt("tea")))
//                .isInstanceOf(RuntimeException.class)
//                .hasMessageContaining("not found");
//
//    }
//
//
//    @Test
//    public void getOrdersServiceTest() {
//        when(orderRepo.findAll()).thenReturn(new ArrayList<>());
//        Assertions.assertThatThrownBy(() -> services.retreiveAllOrders())
//                .isInstanceOf(RuntimeException.class)
//                .hasMessageContaining("not found");
//    }
//
//}
