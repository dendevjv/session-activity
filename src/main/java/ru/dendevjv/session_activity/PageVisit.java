package ru.dendevjv.session_activity;

import java.io.Serializable;
import java.net.InetAddress;

public class PageVisit implements Serializable {

    private static final long serialVersionUID = -1792952904349428071L;

    private long enteredTimestamp;

    private Long leftTimestamp;

    private String request;

    private InetAddress ipAddress;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getEnteredTimestamp() {
        return enteredTimestamp;
    }

    public Long getLeftTimestamp() {
        return leftTimestamp;
    }

    public String getRequest() {
        return request;
    }

    public InetAddress getIpAddress() {
        return ipAddress;
    }

    public void setEnteredTimestamp(long enteredTimestamp) {
        this.enteredTimestamp = enteredTimestamp;
    }

    public void setLeftTimestamp(Long leftTimestamp) {
        this.leftTimestamp = leftTimestamp;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setIpAddress(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

}
