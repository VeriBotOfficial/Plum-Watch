package com.xmly.businesssdk.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewConfig.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/xmly/businesssdk/config/WebViewConfig;", "", "debugMode", "", "enableJavaScript", "enableDomStorage", "allowFileAccess", "allowMixedContent", "cacheMode", "", "userAgent", "", "(ZZZZZILjava/lang/String;)V", "getAllowFileAccess", "()Z", "getAllowMixedContent", "getCacheMode", "()I", "getDebugMode", "getEnableDomStorage", "getEnableJavaScript", "getUserAgent", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WebViewConfig {
    private final boolean allowFileAccess;
    private final boolean allowMixedContent;
    private final int cacheMode;
    private final boolean debugMode;
    private final boolean enableDomStorage;
    private final boolean enableJavaScript;
    private final String userAgent;

    public WebViewConfig() {
        this(false, false, false, false, false, 0, null, 127, null);
    }

    public WebViewConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str) {
        this.debugMode = z;
        this.enableJavaScript = z2;
        this.enableDomStorage = z3;
        this.allowFileAccess = z4;
        this.allowMixedContent = z5;
        this.cacheMode = i;
        this.userAgent = str;
    }

    public static /* synthetic */ WebViewConfig copy$default(WebViewConfig webViewConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = webViewConfig.debugMode;
        }
        if ((i2 & 2) != 0) {
            z2 = webViewConfig.enableJavaScript;
        }
        if ((i2 & 4) != 0) {
            z3 = webViewConfig.enableDomStorage;
        }
        if ((i2 & 8) != 0) {
            z4 = webViewConfig.allowFileAccess;
        }
        if ((i2 & 16) != 0) {
            z5 = webViewConfig.allowMixedContent;
        }
        if ((i2 & 32) != 0) {
            i = webViewConfig.cacheMode;
        }
        if ((i2 & 64) != 0) {
            str = webViewConfig.userAgent;
        }
        int i3 = i;
        String str2 = str;
        boolean z6 = z5;
        boolean z7 = z3;
        return webViewConfig.copy(z, z2, z7, z4, z6, i3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDebugMode() {
        return this.debugMode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableJavaScript() {
        return this.enableJavaScript;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableDomStorage() {
        return this.enableDomStorage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAllowMixedContent() {
        return this.allowMixedContent;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCacheMode() {
        return this.cacheMode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final WebViewConfig copy(boolean debugMode, boolean enableJavaScript, boolean enableDomStorage, boolean allowFileAccess, boolean allowMixedContent, int cacheMode, String userAgent) {
        return new WebViewConfig(debugMode, enableJavaScript, enableDomStorage, allowFileAccess, allowMixedContent, cacheMode, userAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewConfig)) {
            return false;
        }
        WebViewConfig webViewConfig = (WebViewConfig) other;
        return this.debugMode == webViewConfig.debugMode && this.enableJavaScript == webViewConfig.enableJavaScript && this.enableDomStorage == webViewConfig.enableDomStorage && this.allowFileAccess == webViewConfig.allowFileAccess && this.allowMixedContent == webViewConfig.allowMixedContent && this.cacheMode == webViewConfig.cacheMode && Intrinsics.areEqual(this.userAgent, webViewConfig.userAgent);
    }

    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    public final boolean getAllowMixedContent() {
        return this.allowMixedContent;
    }

    public final int getCacheMode() {
        return this.cacheMode;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    public final boolean getEnableDomStorage() {
        return this.enableDomStorage;
    }

    public final boolean getEnableJavaScript() {
        return this.enableJavaScript;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.debugMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r3 = this.enableJavaScript;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r32 = this.enableDomStorage;
        int i4 = r32;
        if (r32 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r33 = this.allowFileAccess;
        int i6 = r33;
        if (r33 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.allowMixedContent;
        int a2 = b.a(this.cacheMode, (i7 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31);
        String str = this.userAgent;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("WebViewConfig(debugMode=").append(this.debugMode).append(", enableJavaScript=").append(this.enableJavaScript).append(", enableDomStorage=").append(this.enableDomStorage).append(", allowFileAccess=").append(this.allowFileAccess).append(", allowMixedContent=").append(this.allowMixedContent).append(", cacheMode=").append(this.cacheMode).append(", userAgent="), this.userAgent, ')');
    }

    public /* synthetic */ WebViewConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? true : z4, (i2 & 16) != 0 ? true : z5, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? null : str);
    }
}
