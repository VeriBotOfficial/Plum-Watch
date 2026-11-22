package com.wakeup.common.storage;

import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.model.DeviceLocal;
import com.wakeup.common.storage.model.DeviceScreen;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceLocalSupports.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J2\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0012H\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/storage/DeviceLocalSupports;", "", "<init>", "()V", "CACHE_KEY", "", "save", "", "mac", "deviceLocal", "Lcom/wakeup/common/storage/model/DeviceLocal;", "isSupportDouble", "", "isSupportNewAliCode", "isSupportPressure", "isSupportFileTrans", "isSupportFOta", "getType", "", "getDeviceType", "getOtaType", "isSupperSwitchReceive", "printSupport", "saveScreen", "width", "height", "screenType", "rotate", "getScreen", "Lcom/wakeup/common/storage/model/DeviceScreen;", "getRotate", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceLocalSupports {
    public static final String CACHE_KEY = "local_supports_key_";
    public static final DeviceLocalSupports INSTANCE = new DeviceLocalSupports();

    @JvmStatic
    public static final boolean isSupportFOta(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return true;
    }

    @JvmStatic
    public static final void saveScreen(String mac, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        saveScreen$default(mac, i, i2, i3, 0, 16, null);
    }

    private DeviceLocalSupports() {
    }

    @JvmStatic
    public static final void save(String mac, DeviceLocal deviceLocal) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(deviceLocal, "deviceLocal");
        CacheManager.INSTANCE.saveData(CACHE_KEY + mac, deviceLocal);
    }

    @JvmStatic
    public static final boolean isSupportDouble(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return false;
        }
        return deviceLocal.supportDouble();
    }

    @JvmStatic
    public static final boolean isSupportNewAliCode(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return false;
        }
        return deviceLocal.supportNewAliCode();
    }

    @JvmStatic
    public static final boolean isSupportPressure(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return false;
        }
        return deviceLocal.supportPressure();
    }

    @JvmStatic
    public static final boolean isSupportFileTrans(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (MockSleepSoundDevice.INSTANCE.getEnabled()) {
            return true;
        }
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return false;
        }
        return deviceLocal.supportFileTrans();
    }

    @JvmStatic
    public static final int getType(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return 1;
        }
        return deviceLocal.getPlatform();
    }

    @JvmStatic
    public static final int getDeviceType(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return 0;
        }
        return deviceLocal.getDeviceType();
    }

    @JvmStatic
    public static final int getOtaType(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return 0;
        }
        return deviceLocal.getOtaType();
    }

    @JvmStatic
    public static final boolean isSupperSwitchReceive(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return false;
        }
        return deviceLocal.supportSwitchReceive();
    }

    @JvmStatic
    public static final String printSupport(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        return "一键双联: " + (deviceLocal != null ? deviceLocal.supportDouble() : false) + " ,新乘车码: " + (deviceLocal != null ? deviceLocal.supportNewAliCode() : false) + " ,压力: " + (deviceLocal != null ? deviceLocal.supportPressure() : false) + " ,自研文件传输: " + (deviceLocal != null ? deviceLocal.supportFileTrans() : false);
    }

    public static /* synthetic */ void saveScreen$default(String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i4 = 1;
        }
        saveScreen(str, i, i2, i3, i4);
    }

    @JvmStatic
    public static final void saveScreen(String mac, int width, int height, int screenType, int rotate) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceScreen deviceScreen = new DeviceScreen(width, height, screenType);
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return;
        }
        deviceLocal.setDeviceScreen(deviceScreen);
        deviceLocal.setRotate(rotate);
        CacheManager.INSTANCE.saveData(CACHE_KEY + mac, deviceLocal);
    }

    @JvmStatic
    public static final DeviceScreen getScreen(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        LogUtils.i("DeviceScreenType", "getScreen = " + CacheManager.INSTANCE.getString(CACHE_KEY + mac));
        if (deviceLocal == null) {
            return null;
        }
        return deviceLocal.getDeviceScreen();
    }

    @JvmStatic
    public static final int getRotate(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceLocal deviceLocal = (DeviceLocal) CacheManager.INSTANCE.getData(CACHE_KEY + mac, DeviceLocal.class);
        if (deviceLocal == null) {
            return 1;
        }
        return deviceLocal.getRotate();
    }
}
