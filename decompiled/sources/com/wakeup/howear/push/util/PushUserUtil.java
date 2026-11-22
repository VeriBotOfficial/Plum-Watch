package com.wakeup.howear.push.util;

import android.util.Log;
import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;

/* compiled from: PushUserUtil.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/wakeup/howear/push/util/PushUserUtil;", "", "<init>", "()V", "tag", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "isUserLogin", "", "module-push_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushUserUtil {
    public static final PushUserUtil INSTANCE;
    private static final String tag;

    private PushUserUtil() {
    }

    static {
        PushUserUtil pushUserUtil = new PushUserUtil();
        INSTANCE = pushUserUtil;
        tag = pushUserUtil.getClass().getSimpleName();
    }

    public final boolean isUserLogin() {
        if (UserDao.getUser() != null) {
            return true;
        }
        Log.i(tag, "push user not login");
        return false;
    }
}
