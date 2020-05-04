package com.ldy.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-04-29 20:30
 */
@Component
//@PropertySource("classpath:person.properties")
@ConfigurationProperties(prefix = "person")
public class Person {

    @Value("${person.id}")
    private Integer id;

    @Value("${person.name}")
    private  String name;

    @Value("#{11*2}")
    private Integer age;

    @Value("${person.data}")
    private Date data;
    private Map<String,String> maps;
    private List<Object>  lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", data=" + data +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
