package com.qweather.sdk.bean.ocean;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class CurrentsBean {
    private Basic basic;
    private Code code;
    private List<CurrentsHourlyBase> hourlyList;
    private Refer refer;
    private List<CurrentsTableBase> tableList;

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Basic getBasic() {
        return this.basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Refer getRefer() {
        return this.refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }

    public List<CurrentsTableBase> getTableList() {
        return this.tableList;
    }

    public void setTableList(List<CurrentsTableBase> list) {
        this.tableList = list;
    }

    public List<CurrentsHourlyBase> getHourlyList() {
        return this.hourlyList;
    }

    public void setHourlyList(List<CurrentsHourlyBase> list) {
        this.hourlyList = list;
    }

    public static class CurrentsTableBase {
        private String dir360;
        private String fxTime;
        private String speedMax;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getDir360() {
            return this.dir360;
        }

        public void setDir360(String str) {
            this.dir360 = str;
        }

        public String getSpeedMax() {
            return this.speedMax;
        }

        public void setSpeedMax(String str) {
            this.speedMax = str;
        }
    }

    public static class CurrentsHourlyBase {
        private String dir360;
        private String fxTime;
        private String speed;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getDir360() {
            return this.dir360;
        }

        public void setDir360(String str) {
            this.dir360 = str;
        }

        public String getSpeed() {
            return this.speed;
        }

        public void setSpeed(String str) {
            this.speed = str;
        }
    }
}
