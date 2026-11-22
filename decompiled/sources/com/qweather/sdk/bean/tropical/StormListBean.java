package com.qweather.sdk.bean.tropical;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class StormListBean {
    private Basic basic;
    private Code code;
    private Refer refer;
    private List<StormBean> stormList;

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

    public List<StormBean> getStormList() {
        return this.stormList;
    }

    public void setStormList(List<StormBean> list) {
        this.stormList = list;
    }

    public static class StormBean {
        private String active;
        private String basin;

        /* renamed from: id, reason: collision with root package name */
        private String f13518id;
        private String name;
        private String year;

        public String getId() {
            return this.f13518id;
        }

        public void setId(String str) {
            this.f13518id = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String getBasin() {
            return this.basin;
        }

        public void setBasin(String str) {
            this.basin = str;
        }

        public String getYear() {
            return this.year;
        }

        public void setYear(String str) {
            this.year = str;
        }

        public String getActive() {
            return this.active;
        }

        public void setActive(String str) {
            this.active = str;
        }
    }
}
