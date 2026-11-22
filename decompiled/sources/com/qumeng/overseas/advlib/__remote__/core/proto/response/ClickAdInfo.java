package com.qumeng.overseas.advlib.__remote__.core.proto.response;

import com.qumeng.overseas.advlib.__remote__.ui.incite.j;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class ClickAdInfo extends JSONBeanFrm {
    public static final String TAG = "ClickAdInfo";
    private String _802ClickRule;
    private String clickedClickRule;
    private List<String> clkList;
    private Map<String, String> headerMap;
    private String installClickRule;
    private int planId;
    private long presentTimer;
    private j traceRcvBean;
    private int unitId;
    private int userId;

    public String getClickedClickRule() {
        return this.clickedClickRule;
    }

    public List<String> getClkList() {
        return this.clkList;
    }

    public Map<String, String> getHeaderMap() {
        return this.headerMap;
    }

    public String getInstallClickRule() {
        return this.installClickRule;
    }

    public int getPlanId() {
        return this.planId;
    }

    public long getPresentTimer() {
        return this.presentTimer;
    }

    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    public j getTraceRcvBean() {
        return this.traceRcvBean;
    }

    public int getUnitId() {
        return this.unitId;
    }

    public int getUserId() {
        return this.userId;
    }

    public String get_802ClickRule() {
        return this._802ClickRule;
    }

    public void setClickedClickRule(String str) {
        this.clickedClickRule = str;
    }

    public void setClkList(List<String> list) {
        this.clkList = list;
    }

    public void setHeaderMap(Map<String, String> map) {
        this.headerMap = map;
    }

    public void setInstallClickRule(String str) {
        this.installClickRule = str;
    }

    public void setPlanId(int i) {
        this.planId = i;
    }

    public void setPresentTimer(long j) {
        this.presentTimer = j;
    }

    public void setTraceRcvBean(j jVar) {
        this.traceRcvBean = jVar;
    }

    public void setUnitId(int i) {
        this.unitId = i;
    }

    public void setUserId(int i) {
        this.userId = i;
    }

    public void set_802ClickRule(String str) {
        this._802ClickRule = str;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm
    public String toString() {
        return "ClickAdInfo{traceRcvBean=" + this.traceRcvBean + ", clkList个数：" + this.clkList.size() + ", headerMap=" + this.headerMap + ", installClickRule='" + this.installClickRule + "', clickedClickRule='" + this.clickedClickRule + "', _802ClickRule='" + this._802ClickRule + "', userId=" + this.userId + ", planId=" + this.planId + ", unitId=" + this.unitId + AbstractJsonLexerKt.END_OBJ;
    }
}
