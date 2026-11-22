package com.wakeup.module.religion.ble;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: MuslimBle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0007J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J&\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0007J@\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0007J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0015H\u0007J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\bH\u0007¨\u0006$"}, d2 = {"Lcom/wakeup/module/religion/ble/MuslimBle;", "", "<init>", "()V", "sendPrayTime", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "times", "", "", "enables", "getTasbih", "sendKaaba", "angle", "distance", "sendKoran", "sura", "paragraphIndex", "position", "chapterFlag", "lastFlag", "koran", "", "sendKoranTitle", "koranTitle", "sendScene", "directoryNum", "last", "scenes", "", "sendSceneContent", "sceneId", "content", "sendSceneTitle", "sceneTitle", "sendKoranPlayState", "state", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MuslimBle {
    public static final MuslimBle INSTANCE = new MuslimBle();

    private MuslimBle() {
    }

    public final BleOrderModel sendPrayTime(List<Integer> times, List<Integer> enables) {
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(enables, "enables");
        return new BleOrderModel("同步礼拜时间", new byte[]{-22, 0, 15, 0, 6, 1, (byte) (times.get(0).intValue() / 60), (byte) (times.get(0).intValue() % 60), (byte) (times.get(1).intValue() / 60), (byte) (times.get(1).intValue() % 60), (byte) (times.get(2).intValue() / 60), (byte) (times.get(2).intValue() % 60), (byte) (times.get(3).intValue() / 60), (byte) (times.get(3).intValue() % 60), (byte) (times.get(4).intValue() / 60), (byte) (times.get(4).intValue() % 60), (byte) (enables.get(0).intValue() + (enables.get(1).intValue() << 1) + (enables.get(2).intValue() << 2) + (enables.get(3).intValue() << 3) + (enables.get(4).intValue() << 4)), 0}, false, 0, 12, null);
    }

    public final BleOrderModel getTasbih() {
        return new BleOrderModel("获取Subid", new byte[]{-22, 0, 3, 0, 6, 4}, false, 0, 12, null);
    }

    public final BleOrderModel sendKaaba(int angle, int distance) {
        return new BleOrderModel("同步克尔白", new byte[]{-22, 0, 9, 0, 6, 3, (byte) (angle / 256), (byte) (angle % 256), (byte) ((distance >> 24) & 255), (byte) ((distance >> 16) & 255), (byte) ((distance >> 8) & 255), (byte) (distance & 255)}, false, 0, 12, null);
    }

    public final BleOrderModel sendKoran(int sura, int paragraphIndex, int position, int chapterFlag, int lastFlag, String koran) {
        Intrinsics.checkNotNullParameter(koran, "koran");
        byte[] bytes = koran.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 6, 7, (byte) sura, (byte) (paragraphIndex / 256), (byte) (paragraphIndex % 256), (byte) position, (byte) chapterFlag, (byte) lastFlag, (byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送古兰经", handleMessageBytes, true, 20);
    }

    public final BleOrderModel sendKoranTitle(String koranTitle) {
        Intrinsics.checkNotNullParameter(koranTitle, "koranTitle");
        byte[] bytes = koranTitle.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 6, 8, (byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送古兰经名称", handleMessageBytes, true, 20);
    }

    public final BleOrderModel sendScene(int directoryNum, int last, List<String> scenes) {
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        byte[] bArr = {-22, 0, 0, 0, 6, 10, (byte) directoryNum, (byte) last};
        int size = scenes.size();
        for (int i = 0; i < size; i++) {
            byte[] bytes = scenes.get(i).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArr = BleUtil.addBytes(bArr, BleUtil.addBytes(new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes));
        }
        bArr[1] = (byte) ((bArr.length - 3) / 256);
        bArr[2] = (byte) ((bArr.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(bArr);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送祈祷场景页", handleMessageBytes, true, 20);
    }

    public final BleOrderModel sendSceneContent(int sceneId, int sura, int paragraphIndex, int position, int chapterFlag, int lastFlag, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 6, 12, (byte) sceneId, (byte) sura, (byte) (paragraphIndex / 256), (byte) (paragraphIndex % 256), (byte) position, (byte) chapterFlag, (byte) lastFlag, (byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送祈祷场景页内容", handleMessageBytes, true, 20);
    }

    public final BleOrderModel sendSceneTitle(String sceneTitle) {
        Intrinsics.checkNotNullParameter(sceneTitle, "sceneTitle");
        byte[] bytes = sceneTitle.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 6, 13, (byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送祈祷章节名", handleMessageBytes, true, 20);
    }

    public final BleOrderModel sendKoranPlayState(int state) {
        return new BleOrderModel("有声播放state", new byte[]{-22, 0, 4, 0, 6, 15, (byte) state}, false, 0, 12, null);
    }
}
