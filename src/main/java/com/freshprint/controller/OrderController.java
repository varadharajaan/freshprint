package com.freshprint.controller;

import com.freshprint.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Varadharajan on 24/08/20 22:02
 */

@RestController
@RequestMapping("/freshprint/ordermanagement/v1")
public class OrderController {

    OrderService orderService;

    @GetMapping("order/{id}")
    public ResponseEntity<?> findOrder( final String id) {

        return new ResponseEntity<>(orderService.findOrder(id), HttpStatus.ACCEPTED);
    }
}
