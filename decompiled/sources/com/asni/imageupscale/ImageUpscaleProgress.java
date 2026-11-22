package com.asni.imageupscale;

import android.gov.nist.core.Separators;
import com.anythink.expressad.foundation.g.g.a.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageUpscaleTask.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleProgress;", "", b.aX, "Lcom/asni/imageupscale/ImageUpscaleProgressStage;", "fraction", "", "(Lcom/asni/imageupscale/ImageUpscaleProgressStage;D)V", "getFraction", "()D", "getStage", "()Lcom/asni/imageupscale/ImageUpscaleProgressStage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageUpscaleProgress {
    private final double fraction;
    private final ImageUpscaleProgressStage stage;

    public static /* synthetic */ ImageUpscaleProgress copy$default(ImageUpscaleProgress imageUpscaleProgress, ImageUpscaleProgressStage imageUpscaleProgressStage, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            imageUpscaleProgressStage = imageUpscaleProgress.stage;
        }
        if ((i & 2) != 0) {
            d = imageUpscaleProgress.fraction;
        }
        return imageUpscaleProgress.copy(imageUpscaleProgressStage, d);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageUpscaleProgressStage getStage() {
        return this.stage;
    }

    /* renamed from: component2, reason: from getter */
    public final double getFraction() {
        return this.fraction;
    }

    public final ImageUpscaleProgress copy(ImageUpscaleProgressStage stage, double fraction) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        return new ImageUpscaleProgress(stage, fraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUpscaleProgress)) {
            return false;
        }
        ImageUpscaleProgress imageUpscaleProgress = (ImageUpscaleProgress) other;
        return this.stage == imageUpscaleProgress.stage && Double.compare(this.fraction, imageUpscaleProgress.fraction) == 0;
    }

    public int hashCode() {
        return (this.stage.hashCode() * 31) + Double.hashCode(this.fraction);
    }

    public String toString() {
        return "ImageUpscaleProgress(stage=" + this.stage + ", fraction=" + this.fraction + Separators.RPAREN;
    }

    public ImageUpscaleProgress(ImageUpscaleProgressStage stage, double d) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        this.stage = stage;
        this.fraction = d;
        if (0.0d > d || d > 1.0d) {
            throw new IllegalArgumentException("fraction must be between 0 and 1".toString());
        }
    }

    public final ImageUpscaleProgressStage getStage() {
        return this.stage;
    }

    public final double getFraction() {
        return this.fraction;
    }
}
