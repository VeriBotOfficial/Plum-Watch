package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUpscaleOptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleMetadataPolicy;", "", "(Ljava/lang/String;I)V", "DISCARD", "PRESERVE_SAFE", "PRESERVE_ALL", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleMetadataPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageUpscaleMetadataPolicy[] $VALUES;
    public static final ImageUpscaleMetadataPolicy DISCARD = new ImageUpscaleMetadataPolicy("DISCARD", 0);
    public static final ImageUpscaleMetadataPolicy PRESERVE_SAFE = new ImageUpscaleMetadataPolicy("PRESERVE_SAFE", 1);
    public static final ImageUpscaleMetadataPolicy PRESERVE_ALL = new ImageUpscaleMetadataPolicy("PRESERVE_ALL", 2);

    private static final /* synthetic */ ImageUpscaleMetadataPolicy[] $values() {
        return new ImageUpscaleMetadataPolicy[]{DISCARD, PRESERVE_SAFE, PRESERVE_ALL};
    }

    public static EnumEntries<ImageUpscaleMetadataPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ImageUpscaleMetadataPolicy valueOf(String str) {
        return (ImageUpscaleMetadataPolicy) Enum.valueOf(ImageUpscaleMetadataPolicy.class, str);
    }

    public static ImageUpscaleMetadataPolicy[] values() {
        return (ImageUpscaleMetadataPolicy[]) $VALUES.clone();
    }

    private ImageUpscaleMetadataPolicy(String str, int i) {
    }

    static {
        ImageUpscaleMetadataPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
