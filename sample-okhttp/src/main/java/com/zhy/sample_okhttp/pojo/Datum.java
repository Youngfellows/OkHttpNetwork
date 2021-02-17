
package com.zhy.sample_okhttp.pojo;

import java.util.HashMap;
import java.util.Map;

public class Datum {

    private String description;
    private Integer id;
    private String name;
    private String thumbnail;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param thumbnail
     * @param name
     * @param description
     * @param id
     */
    public Datum(String description, Integer id, String name, String thumbnail) {
        super();
        this.description = description;
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
