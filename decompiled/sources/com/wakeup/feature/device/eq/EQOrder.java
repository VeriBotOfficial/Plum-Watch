package com.wakeup.feature.device.eq;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: EQOrder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/device/eq/EQOrder;", "", "<init>", "()V", "requestDeviceEQMode", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "setEQMode", DOMConstants.ATTR_MODE, "", "setCustomEQ", "dataList", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EQOrder {
    public static final EQOrder INSTANCE = new EQOrder();

    private EQOrder() {
    }

    public final BleOrderModel requestDeviceEQMode() {
        return new BleOrderModel("获取设备EQ模式", new byte[]{-22, 0, 3, 0, 31, 3}, false, 0, 12, null);
    }

    public final BleOrderModel setEQMode(int mode) {
        return new BleOrderModel("设置EQ模式", new byte[]{-22, 0, 4, 0, 31, 1, (byte) mode}, false, 0, 12, null);
    }

    public final BleOrderModel setCustomEQ(List<Integer> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        int i = 0;
        byte[] bArr = {-22, 0, 3, 0, 31, 2};
        if (!dataList.isEmpty()) {
            byte[] bArr2 = new byte[dataList.size()];
            for (Object obj : dataList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bArr2[i] = (byte) ((Number) obj).intValue();
                i = i2;
            }
            bArr = BleUtil.addBytes(bArr, bArr2);
        }
        byte[] bArr3 = bArr;
        bArr3[1] = (byte) ((bArr3.length - 3) / 256);
        bArr3[2] = (byte) ((bArr3.length - 3) % 256);
        return new BleOrderModel("设置自定义EQ", bArr3, false, 0, 12, null);
    }
}
