package com.wakeup.module.sound.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AiMusicOrder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0007¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/sound/order/AiMusicOrder;", "", "<init>", "()V", "sendMusicListEnd", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "createMusicCount", "num", "", "createMusicInfo", "isNameType", "", "name", "", "createMusicState", "state", "playMusicInfo", "code", "content", "musicControl", "playingProgress", "total", "current", "sendPlayMusicOrder", "order", "type", "feature-sound_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiMusicOrder {
    public static final AiMusicOrder INSTANCE = new AiMusicOrder();

    private AiMusicOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendMusicListEnd() {
        return new BleOrderModel("已发送完歌曲列表指令", new byte[]{-22, 0, 4, 0, BuiltinOptions.CastOptions, 1, 1}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel createMusicCount(int num) {
        return new BleOrderModel("发送正在创作的歌曲数量", new byte[]{-22, 0, 4, 0, BuiltinOptions.CastOptions, 2, (byte) num}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel createMusicInfo(boolean isNameType, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.CastOptions, 3, !isNameType ? 1 : 0};
        if (isNameType) {
            if (name.length() > 64) {
                name = name.substring(0, 64);
                Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
            }
        } else if (name.length() > 32) {
            name = name.substring(0, 32);
            Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
        }
        byte[] bytes = name.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        String concat = "发送已创作的歌曲信息 ".concat(isNameType ? "歌名" : "歌手名");
        Intrinsics.checkNotNull(addBytes);
        return new BleOrderModel(concat, addBytes, false, 0, 8, null);
    }

    @JvmStatic
    public static final BleOrderModel createMusicState(int state) {
        return new BleOrderModel("发送创作音乐指令", new byte[]{-22, 0, 4, 0, BuiltinOptions.CastOptions, 4, (byte) state}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel playMusicInfo(int code, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 4, 0, BuiltinOptions.CastOptions, 7, (byte) code};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送播放歌曲的信息", handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel musicControl(int state) {
        return new BleOrderModel("发送音乐控制", new byte[]{-22, 0, 4, 0, BuiltinOptions.CastOptions, 8, (byte) state}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel playingProgress(int total, int current) {
        int i = total <= 0 ? 0 : total / 1000;
        int i2 = current <= 0 ? 0 : current / 1000;
        return new BleOrderModel("发送歌曲进度", new byte[]{-22, 0, 7, 0, BuiltinOptions.CastOptions, 9, (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendPlayMusicOrder(int order, int type) {
        return new BleOrderModel("在播放的歌曲，在列表中的序号", new byte[]{-22, 0, 5, 0, BuiltinOptions.CastOptions, 5, (byte) type, (byte) order}, false, 0, 12, null);
    }
}
