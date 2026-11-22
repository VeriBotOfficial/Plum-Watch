package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.util.List;

/* loaded from: classes13.dex */
public class SugResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "本次API访问状态，如果成功返回0，如果失败返回其他数字。", name = "status")
    private int f8147a;

    @Properties(desc = "本次API访问状态描述信息，如果成功返回ok，如果失败返回错误原因。", name = "message")
    private String b;

    @Properties(desc = "搜索类型", name = "results")
    private List<SugResult> c;

    public String getMessage() {
        return this.b;
    }

    public List<SugResult> getResults() {
        return this.c;
    }

    public int getStatus() {
        return this.f8147a;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setResults(List<SugResult> list) {
        this.c = list;
    }

    public void setStatus(int i) {
        this.f8147a = i;
    }
}
