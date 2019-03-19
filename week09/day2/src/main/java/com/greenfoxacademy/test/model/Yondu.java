package com.greenfoxacademy.test.model;

public class Yondu {
    double distance;
    double time;
    double speed;

    public Yondu() {
    }

    public Yondu(double distance, double time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance/time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void calculateSpeed(double distance, double time) {
        setDistance(distance);
        setTime(time);
        setSpeed(distance/time);
    }
}
