package com.asni.imageupscale;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import com.google.android.gms.common.util.GmsVersion;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ImageUpscaleOptions.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0012HÆ\u0003J\t\u0010R\u001a\u00020\u0014HÆ\u0003J\t\u0010S\u001a\u00020\u0014HÆ\u0003J\t\u0010T\u001a\u00020\u0014HÆ\u0003J\t\u0010U\u001a\u00020\u0014HÆ\u0003J\t\u0010V\u001a\u00020\u0014HÆ\u0003J\t\u0010W\u001a\u00020\u0014HÆ\u0003J\t\u0010X\u001a\u00020\u0014HÆ\u0003J\t\u0010Y\u001a\u00020\u001cHÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010KJÄ\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020\u0003HÖ\u0001J\t\u0010g\u001a\u00020hHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0018\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00148@X\u0081\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010!R\u0014\u0010.\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0014\u00100\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0014\u00102\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0014\u00104\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010&R\u0014\u00106\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0014\u00108\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0014\u0010:\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0014\u0010A\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010=R\u0014\u0010C\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bE\u0010!R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bF\u0010!R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bO\u0010!¨\u0006i"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleOptions;", "", "targetPixelCount", "", "upscaleOnly", "", "algorithm", "Lcom/asni/imageupscale/ImageUpscaleAlgorithm;", "outputFormat", "Landroid/graphics/Bitmap$CompressFormat;", "outputFormatType", "Lcom/asni/imageupscale/ImageUpscaleOutputFormat;", "outputQuality", "maxInputPixelCount", "maxOutputPixelCount", "timeoutMillis", "", "metadataPolicy", "Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;", "denoiseStrength", "", "sharpenAmount", "whiteBalanceStrength", "autoBrightnessStrength", "contrastStrength", "saturationStrength", "localContrastStrength", "style", "Lcom/asni/imageupscale/ImageUpscaleStyle;", "(IZLcom/asni/imageupscale/ImageUpscaleAlgorithm;Landroid/graphics/Bitmap$CompressFormat;Lcom/asni/imageupscale/ImageUpscaleOutputFormat;IIILjava/lang/Long;Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;DDDDDDDLcom/asni/imageupscale/ImageUpscaleStyle;)V", "getAlgorithm", "()Lcom/asni/imageupscale/ImageUpscaleAlgorithm;", "getAutoBrightnessStrength", "()D", "getContrastStrength", "getDenoiseStrength", "getLocalContrastStrength", "getMaxInputPixelCount", "()I", "getMaxOutputPixelCount", "getMetadataPolicy", "()Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;", "normalizedAutoBrightnessStrength", "getNormalizedAutoBrightnessStrength$image_upscale_sdk_release$annotations", "()V", "getNormalizedAutoBrightnessStrength$image_upscale_sdk_release", "normalizedContrastStrength", "getNormalizedContrastStrength$image_upscale_sdk_release", "normalizedDenoiseStrength", "getNormalizedDenoiseStrength$image_upscale_sdk_release", "normalizedLocalContrastStrength", "getNormalizedLocalContrastStrength$image_upscale_sdk_release", "normalizedQuality", "getNormalizedQuality$image_upscale_sdk_release", "normalizedSaturationStrength", "getNormalizedSaturationStrength$image_upscale_sdk_release", "normalizedSharpenAmount", "getNormalizedSharpenAmount$image_upscale_sdk_release", "normalizedWhiteBalanceStrength", "getNormalizedWhiteBalanceStrength$image_upscale_sdk_release", "getOutputFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "getOutputFormatType", "()Lcom/asni/imageupscale/ImageUpscaleOutputFormat;", "getOutputQuality", "resolvedCompressFormat", "getResolvedCompressFormat$image_upscale_sdk_release", "resolvedTargetPixelCount", "getResolvedTargetPixelCount$image_upscale_sdk_release", "getSaturationStrength", "getSharpenAmount", "getStyle", "()Lcom/asni/imageupscale/ImageUpscaleStyle;", "getTargetPixelCount", "getTimeoutMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpscaleOnly", "()Z", "getWhiteBalanceStrength", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IZLcom/asni/imageupscale/ImageUpscaleAlgorithm;Landroid/graphics/Bitmap$CompressFormat;Lcom/asni/imageupscale/ImageUpscaleOutputFormat;IIILjava/lang/Long;Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;DDDDDDDLcom/asni/imageupscale/ImageUpscaleStyle;)Lcom/asni/imageupscale/ImageUpscaleOptions;", "equals", "other", "hashCode", "toString", "", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageUpscaleOptions {
    private final ImageUpscaleAlgorithm algorithm;
    private final double autoBrightnessStrength;
    private final double contrastStrength;
    private final double denoiseStrength;
    private final double localContrastStrength;
    private final int maxInputPixelCount;
    private final int maxOutputPixelCount;
    private final ImageUpscaleMetadataPolicy metadataPolicy;
    private final Bitmap.CompressFormat outputFormat;
    private final ImageUpscaleOutputFormat outputFormatType;
    private final int outputQuality;
    private final double saturationStrength;
    private final double sharpenAmount;
    private final ImageUpscaleStyle style;
    private final int targetPixelCount;
    private final Long timeoutMillis;
    private final boolean upscaleOnly;
    private final double whiteBalanceStrength;

    /* compiled from: ImageUpscaleOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageUpscaleStyle.values().length];
            try {
                iArr[ImageUpscaleStyle.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageUpscaleStyle.COMPETITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageUpscaleStyle.NATURAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageUpscaleOptions() {
        this(0, false, null, null, null, 0, 0, 0, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 262143, null);
    }

    @Deprecated(message = "Auto brightness is disabled and kept only for source compatibility.")
    public static /* synthetic */ void getNormalizedAutoBrightnessStrength$image_upscale_sdk_release$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getTargetPixelCount() {
        return this.targetPixelCount;
    }

    /* renamed from: component10, reason: from getter */
    public final ImageUpscaleMetadataPolicy getMetadataPolicy() {
        return this.metadataPolicy;
    }

    /* renamed from: component11, reason: from getter */
    public final double getDenoiseStrength() {
        return this.denoiseStrength;
    }

    /* renamed from: component12, reason: from getter */
    public final double getSharpenAmount() {
        return this.sharpenAmount;
    }

    /* renamed from: component13, reason: from getter */
    public final double getWhiteBalanceStrength() {
        return this.whiteBalanceStrength;
    }

    /* renamed from: component14, reason: from getter */
    public final double getAutoBrightnessStrength() {
        return this.autoBrightnessStrength;
    }

    /* renamed from: component15, reason: from getter */
    public final double getContrastStrength() {
        return this.contrastStrength;
    }

    /* renamed from: component16, reason: from getter */
    public final double getSaturationStrength() {
        return this.saturationStrength;
    }

    /* renamed from: component17, reason: from getter */
    public final double getLocalContrastStrength() {
        return this.localContrastStrength;
    }

    /* renamed from: component18, reason: from getter */
    public final ImageUpscaleStyle getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUpscaleOnly() {
        return this.upscaleOnly;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageUpscaleAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /* renamed from: component4, reason: from getter */
    public final Bitmap.CompressFormat getOutputFormat() {
        return this.outputFormat;
    }

    /* renamed from: component5, reason: from getter */
    public final ImageUpscaleOutputFormat getOutputFormatType() {
        return this.outputFormatType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOutputQuality() {
        return this.outputQuality;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxInputPixelCount() {
        return this.maxInputPixelCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMaxOutputPixelCount() {
        return this.maxOutputPixelCount;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final ImageUpscaleOptions copy(int targetPixelCount, boolean upscaleOnly, ImageUpscaleAlgorithm algorithm, Bitmap.CompressFormat outputFormat, ImageUpscaleOutputFormat outputFormatType, int outputQuality, int maxInputPixelCount, int maxOutputPixelCount, Long timeoutMillis, ImageUpscaleMetadataPolicy metadataPolicy, double denoiseStrength, double sharpenAmount, double whiteBalanceStrength, double autoBrightnessStrength, double contrastStrength, double saturationStrength, double localContrastStrength, ImageUpscaleStyle style) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(outputFormatType, "outputFormatType");
        Intrinsics.checkNotNullParameter(metadataPolicy, "metadataPolicy");
        Intrinsics.checkNotNullParameter(style, "style");
        return new ImageUpscaleOptions(targetPixelCount, upscaleOnly, algorithm, outputFormat, outputFormatType, outputQuality, maxInputPixelCount, maxOutputPixelCount, timeoutMillis, metadataPolicy, denoiseStrength, sharpenAmount, whiteBalanceStrength, autoBrightnessStrength, contrastStrength, saturationStrength, localContrastStrength, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUpscaleOptions)) {
            return false;
        }
        ImageUpscaleOptions imageUpscaleOptions = (ImageUpscaleOptions) other;
        return this.targetPixelCount == imageUpscaleOptions.targetPixelCount && this.upscaleOnly == imageUpscaleOptions.upscaleOnly && this.algorithm == imageUpscaleOptions.algorithm && this.outputFormat == imageUpscaleOptions.outputFormat && this.outputFormatType == imageUpscaleOptions.outputFormatType && this.outputQuality == imageUpscaleOptions.outputQuality && this.maxInputPixelCount == imageUpscaleOptions.maxInputPixelCount && this.maxOutputPixelCount == imageUpscaleOptions.maxOutputPixelCount && Intrinsics.areEqual(this.timeoutMillis, imageUpscaleOptions.timeoutMillis) && this.metadataPolicy == imageUpscaleOptions.metadataPolicy && Double.compare(this.denoiseStrength, imageUpscaleOptions.denoiseStrength) == 0 && Double.compare(this.sharpenAmount, imageUpscaleOptions.sharpenAmount) == 0 && Double.compare(this.whiteBalanceStrength, imageUpscaleOptions.whiteBalanceStrength) == 0 && Double.compare(this.autoBrightnessStrength, imageUpscaleOptions.autoBrightnessStrength) == 0 && Double.compare(this.contrastStrength, imageUpscaleOptions.contrastStrength) == 0 && Double.compare(this.saturationStrength, imageUpscaleOptions.saturationStrength) == 0 && Double.compare(this.localContrastStrength, imageUpscaleOptions.localContrastStrength) == 0 && this.style == imageUpscaleOptions.style;
    }

    public final double getNormalizedAutoBrightnessStrength$image_upscale_sdk_release() {
        return 0.0d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.targetPixelCount) * 31) + Boolean.hashCode(this.upscaleOnly)) * 31) + this.algorithm.hashCode()) * 31) + this.outputFormat.hashCode()) * 31) + this.outputFormatType.hashCode()) * 31) + Integer.hashCode(this.outputQuality)) * 31) + Integer.hashCode(this.maxInputPixelCount)) * 31) + Integer.hashCode(this.maxOutputPixelCount)) * 31;
        Long l = this.timeoutMillis;
        return ((((((((((((((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.metadataPolicy.hashCode()) * 31) + Double.hashCode(this.denoiseStrength)) * 31) + Double.hashCode(this.sharpenAmount)) * 31) + Double.hashCode(this.whiteBalanceStrength)) * 31) + Double.hashCode(this.autoBrightnessStrength)) * 31) + Double.hashCode(this.contrastStrength)) * 31) + Double.hashCode(this.saturationStrength)) * 31) + Double.hashCode(this.localContrastStrength)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "ImageUpscaleOptions(targetPixelCount=" + this.targetPixelCount + ", upscaleOnly=" + this.upscaleOnly + ", algorithm=" + this.algorithm + ", outputFormat=" + this.outputFormat + ", outputFormatType=" + this.outputFormatType + ", outputQuality=" + this.outputQuality + ", maxInputPixelCount=" + this.maxInputPixelCount + ", maxOutputPixelCount=" + this.maxOutputPixelCount + ", timeoutMillis=" + this.timeoutMillis + ", metadataPolicy=" + this.metadataPolicy + ", denoiseStrength=" + this.denoiseStrength + ", sharpenAmount=" + this.sharpenAmount + ", whiteBalanceStrength=" + this.whiteBalanceStrength + ", autoBrightnessStrength=" + this.autoBrightnessStrength + ", contrastStrength=" + this.contrastStrength + ", saturationStrength=" + this.saturationStrength + ", localContrastStrength=" + this.localContrastStrength + ", style=" + this.style + Separators.RPAREN;
    }

    public ImageUpscaleOptions(int i, boolean z, ImageUpscaleAlgorithm algorithm, Bitmap.CompressFormat outputFormat, ImageUpscaleOutputFormat outputFormatType, int i2, int i3, int i4, Long l, ImageUpscaleMetadataPolicy metadataPolicy, double d, double d2, double d3, double d4, double d5, double d6, double d7, ImageUpscaleStyle style) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(outputFormatType, "outputFormatType");
        Intrinsics.checkNotNullParameter(metadataPolicy, "metadataPolicy");
        Intrinsics.checkNotNullParameter(style, "style");
        this.targetPixelCount = i;
        this.upscaleOnly = z;
        this.algorithm = algorithm;
        this.outputFormat = outputFormat;
        this.outputFormatType = outputFormatType;
        this.outputQuality = i2;
        this.maxInputPixelCount = i3;
        this.maxOutputPixelCount = i4;
        this.timeoutMillis = l;
        this.metadataPolicy = metadataPolicy;
        this.denoiseStrength = d;
        this.sharpenAmount = d2;
        this.whiteBalanceStrength = d3;
        this.autoBrightnessStrength = d4;
        this.contrastStrength = d5;
        this.saturationStrength = d6;
        this.localContrastStrength = d7;
        this.style = style;
    }

    public final int getTargetPixelCount() {
        return this.targetPixelCount;
    }

    public final boolean getUpscaleOnly() {
        return this.upscaleOnly;
    }

    public /* synthetic */ ImageUpscaleOptions(int i, boolean z, ImageUpscaleAlgorithm imageUpscaleAlgorithm, Bitmap.CompressFormat compressFormat, ImageUpscaleOutputFormat imageUpscaleOutputFormat, int i2, int i3, int i4, Long l, ImageUpscaleMetadataPolicy imageUpscaleMetadataPolicy, double d, double d2, double d3, double d4, double d5, double d6, double d7, ImageUpscaleStyle imageUpscaleStyle, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? GmsVersion.VERSION_SAGA : i, (i5 & 2) != 0 ? true : z, (i5 & 4) != 0 ? ImageUpscaleAlgorithm.LANCZOS4 : imageUpscaleAlgorithm, (i5 & 8) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat, (i5 & 16) != 0 ? ImageUpscaleOutputFormat.JPEG : imageUpscaleOutputFormat, (i5 & 32) != 0 ? 92 : i2, (i5 & 64) != 0 ? 48000000 : i3, (i5 & 128) != 0 ? 16000000 : i4, (i5 & 256) != 0 ? 30000L : l, (i5 & 512) != 0 ? ImageUpscaleMetadataPolicy.PRESERVE_SAFE : imageUpscaleMetadataPolicy, (i5 & 1024) != 0 ? 0.0d : d, (i5 & 2048) != 0 ? 0.0d : d2, (i5 & 4096) != 0 ? 0.0d : d3, (i5 & 8192) != 0 ? 0.0d : d4, (i5 & 16384) != 0 ? 0.0d : d5, (32768 & i5) != 0 ? 0.0d : d6, (65536 & i5) == 0 ? d7 : 0.0d, (i5 & 131072) != 0 ? ImageUpscaleStyle.CUSTOM : imageUpscaleStyle);
    }

    public final ImageUpscaleAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final Bitmap.CompressFormat getOutputFormat() {
        return this.outputFormat;
    }

    public final ImageUpscaleOutputFormat getOutputFormatType() {
        return this.outputFormatType;
    }

    public final int getOutputQuality() {
        return this.outputQuality;
    }

    public final int getMaxInputPixelCount() {
        return this.maxInputPixelCount;
    }

    public final int getMaxOutputPixelCount() {
        return this.maxOutputPixelCount;
    }

    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final ImageUpscaleMetadataPolicy getMetadataPolicy() {
        return this.metadataPolicy;
    }

    public final double getDenoiseStrength() {
        return this.denoiseStrength;
    }

    public final double getSharpenAmount() {
        return this.sharpenAmount;
    }

    public final double getWhiteBalanceStrength() {
        return this.whiteBalanceStrength;
    }

    public final double getAutoBrightnessStrength() {
        return this.autoBrightnessStrength;
    }

    public final double getContrastStrength() {
        return this.contrastStrength;
    }

    public final double getSaturationStrength() {
        return this.saturationStrength;
    }

    public final double getLocalContrastStrength() {
        return this.localContrastStrength;
    }

    public final ImageUpscaleStyle getStyle() {
        return this.style;
    }

    public final int getResolvedTargetPixelCount$image_upscale_sdk_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            return this.targetPixelCount;
        }
        if (i == 2 || i == 3) {
            return GmsVersion.VERSION_SAGA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getNormalizedQuality$image_upscale_sdk_release() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i2 == 1) {
            i = this.outputQuality;
        } else if (i2 == 2) {
            i = 82;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 92;
        }
        return RangesKt.coerceIn(i, 0, 100);
    }

    public final Bitmap.CompressFormat getResolvedCompressFormat$image_upscale_sdk_release() {
        if (this.outputFormat == Bitmap.CompressFormat.JPEG) {
            return this.outputFormatType.getCompressFormat();
        }
        return this.outputFormat;
    }

    public final double getNormalizedDenoiseStrength$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.denoiseStrength;
        } else if (i == 2) {
            d = 0.45d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.1d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), 0.0d, 1.0d);
        }
        return 0.0d;
    }

    public final double getNormalizedSharpenAmount$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.sharpenAmount;
        } else if (i == 2) {
            d = 0.1d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.45d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), 0.0d, 1.0d);
        }
        return 0.0d;
    }

    public final double getNormalizedWhiteBalanceStrength$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.whiteBalanceStrength;
        } else if (i == 2) {
            d = 0.05d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.25d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), 0.0d, 1.0d);
        }
        return 0.0d;
    }

    public final double getNormalizedContrastStrength$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.contrastStrength;
        } else if (i == 2) {
            d = -0.08d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.18d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), -1.0d, 1.0d);
        }
        return 0.0d;
    }

    public final double getNormalizedSaturationStrength$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.saturationStrength;
        } else if (i == 2) {
            d = -0.28d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.3d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), -1.0d, 1.0d);
        }
        return 0.0d;
    }

    public final double getNormalizedLocalContrastStrength$image_upscale_sdk_release() {
        double d;
        int i = WhenMappings.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i == 1) {
            d = this.localContrastStrength;
        } else if (i == 2) {
            d = 0.08d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.4d;
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return RangesKt.coerceIn(valueOf.doubleValue(), 0.0d, 1.0d);
        }
        return 0.0d;
    }
}
