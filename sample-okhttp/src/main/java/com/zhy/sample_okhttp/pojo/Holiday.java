
package com.zhy.sample_okhttp.pojo;

import java.util.HashMap;
import java.util.Map;

public class Holiday {

    private String countryCode;
    private String holidayDate;
    private String holidayDateStr;
    private String holidayName;
    private Integer holidayType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Holiday() {
    }

    /**
     * 
     * @param holidayType
     * @param countryCode
     * @param holidayName
     * @param holidayDate
     * @param holidayDateStr
     */
    public Holiday(String countryCode, String holidayDate, String holidayDateStr, String holidayName, Integer holidayType) {
        super();
        this.countryCode = countryCode;
        this.holidayDate = holidayDate;
        this.holidayDateStr = holidayDateStr;
        this.holidayName = holidayName;
        this.holidayType = holidayType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getHolidayDateStr() {
        return holidayDateStr;
    }

    public void setHolidayDateStr(String holidayDateStr) {
        this.holidayDateStr = holidayDateStr;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Integer getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(Integer holidayType) {
        this.holidayType = holidayType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
