package com.aletronics.digitalmb;

/**
 * Created by Alex on 12/4/2016.
 */

public class CurrentWeather {
    private String mIcon = null;
    private long mTime = 0;
    private double mTemp = 0.0;
    private double mHumidity = 0.0;
    private double mPrecipChance = 0.0;
    private String mSummary = null;
    private double mTemperature;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemp() {
        return mTemp;
    }

    public void setTemp(double temp) {
        mTemp = temp;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

}
