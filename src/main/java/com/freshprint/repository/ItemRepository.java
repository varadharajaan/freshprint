package com.freshprint.repository;


import com.freshprint.model.ItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemMaster, Long> {

}
