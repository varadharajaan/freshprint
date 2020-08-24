package com.freshprint.services.servicesimpl;

import com.freshprint.model.Order;
import com.freshprint.repository.OrderRepository;
import com.freshprint.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Varadharajan on 24/08/20 21:58
 *
 */
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order findOrder(String id) {
        return orderRepository.findById(id).orElseThrow();
    }
}
