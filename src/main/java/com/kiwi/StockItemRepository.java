package com.kiwi;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by malithi on 12/25/16.
 */
public interface StockItemRepository extends JpaRepository<StockItem,Long> {

}
