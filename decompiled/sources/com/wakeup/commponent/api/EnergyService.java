package com.wakeup.commponent.api;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.commponent.module.energy.EnergyView;
import kotlin.Metadata;

/* compiled from: EnergyService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commponent/api/EnergyService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getEnergyView", "Lcom/wakeup/commponent/module/energy/EnergyView;", "context", "Landroid/content/Context;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EnergyService extends IProvider {
    EnergyView getEnergyView(Context context);
}
