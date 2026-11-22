package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUpscaleAlgorithm.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleAlgorithm;", "", "openCvInterpolation", "", "(Ljava/lang/String;II)V", "getOpenCvInterpolation$image_upscale_sdk_release", "()I", "LANCZOS4", "CUBIC", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleAlgorithm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageUpscaleAlgorithm[] $VALUES;
    private final int openCvInterpolation;
    public static final ImageUpscaleAlgorithm LANCZOS4 = new ImageUpscaleAlgorithm("LANCZOS4", 0, 4);
    public static final ImageUpscaleAlgorithm CUBIC = new ImageUpscaleAlgorithm("CUBIC", 1, 2);

    private static final /* synthetic */ ImageUpscaleAlgorithm[] $values() {
        return new ImageUpscaleAlgorithm[]{LANCZOS4, CUBIC};
    }

    public static EnumEntries<ImageUpscaleAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static ImageUpscaleAlgorithm valueOf(String str) {
        return (ImageUpscaleAlgorithm) Enum.valueOf(ImageUpscaleAlgorithm.class, str);
    }

    public static ImageUpscaleAlgorithm[] values() {
        return (ImageUpscaleAlgorithm[]) $VALUES.clone();
    }

    private ImageUpscaleAlgorithm(String str, int i, int i2) {
        this.openCvInterpolation = i2;
    }

    /* renamed from: getOpenCvInterpolation$image_upscale_sdk_release, reason: from getter */
    public final int getOpenCvInterpolation() {
        return this.openCvInterpolation;
    }

    static {
        ImageUpscaleAlgorithm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
