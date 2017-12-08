package com.example.abdulbasith.transportuk.data.network.model.busStopModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class LocalBusStopModel {
    @SerializedName("minlon")
    @Expose
    private Double minlon;
    @SerializedName("minlat")
    @Expose
    private Double minlat;
    @SerializedName("maxlon")
    @Expose
    private Double maxlon;
    @SerializedName("maxlat")
    @Expose
    private Double maxlat;
    @SerializedName("searchlon")
    @Expose
    private Double searchlon;
    @SerializedName("searchlat")
    @Expose
    private Double searchlat;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("rpp")
    @Expose
    private Integer rpp;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("request_time")
    @Expose
    private String requestTime;
    @SerializedName("stops")
    @Expose
    private List<Stop> stops = null;

    public Double getMinlon() {
        return minlon;
    }

    public void setMinlon(Double minlon) {
        this.minlon = minlon;
    }

    public Double getMinlat() {
        return minlat;
    }

    public void setMinlat(Double minlat) {
        this.minlat = minlat;
    }

    public Double getMaxlon() {
        return maxlon;
    }

    public void setMaxlon(Double maxlon) {
        this.maxlon = maxlon;
    }

    public Double getMaxlat() {
        return maxlat;
    }

    public void setMaxlat(Double maxlat) {
        this.maxlat = maxlat;
    }

    public Double getSearchlon() {
        return searchlon;
    }

    public void setSearchlon(Double searchlon) {
        this.searchlon = searchlon;
    }

    public Double getSearchlat() {
        return searchlat;
    }

    public void setSearchlat(Double searchlat) {
        this.searchlat = searchlat;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRpp() {
        return rpp;
    }

    public void setRpp(Integer rpp) {
        this.rpp = rpp;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
}
