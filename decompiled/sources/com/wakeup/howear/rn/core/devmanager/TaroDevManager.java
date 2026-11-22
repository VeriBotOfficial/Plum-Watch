package com.wakeup.howear.rn.core.devmanager;

import android.app.Application;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.wakeup.howear.rn.core.RnApplication;
import com.yandex.div.core.timer.TimerController;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TaroDevManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0005J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0007J\b\u0010(\u001a\u00020\u001cH\u0002J\u0016\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/wakeup/howear/rn/core/devmanager/TaroDevManager;", "", "<init>", "()V", "TAG", "", "JS_BUNDLE_FILE_NAME", "JS_BUNDLE_WITH_TAG_BRIDGE_FILE_NAME", "application", "Landroid/app/Application;", "packagerConnectionSettings", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "kotlin.jvm.PlatformType", "getReactInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "value", "sourceCodeScriptUrl", "getSourceCodeScriptUrl", "()Ljava/lang/String;", "init", "", "app", "loadBundleByBundleUrl", "host", "jsMainModulePath", "loadBundle", "url", "setDebugHttpHost", "setJsMainModuleName", TimerController.RESET_COMMAND, "removeDownloadedJsBundleFile", "clearReactNativeHost", "reloadJS", "runOnUiThread", "runnable", "Lkotlin/Function0;", "feature-rn_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaroDevManager {
    public static final TaroDevManager INSTANCE = new TaroDevManager();
    private static final String JS_BUNDLE_FILE_NAME = "ReactNativeDevBundle.js";
    private static final String JS_BUNDLE_WITH_TAG_BRIDGE_FILE_NAME = "BridgeReactNativeDevBundle.js";
    private static final String TAG = "TaroDevManager";
    private static Application application;
    private static PackagerConnectionSettings packagerConnectionSettings;
    private static ReactNativeHost reactNativeHost;
    private static String sourceCodeScriptUrl;

    private TaroDevManager() {
    }

    static {
        ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda1
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
                TaroDevManager._init_$lambda$0(reactMarkerConstants, str, i);
            }
        });
        sourceCodeScriptUrl = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        if (reactMarkerConstants == ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START) {
            INSTANCE.reset();
        }
    }

    private final ReactInstanceManager getReactInstanceManager() {
        ReactNativeHost reactNativeHost2 = reactNativeHost;
        if (reactNativeHost2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactNativeHost");
            reactNativeHost2 = null;
        }
        return reactNativeHost2.getReactInstanceManager();
    }

    private final DevSupportManager getDevSupportManager() {
        return getReactInstanceManager().getDevSupportManager();
    }

    public final String getSourceCodeScriptUrl() {
        return sourceCodeScriptUrl;
    }

    @JvmStatic
    public static final void init(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        application = app;
        Application application2 = application;
        Application application3 = null;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application2 = null;
        }
        packagerConnectionSettings = new PackagerConnectionSettings(application2);
        Application application4 = application;
        if (application4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
        } else {
            application3 = application4;
        }
        reactNativeHost = ((RnApplication) application3).getReactNativeHost();
    }

    public final void loadBundleByBundleUrl(String host, String jsMainModulePath) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        sourceCodeScriptUrl = "";
        setDebugHttpHost(host);
        setJsMainModuleName(jsMainModulePath);
        reloadJS();
    }

    public final void loadBundle(final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        getDevSupportManager().reloadJSFromServer(url, new BundleLoadCallback() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda0
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public final void onSuccess() {
                TaroDevManager.loadBundle$lambda$4(url);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBundle$lambda$4(String str) {
        TaroDevManager taroDevManager = INSTANCE;
        String substring = str.substring(0, StringsKt.indexOf$default((CharSequence) str, "/", 8, false, 4, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sourceCodeScriptUrl = substring;
        taroDevManager.runOnUiThread(new Function0() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit loadBundle$lambda$4$lambda$3;
                loadBundle$lambda$4$lambda$3 = TaroDevManager.loadBundle$lambda$4$lambda$3();
                return loadBundle$lambda$4$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBundle$lambda$4$lambda$3() {
        TaroDevManager taroDevManager = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            Method declaredMethod = ReactInstanceManager.class.getDeclaredMethod("onJSBundleLoadedFromServer", new Class[0]);
            declaredMethod.setAccessible(true);
            Result.m14057constructorimpl(declaredMethod.invoke(taroDevManager.getReactInstanceManager(), new Object[0]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    private final void setDebugHttpHost(String host) {
        PackagerConnectionSettings packagerConnectionSettings2 = packagerConnectionSettings;
        if (packagerConnectionSettings2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packagerConnectionSettings");
            packagerConnectionSettings2 = null;
        }
        packagerConnectionSettings2.setDebugServerHost(host);
    }

    private final void setJsMainModuleName(String jsMainModulePath) {
        Application application2 = application;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application2 = null;
        }
        ((RnApplication) application2).getTaroReactNativeHost().setJsMainModulePath(jsMainModulePath);
    }

    private final void reset() {
        removeDownloadedJsBundleFile();
        setDebugHttpHost("");
    }

    private final void removeDownloadedJsBundleFile() {
        Application application2 = application;
        Application application3 = null;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application2 = null;
        }
        new File(application2.getFilesDir(), JS_BUNDLE_FILE_NAME).delete();
        Application application4 = application;
        if (application4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
        } else {
            application3 = application4;
        }
        new File(application3.getFilesDir(), JS_BUNDLE_WITH_TAG_BRIDGE_FILE_NAME).delete();
    }

    @JvmStatic
    public static final void clearReactNativeHost() {
        INSTANCE.runOnUiThread(new Function0() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit clearReactNativeHost$lambda$5;
                clearReactNativeHost$lambda$5 = TaroDevManager.clearReactNativeHost$lambda$5();
                return clearReactNativeHost$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearReactNativeHost$lambda$5() {
        ReactNativeHost reactNativeHost2 = reactNativeHost;
        if (reactNativeHost2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactNativeHost");
            reactNativeHost2 = null;
        }
        reactNativeHost2.clear();
        return Unit.INSTANCE;
    }

    private final void reloadJS() {
        runOnUiThread(new Function0() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reloadJS$lambda$6;
                reloadJS$lambda$6 = TaroDevManager.reloadJS$lambda$6();
                return reloadJS$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reloadJS$lambda$6() {
        INSTANCE.getDevSupportManager().handleReloadJS();
        return Unit.INSTANCE;
    }

    private final void runOnUiThread(final Function0<Unit> runnable) {
        if (UiThreadUtil.isOnUiThread()) {
            runnable.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.wakeup.howear.rn.core.devmanager.TaroDevManager$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }
    }
}
