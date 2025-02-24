package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Stock;
import com.example.inventorymanagement.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(int id) {
        return stockRepository.findById(id);
    }

    public Optional<Stock> updateStock(int id, Stock stock) {
        if (stockRepository.existsById(id)) {
            stock.setStockId(id); // Assuming there's a setStockId method in Stock entity
            return Optional.of(stockRepository.save(stock));
        }
        return Optional.empty();
    }

    public boolean deleteStock(int id) {
        if (stockRepository.existsById(id)) {
            stockRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
