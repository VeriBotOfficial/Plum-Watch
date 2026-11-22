package defpackage;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: TranslateOrder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"LTranslateOrder;", "", "<init>", "()V", "sendSupportLanguage", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "pair", "", "Lkotlin/Pair;", "", "", "sendPlayerEnd", "sendQuestionSteamResult", "code", "completeCode", "overLength", "content", "sendSteamResult", "sendIsSupportPlay", "languageId", "isSupport", "", "feature-translate_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TranslateOrder {
    public static final TranslateOrder INSTANCE = new TranslateOrder();

    private TranslateOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendSupportLanguage(List<Pair<Integer, String>> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        byte[] bArr = {-22, 0, 0, 0, 22, 1};
        for (Pair<Integer, String> pair2 : pair) {
            byte[] addBytes = BleUtil.addBytes(bArr, new byte[]{(byte) pair2.getFirst().intValue()});
            byte[] bytes = pair2.getSecond().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArr = BleUtil.addBytes(addBytes, bytes);
        }
        bArr[1] = (byte) ((bArr.length - 3) / 256);
        bArr[2] = (byte) ((bArr.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(bArr);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(WatchBleOrder.SEND_TRANSLATE_LANGUAGE, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendPlayerEnd() {
        return new BleOrderModel(WatchBleOrder.SEND_TRANSLATE_PLAY_END, new byte[]{-22, 0, 4, 0, 22, 3, 1}, false, 0, 12, null);
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
        return new BleOrderModel(WatchBleOrder.SEND_TRANSLATE_STEAM_RESULT_QUESTION, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendSteamResult(int code, int completeCode, int overLength, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 22, 4, (byte) code, (byte) completeCode, content.length() >= 300 ? (byte) 1 : (byte) overLength};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(WatchBleOrder.SEND_TRANSLATE_STEAM_RESULT_ANSWER, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendIsSupportPlay(int languageId, boolean isSupport) {
        return new BleOrderModel("发送 此语言是否支持播放", new byte[]{-22, 0, 5, 0, 22, 5, (byte) languageId, isSupport ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }
}
