package com.socgen.stockmarketcharting.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socgen.stockmarketcharting.entity.StockPrice;
@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice,Long> {


}
