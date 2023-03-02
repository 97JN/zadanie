package com.example.demo.service;

import com.example.demo.entity.DetailEntity;
import com.example.demo.repository.DetailRepository;
import org.springframework.stereotype.Service;

@Service

public class DetailService {
    private final DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public Iterable<DetailEntity> findAll() {
        return detailRepository.findAll();
    }

    public DetailEntity save(DetailEntity detailEntity) {
        return detailRepository.save(detailEntity);
    }
}
