package com.wakeup.howear.push.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BuildConfigUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/howear/push/util/BuildConfigUtil;", "", "<init>", "()V", "tag", "", "currentSoftVersion", "isOverseas", "", "saveSoftVersion", "", "context", "Landroid/content/Context;", "getSoftVersion", "cleanSoftVersion", "softVersion", "module-push_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuildConfigUtil {
    public static final BuildConfigUtil INSTANCE = new BuildConfigUtil();
    private static String currentSoftVersion;
    private static final String tag;

    public final boolean isOverseas() {
        return true;
    }

    private BuildConfigUtil() {
    }

    static {
        Intrinsics.checkNotNullExpressionValue("BuildConfigUtil", "getSimpleName(...)");
        tag = "BuildConfigUtil";
        currentSoftVersion = "unknown";
    }

    public final void saveSoftVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            if (str == null) {
                str = "unknown";
            }
            currentSoftVersion = str;
            String str2 = tag;
            Log.i(str2, "saveSoftVersion currentSoftVersion: " + str);
            Log.i(str2, "saveSoftVersion versionCode: " + packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.e(tag, "saveSoftVersion e: " + e.getMessage());
        }
    }

    public final String getSoftVersion() {
        Log.i(tag, "getSoftVersion currentSoftVersion: " + currentSoftVersion);
        return cleanSoftVersion(currentSoftVersion);
    }

    private final String cleanSoftVersion(String softVersion) {
        return StringsKt.substringAfter$default(softVersion, "_", (String) null, 2, (Object) null);
    }
}
