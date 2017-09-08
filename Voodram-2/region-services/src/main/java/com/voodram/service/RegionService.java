package com.voodram.service;

import com.voodram.model.Region;

import java.util.List;

public interface RegionService {

    void save(Region region);
    List<Region> findAll();
    Region update(Region region ,String id);
    boolean deleteByName(String name);
    boolean deleteById(String id);
    Region findByName(String name);
    Region findById(String id);


}
