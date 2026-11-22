package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.util.Map;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @JSONBeanFrm.a(fieldname = "is_on")
    public int f13400a;

    @JSONBeanFrm.a(fieldname = "background_dialog_slotid")
    public String b = "";

    @JSONBeanFrm.a(fieldname = "bottom_slotid")
    public String c = "";

    @JSONBeanFrm.a(fieldname = "event_interval_time")
    public int d = 600000;

    @JSONBeanFrm.a(fieldname = "traffic_is_on")
    public int e;

    @JSONBeanFrm.a(fieldname = "black_list_pkgs")
    public Map<String, Integer> f;

    public String a() {
        return this.b;
    }

    public void b(int i) {
        this.f13400a = i;
    }

    public void c(int i) {
        this.e = i;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f13400a;
    }

    public int f() {
        return this.e;
    }

    public void a(String str) {
        this.b = str;
    }

    public Map<String, Integer> b() {
        return this.f;
    }

    public String c() {
        return this.c;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void a(Map<String, Integer> map) {
        this.f = map;
    }
}
