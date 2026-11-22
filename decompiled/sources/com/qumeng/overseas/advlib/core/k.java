package com.qumeng.overseas.advlib.core;

/* loaded from: classes17.dex */
public interface k extends j {

    public interface a {
        void onVideoAdComplete();

        void onVideoAdPaused();

        void onVideoAdPlay();

        void onVideoError();

        void onVideoProgress(int i);
    }

    default String B() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    /* bridge */ /* synthetic */ default String a() {
        return super.a();
    }

    @Override // com.qumeng.overseas.advlib.core.j
    /* bridge */ /* synthetic */ default float b() {
        return super.b();
    }

    default String e() {
        return "";
    }

    String r();
}
