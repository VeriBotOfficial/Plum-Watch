package com.wakeup.module.ai.port;

import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;

/* compiled from: MoeAgiConfig.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"withAuth", "Lokhttp3/Request$Builder;", "module-ai_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoeAgiConfigKt {
    public static final Request.Builder withAuth(Request.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Request.Builder addHeader = builder.addHeader("Authorization", "Basic bGxtOlJtZjQjTGNHKGlGWnJqVTsySg==");
        String uid = UserDao.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return addHeader.addHeader("userId", uid);
    }
}
