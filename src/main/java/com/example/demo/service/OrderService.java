package com.example.demo.service;

import com.example.demo.data.dto.OrderDto;
import com.example.demo.data.dto.OrderIncomingDto;
import com.example.demo.data.dto.OrderPageDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    public OrderDto createOrder(OrderIncomingDto orderIncomingDto) {

        return null;
    }

    public Optional<OrderDto> getOrder(Long id) {
        return null;
    }

    public Optional<OrderDto> updateOrder(Long id, OrderIncomingDto orderIncomingDto) {
        return null;
    }

    public OrderPageDto getOrders(int page, int size, String sortField, String direction, List<String> status, String search) {
        return null;
    }
}
