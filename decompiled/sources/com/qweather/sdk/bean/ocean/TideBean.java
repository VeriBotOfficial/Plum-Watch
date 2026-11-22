package com.qweather.sdk.bean.ocean;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class TideBean {
    private Basic basic;
    private Code code;
    private Refer refer;
    private List<TideHourlyBase> tideHourlyList;
    private List<TideTableBase> tideTable;

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

    public List<TideHourlyBase> getTideHourlyList() {
        return this.tideHourlyList;
    }

    public void setTideHourlyList(List<TideHourlyBase> list) {
        this.tideHourlyList = list;
    }

    public List<TideTableBase> getTideTable() {
        return this.tideTable;
    }

    public void setTideTable(List<TideTableBase> list) {
        this.tideTable = list;
    }

    public static class TideTableBase {
        private String fxTime;
        private String height;
        private String type;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getHeight() {
            return this.height;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public static class TideHourlyBase {
        private String fxTime;
        private String height;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getHeight() {
            return this.height;
        }

        public void setHeight(String str) {
            this.height = str;
        }
    }
}
