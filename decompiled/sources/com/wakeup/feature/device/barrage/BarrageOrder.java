package com.wakeup.feature.device.barrage;

import com.wakeup.common.Constants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.device.work.TranBarrageBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: BarrageOrder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/device/barrage/BarrageOrder;", "", "<init>", "()V", "sendBarrageInfo", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", Constants.BundleKey.BEAN, "Lcom/wakeup/commponent/module/device/work/TranBarrageBean;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarrageOrder {
    public static final BarrageOrder INSTANCE = new BarrageOrder();

    private BarrageOrder() {
    }

    public final BleOrderModel sendBarrageInfo(TranBarrageBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        byte[] bytes = bean.getContent().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, (byte) ((bytes.length + 17) / 256), (byte) ((bytes.length + 17) % 256), 0, BuiltinOptions.ExpOptions, 1, (byte) bean.getNum(), (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont_r(), (byte) bean.getFont_g(), (byte) bean.getFont_b(), (byte) bean.getFontSize(), (byte) (bean.getSpeed() / 256), (byte) (bean.getSpeed() % 256), (byte) bean.getDirection(), (byte) ((addBytes.length - 3) / 256), (byte) ((addBytes.length - 3) % 256), (byte) bean.getType()}, bytes);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        BleOrderModel bleOrderModel = new BleOrderModel("发送弹幕图片信息", handleMessageBytes, false, 0, 12, null);
        bleOrderModel.setSplitNum(20);
        return bleOrderModel;
    }
}
