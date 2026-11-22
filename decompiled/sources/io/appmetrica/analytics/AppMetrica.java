package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC3410n1;
import io.appmetrica.analytics.impl.C0;
import io.appmetrica.analytics.impl.C3385m1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC3410n1.f18408a.a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC3410n1.f18408a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC3410n1.f18408a.a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC3410n1.f18408a.a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC3410n1.f18408a.b();
    }

    public static int getLibraryApiLevel() {
        return 115;
    }

    public static String getLibraryVersion() {
        return "7.7.2";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return C0.f17787a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC3410n1.f18408a.a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC3410n1.f18408a.a(context).f18623id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC3410n1.f18408a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC3410n1.f18408a.a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC3410n1.f18408a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC3410n1.f18408a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC3410n1.f18408a.a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC3410n1.f18408a.a(adRevenue);
    }

    public static void reportAnr(Map<Thread, StackTraceElement[]> map) {
        AbstractC3410n1.f18408a.a(map);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC3410n1.f18408a.b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC3410n1.f18408a.a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC3410n1.f18408a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC3410n1.f18408a.b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        AbstractC3410n1.f18408a.b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC3410n1.f18408a.a(externalAttribution);
    }

    public static void reportReferralUrl(String str) {
        AbstractC3410n1.f18408a.d(str);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC3410n1.f18408a.a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        AbstractC3410n1.f18408a.a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC3410n1.f18408a.a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC3410n1.f18408a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC3410n1.f18408a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C3385m1 c3385m1 = AbstractC3410n1.f18408a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c3385m1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC3410n1.f18408a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC3410n1.f18408a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        AbstractC3410n1.f18408a.a(z);
    }

    public static void setDataSendingEnabled(boolean z) {
        AbstractC3410n1.f18408a.b(z);
    }

    public static void setLocation(Location location) {
        AbstractC3410n1.f18408a.a(location);
    }

    public static void setLocationTracking(boolean z) {
        AbstractC3410n1.f18408a.c(z);
    }

    public static void setUserProfileID(String str) {
        AbstractC3410n1.f18408a.e(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC3410n1.f18408a.a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        AbstractC3410n1.f18408a.a(str, str2, th);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC3410n1.f18408a.c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC3410n1.f18408a.a(str);
    }

    public static void reportError(String str, Throwable th) {
        AbstractC3410n1.f18408a.a(str, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC3410n1.f18408a.a(str, map);
    }
}
