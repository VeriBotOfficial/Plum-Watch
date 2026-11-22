package org.tensorflow.lite.support.metadata.schema;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;

/* loaded from: classes7.dex */
public final class ContentProperties {
    public static final byte AudioProperties = 4;
    public static final byte BoundingBoxProperties = 3;
    public static final byte FeatureProperties = 1;
    public static final byte ImageProperties = 2;
    public static final byte NONE = 0;
    public static final String[] names = {DialPromoBanner.NONE, "FeatureProperties", "ImageProperties", "BoundingBoxProperties", "AudioProperties"};

    private ContentProperties() {
    }

    public static String name(int i) {
        return names[i];
    }
}
