package com.wakeup.feature.health;

import android.content.Context;
import com.wakeup.commponent.module.health.HealthService;
import com.wakeup.feature.health.fatigue.WriteNoisePlayMgr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthServiceImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/health/HealthServiceImpl;", "Lcom/wakeup/commponent/module/health/HealthService;", "<init>", "()V", "init", "", "content", "Landroid/content/Context;", "isWorking", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthServiceImpl implements HealthService {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context content) {
        Intrinsics.checkNotNullParameter(content, "content");
        WriteNoisePlayMgr.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.module.health.HealthService
    public boolean isWorking() {
        return WriteNoisePlayMgr.INSTANCE.isWorking();
    }
}
