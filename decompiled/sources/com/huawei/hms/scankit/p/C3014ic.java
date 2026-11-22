package com.huawei.hms.scankit.p;

import com.google.api.ClientProto;
import com.haibin.calendarview.BuildConfig;
import com.luck.picture.lib.config.Crop;
import com.wakeup.common.DeviceFeatures;

/* compiled from: SymbolInfo.java */
/* renamed from: com.huawei.hms.scankit.p.ic, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3014ic {

    /* renamed from: a, reason: collision with root package name */
    static final C3014ic[] f10654a;
    private static C3014ic[] b;
    private final boolean c;
    private final int d;
    private final int e;
    public final int f;
    public final int g;
    private final int h;
    private final int i;
    private final int j;

    static {
        C3014ic[] c3014icArr = {new C3014ic(false, 3, 5, 8, 8, 1), new C3014ic(false, 5, 7, 10, 10, 1), new C3014ic(true, 5, 7, 16, 6, 1), new C3014ic(false, 8, 10, 12, 12, 1), new C3014ic(true, 10, 11, 14, 6, 2), new C3014ic(false, 12, 12, 14, 14, 1), new C3014ic(true, 16, 14, 24, 10, 1), new C3014ic(false, 18, 14, 16, 16, 1), new C3014ic(false, 22, 18, 18, 18, 1), new C3014ic(true, 22, 18, 16, 10, 2), new C3014ic(false, 30, 20, 20, 20, 1), new C3014ic(true, 32, 24, 16, 14, 2), new C3014ic(false, 36, 24, 22, 22, 1), new C3014ic(false, 44, 28, 24, 24, 1), new C3014ic(true, 49, 28, 22, 14, 2), new C3014ic(false, 62, 36, 14, 14, 4), new C3014ic(false, 86, 42, 16, 16, 4), new C3014ic(false, 114, 48, 18, 18, 4), new C3014ic(false, 144, 56, 20, 20, 4), new C3014ic(false, 174, 68, 22, 22, 4), new C3014ic(false, 204, 84, 24, 24, 4, 102, 42), new C3014ic(false, 280, 112, 14, 14, 16, 140, 56), new C3014ic(false, BuildConfig.VERSION_CODE, 144, 16, 16, 16, 92, 36), new C3014ic(false, 456, 192, 18, 18, 16, 114, 48), new C3014ic(false, 576, 224, 20, 20, 16, 144, 56), new C3014ic(false, Crop.REQUEST_EDIT_CROP, 272, 22, 22, 16, 174, 68), new C3014ic(false, 816, 336, 24, 24, 16, 136, 56), new C3014ic(false, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, 408, 18, 18, 36, DeviceFeatures.AUDIO_MEMORANDUM, 68), new C3014ic(false, 1304, 496, 20, 20, 36, 163, 62), new C2986bc()};
        f10654a = c3014icArr;
        b = c3014icArr;
    }

    public C3014ic(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    public static C3014ic a(int i, EnumC3018jc enumC3018jc, Mb mb, Mb mb2, boolean z) {
        for (C3014ic c3014ic : b) {
            if (!(enumC3018jc == EnumC3018jc.FORCE_SQUARE && c3014ic.c) && ((enumC3018jc != EnumC3018jc.FORCE_RECTANGLE || c3014ic.c) && ((mb == null || (c3014ic.g() >= mb.b() && c3014ic.f() >= mb.a())) && ((mb2 == null || (c3014ic.g() <= mb2.b() && c3014ic.f() <= mb2.a())) && i <= c3014ic.d)))) {
                return c3014ic;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i);
        }
        return null;
    }

    private int h() {
        int i = this.h;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    private int i() {
        int i = this.h;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int b() {
        return this.e;
    }

    public int c() {
        return this.d / this.i;
    }

    public final int d() {
        return i() * this.g;
    }

    public final int e() {
        return h() * this.f;
    }

    public final int f() {
        return d() + (i() * 2);
    }

    public final int g() {
        return e() + (h() * 2);
    }

    public final String toString() {
        return (this.c ? "Rectangular Symbol:" : "Square Symbol:") + " data region " + this.f + 'x' + this.g + ", symbol size " + g() + 'x' + f() + ", symbol data size " + e() + 'x' + d() + ", codewords " + this.d + '+' + this.e;
    }

    C3014ic(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
    }

    public final int b(int i) {
        return this.j;
    }

    public final int a() {
        return this.d;
    }

    public int a(int i) {
        return this.i;
    }
}
