package com.baidu.platform.comapi.bmsdk.style;

import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes13.dex */
public class BmTextStyle extends BmObject implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f8553a;
    private int b;
    private int c;
    private int d;
    private int e;

    public BmTextStyle() {
        super(54, nativeCreate());
        this.f8553a = -13421773;
        this.b = 22;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBorderColor(long j, int i);

    private static native boolean nativeSetBorderWidth(long j, int i);

    private static native boolean nativeSetFontOption(long j, int i);

    private static native boolean nativeSetTextColor(long j, int i);

    private static native boolean nativeSetTextSize(long j, int i);

    public boolean a(int i) {
        this.c = i;
        return nativeSetBorderColor(this.nativeInstance, a.a(i));
    }

    public boolean b(int i) {
        this.d = i;
        return nativeSetBorderWidth(this.nativeInstance, i);
    }

    public boolean c(int i) {
        this.e = i;
        return nativeSetFontOption(this.nativeInstance, i);
    }

    public boolean d(int i) {
        this.f8553a = i;
        return nativeSetTextColor(this.nativeInstance, a.a(i));
    }

    public boolean e(int i) {
        this.b = i;
        return nativeSetTextSize(this.nativeInstance, i);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BmTextStyle clone() {
        BmTextStyle bmTextStyle = new BmTextStyle();
        bmTextStyle.d(this.f8553a);
        bmTextStyle.e(this.b);
        bmTextStyle.a(this.c);
        bmTextStyle.b(this.d);
        bmTextStyle.c(this.e);
        return bmTextStyle;
    }
}
