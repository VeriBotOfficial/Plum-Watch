package com.wakeup.commponent.api;

import android.app.Dialog;
import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.aipay.AiEnergyRule;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AiPayService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H&J\u000e\u0010\t\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\nJ,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/wakeup/commponent/api/AiPayService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getRule", "", "projectId", "", "cb", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/common/network/entity/aipay/AiEnergyRule;", "getUserEnergy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceivedEnergy", "getEnergyTipDialog", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "tipType", "callback", "sendEnergyCheck", "result", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiPayService extends IProvider {
    Dialog getEnergyTipDialog(Context context, int tipType, BaseCallback<Integer> callback);

    Object getReceivedEnergy(Continuation<? super Integer> continuation);

    void getRule(int projectId, BaseCallback<AiEnergyRule> cb);

    Object getUserEnergy(Continuation<? super Integer> continuation);

    void sendEnergyCheck(int projectId, boolean result);

    /* compiled from: AiPayService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog getEnergyTipDialog$default(AiPayService aiPayService, Context context, int i, BaseCallback baseCallback, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEnergyTipDialog");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                baseCallback = null;
            }
            return aiPayService.getEnergyTipDialog(context, i, baseCallback);
        }
    }
}
