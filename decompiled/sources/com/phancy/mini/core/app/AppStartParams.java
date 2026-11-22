package com.phancy.mini.core.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.phancy.mini.utils.LazyValue;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppStartParams.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u000bR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u000bR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001d\u0010\u000bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b$\u0010\u000bR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b'\u0010\u000b¨\u0006*"}, d2 = {"Lcom/phancy/mini/core/app/AppStartParams;", "", "app", "Lcom/phancy/mini/core/app/MiniApp;", "(Lcom/phancy/mini/core/app/MiniApp;)V", "getApp", "()Lcom/phancy/mini/core/app/MiniApp;", AppStartParams.KEY_FORCE_SYS_WEB_VIEW, "Lcom/phancy/mini/utils/LazyValue;", "", "getForceSysWebView", "()Lcom/phancy/mini/utils/LazyValue;", "forceSysWebView$delegate", "Lkotlin/Lazy;", "forceV8", "getForceV8", "forceV8$delegate", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", AppStartParams.EXTRA_KERNEL_NATIVE, "getKernelNative", "kernelNative$delegate", AppStartParams.KEY_MIXED_CONTENT, "getMixedContent", "mixedContent$delegate", "page", "", "getPage", "page$delegate", "startData", "Landroid/net/Uri;", "getStartData", "()Landroid/net/Uri;", AppStartParams.KEY_V_CONSOLE, "getVConsole", "vConsole$delegate", "version", MobileAdsBridge.versionMethodName, "version$delegate", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppStartParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRA_APP_ID = "appId";
    public static final String EXTRA_APP_START_TIME = "appStartTime";
    public static final String EXTRA_KERNEL_NATIVE = "kernelNative";
    public static final String EXTRA_REFERER_APP_ID = "refererAppId";
    public static final String EXTRA_REFERER_EXTRA_DATA = "refererExtraData";
    public static final String EXTRA_SCENE = "scene";
    public static final String EXTRA_USER_ID = "userId";
    public static final String KEY_APP_ID = "appId";
    public static final String KEY_APP_NAME = "appName";
    public static final String KEY_FORCE_SYS_WEB_VIEW = "forceSysWebView";
    public static final String KEY_FORCE_V8 = "forceJsContext";
    public static final String KEY_MIXED_CONTENT = "mixedContent";
    public static final String KEY_PAGE = "page";
    public static final String KEY_VERSION = "version";
    public static final String KEY_V_CONSOLE = "vConsole";
    public static final int SCENE_CHAT_ALONE = 1007;
    public static final int SCENE_CHAT_GROUP = 1008;
    public static final int SCENE_DESKTOP_ICON = 1023;
    public static final int SCENE_NAVIGATE_BACK = 1038;
    public static final int SCENE_NAVIGATE_TO = 1037;
    public static final int SCENE_OTHER = 1000;
    public static final int SCENE_QRCODE_ALBUM = 1013;
    public static final int SCENE_QRCODE_IMAGE = 1012;
    public static final int SCENE_QRCODE_SCAN = 1011;
    private final MiniApp app;

    /* renamed from: forceSysWebView$delegate, reason: from kotlin metadata */
    private final Lazy forceSysWebView;

    /* renamed from: forceV8$delegate, reason: from kotlin metadata */
    private final Lazy forceV8;

    /* renamed from: kernelNative$delegate, reason: from kotlin metadata */
    private final Lazy kernelNative;

    /* renamed from: mixedContent$delegate, reason: from kotlin metadata */
    private final Lazy mixedContent;

    /* renamed from: page$delegate, reason: from kotlin metadata */
    private final Lazy page;

    /* renamed from: vConsole$delegate, reason: from kotlin metadata */
    private final Lazy vConsole;

    /* renamed from: version$delegate, reason: from kotlin metadata */
    private final Lazy version;

    @JvmStatic
    public static final String getAppId(Intent intent) {
        return INSTANCE.getAppId(intent);
    }

    @JvmStatic
    public static final String getAppId(Uri uri) {
        return INSTANCE.getAppId(uri);
    }

    @JvmStatic
    public static final String getPage(Uri uri) {
        return INSTANCE.getPage(uri);
    }

    @JvmStatic
    public static final JSONObject getQuery(Uri uri) {
        return INSTANCE.getQuery(uri);
    }

    @JvmStatic
    public static final String getRefererAppId(Intent intent) {
        return INSTANCE.getRefererAppId(intent);
    }

    @JvmStatic
    public static final JSONObject getRefererExtraData(Intent intent) {
        return INSTANCE.getRefererExtraData(intent);
    }

    @JvmStatic
    public static final int getScene(Intent intent) {
        return INSTANCE.getScene(intent);
    }

    @JvmStatic
    public static final String getUserId(Intent intent) {
        return INSTANCE.getUserId(intent);
    }

    @JvmStatic
    public static final String getVersion(Uri uri) {
        return INSTANCE.getVersion(uri);
    }

    @JvmStatic
    public static final boolean isForceSysWebView(Uri uri) {
        return INSTANCE.isForceSysWebView(uri);
    }

    @JvmStatic
    public static final boolean isForceV8(Uri uri) {
        return INSTANCE.isForceV8(uri);
    }

    @JvmStatic
    public static final boolean isKernelNative(Intent intent) {
        return INSTANCE.isKernelNative(intent);
    }

    @JvmStatic
    public static final boolean isMixedContent(Uri uri) {
        return INSTANCE.isMixedContent(uri);
    }

    @JvmStatic
    public static final boolean isVConsoleEnabled(Uri uri) {
        return INSTANCE.isVConsoleEnabled(uri);
    }

    public AppStartParams(MiniApp app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        this.forceSysWebView = LazyKt.lazy(new AppStartParams$forceSysWebView$2(this));
        this.vConsole = LazyKt.lazy(new AppStartParams$vConsole$2(this));
        this.mixedContent = LazyKt.lazy(new AppStartParams$mixedContent$2(this));
        this.forceV8 = LazyKt.lazy(new AppStartParams$forceV8$2(this));
        this.version = LazyKt.lazy(new AppStartParams$version$2(this));
        this.page = LazyKt.lazy(new AppStartParams$page$2(this));
        this.kernelNative = LazyKt.lazy(new AppStartParams$kernelNative$2(this));
    }

    public final MiniApp getApp() {
        return this.app;
    }

    public final Intent getIntent() {
        Activity activity = this.app.getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    public final Uri getStartData() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    public final LazyValue<Boolean> getForceSysWebView() {
        return (LazyValue) this.forceSysWebView.getValue();
    }

    public final LazyValue<Boolean> getVConsole() {
        return (LazyValue) this.vConsole.getValue();
    }

    public final LazyValue<Boolean> getMixedContent() {
        return (LazyValue) this.mixedContent.getValue();
    }

    public final LazyValue<Boolean> getForceV8() {
        return (LazyValue) this.forceV8.getValue();
    }

    public final LazyValue<String> getVersion() {
        return (LazyValue) this.version.getValue();
    }

    public final LazyValue<String> getPage() {
        return (LazyValue) this.page.getValue();
    }

    public final LazyValue<Boolean> getKernelNative() {
        return (LazyValue) this.kernelNative.getValue();
    }

    /* compiled from: AppStartParams.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0014\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0014\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0014\u0010&\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010'\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010(\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0014\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010*\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010,\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010-\u001a\u00020+2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010.\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010/\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/phancy/mini/core/app/AppStartParams$Companion;", "", "()V", "EXTRA_APP_ID", "", "EXTRA_APP_START_TIME", "EXTRA_KERNEL_NATIVE", "EXTRA_REFERER_APP_ID", "EXTRA_REFERER_EXTRA_DATA", "EXTRA_SCENE", "EXTRA_USER_ID", "KEY_APP_ID", "KEY_APP_NAME", "KEY_FORCE_SYS_WEB_VIEW", "KEY_FORCE_V8", "KEY_MIXED_CONTENT", "KEY_PAGE", "KEY_VERSION", "KEY_V_CONSOLE", "SCENE_CHAT_ALONE", "", "SCENE_CHAT_GROUP", "SCENE_DESKTOP_ICON", "SCENE_NAVIGATE_BACK", "SCENE_NAVIGATE_TO", "SCENE_OTHER", "SCENE_QRCODE_ALBUM", "SCENE_QRCODE_IMAGE", "SCENE_QRCODE_SCAN", "getAppId", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "startData", "Landroid/net/Uri;", "getPage", "getQuery", "Lcom/alibaba/fastjson/JSONObject;", "getRefererAppId", "getRefererExtraData", "getScene", "getUserId", MobileAdsBridge.versionMethodName, "isForceSysWebView", "", "isForceV8", "isKernelNative", "isMixedContent", "isVConsoleEnabled", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String getAppId(Uri startData) {
            if (startData == null) {
                return null;
            }
            try {
                return startData.getQueryParameter("appId");
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @JvmStatic
        public final String getVersion(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getQueryParameter("version");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @JvmStatic
        public final String getPage(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getQueryParameter("page");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @JvmStatic
        public final boolean isForceSysWebView(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getBooleanQueryParameter(AppStartParams.KEY_FORCE_SYS_WEB_VIEW, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean isVConsoleEnabled(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getBooleanQueryParameter(AppStartParams.KEY_V_CONSOLE, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        @JvmStatic
        public final JSONObject getQuery(Uri startData) {
            Set<String> queryParameterNames;
            JSONObject jSONObject = new JSONObject();
            if (startData != null && (queryParameterNames = startData.getQueryParameterNames()) != null) {
                for (String str : queryParameterNames) {
                    String str2 = str;
                    if (str2 != null && str2.length() != 0) {
                        jSONObject.put(str, (Object) startData.getQueryParameter(str));
                    }
                }
            }
            return jSONObject;
        }

        @JvmStatic
        public final String getAppId(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("appId");
            }
            return null;
        }

        @JvmStatic
        public final String getUserId(Intent intent) {
            String stringExtra = intent != null ? intent.getStringExtra("userId") : null;
            String str = stringExtra;
            return (str == null || str.length() == 0) ? "INVALID_UID" : stringExtra;
        }

        @JvmStatic
        public final int getScene(Intent intent) {
            if (intent != null) {
                return intent.getIntExtra("scene", 1000);
            }
            return 1000;
        }

        @JvmStatic
        public final String getRefererAppId(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra(AppStartParams.EXTRA_REFERER_APP_ID);
            }
            return null;
        }

        @JvmStatic
        public final JSONObject getRefererExtraData(Intent intent) {
            if (intent != null) {
                try {
                    String stringExtra = intent.getStringExtra(AppStartParams.EXTRA_REFERER_EXTRA_DATA);
                    if (stringExtra != null) {
                        return JSON.parseObject(stringExtra);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @JvmStatic
        public final boolean isMixedContent(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getBooleanQueryParameter(AppStartParams.KEY_MIXED_CONTENT, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean isForceV8(Uri startData) {
            if (startData != null) {
                try {
                    return startData.getBooleanQueryParameter(AppStartParams.KEY_FORCE_V8, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean isKernelNative(Intent intent) {
            if (intent != null) {
                try {
                    return intent.getBooleanExtra(AppStartParams.EXTRA_KERNEL_NATIVE, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    }
}
