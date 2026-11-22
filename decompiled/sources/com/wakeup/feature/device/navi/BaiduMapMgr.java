package com.wakeup.feature.device.navi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: BaiduMapMgr.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/device/navi/BaiduMapMgr;", "", "<init>", "()V", "chooseMapMode", "", "mNaviType", "isSyncDevice", "", "saveMapMode", "", DOMConstants.ATTR_MODE, "getMapMode", "setNaviType", "naviType", "getNaviType", "setIsSyncDevice", "getIsSyncDevice", "InstanceHolder", "Companion", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaiduMapMgr {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODE_MAP = 1;
    public static final int MODE_TEXT = 0;
    public static final int TYPE_ELECTRIC_RIDE = 0;
    public static final int TYPE_RIDE = 1;
    public static final int TYPE_WALK = 2;
    private int chooseMapMode;
    private boolean isSyncDevice;
    private int mNaviType = 1;

    /* compiled from: BaiduMapMgr.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/device/navi/BaiduMapMgr$InstanceHolder;", "", "<init>", "()V", "instance", "Lcom/wakeup/feature/device/navi/BaiduMapMgr;", "getInstance", "()Lcom/wakeup/feature/device/navi/BaiduMapMgr;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class InstanceHolder {
        public static final InstanceHolder INSTANCE = new InstanceHolder();
        private static final BaiduMapMgr instance = new BaiduMapMgr();

        private InstanceHolder() {
        }

        public final BaiduMapMgr getInstance() {
            return instance;
        }
    }

    /* compiled from: BaiduMapMgr.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/feature/device/navi/BaiduMapMgr$Companion;", "", "<init>", "()V", "TYPE_ELECTRIC_RIDE", "", "TYPE_RIDE", "TYPE_WALK", "MODE_TEXT", "MODE_MAP", "instance", "Lcom/wakeup/feature/device/navi/BaiduMapMgr;", "getInstance", "()Lcom/wakeup/feature/device/navi/BaiduMapMgr;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BaiduMapMgr getInstance() {
            return InstanceHolder.INSTANCE.getInstance();
        }
    }

    public final void saveMapMode(int mode) {
        this.chooseMapMode = mode;
    }

    /* renamed from: getMapMode, reason: from getter */
    public final int getChooseMapMode() {
        return this.chooseMapMode;
    }

    public final void setNaviType(int naviType) {
        this.mNaviType = naviType;
    }

    /* renamed from: getNaviType, reason: from getter */
    public final int getMNaviType() {
        return this.mNaviType;
    }

    public final void setIsSyncDevice(boolean isSyncDevice) {
        this.isSyncDevice = isSyncDevice;
    }

    public final boolean getIsSyncDevice() {
        return this.isSyncDevice;
    }
}
