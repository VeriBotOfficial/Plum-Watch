package com.wakeup.commonui.newui.utils;

import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;

/* compiled from: GuildeUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/commonui/newui/utils/GuideUtils;", "", "<init>", "()V", "IS_FIRST_LAUNCH", "", "currentStep", "", "KEY_IS_FIRST_CONNECT_DEVICE", "KEY_IS_FIRST_LAUNCH_COMPONENT", "isFirstLaunch", "", "setCurrentStep", "", "step", "getCurrentStep", "markAsLaunched", "isFirstConnectDevice", "markAsConnectDevice", "isFirstLaunchComponent", "markAsLaunchComponent", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GuideUtils {
    public static final GuideUtils INSTANCE = new GuideUtils();
    private static final String IS_FIRST_LAUNCH = "isFirstLaunch";
    private static int currentStep = 1;
    private static final String KEY_IS_FIRST_CONNECT_DEVICE = "isFirstConnectDevice";
    private static final String KEY_IS_FIRST_LAUNCH_COMPONENT = "isFirstLaunchComponent";

    private GuideUtils() {
    }

    public final boolean isFirstLaunch() {
        return CacheManager.getBoolean(IS_FIRST_LAUNCH, true);
    }

    public final void setCurrentStep(int step) {
        currentStep = step;
    }

    public final int getCurrentStep() {
        return currentStep;
    }

    public final void markAsLaunched() {
        CacheManager.saveBoolean(IS_FIRST_LAUNCH, false);
    }

    public final boolean isFirstConnectDevice() {
        return CacheManager.getBoolean(KEY_IS_FIRST_CONNECT_DEVICE, true);
    }

    public final void markAsConnectDevice() {
        CacheManager.saveBoolean(KEY_IS_FIRST_CONNECT_DEVICE, false);
    }

    public final boolean isFirstLaunchComponent() {
        return CacheManager.getBoolean(KEY_IS_FIRST_LAUNCH_COMPONENT, true);
    }

    public final void markAsLaunchComponent() {
        CacheManager.saveBoolean(KEY_IS_FIRST_LAUNCH_COMPONENT, false);
    }
}
