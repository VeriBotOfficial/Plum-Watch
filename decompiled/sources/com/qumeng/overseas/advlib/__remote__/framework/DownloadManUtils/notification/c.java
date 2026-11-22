package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification;

import java.io.File;

/* loaded from: classes17.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12924a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;

    void a();

    void a(int i, long j, long j2);

    void a(com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c cVar);

    void a(File file);

    void a(String str);

    void a(String str, String str2);

    com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c b();

    int c();

    void cancel();

    void onInstalled(String str);

    void onPause();
}
