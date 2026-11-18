package com.mbridge.msdk.click.entity;

/* JADX INFO: compiled from: ClickResponseHeader.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11319a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    public String a() {
        return "statusCode=" + this.f + ", location=" + this.f11319a + ", contentType=" + this.b + ", contentLength=" + this.e + ", contentEncoding=" + this.c + ", referer=" + this.d;
    }

    public String toString() {
        return "ClickResponseHeader{location='" + this.f11319a + "', contentType='" + this.b + "', contentEncoding='" + this.c + "', referer='" + this.d + "', contentLength=" + this.e + ", statusCode=" + this.f + ", url='" + this.g + "', exception='" + this.h + "'}";
    }
}
