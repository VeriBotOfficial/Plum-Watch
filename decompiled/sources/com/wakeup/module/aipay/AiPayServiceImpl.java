package com.wakeup.module.aipay;

import android.app.Dialog;
import android.content.Context;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.aipay.AiEnergyRule;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.api.AiPayService;
import com.wakeup.module.aipay.dialog.EnergyTipDialog;
import com.wakeup.module.aipay.order.AiEnergyAnalyzer;
import com.wakeup.module.aipay.order.AiEnergyOrderKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayServiceImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\u000e\u0010\u000b\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\fJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/aipay/AiPayServiceImpl;", "Lcom/wakeup/commponent/api/AiPayService;", "<init>", "()V", "getRule", "", "projectId", "", "cb", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/common/network/entity/aipay/AiEnergyRule;", "getUserEnergy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceivedEnergy", "getEnergyTipDialog", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "tipType", "callback", "sendEnergyCheck", "result", "", "init", "ctx", "module-aipay_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiPayServiceImpl implements AiPayService {
    @Override // com.wakeup.commponent.api.AiPayService
    public void getRule(int projectId, BaseCallback<AiEnergyRule> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        AiPayMgr.INSTANCE.getRule(projectId, cb);
    }

    @Override // com.wakeup.commponent.api.AiPayService
    public Object getUserEnergy(Continuation<? super Integer> continuation) {
        return AiPayMgr.INSTANCE.getUserEnergy(continuation);
    }

    @Override // com.wakeup.commponent.api.AiPayService
    public Object getReceivedEnergy(Continuation<? super Integer> continuation) {
        return AiPayMgr.INSTANCE.getReceivedEnergy(continuation);
    }

    @Override // com.wakeup.commponent.api.AiPayService
    public Dialog getEnergyTipDialog(Context context, int tipType, BaseCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new EnergyTipDialog(context, tipType, callback);
    }

    @Override // com.wakeup.commponent.api.AiPayService
    public void sendEnergyCheck(int projectId, boolean result) {
        ServiceManager.getDeviceService().sendData(AiEnergyOrderKt.sendEnergyCheckResult(projectId, result));
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ServiceManager.getDeviceService().addAnalyzer(new AiEnergyAnalyzer());
    }
}
