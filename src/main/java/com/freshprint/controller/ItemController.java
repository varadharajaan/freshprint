package com.freshprint.controller;

import com.freshprint.services.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Varadharajan on 24/08/20 22:04
 *
 */

@RestController
@RequestMapping("/freshprint/itemmanagement/v1")
public class ItemController {

    ItemService itemService;

    @GetMapping("item/{id}")
    public ResponseEntity<?> findOrder(final long id) {

        return new ResponseEntity<>(itemService.findItem(id), HttpStatus.ACCEPTED);
    }
}
