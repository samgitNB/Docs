package com.voodram.controller;


import com.voodram.model.Bungalow;
import com.voodram.service.BungalowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan("com.voodram")
public class BungalowController {


    @Autowired
    BungalowService bungalowService;


    @RequestMapping("/")
    public String version(){
        return "2.1.0-RELEASE - [Bungalow]";
    }

    @RequestMapping(value = "/bungalow", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody Bungalow bungalow){

        this.bungalowService.save(bungalow);
    }

    @RequestMapping(value = "/bungalow", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Bungalow> findAll(){

        return bungalowService.findAll();
    }

    @RequestMapping(value = "/bungalow/{id}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bungalow update(@PathVariable String id , @RequestBody Bungalow bungalow){

        return bungalowService.update(bungalow,id);
    }
    @RequestMapping(value = "/bungalow/name/{name}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteByName(@PathVariable String name){

        this.bungalowService.deleteByName(name);
    }

    @RequestMapping(value = "/bungalow/id/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteById(@PathVariable String id){

        this.bungalowService.deleteById(id);

    }

    @RequestMapping(value = "/bungalow/name/{name}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Bungalow findByNameOne(@PathVariable String name){

        return bungalowService.findByName(name);

    }

    @RequestMapping(value = "/bungalow/id/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Bungalow findByIdOne(@PathVariable String id){

        return bungalowService.findById(id);

    }

}
