package com.wakeup.feature.device.white.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: LNMusicOrder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/device/white/order/LNMusicOrder;", "", "<init>", "()V", "deviceWhileNoise", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "delWhileNoise", "fileName", "", "delAllWhileNoise", "playMusicByName", "playMusic", "stopMusic", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LNMusicOrder {
    public static final LNMusicOrder INSTANCE = new LNMusicOrder();

    private LNMusicOrder() {
    }

    public final BleOrderModel deviceWhileNoise() {
        return new BleOrderModel("白噪音文件信息", new byte[]{-22, 0, 3, 0, BuiltinOptions.ZerosLikeOptions, 2}, false, 0, 12, null);
    }

    public final BleOrderModel delWhileNoise(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr = {-22, 0, 4, 0, BuiltinOptions.ZerosLikeOptions, 3};
        byte[] bytes = fileName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("白噪音文件操作，删除单个文件", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel delAllWhileNoise() {
        return new BleOrderModel("白噪音文件操作，删除所有文件", new byte[]{-22, 0, 3, 0, BuiltinOptions.ZerosLikeOptions, 4}, false, 0, 12, null);
    }

    public final BleOrderModel playMusicByName(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr = {-22, 0, 4, 0, BuiltinOptions.ZerosLikeOptions, 5};
        byte[] bytes = fileName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("白噪音播放指定文件", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel playMusic() {
        return new BleOrderModel("白噪音播放所有文件", new byte[]{-22, 0, 3, 0, BuiltinOptions.ZerosLikeOptions, 6}, false, 0, 12, null);
    }

    public final BleOrderModel stopMusic() {
        return new BleOrderModel("白噪音暂停播放", new byte[]{-22, 0, 3, 0, BuiltinOptions.ZerosLikeOptions, 7}, false, 0, 12, null);
    }
}
