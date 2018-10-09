package com.rtmap.controller;

import com.rtmap.pojo.Brand;
import com.rtmap.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    BrandService brandService;
    @RequestMapping("/hello")
    public Brand hello(){
      Brand brand = brandService.selectAll();
        return brand;
    }
}
