package com.voodram.controller;


import com.voodram.model.Region;
import com.voodram.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan("com.voodram")
public class RegionController {


    @Autowired
    RegionService regionService;


    @RequestMapping("/")
    public String version(){
        return "2.1.0-RELEASE";
    }

    @RequestMapping(value = "/regions", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody Region region){

        this.regionService.save(region);
    }

    @RequestMapping(value = "/regions", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Region> findAll(){

        return regionService.findAll();
    }

    @RequestMapping(value = "/regions/{id}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Region update(@PathVariable String id , @RequestBody Region region){

        return regionService.update(region ,id);
    }
    @RequestMapping(value = "/regions/name/{name}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteByName(@PathVariable String name){

        this.regionService.deleteByName(name);
    }

    @RequestMapping(value = "/regions/id/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteById(@PathVariable String id){

        this.regionService.deleteById(id);

    }

    @RequestMapping(value = "/regions/name/{name}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Region findByNameOne(@PathVariable String name){

        return regionService.findByName(name);

    }

    @RequestMapping(value = "/regions/id/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Region findByIdOne(@PathVariable String id){

        return regionService.findById(id);

    }

}
