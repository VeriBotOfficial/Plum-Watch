package com.phancy.mini.app.service;

import com.phancy.mini.service.BaseService;
import com.phancy.mini.service.IUserService;
import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/app/service/UserService;", "Lcom/phancy/mini/service/BaseService;", "Lcom/phancy/mini/service/IUserService;", "<init>", "()V", "getUserId", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserService extends BaseService implements IUserService {
    @Override // com.phancy.mini.service.IUserService
    public String getUserId() {
        String uid = UserDao.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }
}
