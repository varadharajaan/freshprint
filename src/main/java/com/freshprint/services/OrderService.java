package com.freshprint.services;

import com.freshprint.model.Order;

/**
 * @Author Varadharajan on 24/08/20 21:57
 *
 */
public interface OrderService {

    Order findOrder(String id);
}
