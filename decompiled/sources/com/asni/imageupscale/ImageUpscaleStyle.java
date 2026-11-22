package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUpscaleOptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleStyle;", "", "(Ljava/lang/String;I)V", "CUSTOM", "COMPETITOR", "NATURAL", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageUpscaleStyle[] $VALUES;
    public static final ImageUpscaleStyle CUSTOM = new ImageUpscaleStyle("CUSTOM", 0);
    public static final ImageUpscaleStyle COMPETITOR = new ImageUpscaleStyle("COMPETITOR", 1);
    public static final ImageUpscaleStyle NATURAL = new ImageUpscaleStyle("NATURAL", 2);

    private static final /* synthetic */ ImageUpscaleStyle[] $values() {
        return new ImageUpscaleStyle[]{CUSTOM, COMPETITOR, NATURAL};
    }

    public static EnumEntries<ImageUpscaleStyle> getEntries() {
        return $ENTRIES;
    }

    public static ImageUpscaleStyle valueOf(String str) {
        return (ImageUpscaleStyle) Enum.valueOf(ImageUpscaleStyle.class, str);
    }

    public static ImageUpscaleStyle[] values() {
        return (ImageUpscaleStyle[]) $VALUES.clone();
    }

    private ImageUpscaleStyle(String str, int i) {
    }

    static {
        ImageUpscaleStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
