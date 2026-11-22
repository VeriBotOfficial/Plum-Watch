package com.xmly.businesssdk.network;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdkConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/xmly/businesssdk/network/NetworkConfig;", "", "()V", "Api", "Cache", "LogLevel", "Request", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkConfig {
    public static final NetworkConfig INSTANCE = new NetworkConfig();

    /* compiled from: SdkConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/network/NetworkConfig$Api;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "USER_AGENT", "VERSION", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api {
        public static final String USER_AGENT = "BusinessSDK/1.0";
        public static final String VERSION = "v1";
        public static final Api INSTANCE = new Api();
        private static String BASE_URL = "https://api.ximalaya.com/";

        private Api() {
        }

        public final String getBASE_URL() {
            return BASE_URL;
        }

        public final void setBASE_URL(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BASE_URL = str;
        }
    }

    /* compiled from: SdkConfig.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xmly/businesssdk/network/NetworkConfig$Cache;", "", "()V", "DEFAULT_MAX_AGE", "", "DIR_NAME", "", "SIZE", "", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Cache {
        public static final int DEFAULT_MAX_AGE = 300;
        public static final String DIR_NAME = "http_cache";
        public static final long SIZE = 10485760;
        public static final Cache INSTANCE = new Cache();
        private static boolean isEnabled = true;

        private Cache() {
        }

        public final boolean isEnabled() {
            return isEnabled;
        }

        public final void setEnabled(boolean z) {
            isEnabled = z;
        }
    }

    /* compiled from: SdkConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xmly/businesssdk/network/NetworkConfig$LogLevel;", "", "(Ljava/lang/String;I)V", DialPromoBanner.NONE, "BASIC", "HEADERS", "BODY", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogLevel {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: SdkConfig.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xmly/businesssdk/network/NetworkConfig$Request;", "", "()V", "DEFAULT_TIMEOUT", "", "isLogEnabled", "", "()Z", "setLogEnabled", "(Z)V", "logLevel", "Lcom/xmly/businesssdk/network/NetworkConfig$LogLevel;", "getLogLevel", "()Lcom/xmly/businesssdk/network/NetworkConfig$LogLevel;", "setLogLevel", "(Lcom/xmly/businesssdk/network/NetworkConfig$LogLevel;)V", "maxRetries", "", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Request {
        public static final long DEFAULT_TIMEOUT = 30;
        public static final Request INSTANCE = new Request();
        private static boolean isLogEnabled = true;
        private static LogLevel logLevel = LogLevel.BODY;
        private static int maxRetries = 3;

        private Request() {
        }

        public final LogLevel getLogLevel() {
            return logLevel;
        }

        public final int getMaxRetries() {
            return maxRetries;
        }

        public final boolean isLogEnabled() {
            return isLogEnabled;
        }

        public final void setLogEnabled(boolean z) {
            isLogEnabled = z;
        }

        public final void setLogLevel(LogLevel logLevel2) {
            Intrinsics.checkNotNullParameter(logLevel2, "<set-?>");
            logLevel = logLevel2;
        }

        public final void setMaxRetries(int i) {
            maxRetries = i;
        }
    }

    private NetworkConfig() {
    }
}
