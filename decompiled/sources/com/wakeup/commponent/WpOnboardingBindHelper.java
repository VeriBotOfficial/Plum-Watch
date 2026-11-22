package com.wakeup.commponent;

import android.app.Activity;
import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.commponent.constant.PagePath;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WpOnboardingBindHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u001aJ\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR&\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/wakeup/commponent/WpOnboardingBindHelper;", "", "<init>", "()V", "TAG", "", "EXTRA_FROM_ONBOARDING", "CACHE_LOGIN_COLD_START", "CACHE_JUMP_HOME", "value", "", "bindSessionActive", "getBindSessionActive", "()Z", "registerSessionActive", "getRegisterSessionActive", "hasInterHome", "getHasInterHome", "beforeGoHomeListener", "Ljava/lang/Runnable;", "getBeforeGoHomeListener$annotations", "getBeforeGoHomeListener", "()Ljava/lang/Runnable;", "setBeforeGoHomeListener", "(Ljava/lang/Runnable;)V", "markColdStartLogin", "", "isColdStartLogin", "clearColdStartLogin", "markJumpHome", "isHasJumpHome", "isHasInterHome", "clearHasInterHome", "clearJumpHome", "startBindSession", "clearBindSession", "markRegisterSession", "isRegisterSession", "clearRegisterSession", "goHome", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "finishInBindFlow", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WpOnboardingBindHelper {
    private static final String CACHE_JUMP_HOME = "wp_jump_home";
    private static final String CACHE_LOGIN_COLD_START = "wp_login_from_cold_start";
    public static final String EXTRA_FROM_ONBOARDING = "wp_from_onboarding";
    public static final WpOnboardingBindHelper INSTANCE = new WpOnboardingBindHelper();
    private static final String TAG = "WpOnboardingBindHelper";
    private static volatile Runnable beforeGoHomeListener;
    private static volatile boolean bindSessionActive;
    private static volatile boolean hasInterHome;
    private static volatile boolean registerSessionActive;

    @JvmStatic
    public static /* synthetic */ void getBeforeGoHomeListener$annotations() {
    }

    private WpOnboardingBindHelper() {
    }

    public final boolean getBindSessionActive() {
        return bindSessionActive;
    }

    public final boolean getRegisterSessionActive() {
        return registerSessionActive;
    }

    public final boolean getHasInterHome() {
        return hasInterHome;
    }

    public static final Runnable getBeforeGoHomeListener() {
        return beforeGoHomeListener;
    }

    public static final void setBeforeGoHomeListener(Runnable runnable) {
        beforeGoHomeListener = runnable;
    }

    public final void markColdStartLogin() {
        CacheManager.saveBoolean(CACHE_LOGIN_COLD_START, true);
        LogUtils.i(TAG, "markColdStartLogin");
    }

    public final boolean isColdStartLogin() {
        return CacheManager.getBoolean(CACHE_LOGIN_COLD_START, false);
    }

    public final void clearColdStartLogin() {
        CacheManager.saveBoolean(CACHE_LOGIN_COLD_START, false);
    }

    public final void markJumpHome() {
        hasInterHome = true;
        CacheManager.saveBoolean(CACHE_JUMP_HOME, true);
        LogUtils.i(TAG, "markJumpHome");
    }

    public final boolean isHasJumpHome() {
        return CacheManager.getBoolean(CACHE_JUMP_HOME, false);
    }

    public final boolean isHasInterHome() {
        return hasInterHome;
    }

    public final void clearHasInterHome() {
        hasInterHome = false;
    }

    public final void clearJumpHome() {
        CacheManager.saveBoolean(CACHE_JUMP_HOME, false);
    }

    public final void startBindSession() {
        bindSessionActive = true;
        LogUtils.i(TAG, "startBindSession");
    }

    public final void clearBindSession() {
        bindSessionActive = false;
    }

    public final void markRegisterSession() {
        registerSessionActive = true;
        LogUtils.i(TAG, "markRegisterSession");
    }

    public final boolean isRegisterSession() {
        return registerSessionActive;
    }

    public final void clearRegisterSession() {
        if (registerSessionActive) {
            LogUtils.i(TAG, "clearRegisterSession");
        }
        registerSessionActive = false;
    }

    public final void goHome(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogUtils.i(TAG, "goHome sessionWasActive=" + bindSessionActive);
        clearBindSession();
        clearColdStartLogin();
        Runnable runnable = beforeGoHomeListener;
        if (runnable != null) {
            runnable.run();
        }
        Navigator.start((Context) activity, PagePath.PAGE_MAIN_HOME, true);
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final void finishInBindFlow(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (bindSessionActive) {
            goHome(activity);
        } else {
            activity.finish();
        }
    }
}
