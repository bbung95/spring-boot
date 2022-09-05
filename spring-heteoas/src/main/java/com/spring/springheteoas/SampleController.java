package com.spring.springheteoas;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class SampleController {

    @GetMapping("hello")
    public EntityModel<Sample> hello(){

        Sample sample = new Sample();
        sample.setPrefix("Hey, ");
        sample.setName("bbung");

        EntityModel<Sample> sampleResource = EntityModel.of(sample);
        sampleResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());
        sampleResource.add(linkTo(methodOn(SampleController.class).getName("rai")).withRel("detail"));

        return sampleResource;
    }

    @GetMapping("/hello/{name}")
    public EntityModel<Sample> getName(@PathVariable String name){

        Sample sample = new Sample();
        sample.setName(name);

        EntityModel<Sample> sampleResource = EntityModel.of(sample);
        sampleResource.add(linkTo(methodOn(SampleController.class).getName(name)).withSelfRel());

        return sampleResource;
    }

//    @GetMapping("hello")
//    public Sample hello(){
//
//        Sample sample = new Sample();
//        sample.setPrefix("Hey, ");
//        sample.setName("bbung");
//
//        return sample;
//    }
}
