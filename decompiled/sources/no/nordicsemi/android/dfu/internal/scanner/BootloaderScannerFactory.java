package no.nordicsemi.android.dfu.internal.scanner;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class BootloaderScannerFactory {
    private static final int ADDRESS_DIFF = 1;

    private BootloaderScannerFactory() {
    }

    public static String getIncrementedAddress(String str) {
        return str.substring(0, 15) + String.format(Locale.US, "%02X", Integer.valueOf((Integer.valueOf(str.substring(15), 16).intValue() + 1) & 255));
    }

    public static BootloaderScanner getScanner(String str, UUID uuid) {
        return new BootloaderScannerLollipop(str, getIncrementedAddress(str), uuid);
    }
}
