package com.example.abdulbasith.transportuk.data.network.model.busStopModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class Stop {
    @SerializedName("atcocode")
    @Expose
    private String atcocode;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stop_name")
    @Expose
    private String stopName;
    @SerializedName("smscode")
    @Expose
    private String smscode;
    @SerializedName("bearing")
    @Expose
    private String bearing;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("indicator")
    @Expose
    private String indicator;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("distance")
    @Expose
    private Integer distance;

    public String getAtcocode() {
        return atcocode;
    }

    public void setAtcocode(String atcocode) {
        this.atcocode = atcocode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
