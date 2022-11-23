package com.generation.generation1.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.generation1.model.BuySell;
import com.generation.generation1.model.Car;
import com.generation.generation1.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }
    public void saveBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public void deleteBuySell(Integer id){
        buySellRepository.deleteById(id);
    }

    public List<BuySell> findAllFecha(Date fecha){
        return buySellRepository.findAllFecha(fecha);
    }
    
    public List<BuySell> findAllBuySell(){
        return buySellRepository.findAll();
    }

    public List<BuySell> findAllBuysell2(){
        return (List<BuySell>) buySellRepository.findAll();
    }
}
