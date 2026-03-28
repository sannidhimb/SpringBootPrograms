package com.example.addition.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.addition.dto.request.AddRequest;
import com.example.addition.dto.response.AddResponse;
import com.example.addition.entity.AddEntity;
import com.example.addition.repository.AddRepository;



@Service
public class AddService {

    private final AddRepository addRepo;

    public AddService(AddRepository addRepo) {
        this.addRepo = addRepo;
    }

    public AddResponse calculate(AddRequest request) {
        Integer a = request.getA();
        Integer b = request.getB();
        Integer c = a + b;

        AddEntity entity = new AddEntity();
        entity.setA(a);
        entity.setB(b);
        entity.setC(c);

        AddEntity saved = addRepo.save(entity);

        AddResponse res = new AddResponse();
        res.setA(saved.getA());
        res.setB(saved.getB());
        res.setC(saved.getC());

        return res;
    }

 
    public List<AddResponse> getEveryAddition() {
        List<AddEntity> entities = addRepo.findAll();

        return entities.stream().map(entity -> {
            AddResponse res = new AddResponse();
            res.setA(entity.getA());
            res.setB(entity.getB());
            res.setC(entity.getC());
            return res;
        }).collect(Collectors.toList());
    }
}