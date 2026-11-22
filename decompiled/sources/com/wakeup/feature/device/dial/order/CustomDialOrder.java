package com.wakeup.feature.device.dial.order;

import com.wakeup.common.Constants;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.feature.device.dial.bean.DiyLocationOrder;
import com.wakeup.feature.device.dial.bean.DiyNumOrder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomDialOrder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/device/dial/order/CustomDialOrder;", "", "<init>", "()V", "sendModuleDial", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "bigModel", "", "smallModel1", "smallModel2", "smallModel3", "sendMenuBgState", "state", "errorCode", "sendDiyPointer", "style", "sendDiyNum", Constants.BundleKey.BEAN, "Lcom/wakeup/feature/device/dial/bean/DiyNumOrder;", "sendDiyLocation", "Lcom/wakeup/feature/device/dial/bean/DiyLocationOrder;", "sendDiyState", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomDialOrder {
    public static final CustomDialOrder INSTANCE = new CustomDialOrder();

    private CustomDialOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendModuleDial(int bigModel, int smallModel1, int smallModel2, int smallModel3) {
        return new BleOrderModel("发送模块表盘", new byte[]{-22, 0, 7, 0, 10, 1, (byte) bigModel, (byte) smallModel1, (byte) smallModel2, (byte) smallModel3}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendMenuBgState(int state, int errorCode) {
        return new BleOrderModel("发送菜单背景状态", new byte[]{-22, 0, 6, 0, 15, 1, 0, (byte) state, (byte) errorCode}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendDiyPointer(int style) {
        return new BleOrderModel("发送DIY表盘 指针设置", new byte[]{-22, 0, 4, 0, 61, 2, (byte) style}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendDiyNum(DiyNumOrder bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        return new BleOrderModel("发送DIY表盘 数字设置", new byte[]{-22, 0, 8, 0, 61, 1, (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont(), (byte) bean.getFunc()}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendDiyLocation(DiyLocationOrder bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        byte[] bArr = new byte[15];
        bArr[0] = -22;
        bArr[1] = 0;
        bArr[2] = 12;
        bArr[3] = 0;
        bArr[4] = 61;
        bArr[5] = 3;
        bArr[7] = (byte) (bean.getDateX() / 256);
        bArr[8] = (byte) (bean.getDateX() % 256);
        bArr[9] = (byte) (bean.getDateY() / 256);
        bArr[10] = (byte) (bean.getDateY() % 256);
        if (bean.getFuncX() != null && bean.getFuncY() != null) {
            bArr[6] = 2;
            bArr[11] = (byte) (bean.getFuncX().intValue() / 256);
            bArr[12] = (byte) (bean.getFuncX().intValue() % 256);
            bArr[13] = (byte) (bean.getFuncY().intValue() / 256);
            bArr[14] = (byte) (bean.getFuncY().intValue() % 256);
        } else {
            bArr[6] = 1;
        }
        return new BleOrderModel("发送DIY表盘位置", bArr, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendDiyState(int state, int errorCode) {
        return new BleOrderModel("发送DIY表盘状态", new byte[]{-22, 0, 5, 0, 61, 4, (byte) state, (byte) errorCode}, false, 0, 12, null);
    }
}
