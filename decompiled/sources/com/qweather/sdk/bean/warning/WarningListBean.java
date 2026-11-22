package com.qweather.sdk.bean.warning;

import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class WarningListBean {
    private Code code;
    private String updateTime;
    private List<WarningListBeanBase> warningBean;

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public List<WarningListBeanBase> getWarningBean() {
        return this.warningBean;
    }

    public void setWarningBean(List<WarningListBeanBase> list) {
        this.warningBean = list;
    }

    public static class WarningListBeanBase {
        private String locationId;

        public String getLocationId() {
            return this.locationId;
        }

        public void setLocationId(String str) {
            this.locationId = str;
        }
    }
}
