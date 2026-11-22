package com.wakeup.module.ai.simInter;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: SimIntOrder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/wakeup/module/ai/simInter/SimIntOrder;", "", "<init>", "()V", "sendRecordState", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "sendRecordTimeOut", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimIntOrder {
    public static final SimIntOrder INSTANCE = new SimIntOrder();

    private SimIntOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendRecordState(int state) {
        return new BleOrderModel("发送录音状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.ArgMaxOptions, 1, (byte) state}, false, 0, 12, null);
    }

    public final BleOrderModel sendRecordTimeOut() {
        return new BleOrderModel("发送录音超时", new byte[]{-22, 0, 4, 0, BuiltinOptions.ArgMaxOptions, 2, 1}, false, 0, 12, null);
    }
}
