package com.freshprint.services.servicesimpl;

import com.freshprint.model.ItemMaster;
import com.freshprint.repository.ItemRepository;
import com.freshprint.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Varadharajan on 24/08/20 21:58
 *
 */
public class ItermServiceImpl implements ItemService {


    @Autowired
    ItemRepository itemRepository;

    @Override
    public ItemMaster findItem(long id) {
        return itemRepository.findById(id).orElseThrow();
    }
}
