package com.beken.iot.smartsdk.options;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraResult.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/beken/iot/smartsdk/options/CameraResult;", "", "bitmap", "Landroid/graphics/Bitmap;", "sequence", "", "enableNoiseReduction", "", "(Landroid/graphics/Bitmap;IZ)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getEnableNoiseReduction", "()Z", "getSequence", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CameraResult {
    private final Bitmap bitmap;
    private final boolean enableNoiseReduction;
    private final int sequence;

    public static /* synthetic */ CameraResult copy$default(CameraResult cameraResult, Bitmap bitmap, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bitmap = cameraResult.bitmap;
        }
        if ((i2 & 2) != 0) {
            i = cameraResult.sequence;
        }
        if ((i2 & 4) != 0) {
            z = cameraResult.enableNoiseReduction;
        }
        return cameraResult.copy(bitmap, i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSequence() {
        return this.sequence;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableNoiseReduction() {
        return this.enableNoiseReduction;
    }

    public final CameraResult copy(Bitmap bitmap, int sequence, boolean enableNoiseReduction) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new CameraResult(bitmap, sequence, enableNoiseReduction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraResult)) {
            return false;
        }
        CameraResult cameraResult = (CameraResult) other;
        return Intrinsics.areEqual(this.bitmap, cameraResult.bitmap) && this.sequence == cameraResult.sequence && this.enableNoiseReduction == cameraResult.enableNoiseReduction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.bitmap.hashCode() * 31) + Integer.hashCode(this.sequence)) * 31;
        boolean z = this.enableNoiseReduction;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "CameraResult(bitmap=" + this.bitmap + ", sequence=" + this.sequence + ", enableNoiseReduction=" + this.enableNoiseReduction + ')';
    }

    public CameraResult(Bitmap bitmap, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.sequence = i;
        this.enableNoiseReduction = z;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean getEnableNoiseReduction() {
        return this.enableNoiseReduction;
    }

    public final int getSequence() {
        return this.sequence;
    }
}
