package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.generation.generation1.model.BuySell;
import com.generation.generation1.service.BuySellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin("*")
public class BuySellController {
    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService ){
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/save")//c = create
    public void saveBuySell(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }

    @GetMapping(value="/BuySell/all")//r = read
    public List<BuySell> getMethodName() {
        return buySellService.findAll();
    }
    
    @PutMapping("BuySell/update")//u = update
    public void updateBuySell(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @DeleteMapping("BuySell/delete/{id}")//d = delete
    public void deleteBuySell(@PathVariable("id") Integer id){
        buySellService.deleteBuySell(id);
    }
}
//CRUD
//c = create
//r = read
//u = update
//d = delete
//int = formato de dato
//Integer = objeto de formato
//@Postmapping = solo crea preguntando si existe el objeto
//@PutMapping = reemplaza los datos sin preguntar


/* @RequestBody
{
    Id: "1",
    fechaCompraId: "yyyy-MM-dd",
    monto: "10000000"
    userId: "1"
} */