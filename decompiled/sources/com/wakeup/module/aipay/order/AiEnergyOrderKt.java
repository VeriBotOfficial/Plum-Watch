package com.wakeup.module.aipay.order;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AiEnergyOrder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"sendEnergyCheckResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "projectId", "", "result", "", "module-aipay_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiEnergyOrderKt {
    public static final BleOrderModel sendEnergyCheckResult(int i, boolean z) {
        return new BleOrderModel("发送能量检查结果", new byte[]{-22, 0, 5, 0, BuiltinOptions.MaximumMinimumOptions, 2, (byte) i, z ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }
}
