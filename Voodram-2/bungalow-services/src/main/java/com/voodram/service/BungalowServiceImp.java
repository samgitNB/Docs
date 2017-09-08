package com.voodram.service;

import com.voodram.model.Bungalow;
import com.voodram.repository.BungalowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BungalowServiceImp implements BungalowService {

    @Autowired
    BungalowRepository bungalowRepository;

    @Override
    public void save(Bungalow bungalow) {

        Bungalow isBungalowExist = bungalowRepository.findByName(bungalow.getName());
        if (isBungalowExist == null) {
            bungalowRepository.save(bungalow);
        }
    }

    @Override
    public List<Bungalow> findAll() {
        return bungalowRepository.findAll();
    }

    @Override
    public Bungalow update(Bungalow reg, String id) {
        Bungalow isExist = bungalowRepository.findById(id);
        Bungalow bungalow = new Bungalow();
        if (id != null && isExist != null) {
            bungalow.setId(id);
            bungalow.setName(reg.getName());
            bungalow = bungalowRepository.update(bungalow);
        }
        return bungalow;
    }

    @Override
    public boolean deleteByName(String name) {

        Bungalow isBungalowExist = bungalowRepository.findByName(name);
        if (isBungalowExist != null) {
            bungalowRepository.deleteByName(name);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        Bungalow isBungalowExist = bungalowRepository.findById(id);
        if (isBungalowExist != null) {
            bungalowRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Bungalow findByName(String name) {
        return bungalowRepository.findByName(name);
    }

    @Override
    public Bungalow findById(String id) {
        return bungalowRepository.findById(id);
    }


}
