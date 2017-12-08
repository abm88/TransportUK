package com.example.abdulbasith.transportuk.data.network.model.busStopModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Abdul Basith on 05/12/2017.
 */

public class AtcoCodeBusStopModel {

    @SerializedName("atcocode")
    @Expose
    private String atcocode;
    @SerializedName("smscode")
    @Expose
    private String smscode;
    @SerializedName("request_time")
    @Expose
    private String requestTime;
    @SerializedName("bearing")
    @Expose
    private String bearing;
    @SerializedName("indicator")
    @Expose
    private String indicator;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("stop_name")
    @Expose
    private String stopName;
    @SerializedName("departures")
    @Expose
    private Departures departures;

    public String getAtcocode() {
        return atcocode;
    }

    public void setAtcocode(String atcocode) {
        this.atcocode = atcocode;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public Departures getDepartures() {
        return departures;
    }

    public void setDepartures(Departures departures) {
        this.departures = departures;
    }
}
