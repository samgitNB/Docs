package com.voodram.service;

import com.voodram.model.Bungalow;

import java.util.List;

public interface BungalowService {

    void save(Bungalow bungalow);
    List<Bungalow> findAll();
    Bungalow update(Bungalow bungalow, String id);
    boolean deleteByName(String name);
    boolean deleteById(String id);
    Bungalow findByName(String name);
    Bungalow findById(String id);

}
