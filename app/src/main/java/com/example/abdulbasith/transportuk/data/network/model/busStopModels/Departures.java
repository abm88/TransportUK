package com.example.abdulbasith.transportuk.data.network.model.busStopModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Abdul Basith on 05/12/2017.
 */

public class Departures {
    @SerializedName("all")
    @Expose
    private List<All> all = null;

    public List<All> getAll() {
        return all;
    }

    public void setAll(List<All> all) {
        this.all = all;
    }
}
