package com.wakeup.common.temp.model;

/* loaded from: classes2.dex */
public class DeviceQrModel {
    private String Mac;
    private String ManufData;
    private String Name;

    public String getMac() {
        return this.Mac;
    }

    public void setMac(String mac) {
        this.Mac = mac;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setManufData(String manufData) {
        this.ManufData = manufData;
    }

    public String getManufData() {
        return this.ManufData;
    }

    public int getDeviceType() {
        if ("FFF1".equals(this.ManufData)) {
            return 2;
        }
        if ("FFF2".equals(this.ManufData)) {
            return 4;
        }
        return "FFF3".equals(this.ManufData) ? 9 : 0;
    }
}
