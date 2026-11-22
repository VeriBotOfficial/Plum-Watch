package org.tensorflow.lite.schema;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;

/* loaded from: classes7.dex */
public final class QuantizationDetails {
    public static final byte CustomQuantization = 1;
    public static final byte NONE = 0;
    public static final String[] names = {DialPromoBanner.NONE, "CustomQuantization"};

    private QuantizationDetails() {
    }

    public static String name(int i) {
        return names[i];
    }
}
