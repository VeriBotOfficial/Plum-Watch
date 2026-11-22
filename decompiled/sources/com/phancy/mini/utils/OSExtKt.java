package com.phancy.mini.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.core.app.MiniApp;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* compiled from: OSExt.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\f*\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u000e\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u000e\u001a\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010\u001d\u001a\u00020\u0003*\u00020\r\u001a\n\u0010\u001e\u001a\u00020\u0003*\u00020\u000e\u001a\n\u0010\u001f\u001a\u00020\u0003*\u00020\u000e\u001a\n\u0010 \u001a\u00020\u0003*\u00020\u000e\u001a\n\u0010!\u001a\u00020\u0003*\u00020\u000e\u001a\n\u0010\"\u001a\u00020\u0003*\u00020\u000e\u001az\u0010#\u001a\u00020\f*\u00020$2\u0006\u0010%\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\u00032'\b\u0002\u0010(\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\f\u0018\u00010)2'\b\u0002\u0010-\u001a!\u0012\u0015\u0012\u0013\u0018\u00010.¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\f\u0018\u00010)H\u0007\u001a3\u00100\u001a\u0004\u0018\u0001H1\"\u0004\b\u0000\u00101*\b\u0012\u0002\b\u0003\u0018\u0001022\u0006\u00103\u001a\u00020\t2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H105¢\u0006\u0002\u00106\u001a\u008e\u0001\u00107\u001a\u00020\f*\u00020$2\u0006\u0010%\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2'\b\u0002\u0010(\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\f\u0018\u00010)2'\b\u0002\u0010-\u001a!\u0012\u0015\u0012\u0013\u0018\u00010.¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\f\u0018\u00010)H\u0007\u001a\n\u00108\u001a\u00020\u0001*\u00020\u0019\u001a\n\u00109\u001a\u00020\u0001*\u00020:\u001a!\u0010;\u001a\u00020\f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\b\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010=\u001a!\u0010>\u001a\u00020\f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\b\u0010<\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010?\u001a\u0012\u0010@\u001a\u00020:*\u00020:2\u0006\u0010A\u001a\u00020B\u001a\u001a\u0010@\u001a\u00020:*\u00020:2\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u0001\u001a\u0012\u0010E\u001a\u00020\t*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e\u001a\u0016\u0010F\u001a\u0004\u0018\u00010G*\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010:\u001a\f\u0010I\u001a\u0004\u0018\u00010\r*\u00020\u000e\u001a\f\u0010J\u001a\u0004\u0018\u00010K*\u00020\u000e\u001a\u001b\u0010L\u001a\u00020\u0001\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u0002H102¢\u0006\u0002\u0010M\u001a\u0016\u0010N\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"TAG", "", "isHuaweiCloudImageHost", "", "host", "resizeHuaweiCloudImage", "uri", "Landroid/net/Uri;", "w", "", "h", "applyCutoutModeByShortEdges", "", "Landroid/app/Activity;", "Landroid/content/Context;", "clearCorePoolSize", "Ljava/util/concurrent/Executor;", "dip2px", "context", "getAppIcon", "Landroid/graphics/drawable/Drawable;", "getAppName", "getAppVersion", "getJSONObject", "Lcom/alibaba/fastjson/JSONObject;", "Landroid/os/Bundle;", "key", "getProcessName", "getProcessTagName", "isDead", "isDebug", "isMainProcess", "isNetworkConnected", "isNightMode", "isWifiConnected", "load", "Landroid/widget/ImageView;", "url", "placeholderResId", "circleCrop", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "r", "onError", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "obtain", "T", "", "index", "clazz", "Ljava/lang/Class;", "([Ljava/lang/Object;ILjava/lang/Class;)Ljava/lang/Object;", "preload", "printBundle", "printExtras", "Landroid/content/Intent;", "putBoolString", "value", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Boolean;)V", "putIntString", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;)V", "putMiniAppExtra", "app", "Lcom/phancy/mini/core/app/MiniApp;", "appId", "userId", "px2dip", "safeStartService", "Landroid/content/ComponentName;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "toActivity", "toFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "toStringByArray", "([Ljava/lang/Object;)Ljava/lang/String;", "truncate", "maxSize", "phancy-mini-sdk_overseasRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OSExtKt {
    private static final String TAG = "OSExt";

    public static final boolean isDebug(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final String getAppVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n        this.packageMa…ame, 0).versionName\n    }");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final Activity toActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static final FragmentActivity toFragmentActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Activity activity = toActivity(context);
        if (activity instanceof FragmentActivity) {
            return (FragmentActivity) activity;
        }
        return null;
    }

    public static final String getProcessName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
            return processName;
        }
        Object systemService = context.getApplicationContext().getSystemService(Const.STR_PROCESS_TAG);
        if (systemService instanceof ActivityManager) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid && runningAppProcessInfo.processName != null) {
                        String str = runningAppProcessInfo.processName;
                        Intrinsics.checkNotNullExpressionValue(str, "process.processName");
                        return str;
                    }
                }
                return "";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static final boolean isMainProcess(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Intrinsics.areEqual(getProcessName(context), context.getPackageName());
    }

    public static final String getProcessTagName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String processName = getProcessName(context);
        String packageName = context.getPackageName();
        if (Intrinsics.areEqual(processName, packageName)) {
            return "main";
        }
        if (!StringsKt.startsWith$default(processName, packageName + AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
            return processName;
        }
        String substring = processName.substring(packageName.length() + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final ComponentName safeStartService(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final boolean isNightMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final String getAppName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final Drawable getAppIcon(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        return (systemService instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable();
    }

    public static final boolean isWifiConnected(Context context) {
        NetworkInfo networkInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        return (systemService instanceof ConnectivityManager) && (networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(1)) != null && networkInfo.isAvailable();
    }

    public static final String printExtras(Intent intent) {
        String printBundle;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        return (extras == null || (printBundle = printBundle(extras)) == null) ? "{}" : printBundle;
    }

    public static final Intent putMiniAppExtra(Intent intent, MiniApp app) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        return putMiniAppExtra(intent, app.getAppId(), app.getUserId());
    }

    public static final Intent putMiniAppExtra(Intent intent, String appId, String userId) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        intent.putExtra("appId", appId);
        intent.putExtra("userId", userId);
        return intent;
    }

    public static final String printBundle(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        StringBuilder sb = new StringBuilder(Const.STR_MART_JSON_BEGIN);
        Set<String> keySet = bundle.keySet();
        if (keySet != null) {
            boolean z = true;
            for (String str : keySet) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(str).append("=").append(bundle.get(str));
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public static final void putBoolString(Bundle bundle, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, Intrinsics.areEqual((Object) bool, (Object) true) ? "1" : "0");
    }

    public static final void putIntString(Bundle bundle, String key, Integer num) {
        String str;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (num == null || (str = num.toString()) == null) {
            str = "0";
        }
        bundle.putString(key, str);
    }

    public static final JSONObject getJSONObject(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Serializable serializable = bundle.getSerializable(key);
            if (serializable instanceof Map) {
                return new JSONObject((Map<String, Object>) serializable);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final boolean isDead(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            if (activity.isFinishing()) {
                return true;
            }
            return activity.isDestroyed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final void applyCutoutModeByShortEdges(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public static final void applyCutoutModeByShortEdges(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Activity activity = toActivity(context);
        if (activity != null) {
            applyCutoutModeByShortEdges(activity);
        }
    }

    public static /* synthetic */ void preload$default(ImageView imageView, String str, int i, boolean z, int i2, int i3, Function1 function1, Function1 function12, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        if ((i4 & 64) != 0) {
            function12 = null;
        }
        preload(imageView, str, i, z, i2, i3, function1, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void preload(android.widget.ImageView r4, final java.lang.String r5, int r6, boolean r7, int r8, int r9, final kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> r10, final kotlin.jvm.functions.Function1<? super com.bumptech.glide.load.engine.GlideException, kotlin.Unit> r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r8 <= 0) goto L47
            if (r9 <= 0) goto L47
            java.lang.String r0 = "https://"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r5, r0, r3, r2, r1)     // Catch: java.lang.Exception -> L43
            if (r0 != 0) goto L22
            java.lang.String r0 = "http://"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r5, r0, r3, r2, r1)     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
        L22:
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L47
            boolean r1 = isHuaweiCloudImageHost(r1)     // Catch: java.lang.Exception -> L3e
            r2 = 1
            if (r1 != r2) goto L47
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = resizeHuaweiCloudImage(r0, r8, r9)     // Catch: java.lang.Exception -> L3e
            goto L48
        L3e:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            r0.printStackTrace()
        L47:
            r0 = r5
        L48:
            r1 = r4
            android.view.View r1 = (android.view.View) r1
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            com.bumptech.glide.RequestBuilder r0 = r1.load(r0)
            com.bumptech.glide.request.RequestOptions r1 = new com.bumptech.glide.request.RequestOptions
            r1.<init>()
            if (r6 <= 0) goto L5d
            r1.placeholder(r6)
        L5d:
            if (r7 == 0) goto L62
            r1.circleCrop()
        L62:
            if (r8 <= 0) goto L69
            if (r9 <= 0) goto L69
            r1.override(r8, r9)
        L69:
            com.bumptech.glide.request.BaseRequestOptions r1 = (com.bumptech.glide.request.BaseRequestOptions) r1
            com.bumptech.glide.RequestBuilder r6 = r0.apply(r1)
            if (r10 != 0) goto L73
            if (r11 == 0) goto L7d
        L73:
            com.phancy.mini.utils.OSExtKt$preload$2$1 r7 = new com.phancy.mini.utils.OSExtKt$preload$2$1
            r7.<init>()
            com.bumptech.glide.request.RequestListener r7 = (com.bumptech.glide.request.RequestListener) r7
            r6.listener(r7)
        L7d:
            r6.into(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phancy.mini.utils.OSExtKt.preload(android.widget.ImageView, java.lang.String, int, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void load$default(ImageView imageView, String str, int i, boolean z, Function1 function1, Function1 function12, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        if ((i2 & 16) != 0) {
            function12 = null;
        }
        load(imageView, str, i, z, function1, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void load(android.widget.ImageView r6, final java.lang.String r7, int r8, boolean r9, final kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> r10, final kotlin.jvm.functions.Function1<? super com.bumptech.glide.load.engine.GlideException, kotlin.Unit> r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()     // Catch: java.lang.Exception -> L4f
            int r0 = r0.width     // Catch: java.lang.Exception -> L4f
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()     // Catch: java.lang.Exception -> L4f
            int r1 = r1.height     // Catch: java.lang.Exception -> L4f
            if (r0 <= 0) goto L53
            if (r1 <= 0) goto L53
            java.lang.String r2 = "https://"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r2, r5, r4, r3)     // Catch: java.lang.Exception -> L4f
            if (r2 != 0) goto L2e
            java.lang.String r2 = "http://"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r2, r5, r4, r3)     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L53
        L2e:
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = r2.getHost()     // Catch: java.lang.Exception -> L4a
            if (r3 == 0) goto L53
            boolean r3 = isHuaweiCloudImageHost(r3)     // Catch: java.lang.Exception -> L4a
            r4 = 1
            if (r3 != r4) goto L53
            java.lang.String r3 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = resizeHuaweiCloudImage(r2, r0, r1)     // Catch: java.lang.Exception -> L4a
            goto L54
        L4a:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r0.printStackTrace()
        L53:
            r0 = r7
        L54:
            r1 = r6
            android.view.View r1 = (android.view.View) r1
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r1)
            com.bumptech.glide.RequestBuilder r0 = r1.load(r0)
            com.bumptech.glide.request.RequestOptions r1 = new com.bumptech.glide.request.RequestOptions
            r1.<init>()
            if (r8 <= 0) goto L6a
            r1.placeholder(r8)
            goto L71
        L6a:
            android.graphics.drawable.Drawable r8 = r6.getDrawable()
            r1.placeholder(r8)
        L71:
            if (r9 == 0) goto L76
            r1.circleCrop()
        L76:
            com.bumptech.glide.request.BaseRequestOptions r1 = (com.bumptech.glide.request.BaseRequestOptions) r1
            com.bumptech.glide.RequestBuilder r8 = r0.apply(r1)
            if (r10 != 0) goto L80
            if (r11 == 0) goto L8a
        L80:
            com.phancy.mini.utils.OSExtKt$load$2$1 r9 = new com.phancy.mini.utils.OSExtKt$load$2$1
            r9.<init>()
            com.bumptech.glide.request.RequestListener r9 = (com.bumptech.glide.request.RequestListener) r9
            r8.listener(r9)
        L8a:
            r8.into(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phancy.mini.utils.OSExtKt.load(android.widget.ImageView, java.lang.String, int, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    private static final boolean isHuaweiCloudImageHost(String str) {
        return MiniSwitch.getJSONArray("MINI_HUAWEI_CLOUD_IMG_HOSTS").contains(str);
    }

    private static final String resizeHuaweiCloudImage(Uri uri, int i, int i2) {
        if (uri.getQueryParameter("x-image-process") == null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("x-image-process", "image/resize,m_fill,h_" + i2 + ",w_" + i);
            String builder = buildUpon.toString();
            Intrinsics.checkNotNullExpressionValue(builder, "{\n        uri.buildUpon(…       }.toString()\n    }");
            return builder;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "{\n        uri.toString()\n    }");
        return uri2;
    }

    public static final int px2dip(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int dip2px(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final String truncate(String str, int i) {
        int length = str != null ? str.length() : 0;
        if (i < 0 || i >= length) {
            return str;
        }
        String str2 = null;
        if (i > 3) {
            StringBuilder sb = new StringBuilder();
            if (str != null) {
                str2 = str.substring(0, i - 3);
                Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return sb.append(str2).append("...").toString();
        }
        if (str == null) {
            return null;
        }
        String substring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final <T> String toStringByArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        StringBuilder sb = new StringBuilder("[");
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            T t = tArr[i];
            sb.append(t != null ? t.toString() : null);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public static final <T> T obtain(Object[] objArr, int i, Class<T> clazz) {
        T t;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (objArr == null || i < 0 || i >= objArr.length || (t = (T) objArr[i]) == null || !clazz.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public static final void clearCorePoolSize(Executor executor) {
        Object obj;
        Field field;
        Object obj2;
        Object obj3;
        Object obj4;
        Field field2;
        Intrinsics.checkNotNullParameter(executor, "<this>");
        if (executor instanceof ThreadPoolExecutor) {
            MiniSDK.d(TAG, "clear core pool size: " + executor);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
            threadPoolExecutor.setCorePoolSize(0);
            threadPoolExecutor.setKeepAliveTime(0L, TimeUnit.SECONDS);
            return;
        }
        try {
            Field[] declaredFields = executor.getClass().getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "this::class.java.declaredFields");
            Field[] fieldArr = declaredFields;
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    field = null;
                    break;
                }
                field = fieldArr[i];
                if (Executor.class.isAssignableFrom(field.getType())) {
                    break;
                } else {
                    i++;
                }
            }
            Field field3 = field;
            if (field3 == null) {
                Field[] declaredFields2 = executor.getClass().getSuperclass().getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields2, "this::class.java.superclass.declaredFields");
                Field[] fieldArr2 = declaredFields2;
                int length2 = fieldArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        field2 = null;
                        break;
                    }
                    field2 = fieldArr2[i2];
                    if (Executor.class.isAssignableFrom(field2.getType())) {
                        break;
                    } else {
                        i2++;
                    }
                }
                field3 = field2;
            }
            if (field3 != null) {
                field3.setAccessible(true);
                obj2 = field3.get(executor);
            } else {
                obj2 = null;
            }
            if (obj2 == null && Build.VERSION.SDK_INT >= 28) {
                List instanceFields = HiddenApiBypass.getInstanceFields(executor.getClass());
                Intrinsics.checkNotNull(instanceFields, "null cannot be cast to non-null type kotlin.collections.List<java.lang.reflect.Field>");
                Iterator it = instanceFields.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it.next();
                        if (Executor.class.isAssignableFrom(((Field) obj3).getType())) {
                            break;
                        }
                    }
                }
                Field field4 = (Field) obj3;
                if (field4 == null) {
                    List instanceFields2 = HiddenApiBypass.getInstanceFields(executor.getClass().getSuperclass());
                    Intrinsics.checkNotNull(instanceFields2, "null cannot be cast to non-null type kotlin.collections.List<java.lang.reflect.Field>");
                    Iterator it2 = instanceFields2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        Object next = it2.next();
                        if (Executor.class.isAssignableFrom(((Field) next).getType())) {
                            obj4 = next;
                            break;
                        }
                    }
                    field4 = (Field) obj4;
                }
                if (field4 != null) {
                    field4.setAccessible(true);
                    obj = field4.get(executor);
                }
                obj2 = obj;
            }
            if (obj2 == null || !(obj2 instanceof ThreadPoolExecutor)) {
                return;
            }
            MiniSDK.d(TAG, "clear core pool size: " + obj2);
            ((ThreadPoolExecutor) obj2).setCorePoolSize(0);
            ((ThreadPoolExecutor) obj2).setKeepAliveTime(1L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
