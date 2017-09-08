package com.voodram.repository;

import com.voodram.model.Bungalow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BungalowRepositoryImpl implements BungalowRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Bungalow bungalow) {
        this.mongoTemplate.insert(bungalow);
    }

    @Override
    public List<Bungalow> findAll() {
        return mongoTemplate.findAll(Bungalow.class);
    }

    @Override
    public Bungalow update(Bungalow bungalow) {
        mongoTemplate.save(bungalow);
        return bungalow;
    }

    @Override
    public boolean deleteByName(String name) {

        Query query = Query.query(Criteria.where("name").is(name));
        mongoTemplate.remove(query, Bungalow.class);
        return true;
    }

    @Override
    public Bungalow findByName(String name) {

        Query query = Query.query(Criteria.where("name").is(name));
        Bungalow bungalow =  mongoTemplate.findOne(query,Bungalow.class);
        return bungalow;
    }

    @Override
    public boolean deleteById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Bungalow.class);
        return true;
    }

    @Override
    public Bungalow findById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        Bungalow bungalow = mongoTemplate.findOne(query,Bungalow.class);
        return bungalow;
    }


}
