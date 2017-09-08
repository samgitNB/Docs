package com.voodram.repository;

import com.voodram.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegionRepositoryImpl implements RegionRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Region region) {
        this.mongoTemplate.insert(region);
    }

    @Override
    public List<Region> findAll() {
        return mongoTemplate.findAll(Region.class);
    }

    @Override
    public Region update(Region region) {
        mongoTemplate.save(region);
        return region;
    }

    @Override
    public boolean deleteByName(String name) {

        Query query = Query.query(Criteria.where("name").is(name));
        mongoTemplate.remove(query, Region.class);
        return true;
    }

    @Override
    public Region findByName(String name) {

        Query query = Query.query(Criteria.where("name").is(name));
        Region region =  mongoTemplate.findOne(query,Region.class);
        return region;
    }

    @Override
    public boolean deleteById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Region.class);
        return true;
    }

    @Override
    public Region findById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        Region region =  mongoTemplate.findOne(query,Region.class);
        return region;
    }


}
