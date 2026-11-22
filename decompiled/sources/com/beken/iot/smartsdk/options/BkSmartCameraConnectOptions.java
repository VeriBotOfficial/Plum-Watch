package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.callback.OnConnectCallback;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: BkSmartCameraConnectOptions.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraConnectOptions;", "", "builder", "Lcom/beken/iot/smartsdk/options/BkSmartCameraConnectOptions$Builder;", "(Lcom/beken/iot/smartsdk/options/BkSmartCameraConnectOptions$Builder;)V", "connectCallback", "Lcom/beken/iot/smartsdk/callback/OnConnectCallback;", "getConnectCallback", "()Lcom/beken/iot/smartsdk/callback/OnConnectCallback;", "cs2Key", "Lcom/beken/iot/smartsdk/options/Cs2Key;", "getCs2Key", "()Lcom/beken/iot/smartsdk/options/Cs2Key;", "scanTimeout", "", "getScanTimeout", "()I", "transmissionProtocol", "Lcom/beken/iot/smartsdk/options/Transmission;", "getTransmissionProtocol", "()Lcom/beken/iot/smartsdk/options/Transmission;", "wifiMode", "Lcom/beken/iot/smartsdk/options/WifiMode;", "checkParams", "", "toString", "", "Builder", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BkSmartCameraConnectOptions {
    private final OnConnectCallback connectCallback;
    private final Cs2Key cs2Key;
    private final int scanTimeout;
    private final Transmission transmissionProtocol;
    private final WifiMode wifiMode;

    /* compiled from: BkSmartCameraConnectOptions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Transmission.values().length];
            try {
                iArr[Transmission.CS2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WifiMode.values().length];
            try {
                iArr2[WifiMode.STATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[WifiMode.SOFT_AP.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BkSmartCameraConnectOptions(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.transmissionProtocol = builder.getTransmissionProtocol();
        this.wifiMode = builder.getWifiMode();
        this.cs2Key = builder.getCs2Key();
        this.connectCallback = builder.getConnectCallback();
        this.scanTimeout = builder.getScanTimeout();
        if (!checkParams()) {
            throw new IllegalArgumentException("connect options is illegal");
        }
    }

    public final Transmission getTransmissionProtocol() {
        return this.transmissionProtocol;
    }

    public final Cs2Key getCs2Key() {
        return this.cs2Key;
    }

    public final OnConnectCallback getConnectCallback() {
        return this.connectCallback;
    }

    public final int getScanTimeout() {
        return this.scanTimeout;
    }

    private final boolean checkParams() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.wifiMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return WhenMappings.$EnumSwitchMapping$0[this.transmissionProtocol.ordinal()] != 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (WhenMappings.$EnumSwitchMapping$0[this.transmissionProtocol.ordinal()] != 1) {
            return true;
        }
        Cs2Key cs2Key = this.cs2Key;
        if (cs2Key != null) {
            return cs2Key.isLegal();
        }
        return false;
    }

    public String toString() {
        return "BkSmartCameraConnectOptions(transmissionProtocol=" + this.transmissionProtocol + ", wifiMode=" + this.wifiMode + ", cs2Key=" + this.cs2Key + ", connectCallback=" + this.connectCallback + ')';
    }

    /* compiled from: BkSmartCameraConnectOptions.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraConnectOptions$Builder;", "", "()V", "connectCallback", "Lcom/beken/iot/smartsdk/callback/OnConnectCallback;", "cs2Key", "Lcom/beken/iot/smartsdk/options/Cs2Key;", "scanTimeout", "", "transmissionProtocol", "Lcom/beken/iot/smartsdk/options/Transmission;", "wifiMode", "Lcom/beken/iot/smartsdk/options/WifiMode;", "build", "Lcom/beken/iot/smartsdk/options/BkSmartCameraConnectOptions;", "getConnectCallback", "getCs2Key", "getScanTimeout", "getTransmissionProtocol", "getWifiMode", "setConnectCallback", "callback", "setCs2Key", "setScanTimeout", "timeout", "setTransmissionProtocol", "protocol", "setWifiMode", DOMConstants.ATTR_MODE, "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private OnConnectCallback connectCallback;
        private Cs2Key cs2Key;
        private Transmission transmissionProtocol = Transmission.CS2;
        private WifiMode wifiMode = WifiMode.STATION;
        private int scanTimeout = 30;

        public final Builder setTransmissionProtocol(Transmission protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.transmissionProtocol = protocol;
            return this;
        }

        public final Transmission getTransmissionProtocol() {
            return this.transmissionProtocol;
        }

        public final Builder setWifiMode(WifiMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.wifiMode = mode;
            return this;
        }

        public final WifiMode getWifiMode() {
            return this.wifiMode;
        }

        public final Builder setCs2Key(Cs2Key cs2Key) {
            this.cs2Key = cs2Key;
            return this;
        }

        public final Cs2Key getCs2Key() {
            return this.cs2Key;
        }

        public final Builder setConnectCallback(OnConnectCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.connectCallback = callback;
            return this;
        }

        public final OnConnectCallback getConnectCallback() {
            return this.connectCallback;
        }

        public final Builder setScanTimeout(int timeout) {
            this.scanTimeout = timeout;
            return this;
        }

        public final int getScanTimeout() {
            return this.scanTimeout;
        }

        public final BkSmartCameraConnectOptions build() {
            return new BkSmartCameraConnectOptions(this);
        }
    }
}
