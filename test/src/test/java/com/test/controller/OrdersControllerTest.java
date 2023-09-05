//package com.test.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectWriter;
//import com.test.dto.OrdersDTO;
//import com.test.entity.Items;
//import com.test.entity.Orders;
//import com.test.service.OrderServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//public class OrdersControllerTest {
//
//    private MockMvc mockMvc;
//    ObjectMapper objectMapper = new ObjectMapper();
//
//    ObjectWriter objectWriter = objectMapper.writer();
//    @InjectMocks
//    private OrderController controller;
//
//    Orders order;
//    List<Orders> orders;
//    OrdersDTO ordersDTO;
//    List<OrdersDTO> ordersDTOS;
//
//    @Mock
//    private OrderServiceImpl service;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//        order = new Orders(1, "29/8/2023", "New", );
//        order = new Orders(2, "28/8/2023", "New", );
//        orders = new ArrayList<Orders>();
//        orders.add(order);
//        orders.add(order);
//
//       ordersDTO = new OrdersDTO(1, "29/8/2023", "New", );
//        ordersDTO = new OrdersDTO(2, "28/8/2023", "New", );
//        ordersDTOS = new ArrayList<OrdersDTO>();
//        ordersDTOS.add(ordersDTO);
//        ordersDTOS.add(ordersDTO);
//    }
//
//    @Test
//    public void addOrdersTest() throws Exception {
//        Mockito.when(service.addOrders((OrdersDTO) ordersDTOS)).thenReturn((Orders) orders);
//        mockMvc.perform(MockMvcRequestBuilders
//                        .post("/orders")
//                        .content(objectWriter.writeValueAsString(ordersDTOS))
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void getOrdersTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/orders")
//                        .content(objectWriter.writeValueAsString(orders))
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//
//    }
//
//    @Test
//    public void getOrdersByOrderIdTest() throws Exception {
//        Mockito.when(service.retreiveOrdersByOrderId(Integer.parseInt(anyString()))).thenReturn(order);
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/orders/1")
//                        .content(objectWriter.writeValueAsString(order))
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//
//    }
//
//}
