package com.app.restaurant0.model;

public class Order {

    String nameOrd, restOrd, tabletNumOrd, timeOrd, guestsOrd, statusOrd;

    public Order() {}

    public Order(String nameOrd, String restOrd, String tabletNumOrd, String timeOrd, String guestsOrd, String statusOrd) {
        this.nameOrd = nameOrd;
        this.restOrd = restOrd;
        this.tabletNumOrd = tabletNumOrd;
        this.timeOrd = timeOrd;
        this.guestsOrd = guestsOrd;
        this.statusOrd = statusOrd;
    }

    public String getNameOrd() {
        return nameOrd;
    }

    public void setNameOrd(String nameOrd) {
        this.nameOrd = nameOrd;
    }

    public String getRestOrd() {
        return restOrd;
    }

    public void setRestOrd(String restOrd) {
        this.restOrd = restOrd;
    }

    public String getTabletNumOrd() {
        return tabletNumOrd;
    }

    public void setTabletNumOrd(String tabletNumOrd) {
        this.tabletNumOrd = tabletNumOrd;
    }

    public String getTimeOrd() {
        return timeOrd;
    }

    public void setTimeOrd(String timeOrd) {
        this.timeOrd = timeOrd;
    }

    public String getGuestsOrd() {
        return guestsOrd;
    }

    public void setGuestsOrd(String guestsOrd) {
        this.guestsOrd = guestsOrd;
    }

    public String getStatusOrd() {
        return statusOrd;
    }

    public void setStatusOrd(String statusOrd) {
        this.statusOrd = statusOrd;
    }
}
