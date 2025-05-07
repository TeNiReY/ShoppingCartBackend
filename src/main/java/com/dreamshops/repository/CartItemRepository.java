package com.dreamshops.repository;

import com.dreamshops.model.CartItem;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {

    void deleteAllByCartId(Long id);
}
