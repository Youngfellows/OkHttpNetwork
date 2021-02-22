
package com.zhy.sample_okhttp.pojo.holiday.foreign;

import java.util.HashMap;
import java.util.Map;

public class Organizer {

    private String email;
    private String displayName;
    private Boolean self;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getSelf() {
        return self;
    }

    public void setSelf(Boolean self) {
        this.self = self;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
