package com.turkcell.mini_e_commere_hw2.service.application;

import com.turkcell.mini_e_commere_hw2.dto.order.OrderListingDto;

import java.util.List;
import java.util.UUID;

public interface OrderApplicationService {
    OrderListingDto createOrder();
    OrderListingDto createOrder(UUID userId);
    OrderListingDto updateOrderState(Integer id);
    List<OrderListingDto> getAllUserOrders();
    List<OrderListingDto> getAllUserOrders(UUID userId);
    OrderListingDto getOrderById(Integer id);

    void deleteOrder(Integer orderId);
}
