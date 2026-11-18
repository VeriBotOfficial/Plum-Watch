package com.qumeng.overseas.advlib.__remote__.ui.dialog;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13092a;
    private a b;

    public interface a {
        void onClick();
    }

    public b(String str, a aVar) {
        this.f13092a = str;
        this.b = aVar;
    }

    public a a() {
        return this.b;
    }

    public String b() {
        return this.f13092a;
    }
}
