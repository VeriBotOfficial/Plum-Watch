package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUpscaleTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleProgressStage;", "", "(Ljava/lang/String;I)V", "VALIDATING", "DECODING", "RESIZING", "ENCODING", "COMPLETED", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleProgressStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageUpscaleProgressStage[] $VALUES;
    public static final ImageUpscaleProgressStage VALIDATING = new ImageUpscaleProgressStage("VALIDATING", 0);
    public static final ImageUpscaleProgressStage DECODING = new ImageUpscaleProgressStage("DECODING", 1);
    public static final ImageUpscaleProgressStage RESIZING = new ImageUpscaleProgressStage("RESIZING", 2);
    public static final ImageUpscaleProgressStage ENCODING = new ImageUpscaleProgressStage("ENCODING", 3);
    public static final ImageUpscaleProgressStage COMPLETED = new ImageUpscaleProgressStage("COMPLETED", 4);

    private static final /* synthetic */ ImageUpscaleProgressStage[] $values() {
        return new ImageUpscaleProgressStage[]{VALIDATING, DECODING, RESIZING, ENCODING, COMPLETED};
    }

    public static EnumEntries<ImageUpscaleProgressStage> getEntries() {
        return $ENTRIES;
    }

    public static ImageUpscaleProgressStage valueOf(String str) {
        return (ImageUpscaleProgressStage) Enum.valueOf(ImageUpscaleProgressStage.class, str);
    }

    public static ImageUpscaleProgressStage[] values() {
        return (ImageUpscaleProgressStage[]) $VALUES.clone();
    }

    private ImageUpscaleProgressStage(String str, int i) {
    }

    static {
        ImageUpscaleProgressStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
