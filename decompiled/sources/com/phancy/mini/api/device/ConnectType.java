package com.phancy.mini.api.device;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NetConnectManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType;", "", "value", "", "desc", "", "(ILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getValue", "()I", "Companion", "M2G", "M3G", "M4G", "M5G", "Mobile", "None", "Unknown", "Wifi", "Lcom/phancy/mini/api/device/ConnectType$M2G;", "Lcom/phancy/mini/api/device/ConnectType$M3G;", "Lcom/phancy/mini/api/device/ConnectType$M4G;", "Lcom/phancy/mini/api/device/ConnectType$M5G;", "Lcom/phancy/mini/api/device/ConnectType$Mobile;", "Lcom/phancy/mini/api/device/ConnectType$None;", "Lcom/phancy/mini/api/device/ConnectType$Unknown;", "Lcom/phancy/mini/api/device/ConnectType$Wifi;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ConnectType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String desc;
    private final int value;

    public /* synthetic */ ConnectType(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$None;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends ConnectType {
        public static final None INSTANCE = new None();

        private None() {
            super(-1, "none", null);
        }
    }

    private ConnectType(int i, String str) {
        this.value = i;
        this.desc = str;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$Unknown;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends ConnectType {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(-2, "unknown", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$Mobile;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Mobile extends ConnectType {
        public static final Mobile INSTANCE = new Mobile();

        private Mobile() {
            super(0, "mobile", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$Wifi;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Wifi extends ConnectType {
        public static final Wifi INSTANCE = new Wifi();

        private Wifi() {
            super(1, "wifi", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$M2G;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class M2G extends ConnectType {
        public static final M2G INSTANCE = new M2G();

        private M2G() {
            super(2, "2G", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$M3G;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class M3G extends ConnectType {
        public static final M3G INSTANCE = new M3G();

        private M3G() {
            super(3, "3G", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$M4G;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class M4G extends ConnectType {
        public static final M4G INSTANCE = new M4G();

        private M4G() {
            super(4, "4G", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$M5G;", "Lcom/phancy/mini/api/device/ConnectType;", "()V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class M5G extends ConnectType {
        public static final M5G INSTANCE = new M5G();

        private M5G() {
            super(5, "5G", null);
        }
    }

    /* compiled from: NetConnectManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/api/device/ConnectType$Companion;", "", "()V", "convert2Type", "Lcom/phancy/mini/api/device/ConnectType;", "value", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConnectType convert2Type(int value) {
            return value == Unknown.INSTANCE.getValue() ? Unknown.INSTANCE : value == Mobile.INSTANCE.getValue() ? Mobile.INSTANCE : value == Wifi.INSTANCE.getValue() ? Wifi.INSTANCE : value == M2G.INSTANCE.getValue() ? M2G.INSTANCE : value == M3G.INSTANCE.getValue() ? M3G.INSTANCE : value == M4G.INSTANCE.getValue() ? M4G.INSTANCE : value == M5G.INSTANCE.getValue() ? M5G.INSTANCE : None.INSTANCE;
        }
    }
}
