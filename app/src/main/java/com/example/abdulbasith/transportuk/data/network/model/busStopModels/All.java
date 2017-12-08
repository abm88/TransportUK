package com.example.abdulbasith.transportuk.data.network.model.busStopModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Abdul Basith on 05/12/2017.
 */

public class All {

    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("line_name")
    @Expose
    private String lineName;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("operator_name")
    @Expose
    private String operatorName;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("aimed_departure_time")
    @Expose
    private String aimedDepartureTime;
    @SerializedName("expected_departure_date")
    @Expose
    private Object expectedDepartureDate;
    @SerializedName("expected_departure_time")
    @Expose
    private Object expectedDepartureTime;
    @SerializedName("best_departure_estimate")
    @Expose
    private String bestDepartureEstimate;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("source")
    @Expose
    private String source;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    public void setAimedDepartureTime(String aimedDepartureTime) {
        this.aimedDepartureTime = aimedDepartureTime;
    }

    public Object getExpectedDepartureDate() {
        return expectedDepartureDate;
    }

    public void setExpectedDepartureDate(Object expectedDepartureDate) {
        this.expectedDepartureDate = expectedDepartureDate;
    }

    public Object getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    public void setExpectedDepartureTime(Object expectedDepartureTime) {
        this.expectedDepartureTime = expectedDepartureTime;
    }

    public String getBestDepartureEstimate() {
        return bestDepartureEstimate;
    }

    public void setBestDepartureEstimate(String bestDepartureEstimate) {
        this.bestDepartureEstimate = bestDepartureEstimate;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
