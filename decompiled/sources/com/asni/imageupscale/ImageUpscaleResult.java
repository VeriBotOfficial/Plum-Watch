package com.asni.imageupscale;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ImageUpscaleResult.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0018\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0002J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleResult;", "", "inputWidth", "", "inputHeight", "outputWidth", "outputHeight", "scale", "", "outputFile", "Ljava/io/File;", "elapsedMillis", "", "metadataPolicy", "Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;", "(IIIIDLjava/io/File;JLcom/asni/imageupscale/ImageUpscaleMetadataPolicy;)V", "getElapsedMillis", "()J", "getInputHeight", "()I", "inputPixelCount", "getInputPixelCount", "inputPixelCountLong", "getInputPixelCountLong", "getInputWidth", "getMetadataPolicy", "()Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;", "getOutputFile", "()Ljava/io/File;", "getOutputHeight", "outputPixelCount", "getOutputPixelCount", "outputPixelCountLong", "getOutputPixelCountLong", "getOutputWidth", "getScale", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "safePixelCount", "width", "height", "toString", "", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageUpscaleResult {
    private final long elapsedMillis;
    private final int inputHeight;
    private final int inputWidth;
    private final ImageUpscaleMetadataPolicy metadataPolicy;
    private final File outputFile;
    private final int outputHeight;
    private final int outputWidth;
    private final double scale;

    public static /* synthetic */ ImageUpscaleResult copy$default(ImageUpscaleResult imageUpscaleResult, int i, int i2, int i3, int i4, double d, File file, long j, ImageUpscaleMetadataPolicy imageUpscaleMetadataPolicy, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = imageUpscaleResult.inputWidth;
        }
        if ((i5 & 2) != 0) {
            i2 = imageUpscaleResult.inputHeight;
        }
        if ((i5 & 4) != 0) {
            i3 = imageUpscaleResult.outputWidth;
        }
        if ((i5 & 8) != 0) {
            i4 = imageUpscaleResult.outputHeight;
        }
        if ((i5 & 16) != 0) {
            d = imageUpscaleResult.scale;
        }
        if ((i5 & 32) != 0) {
            file = imageUpscaleResult.outputFile;
        }
        if ((i5 & 64) != 0) {
            j = imageUpscaleResult.elapsedMillis;
        }
        if ((i5 & 128) != 0) {
            imageUpscaleMetadataPolicy = imageUpscaleResult.metadataPolicy;
        }
        File file2 = file;
        double d2 = d;
        int i6 = i3;
        int i7 = i4;
        return imageUpscaleResult.copy(i, i2, i6, i7, d2, file2, j, imageUpscaleMetadataPolicy);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInputWidth() {
        return this.inputWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInputHeight() {
        return this.inputHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOutputWidth() {
        return this.outputWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOutputHeight() {
        return this.outputHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* renamed from: component6, reason: from getter */
    public final File getOutputFile() {
        return this.outputFile;
    }

    /* renamed from: component7, reason: from getter */
    public final long getElapsedMillis() {
        return this.elapsedMillis;
    }

    /* renamed from: component8, reason: from getter */
    public final ImageUpscaleMetadataPolicy getMetadataPolicy() {
        return this.metadataPolicy;
    }

    public final ImageUpscaleResult copy(int inputWidth, int inputHeight, int outputWidth, int outputHeight, double scale, File outputFile, long elapsedMillis, ImageUpscaleMetadataPolicy metadataPolicy) {
        Intrinsics.checkNotNullParameter(metadataPolicy, "metadataPolicy");
        return new ImageUpscaleResult(inputWidth, inputHeight, outputWidth, outputHeight, scale, outputFile, elapsedMillis, metadataPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUpscaleResult)) {
            return false;
        }
        ImageUpscaleResult imageUpscaleResult = (ImageUpscaleResult) other;
        return this.inputWidth == imageUpscaleResult.inputWidth && this.inputHeight == imageUpscaleResult.inputHeight && this.outputWidth == imageUpscaleResult.outputWidth && this.outputHeight == imageUpscaleResult.outputHeight && Double.compare(this.scale, imageUpscaleResult.scale) == 0 && Intrinsics.areEqual(this.outputFile, imageUpscaleResult.outputFile) && this.elapsedMillis == imageUpscaleResult.elapsedMillis && this.metadataPolicy == imageUpscaleResult.metadataPolicy;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.inputWidth) * 31) + Integer.hashCode(this.inputHeight)) * 31) + Integer.hashCode(this.outputWidth)) * 31) + Integer.hashCode(this.outputHeight)) * 31) + Double.hashCode(this.scale)) * 31;
        File file = this.outputFile;
        return ((((hashCode + (file == null ? 0 : file.hashCode())) * 31) + Long.hashCode(this.elapsedMillis)) * 31) + this.metadataPolicy.hashCode();
    }

    public String toString() {
        return "ImageUpscaleResult(inputWidth=" + this.inputWidth + ", inputHeight=" + this.inputHeight + ", outputWidth=" + this.outputWidth + ", outputHeight=" + this.outputHeight + ", scale=" + this.scale + ", outputFile=" + this.outputFile + ", elapsedMillis=" + this.elapsedMillis + ", metadataPolicy=" + this.metadataPolicy + Separators.RPAREN;
    }

    public ImageUpscaleResult(int i, int i2, int i3, int i4, double d, File file, long j, ImageUpscaleMetadataPolicy metadataPolicy) {
        Intrinsics.checkNotNullParameter(metadataPolicy, "metadataPolicy");
        this.inputWidth = i;
        this.inputHeight = i2;
        this.outputWidth = i3;
        this.outputHeight = i4;
        this.scale = d;
        this.outputFile = file;
        this.elapsedMillis = j;
        this.metadataPolicy = metadataPolicy;
    }

    public final int getInputWidth() {
        return this.inputWidth;
    }

    public final int getInputHeight() {
        return this.inputHeight;
    }

    public final int getOutputWidth() {
        return this.outputWidth;
    }

    public final int getOutputHeight() {
        return this.outputHeight;
    }

    public final double getScale() {
        return this.scale;
    }

    public final File getOutputFile() {
        return this.outputFile;
    }

    public final long getElapsedMillis() {
        return this.elapsedMillis;
    }

    public /* synthetic */ ImageUpscaleResult(int i, int i2, int i3, int i4, double d, File file, long j, ImageUpscaleMetadataPolicy imageUpscaleMetadataPolicy, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, d, file, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? ImageUpscaleMetadataPolicy.PRESERVE_SAFE : imageUpscaleMetadataPolicy);
    }

    public final ImageUpscaleMetadataPolicy getMetadataPolicy() {
        return this.metadataPolicy;
    }

    public final int getInputPixelCount() {
        return (int) RangesKt.coerceAtMost(getInputPixelCountLong(), 2147483647L);
    }

    public final int getOutputPixelCount() {
        return (int) RangesKt.coerceAtMost(getOutputPixelCountLong(), 2147483647L);
    }

    public final long getInputPixelCountLong() {
        return safePixelCount(this.inputWidth, this.inputHeight);
    }

    public final long getOutputPixelCountLong() {
        return safePixelCount(this.outputWidth, this.outputHeight);
    }

    private final long safePixelCount(int width, int height) {
        return RangesKt.coerceAtLeast(width, 0) * RangesKt.coerceAtLeast(height, 0);
    }
}
