package com.example.demo.controller;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.DetailEntity;
import com.example.demo.service.DetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class DetailController {
    private DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }
    @GetMapping("/all")
    public Iterable <DetailEntity> getAll(){
        return detailService.findAll();
    }

    @PostMapping
    public DetailEntity addDetail(DetailEntity detailEntity){
        return  detailService.save(detailEntity);
    }
}
