package com.huawei.hms.scankit.aiscan.common;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.scankit.p._a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ResultPoint.java */
/* loaded from: classes14.dex */
public class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final float f10528a;
    private final float b;
    private int c;
    private boolean d;

    public z(float f, float f2, int i) {
        this.d = false;
        this.f10528a = f;
        this.b = f2;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public final float b() {
        return this.f10528a;
    }

    public final float c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (Math.abs(this.f10528a - zVar.f10528a) < 1.0E-4d && Math.abs(this.b - zVar.b) < 1.0E-4d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f10528a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return Separators.LPAREN + this.f10528a + AbstractJsonLexerKt.COMMA + this.b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f10528a);
        parcel.writeFloat(this.b);
    }

    public static void a(z[] zVarArr) {
        float a2 = a(zVarArr[0], zVarArr[1]);
        float a3 = a(zVarArr[1], zVarArr[2]);
        float a4 = a(zVarArr[0], zVarArr[2]);
        int[] a5 = a(a3, a2, a4);
        int i = a5[0];
        int i2 = a5[1];
        int i3 = a5[2];
        z zVar = zVarArr[i];
        z zVar2 = zVarArr[i2];
        z zVar3 = zVarArr[i3];
        float[] fArr = {a3, a4, a2};
        if (_a.f % 2 == 0 && fArr[i2] / fArr[i] < 1.1d) {
            zVar = zVarArr[i];
            zVar2 = zVarArr[i2];
            zVar3 = zVarArr[i3];
        }
        if (a(zVar2, zVar, zVar3) < 0.0f) {
            z zVar4 = zVar3;
            zVar3 = zVar2;
            zVar2 = zVar4;
        }
        zVarArr[0] = zVar2;
        zVarArr[1] = zVar;
        zVarArr[2] = zVar3;
    }

    public z(float f, float f2) {
        this.c = 0;
        this.d = false;
        this.f10528a = f;
        this.b = f2;
    }

    public z(float f, float f2, boolean z) {
        this.c = 0;
        this.f10528a = f;
        this.b = f2;
        this.d = z;
    }

    protected z(Parcel parcel) {
        this.c = 0;
        this.d = false;
        this.f10528a = parcel.readFloat();
        this.b = parcel.readFloat();
    }

    private static int[] a(float f, float f2, float f3) {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 2;
        if (f < f2 || f < f3) {
            if (f3 < f || f3 < f2) {
                if (f > f) {
                    i = 2;
                    i5 = 1;
                    i3 = i;
                } else {
                    i4 = 1;
                    i3 = 2;
                    i5 = 0;
                }
            } else if (f <= f2) {
                i2 = 2;
                i5 = 0;
                i4 = i2;
            }
        } else if (f2 > f3) {
            i2 = 2;
            i5 = 1;
            i3 = 0;
            i4 = i2;
        } else {
            i = 0;
            i4 = 1;
            i3 = i;
        }
        return new int[]{i3, i4, i5};
    }

    public static float a(z zVar, z zVar2) {
        return n.a(zVar.f10528a, zVar.b, zVar2.f10528a, zVar2.b);
    }

    private static float a(z zVar, z zVar2, z zVar3) {
        float f = zVar2.f10528a;
        float f2 = zVar2.b;
        return ((zVar3.f10528a - f) * (zVar.b - f2)) - ((zVar3.b - f2) * (zVar.f10528a - f));
    }
}
