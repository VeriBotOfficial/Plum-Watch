package com.wakeup.howear.diet;

import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;

/* compiled from: DietTokenProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/wakeup/howear/diet/DietTokenProvider;", "", "<init>", "()V", "get", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DietTokenProvider {
    public static final DietTokenProvider INSTANCE = new DietTokenProvider();

    private DietTokenProvider() {
    }

    public final String get() {
        String token = UserDao.getToken();
        return token == null ? "" : token;
    }
}
