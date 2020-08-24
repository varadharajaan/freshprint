package com.freshprint.services;

import com.freshprint.model.ItemMaster;

/**
 * @Author Varadharajan on 24/08/20 21:57
 *
 */
public interface ItemService {

    ItemMaster findItem(long id);
}
