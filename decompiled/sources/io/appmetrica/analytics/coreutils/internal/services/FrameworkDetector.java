package io.appmetrica.analytics.coreutils.internal.services;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes6.dex */
public class FrameworkDetector {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17711a = new FrameworkDetector().detectFramework();

    public static String framework() {
        return f17711a;
    }

    public static boolean isNative() {
        return "native".equals(f17711a);
    }

    public String detectFramework() {
        if (ReflectionUtils.detectClassExists(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
            return PluginErrorDetails.Platform.UNITY;
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        return ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
    }
}
