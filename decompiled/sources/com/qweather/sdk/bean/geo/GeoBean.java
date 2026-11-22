package com.qweather.sdk.bean.geo;

import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class GeoBean {
    private Code code;
    private List<LocationBean> locationBean;
    private Refer refer;

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public List<LocationBean> getLocationBean() {
        return this.locationBean;
    }

    public void setLocationBean(List<LocationBean> list) {
        this.locationBean = list;
    }

    public Refer getRefer() {
        return this.refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }

    public static class LocationBean {
        private String adm1;
        private String adm2;
        private String country;
        private String fxLink;

        /* renamed from: id, reason: collision with root package name */
        private String f13516id;
        private String isDst;
        private String lat;
        private String lon;
        private String name;
        private String rank;
        private String type;
        private String tz;
        private String utcOffset;

        public String getUtcOffset() {
            return this.utcOffset;
        }

        public void setUtcOffset(String str) {
            this.utcOffset = str;
        }

        public String getIsDst() {
            return this.isDst;
        }

        public void setIsDst(String str) {
            this.isDst = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String getId() {
            return this.f13516id;
        }

        public void setId(String str) {
            this.f13516id = str;
        }

        public String getLat() {
            return this.lat;
        }

        public void setLat(String str) {
            this.lat = str;
        }

        public String getLon() {
            return this.lon;
        }

        public void setLon(String str) {
            this.lon = str;
        }

        public String getAdm2() {
            return this.adm2;
        }

        public void setAdm2(String str) {
            this.adm2 = str;
        }

        public String getAdm1() {
            return this.adm1;
        }

        public void setAdm1(String str) {
            this.adm1 = str;
        }

        public String getCountry() {
            return this.country;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public String getTz() {
            return this.tz;
        }

        public void setTz(String str) {
            this.tz = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getRank() {
            return this.rank;
        }

        public void setRank(String str) {
            this.rank = str;
        }

        public String getFxLink() {
            return this.fxLink;
        }

        public void setFxLink(String str) {
            this.fxLink = str;
        }
    }
}
