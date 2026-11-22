package com.baidu.platform.comapi.walknavi.h;

import android.os.Bundle;

/* compiled from: BikeNaviJarParam.java */
/* loaded from: classes13.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f8749a = new Bundle();

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int i, int i2, int i3, String str) {
        this.f8749a.putInt("start_x", i);
        this.f8749a.putInt("start_y", i2);
        this.f8749a.putInt("start_cityid", i3);
        this.f8749a.putString("start_uid", str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void b(int i) {
        this.f8749a.putInt("route_data_mode", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void c(int i) {
        this.f8749a.putInt("vehicle", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void d(String str) {
        this.f8749a.putString("road_prefer", str);
    }

    public void e(int i) {
        this.f8749a.putInt("wnavi_extra_mode", i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public int[] b(String str) {
        return this.f8749a.getIntArray(str);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public byte[] c(String str) {
        return this.f8749a.getByteArray(str);
    }

    public void d(int i) {
        this.f8749a.putInt("launched_from", i);
    }

    public void a(int i, int i2, int i3, String str, String str2, String str3) {
        this.f8749a.putInt("start_x", i);
        this.f8749a.putInt("start_y", i2);
        this.f8749a.putInt("start_cityid", i3);
        this.f8749a.putString("start_floor", str);
        this.f8749a.putString("start_building", str2);
        this.f8749a.putString("start_uid", str3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr) {
        this.f8749a.putIntArray("end_x", iArr);
        this.f8749a.putIntArray("end_y", iArr2);
        this.f8749a.putIntArray("end_cityid", iArr3);
        this.f8749a.putStringArray("end_uid", strArr);
    }

    public void a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, String[] strArr2, String[] strArr3) {
        this.f8749a.putIntArray("end_x", iArr);
        this.f8749a.putIntArray("end_y", iArr2);
        this.f8749a.putIntArray("end_cityid", iArr3);
        this.f8749a.putStringArray("end_floor", strArr);
        this.f8749a.putStringArray("end_building", strArr2);
        this.f8749a.putStringArray("end_uid", strArr3);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public void a(int i) {
        this.f8749a.putInt("wnavi_mode", i);
    }

    public void a(byte[] bArr) {
        this.f8749a.putByteArray("route_buff", bArr);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public int a(String str, int i) {
        return this.f8749a.getInt(str, i);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public String a(String str, String str2) {
        return this.f8749a.getString(str, str2);
    }

    @Override // com.baidu.platform.comapi.walknavi.h.a
    public String[] a(String str) {
        return this.f8749a.getStringArray(str);
    }
}
