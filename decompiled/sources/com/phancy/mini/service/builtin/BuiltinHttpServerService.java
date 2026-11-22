package com.phancy.mini.service.builtin;

import android.app.Application;
import com.phancy.mini.service.BaseService;
import com.phancy.mini.service.IMiniHttpServerService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuiltinHttpServerService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/phancy/mini/service/builtin/BuiltinHttpServerService;", "Lcom/phancy/mini/service/BaseService;", "Lcom/phancy/mini/service/IMiniHttpServerService;", "()V", "initServer", "", "application", "Landroid/app/Application;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuiltinHttpServerService extends BaseService implements IMiniHttpServerService {
    @Override // com.phancy.mini.service.IMiniHttpServerService
    public void initServer(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
    }
}
