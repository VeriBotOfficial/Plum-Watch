package com.phancy.mini.utils;

import android.content.Context;
import com.alipay.sdk.m.w.a;
import com.phancy.mini.MiniSDK;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.IWorkspace;

/* compiled from: MiniStorage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/phancy/mini/utils/MiniStorage;", "", "()V", "DIR_USR", "", "PREFIX_STORE", "PREFIX_TMP", "SCHEME_FILE", "SCHEME_P4_FILE", "getFrameworkDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "getFrameworkTempDir", "getMiniAppDir", "appId", "getMiniAppPath", "getMiniAppSettingDir", "userId", "getMiniAppSourceDir", "getMiniAppStoreDir", "getMiniAppTempDir", "getMiniAppUsrDir", "getMiniRootPath", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MiniStorage {
    public static final String DIR_USR = "usr";
    public static final MiniStorage INSTANCE = new MiniStorage();
    public static final String PREFIX_STORE = "store_";
    public static final String PREFIX_TMP = "tmp_";
    public static final String SCHEME_FILE = "file://";
    public static final String SCHEME_P4_FILE = "p4file://";

    private MiniStorage() {
    }

    public final String getMiniRootPath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + "/mini/";
    }

    public final File getFrameworkDir(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getMiniRootPath(context), MiniSDK.MINI_FRAMEWORK_APP_ID);
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    public final File getFrameworkTempDir(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getFrameworkDir(context), IWorkspace.DIR_TEMP);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final String getMiniAppPath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getMiniRootPath(context) + "app/";
    }

    public final File getMiniAppDir(Context context, String appId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        File file = new File(getMiniAppPath(context), appId);
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    public final File getMiniAppSourceDir(Context context, String appId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        File file = new File(getMiniAppDir(context, appId), "source");
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    public final File getMiniAppStoreDir(Context context, String appId, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        File file = new File(getMiniAppDir(context, appId), "store");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, userId);
        if (file2.exists() && file2.isDirectory()) {
            return file2;
        }
        file2.mkdirs();
        return file2;
    }

    public final File getMiniAppTempDir(Context context, String appId, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        File file = new File(getMiniAppDir(context, appId), IWorkspace.DIR_TEMP);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, userId);
        if (file2.exists() && file2.isDirectory()) {
            return file2;
        }
        file2.mkdirs();
        return file2;
    }

    public final File getMiniAppSettingDir(Context context, String appId, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        File file = new File(getMiniAppDir(context, appId), a.x);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, userId);
        if (file2.exists() && file2.isDirectory()) {
            return file2;
        }
        file2.mkdirs();
        return file2;
    }

    public final File getMiniAppUsrDir(Context context, String appId, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        File file = new File(getMiniAppDir(context, appId), DIR_USR);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, userId);
        if (file2.exists() && file2.isDirectory()) {
            return file2;
        }
        file2.mkdirs();
        return file2;
    }
}
