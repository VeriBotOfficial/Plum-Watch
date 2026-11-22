package com.wakeup.module.gpt.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: GptOrder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0007J(\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0007J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/gpt/order/GptOrder;", "", "<init>", "()V", "sendSyncRestFreeNumber", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "freeNum", "", "sendSpeechConversionResult", "result", "content", "", "sendChatGptResult", "code", "sendGptTodo", "memoTime", "", "memoTitle", "memoContent", "id", "clearGptTodo", "sendChatGptSteamResult", "completeCode", "overLength", "sendQuestionSteamResult", "sendHealthTemplate", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GptOrder {
    public static final GptOrder INSTANCE = new GptOrder();

    private GptOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendSyncRestFreeNumber(int freeNum) {
        return new BleOrderModel("GPT同步剩余免费次数", new byte[]{-22, 0, 4, 0, 5, 1, (byte) freeNum}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendSpeechConversionResult(int result, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 5, 3, (byte) result};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, BleUtil.addBytes(new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256), content.length() >= 30 ? (byte) 1 : (byte) 0}, bytes));
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("语音转换结果", handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendChatGptResult(int code, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 5, 4, (byte) code};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), new byte[]{content.length() >= 300 ? (byte) 1 : (byte) 0}), bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(WatchBleOrder.SEND_GPT_RESULT, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendGptTodo(long memoTime, String memoTitle, String memoContent, int id2) {
        Intrinsics.checkNotNullParameter(memoTitle, "memoTitle");
        Intrinsics.checkNotNullParameter(memoContent, "memoContent");
        byte[] bArr = {-22, 0, 0, 0, 5, 5, (byte) (id2 / 256), (byte) (id2 % 256), (byte) (DateUtil.getYear(memoTime) - 2000), (byte) (DateUtil.getMonth(memoTime) + 1), (byte) DateUtil.getDay(memoTime), (byte) DateUtil.getHour(memoTime), (byte) DateUtil.getMinute(memoTime)};
        byte[] bytes = memoTitle.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), new byte[]{memoTitle.length() >= 30 ? (byte) 1 : (byte) 0}), bytes);
        byte[] bytes2 = memoContent.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] addBytes2 = BleUtil.addBytes(BleUtil.addBytes(BleUtil.addBytes(addBytes, new byte[]{(byte) (bytes2.length / 256), (byte) (bytes2.length % 256)}), new byte[]{memoContent.length() >= 300 ? (byte) 1 : (byte) 0}), bytes2);
        addBytes2[1] = (byte) ((addBytes2.length - 3) / 256);
        addBytes2[2] = (byte) ((addBytes2.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes2);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel(WatchBleOrder.SEND_GPT_TODO, handleMessageBytes, true, 20);
    }

    @JvmStatic
    public static final BleOrderModel clearGptTodo() {
        return new BleOrderModel(WatchBleOrder.SEND_GPT_CLEAR_TODO, new byte[]{-22, 0, 4, 0, 5, 6, 0}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendChatGptSteamResult(int code, String content, int completeCode, int overLength) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 5, 8, (byte) code, (byte) completeCode, content.length() >= 300 ? (byte) 1 : (byte) overLength};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(WatchBleOrder.SEND_GPT_STEAM_RESULT, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendQuestionSteamResult(int code, String content, int completeCode, int overLength) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 5, 7, (byte) code, (byte) completeCode, content.length() >= 30 ? (byte) 1 : (byte) overLength};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(WatchBleOrder.SEND_GPT_STEAM_RESULT_QUESTION, handleMessageBytes, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendHealthTemplate(int id2, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, 5, 12, 1, (byte) id2, 0};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("ChatGpt 发送模板问题", handleMessageBytes, false, 0, 12, null);
    }
}
