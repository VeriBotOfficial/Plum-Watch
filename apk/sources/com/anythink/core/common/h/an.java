package com.anythink.core.common.h;

import android.content.Context;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes16.dex */
public final class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3851a;
    private String b;
    private String c;
    private JSONArray d;
    private String e;
    private String f;
    private int g;
    private int h;

    public final Context a() {
        return this.f3851a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final JSONArray d() {
        return this.d;
    }

    public final void a(Context context) {
        this.f3851a = context;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void a(JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public final String e() {
        return this.e;
    }

    public final void c(String str) {
        this.e = str;
    }

    private String h() {
        return this.f;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final int f() {
        return this.g;
    }

    public final void a(int r1) {
        this.g = r1;
    }

    public final int g() {
        return this.h;
    }

    public final void b(int r1) {
        this.h = r1;
    }
}
