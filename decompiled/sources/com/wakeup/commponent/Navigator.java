package com.wakeup.commponent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wakeup.common.common.config.ChannelConfig;
import com.wakeup.commponent.constant.PagePath;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0012J?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lcom/wakeup/commponent/Navigator;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "requestCode", "", "isSingle", "", "path", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;)V", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Z)V", "channelIntercept", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Navigator {
    public static final Navigator INSTANCE = new Navigator();

    private Navigator() {
    }

    @JvmStatic
    public static final void start(Context context, Class<?> clazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        start(context, clazz, (Bundle) null);
    }

    @JvmStatic
    public static final void start(Context context, Class<?> clazz, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        start(context, clazz, bundle, -1);
    }

    @JvmStatic
    public static final void start(Context context, Class<?> clazz, Bundle bundle, int requestCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        start(context, clazz, bundle, requestCode, false);
    }

    public static /* synthetic */ void start$default(Context context, Class cls, Bundle bundle, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        start(context, (Class<?>) cls, bundle, i, z);
    }

    @JvmStatic
    public static final void start(Context context, Class<?> clazz, Bundle bundle, int requestCode, boolean isSingle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent intent = new Intent(context, clazz);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            if (isSingle) {
                intent.setFlags(268468224);
            }
            activity.startActivityForResult(intent, requestCode);
            return;
        }
        Intent intent2 = new Intent(context, clazz);
        if (bundle != null) {
            intent2.putExtras(bundle);
        }
        intent2.addFlags(268435456);
        context.startActivity(intent2);
    }

    @JvmStatic
    public static final void start(Context context, String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        start(context, path, (Bundle) null);
    }

    @JvmStatic
    public static final void start(Context context, String path, boolean isSingle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        start$default(context, path, (Bundle) null, (Integer) null, isSingle, 8, (Object) null);
    }

    public static /* synthetic */ void start$default(Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        start(context, str, bundle);
    }

    @JvmStatic
    public static final void start(Context context, String path, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        start(context, path, bundle, (Integer) null);
    }

    public static /* synthetic */ void start$default(Context context, String str, Bundle bundle, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        start(context, str, bundle, num);
    }

    @JvmStatic
    public static final void start(Context context, String path, Bundle bundle, Integer requestCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        start(context, path, bundle, requestCode, false);
    }

    public static /* synthetic */ void start$default(Context context, String str, Bundle bundle, Integer num, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        start(context, str, bundle, num, z);
    }

    @JvmStatic
    public static final void start(Context context, String path, Bundle bundle, Integer requestCode, boolean isSingle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Postcard build = ARouter.getInstance().build(INSTANCE.channelIntercept(path));
        build.with(bundle);
        if (isSingle) {
            build.addFlags(268468224);
        }
        if (requestCode != null && (context instanceof Activity)) {
            build.navigation((Activity) context, requestCode.intValue());
            return;
        }
        if (!(context instanceof Activity)) {
            build.addFlags(268435456);
        }
        build.navigation(context);
    }

    public final String channelIntercept(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!ChannelConfig.INSTANCE.isLenovo()) {
            return path;
        }
        if (Intrinsics.areEqual(path, PagePath.PAGE_HEALTH_SLEEP)) {
            return PagePath.LENOVO_PAGE_HEALTH_SLEEP;
        }
        return Intrinsics.areEqual(path, PagePath.PAGE_CHAT_HOME) ? PagePath.LENOVO_PAGE_CHAT_HOME : path;
    }
}
