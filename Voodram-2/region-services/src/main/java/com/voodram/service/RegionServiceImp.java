package com.voodram.service;

import com.voodram.model.Region;
import com.voodram.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImp implements RegionService {

    @Autowired
    RegionRepository regionRepository;

    @Override
    public void save(Region region) {

        Region isRegionExist = regionRepository.findByName(region.getName());
        if (isRegionExist == null) {
            regionRepository.save(region);
        }
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Region update(Region reg, String id) {
        Region isExist = regionRepository.findById(id);
        Region region = new Region();
        if (id != null && isExist != null) {
            region.setId(id);
            region.setName(reg.getName());
            region = regionRepository.update(region);
        }
        return region;
    }

    @Override
    public boolean deleteByName(String name) {

        Region isRegionExist = regionRepository.findByName(name);
        if (isRegionExist != null) {
            regionRepository.deleteByName(name);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        Region isRegionExist = regionRepository.findById(id);
        if (isRegionExist != null) {
            regionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Region findByName(String name) {
        return regionRepository.findByName(name);
    }

    @Override
    public Region findById(String id) {
        return regionRepository.findById(id);
    }


}
