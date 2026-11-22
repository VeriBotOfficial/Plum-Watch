package com.baidu.platform.comapi.walknavi.h;

import android.os.Bundle;

/* compiled from: WNaviJarParam.java */
/* loaded from: classes13.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f8750a = new Bundle();

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i, int i2, int i3, String str) {
        this.f8750a.putInt("start_x", i);
        this.f8750a.putInt("start_y", i2);
        this.f8750a.putInt("start_cityid", i3);
        this.f8750a.putString("start_uid", str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void b(int i) {
        this.f8750a.putInt("route_data_mode", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void c(int i) {
        this.f8750a.putInt("launched_from", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void d(int i) {
        this.f8750a.putInt("wnavi_extra_mode", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public int[] b(String str) {
        return this.f8750a.getIntArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public byte[] c(String str) {
        return this.f8750a.getByteArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i, int i2, int i3, String str, String str2, String str3) {
        this.f8750a.putInt("start_x", i);
        this.f8750a.putInt("start_y", i2);
        this.f8750a.putInt("start_cityid", i3);
        this.f8750a.putString("start_floor", str);
        this.f8750a.putString("start_building", str2);
        this.f8750a.putString("start_uid", str3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr) {
        this.f8750a.putIntArray("end_x", iArr);
        this.f8750a.putIntArray("end_y", iArr2);
        this.f8750a.putIntArray("end_cityid", iArr3);
        this.f8750a.putStringArray("end_uid", strArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, String[] strArr2, String[] strArr3) {
        this.f8750a.putIntArray("end_x", iArr);
        this.f8750a.putIntArray("end_y", iArr2);
        this.f8750a.putIntArray("end_cityid", iArr3);
        this.f8750a.putStringArray("end_floor", strArr);
        this.f8750a.putStringArray("end_building", strArr2);
        this.f8750a.putStringArray("end_uid", strArr3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(int i) {
        this.f8750a.putInt("wnavi_mode", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public void a(byte[] bArr) {
        this.f8750a.putByteArray("route_buff", bArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public int a(String str, int i) {
        return this.f8750a.getInt(str, i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public String a(String str, String str2) {
        return this.f8750a.getString(str, str2);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.c
    public String[] a(String str) {
        return this.f8750a.getStringArray(str);
    }
}
