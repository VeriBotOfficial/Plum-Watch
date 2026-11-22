package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUpscaleError.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleErrorCode;", "", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "IMAGE_NOT_FOUND", "DECODE_FAILED", "RENDER_FAILED", "ENCODE_FAILED", "COPY_FAILED", "INPUT_TOO_LARGE", "OUTPUT_TOO_LARGE", "TIMED_OUT", "CANCELLED", "OPENCV_UNAVAILABLE", "UNSUPPORTED_FORMAT", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageUpscaleErrorCode[] $VALUES;
    public static final ImageUpscaleErrorCode INVALID_ARGUMENT = new ImageUpscaleErrorCode("INVALID_ARGUMENT", 0);
    public static final ImageUpscaleErrorCode IMAGE_NOT_FOUND = new ImageUpscaleErrorCode("IMAGE_NOT_FOUND", 1);
    public static final ImageUpscaleErrorCode DECODE_FAILED = new ImageUpscaleErrorCode("DECODE_FAILED", 2);
    public static final ImageUpscaleErrorCode RENDER_FAILED = new ImageUpscaleErrorCode("RENDER_FAILED", 3);
    public static final ImageUpscaleErrorCode ENCODE_FAILED = new ImageUpscaleErrorCode("ENCODE_FAILED", 4);
    public static final ImageUpscaleErrorCode COPY_FAILED = new ImageUpscaleErrorCode("COPY_FAILED", 5);
    public static final ImageUpscaleErrorCode INPUT_TOO_LARGE = new ImageUpscaleErrorCode("INPUT_TOO_LARGE", 6);
    public static final ImageUpscaleErrorCode OUTPUT_TOO_LARGE = new ImageUpscaleErrorCode("OUTPUT_TOO_LARGE", 7);
    public static final ImageUpscaleErrorCode TIMED_OUT = new ImageUpscaleErrorCode("TIMED_OUT", 8);
    public static final ImageUpscaleErrorCode CANCELLED = new ImageUpscaleErrorCode("CANCELLED", 9);
    public static final ImageUpscaleErrorCode OPENCV_UNAVAILABLE = new ImageUpscaleErrorCode("OPENCV_UNAVAILABLE", 10);
    public static final ImageUpscaleErrorCode UNSUPPORTED_FORMAT = new ImageUpscaleErrorCode("UNSUPPORTED_FORMAT", 11);

    private static final /* synthetic */ ImageUpscaleErrorCode[] $values() {
        return new ImageUpscaleErrorCode[]{INVALID_ARGUMENT, IMAGE_NOT_FOUND, DECODE_FAILED, RENDER_FAILED, ENCODE_FAILED, COPY_FAILED, INPUT_TOO_LARGE, OUTPUT_TOO_LARGE, TIMED_OUT, CANCELLED, OPENCV_UNAVAILABLE, UNSUPPORTED_FORMAT};
    }

    public static EnumEntries<ImageUpscaleErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static ImageUpscaleErrorCode valueOf(String str) {
        return (ImageUpscaleErrorCode) Enum.valueOf(ImageUpscaleErrorCode.class, str);
    }

    public static ImageUpscaleErrorCode[] values() {
        return (ImageUpscaleErrorCode[]) $VALUES.clone();
    }

    private ImageUpscaleErrorCode(String str, int i) {
    }

    static {
        ImageUpscaleErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
