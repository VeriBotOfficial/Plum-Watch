package com.baidu.ar;

import java.util.List;

/* loaded from: classes12.dex */
public class bd {

    /* renamed from: a, reason: collision with root package name */
    public List<oc> f6828a;
    public tc b;
    public ed c;

    public enum a {
        MODEL_DISAPPEAR_UNTRACKED,
        MODEL_PERSIST_UNTRACKED,
        MODEL_SHOW_IMMEDIATELY
    }

    public ed a() {
        return this.c;
    }

    public void a(ed edVar) {
        this.c = edVar;
    }

    public void a(tc tcVar) {
        this.b = tcVar;
    }

    public void a(List<oc> list) {
        this.f6828a = list;
    }

    public List<oc> b() {
        return this.f6828a;
    }

    public tc c() {
        return this.b;
    }
}
