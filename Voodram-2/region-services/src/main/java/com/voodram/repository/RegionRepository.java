package com.voodram.repository;

import com.voodram.model.Region;

import java.util.List;

public interface RegionRepository {

    void save(Region region);
    List<Region> findAll();
    Region update(Region region);
    boolean deleteByName(String name);
    Region findByName(String name);
    boolean deleteById(String id);
    Region findById(String id);


}
