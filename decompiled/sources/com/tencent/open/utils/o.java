package com.tencent.open.utils;

import androidx.core.view.MotionEventCompat;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f13682a;

    public o(byte[] bArr) {
        this(bArr, 0);
    }

    public o(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        this.f13682a = i2;
        this.f13682a = i2 + (bArr[i] & 255);
    }

    public o(int i) {
        this.f13682a = i;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof o) && this.f13682a == ((o) obj).b();
    }

    public byte[] a() {
        int i = this.f13682a;
        return new byte[]{(byte) (i & 255), (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    public int b() {
        return this.f13682a;
    }

    public int hashCode() {
        return this.f13682a;
    }
}
