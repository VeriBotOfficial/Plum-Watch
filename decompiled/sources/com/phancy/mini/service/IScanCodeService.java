package com.phancy.mini.service;

import com.phancy.mini.core.api.BaseApi;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IScanCodeService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJT\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\tH&¨\u0006\u0010"}, d2 = {"Lcom/phancy/mini/service/IScanCodeService;", "Lcom/phancy/mini/service/IService;", "startScanCode", "", "api", "Lcom/phancy/mini/core/api/BaseApi;", "onlyFromCamera", "", "callback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "result", "scanType", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IScanCodeService extends IService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PATH = "/PhancyMini/scanCode";

    void startScanCode(BaseApi api, boolean onlyFromCamera, Function2<? super String, ? super String, Unit> callback);

    /* compiled from: IScanCodeService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/phancy/mini/service/IScanCodeService$Companion;", "", "()V", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PATH = "/PhancyMini/scanCode";

        private Companion() {
        }
    }
}
