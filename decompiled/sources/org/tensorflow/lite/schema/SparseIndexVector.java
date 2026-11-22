package org.tensorflow.lite.schema;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;

/* loaded from: classes7.dex */
public final class SparseIndexVector {
    public static final byte Int32Vector = 1;
    public static final byte NONE = 0;
    public static final byte Uint16Vector = 2;
    public static final byte Uint8Vector = 3;
    public static final String[] names = {DialPromoBanner.NONE, "Int32Vector", "Uint16Vector", "Uint8Vector"};

    private SparseIndexVector() {
    }

    public static String name(int i) {
        return names[i];
    }
}
