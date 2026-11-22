package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.iflytek.cloud.SpeechConstant;
import java.util.List;

/* loaded from: classes13.dex */
public class PoiResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "本次API访问状态，如果成功返回0，如果失败返回其他数字。", name = "status")
    private int f8140a;

    @Properties(desc = "本次API访问状态描述信息，如果成功返回ok，如果失败返回错误原因。", name = "message")
    private String b;

    @Properties(desc = "召回poi数量", name = "total")
    private int c;

    @Properties(desc = "召回结果类型", name = SpeechConstant.RESULT_TYPE)
    private String d;

    @Properties(desc = "查询类型", name = "query_type")
    private String e;

    @Properties(desc = "搜索类型", name = "results")
    private List<PoiResult> f;

    public String getMessage() {
        return this.b;
    }

    public String getQueryType() {
        return this.e;
    }

    public String getResultType() {
        return this.d;
    }

    public List<PoiResult> getResults() {
        return this.f;
    }

    public int getStatus() {
        return this.f8140a;
    }

    public int getTotal() {
        return this.c;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setQueryType(String str) {
        this.e = str;
    }

    public void setResultType(String str) {
        this.d = str;
    }

    public void setResults(List<PoiResult> list) {
        this.f = list;
    }

    public void setStatus(int i) {
        this.f8140a = i;
    }

    public void setTotal(int i) {
        this.c = i;
    }
}
