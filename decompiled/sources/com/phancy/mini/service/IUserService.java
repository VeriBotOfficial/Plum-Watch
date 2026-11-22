package com.phancy.mini.service;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import kotlin.Metadata;

/* compiled from: IUserService.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/phancy/mini/service/IUserService;", "Lcom/phancy/mini/service/IService;", "getUserId", "", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IUserService extends IService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String INVALID_USER_ID = "INVALID_UID";
    public static final String PATH = "/PhancyMini/user";

    String getUserId();

    /* compiled from: IUserService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/phancy/mini/service/IUserService$Companion;", "", "()V", "INVALID_USER_ID", "", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String INVALID_USER_ID = "INVALID_UID";
        public static final String PATH = "/PhancyMini/user";

        private Companion() {
        }
    }
}
