package com.phancy.mini.core.web;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.uimanager.ViewProps;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.core.IApiBridge;
import com.phancy.mini.core.IPublishBridge;
import com.phancy.mini.utils.OSExtKt;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: MiniWebView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002J\u0010\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u000105R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u00067"}, d2 = {"Lcom/phancy/mini/core/web/MiniWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityEnabledOriginal", "", "Ljava/lang/Boolean;", "<set-?>", "destroyed", "getDestroyed", "()Z", ViewProps.ENABLED, "isAccessibilityEnabled", "setAccessibilityEnabled", "(Z)V", "isX5Core", "jsCore", "Lcom/phancy/mini/core/web/MiniJSCore;", "getJsCore", "()Lcom/phancy/mini/core/web/MiniJSCore;", "viewId", "getViewId", "()I", "webActive", "getWebActive", "destroy", "", "fixedAccessibilityInjectorException", "init", "loadUrl", "url", "", "obtainExtraUserAgent", "", _imp_adbrowser.ACTIVITY_PAUSE, _imp_adbrowser.ACTIVITY_RESUME, "releaseConfigCallback", "removeUnsafeJavaInterface", "resetAccessibilityEnabled", "setInvokeHandler", "invokeHandler", "Lcom/phancy/mini/core/IApiBridge;", "setOverScrollMode", DOMConstants.ATTR_MODE, "setPublishHandler", "publishHandler", "Lcom/phancy/mini/core/IPublishBridge;", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class MiniWebView extends WebView {
    public static final String ABOUT_BLANK = "about:blank";
    private static final String P4_JS_CORE = "P4JSCore";
    private static final String TAG = "MiniWebView";
    private Boolean accessibilityEnabledOriginal;
    private boolean destroyed;
    private final boolean isX5Core;
    private final MiniJSCore jsCore;
    private boolean webActive;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicLong INSTANCE_COUNT = new AtomicLong();
    private static final AtomicReference<String> UA = new AtomicReference<>(null);

    private final void fixedAccessibilityInjectorException() {
    }

    public static final AtomicLong getINSTANCE_COUNT() {
        return INSTANCE.getINSTANCE_COUNT();
    }

    public static final AtomicReference<String> getUA() {
        return INSTANCE.getUA();
    }

    private final void releaseConfigCallback() {
    }

    public final int getViewId() {
        return hashCode();
    }

    public final boolean getDestroyed() {
        return this.destroyed;
    }

    public final boolean getWebActive() {
        return this.webActive;
    }

    public final MiniJSCore getJsCore() {
        return this.jsCore;
    }

    private final boolean isAccessibilityEnabled() {
        Object systemService = getContext().getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            return ((AccessibilityManager) systemService).isEnabled();
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z) {
        Object systemService = getContext().getSystemService("accessibility");
        try {
            if (systemService instanceof AccessibilityManager) {
                Method declaredMethod = AccessibilityManager.class.getDeclaredMethod("setAccessibilityState", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(systemService, Boolean.valueOf(z));
                declaredMethod.setAccessible(false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: isX5Core, reason: from getter */
    public final boolean getIsX5Core() {
        return this.isX5Core;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniWebView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webActive = true;
        this.jsCore = new MiniJSCore();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webActive = true;
        this.jsCore = new MiniJSCore();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webActive = true;
        this.jsCore = new MiniJSCore();
        init();
    }

    protected void init() {
        fixedAccessibilityInjectorException();
        removeUnsafeJavaInterface();
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getUserAgentString());
        sb.append(" Phancy/");
        String string = MiniSDK.INSTANCE.getSettings().getString(MiniSDK.SETTINGS_APP_FEATURE_VERSION);
        if (string == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            string = OSExtKt.getAppVersion(context);
        }
        sb.append(string);
        CharSequence obtainExtraUserAgent = obtainExtraUserAgent();
        if (obtainExtraUserAgent != null) {
            sb.append(obtainExtraUserAgent);
        }
        String string2 = MiniSDK.INSTANCE.getSettings().getString(MiniSDK.SETTINGS_EXTRA_USER_AGENT);
        String str = string2;
        if (str != null && str.length() != 0) {
            sb.append(' ');
            sb.append(string2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "ua.toString()");
        settings.setUserAgentString(sb2);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(MiniSDK.MINI_APP_BG_COLOR);
        MiniSDK.d(TAG, "isX5WebView: " + this.isX5Core + " UA: " + sb2);
        INSTANCE_COUNT.incrementAndGet();
        UA.set(sb2);
        addJavascriptInterface(this.jsCore, P4_JS_CORE);
    }

    protected CharSequence obtainExtraUserAgent() {
        StringBuilder sb = new StringBuilder();
        sb.append(" PhancyMini/1.0.0");
        return sb;
    }

    public final void setInvokeHandler(IApiBridge invokeHandler) {
        this.jsCore.setApiBridge(invokeHandler);
    }

    public final void setPublishHandler(IPublishBridge publishHandler) {
        this.jsCore.setPublishBridge(publishHandler);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            MiniSDK.d(TAG, "destroy: " + getUrl() + ' ' + this);
            this.destroyed = true;
            setWebViewClient(new WebViewClient());
            setWebChromeClient(null);
            removeJavascriptInterface(P4_JS_CORE);
            releaseConfigCallback();
            resetAccessibilityEnabled();
            super.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void removeUnsafeJavaInterface() {
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void resetAccessibilityEnabled() {
        Boolean bool = this.accessibilityEnabledOriginal;
        if (bool != null) {
            setAccessibilityEnabled(bool.booleanValue());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int mode) {
        try {
            super.setOverScrollMode(mode);
        } catch (Throwable th) {
            th.printStackTrace();
            Pair<Boolean, String> isWebViewPackageException = MiniWebViewCompat.INSTANCE.isWebViewPackageException(th);
            Object obj = isWebViewPackageException.first;
            Intrinsics.checkNotNullExpressionValue(obj, "it.first");
            if (((Boolean) obj).booleanValue()) {
                MiniSDK.e(TAG, "WebView Package Exception: " + ((String) isWebViewPackageException.second));
                destroy();
            }
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.destroyed) {
            MiniSDK.w(TAG, "load url when destroyed: " + url);
            return;
        }
        if (StringsKt.startsWith$default(url, "javascript:", false, 2, (Object) null)) {
            evaluateJavascript(url, null);
            return;
        }
        if (StringsKt.startsWith$default(url, "https://", false, 2, (Object) null) || StringsKt.startsWith$default(url, "http://", false, 2, (Object) null)) {
            MiniSDK.d(TAG, "loadUrl: " + url + ' ' + this);
        }
        super.loadUrl(url);
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.webActive) {
            return;
        }
        MiniSDK.d(TAG, "onResume: " + getUrl() + ' ' + this);
        super.onResume();
        this.webActive = true;
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.webActive) {
            MiniSDK.d(TAG, "onPause: " + getUrl() + ' ' + this);
            super.onPause();
            this.webActive = false;
        }
    }

    /* compiled from: MiniWebView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/phancy/mini/core/web/MiniWebView$Companion;", "", "()V", "ABOUT_BLANK", "", "INSTANCE_COUNT", "Ljava/util/concurrent/atomic/AtomicLong;", "getINSTANCE_COUNT$annotations", "getINSTANCE_COUNT", "()Ljava/util/concurrent/atomic/AtomicLong;", "P4_JS_CORE", "TAG", "UA", "Ljava/util/concurrent/atomic/AtomicReference;", "getUA$annotations", "getUA", "()Ljava/util/concurrent/atomic/AtomicReference;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getINSTANCE_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getUA$annotations() {
        }

        private Companion() {
        }

        public final AtomicLong getINSTANCE_COUNT() {
            return MiniWebView.INSTANCE_COUNT;
        }

        public final AtomicReference<String> getUA() {
            return MiniWebView.UA;
        }
    }
}
