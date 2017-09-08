package com.voodram.repository;

import com.voodram.model.Bungalow;

import java.util.List;

public interface BungalowRepository {

    void save(Bungalow bungalow);
    List<Bungalow> findAll();
    Bungalow update(Bungalow bungalow);
    boolean deleteByName(String name);
    Bungalow findByName(String name);
    boolean deleteById(String id);
    Bungalow findById(String id);


}
