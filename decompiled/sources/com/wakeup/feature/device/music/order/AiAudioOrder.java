package com.wakeup.feature.device.music.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AiAudioOrder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ(\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0007J*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u001a\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0013\u0018\u00010\u0012J.\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tJ\u001e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tJ\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006\u001f"}, d2 = {"Lcom/wakeup/feature/device/music/order/AiAudioOrder;", "", "<init>", "()V", "sendAudioResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "audioName", "", "sendQuestionSteamResult", "code", "completeCode", "overLength", "content", "sendSongList", "totalNum", "pair", "", "Lkotlin/Pair;", "sendPlayAudioState", "mainId", "subId", "musicId", "MusicName", "sendPlayAiAudioState", "success", "musicName", "sendAudioSearchSwitch", "isOpen", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AiAudioOrder {
    public static final AiAudioOrder INSTANCE = new AiAudioOrder();

    private AiAudioOrder() {
    }

    public final BleOrderModel sendAudioResult(int state, String audioName) {
        Intrinsics.checkNotNullParameter(audioName, "audioName");
        byte[] bArr = {-22, 0, 0, 0, 5, 18, (byte) state, audioName.length() >= 30 ? (byte) 1 : (byte) 0};
        byte[] bytes = audioName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("Ai 曲库音频转换结果", handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendQuestionSteamResult(int code, int completeCode, int overLength, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 23, 1, (byte) code, (byte) completeCode, content.length() >= 30 ? (byte) 1 : (byte) overLength};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("ai 曲库录音无权限返回", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel sendSongList(int totalNum, List<Pair<Integer, String>> pair) {
        byte[] bArr = {-22, 0, 0, 0, 5, 15, (byte) totalNum};
        if (pair == null) {
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 4;
            byte[] handleMessageBytes = BleUtil.handleMessageBytes(bArr);
            Intrinsics.checkNotNull(handleMessageBytes);
            return new BleOrderModel("ai曲库本地音频列表生成结果", handleMessageBytes, false, 0, 12, null);
        }
        for (Pair<Integer, String> pair2 : pair) {
            byte[] addBytes = BleUtil.addBytes(bArr, new byte[]{(byte) (pair2.getFirst().intValue() / 256), (byte) (pair2.getFirst().intValue() % 256)});
            byte[] bytes = pair2.getSecond().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArr = BleUtil.addBytes(addBytes, bytes);
        }
        bArr[1] = (byte) ((bArr.length - 3) / 256);
        bArr[2] = (byte) ((bArr.length - 3) % 256);
        byte[] handleMessageBytes2 = BleUtil.handleMessageBytes(bArr);
        Intrinsics.checkNotNull(handleMessageBytes2);
        return new BleOrderModel("ai曲库本地音频列表生成结果", handleMessageBytes2, false, 0, 12, null);
    }

    public final BleOrderModel sendPlayAudioState(int state, int mainId, int subId, int musicId, String MusicName) {
        Intrinsics.checkNotNullParameter(MusicName, "MusicName");
        byte[] bytes = MusicName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 5, 16, (byte) state, (byte) mainId, (byte) subId, (byte) (musicId / 256), (byte) (musicId % 256)}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送ai曲库配置的音频播放状态", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel sendPlayAiAudioState(int state, int success, String musicName) {
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        byte[] bArr = {-22, 0, 0, 0, 5, 17, (byte) state, (byte) success, musicName.length() > 15 ? (byte) 1 : (byte) 0};
        byte[] bytes = musicName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送ai返回的音频播放状态", handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendAudioSearchSwitch(boolean isOpen) {
        return new BleOrderModel("Ai曲库 搜索开关", new byte[]{-22, 0, 4, 0, 5, 19, isOpen ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }
}
