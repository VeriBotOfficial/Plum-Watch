package com.qweather.sdk.bean.warning;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class WarningBean {
    private Basic basic;
    private Code code;
    private Refer refer;
    private List<WarningBeanBase> warningList;

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

    public List<WarningBeanBase> getWarningList() {
        return this.warningList;
    }

    public void setWarningList(List<WarningBeanBase> list) {
        this.warningList = list;
    }

    public static class WarningBeanBase {
        private String certainty;
        private String endTime;

        /* renamed from: id, reason: collision with root package name */
        private String f13519id;

        @Deprecated
        private String level;
        private String pubTime;
        private String related;
        private String sender;
        private String severity;
        private String severityColor;
        private String startTime;
        private String status;
        private String text;
        private String title;
        private String type;
        private String typeName;
        private String urgency;

        public String getId() {
            return this.f13519id;
        }

        public void setId(String str) {
            this.f13519id = str;
        }

        public String getPubTime() {
            return this.pubTime;
        }

        public void setPubTime(String str) {
            this.pubTime = str;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String getStartTime() {
            return this.startTime;
        }

        public void setStartTime(String str) {
            this.startTime = str;
        }

        public String getEndTime() {
            return this.endTime;
        }

        public void setEndTime(String str) {
            this.endTime = str;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        @Deprecated
        public String getLevel() {
            return this.level;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public String getSender() {
            return this.sender;
        }

        public void setSender(String str) {
            this.sender = str;
        }

        public String getTypeName() {
            return this.typeName;
        }

        public void setTypeName(String str) {
            this.typeName = str;
        }

        public String getRelated() {
            return this.related;
        }

        public void setRelated(String str) {
            this.related = str;
        }

        public String getSeverity() {
            return this.severity;
        }

        public void setSeverity(String str) {
            this.severity = str;
        }

        public String getSeverityColor() {
            return this.severityColor;
        }

        public void setSeverityColor(String str) {
            this.severityColor = str;
        }

        public String getUrgency() {
            return this.urgency;
        }

        public void setUrgency(String str) {
            this.urgency = str;
        }

        public String getCertainty() {
            return this.certainty;
        }

        public void setCertainty(String str) {
            this.certainty = str;
        }
    }
}
