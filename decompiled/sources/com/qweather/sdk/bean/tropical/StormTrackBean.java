package com.qweather.sdk.bean.tropical;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class StormTrackBean {
    private Basic basic;
    private Code code;
    private String isActive;
    private StormTrackNowBean now;
    private Refer refer;
    private List<StormTrackBaseBean> trackList;

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

    public StormTrackNowBean getNow() {
        return this.now;
    }

    public void setNow(StormTrackNowBean stormTrackNowBean) {
        this.now = stormTrackNowBean;
    }

    public List<StormTrackBaseBean> getTrackList() {
        return this.trackList;
    }

    public void setTrackList(List<StormTrackBaseBean> list) {
        this.trackList = list;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String str) {
        this.isActive = str;
    }

    public static class StormTrackWindBean {
        private String neRadius;
        private String nwRadius;
        private String seRadius;
        private String swRadius;

        public String getNeRadius() {
            return this.neRadius;
        }

        public void setNeRadius(String str) {
            this.neRadius = str;
        }

        public String getSeRadius() {
            return this.seRadius;
        }

        public void setSeRadius(String str) {
            this.seRadius = str;
        }

        public String getSwRadius() {
            return this.swRadius;
        }

        public void setSwRadius(String str) {
            this.swRadius = str;
        }

        public String getNwRadius() {
            return this.nwRadius;
        }

        public void setNwRadius(String str) {
            this.nwRadius = str;
        }
    }

    public static class StormTrackNowBean {
        private String lat;
        private String lon;
        private String move360;
        private String moveDir;
        private String moveSpeed;
        private String pressure;
        private String pubTime;
        private String type;
        private StormTrackWindBean windRadius30;
        private StormTrackWindBean windRadius50;
        private StormTrackWindBean windRadius64;
        private String windSpeed;

        public String getPubTime() {
            return this.pubTime;
        }

        public void setPubTime(String str) {
            this.pubTime = str;
        }

        public String getLon() {
            return this.lon;
        }

        public void setLon(String str) {
            this.lon = str;
        }

        public String getLat() {
            return this.lat;
        }

        public void setLat(String str) {
            this.lat = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getPressure() {
            return this.pressure;
        }

        public void setPressure(String str) {
            this.pressure = str;
        }

        public String getWindSpeed() {
            return this.windSpeed;
        }

        public void setWindSpeed(String str) {
            this.windSpeed = str;
        }

        public String getMoveSpeed() {
            return this.moveSpeed;
        }

        public void setMoveSpeed(String str) {
            this.moveSpeed = str;
        }

        public String getMoveDir() {
            return this.moveDir;
        }

        public void setMoveDir(String str) {
            this.moveDir = str;
        }

        public String getMove360() {
            return this.move360;
        }

        public void setMove360(String str) {
            this.move360 = str;
        }

        public StormTrackWindBean getWindRadius30() {
            return this.windRadius30;
        }

        public void setWindRadius30(StormTrackWindBean stormTrackWindBean) {
            this.windRadius30 = stormTrackWindBean;
        }

        public StormTrackWindBean getWindRadius50() {
            return this.windRadius50;
        }

        public void setWindRadius50(StormTrackWindBean stormTrackWindBean) {
            this.windRadius50 = stormTrackWindBean;
        }

        public StormTrackWindBean getWindRadius64() {
            return this.windRadius64;
        }

        public void setWindRadius64(StormTrackWindBean stormTrackWindBean) {
            this.windRadius64 = stormTrackWindBean;
        }
    }

    public static class StormTrackBaseBean {
        private String lat;
        private String lon;
        private String move360;
        private String moveDir;
        private String moveSpeed;
        private String pressure;
        private String time;
        private String type;
        private StormTrackWindBean windRadius30;
        private StormTrackWindBean windRadius50;
        private StormTrackWindBean windRadius64;
        private String windSpeed;

        public String getTime() {
            return this.time;
        }

        public void setTime(String str) {
            this.time = str;
        }

        public String getLon() {
            return this.lon;
        }

        public void setLon(String str) {
            this.lon = str;
        }

        public String getLat() {
            return this.lat;
        }

        public void setLat(String str) {
            this.lat = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getPressure() {
            return this.pressure;
        }

        public void setPressure(String str) {
            this.pressure = str;
        }

        public String getWindSpeed() {
            return this.windSpeed;
        }

        public void setWindSpeed(String str) {
            this.windSpeed = str;
        }

        public String getMoveSpeed() {
            return this.moveSpeed;
        }

        public void setMoveSpeed(String str) {
            this.moveSpeed = str;
        }

        public String getMoveDir() {
            return this.moveDir;
        }

        public void setMoveDir(String str) {
            this.moveDir = str;
        }

        public String getMove360() {
            return this.move360;
        }

        public void setMove360(String str) {
            this.move360 = str;
        }

        public StormTrackWindBean getWindRadius30() {
            return this.windRadius30;
        }

        public void setWindRadius30(StormTrackWindBean stormTrackWindBean) {
            this.windRadius30 = stormTrackWindBean;
        }

        public StormTrackWindBean getWindRadius50() {
            return this.windRadius50;
        }

        public void setWindRadius50(StormTrackWindBean stormTrackWindBean) {
            this.windRadius50 = stormTrackWindBean;
        }

        public StormTrackWindBean getWindRadius64() {
            return this.windRadius64;
        }

        public void setWindRadius64(StormTrackWindBean stormTrackWindBean) {
            this.windRadius64 = stormTrackWindBean;
        }
    }
}
