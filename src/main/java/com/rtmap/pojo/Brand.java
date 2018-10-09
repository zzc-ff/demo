package com.rtmap.pojo;

import lombok.Data;

@Data
public class Brand {
    private long id;
    private String name;
    private String name_alias;
    private String pinyin;
    private int clazz;
    private String introduce;
}
