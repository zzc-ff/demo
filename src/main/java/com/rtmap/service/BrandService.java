package com.rtmap.service;

import com.rtmap.dao.BrandDao;
import com.rtmap.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    @Autowired
    BrandDao brandDao;

    public Brand selectAll() {
        return brandDao.selectAll();
    }
}
