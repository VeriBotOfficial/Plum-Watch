package com.wakeup.module.ai.robot;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AiRobotOrder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/ai/robot/AiRobotOrder;", "", "<init>", "()V", "AI_ROBOT_ANSWER_RESULT", "", "AI_ROBOT_ANSWER_RESULT_END", "sendAnswerSteamResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "code", "", "completeCode", "overLength", "contentArr", "", "sendTtsPlayState", "state", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiRobotOrder {
    public static final String AI_ROBOT_ANSWER_RESULT = "AI机器人回答结果";
    public static final String AI_ROBOT_ANSWER_RESULT_END = "AI机器人回答结果结束";
    public static final AiRobotOrder INSTANCE = new AiRobotOrder();

    private AiRobotOrder() {
    }

    public final BleOrderModel sendAnswerSteamResult(int code, int completeCode, int overLength, byte[] contentArr) {
        Intrinsics.checkNotNullParameter(contentArr, "contentArr");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(new byte[]{-22, 0, 0, 0, BuiltinOptions.LogSoftmaxOptions, 2, (byte) code, (byte) completeCode, (byte) overLength}, new byte[]{(byte) (contentArr.length / 256), (byte) (contentArr.length % 256)}), contentArr);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        String str = completeCode == 1 ? AI_ROBOT_ANSWER_RESULT_END : AI_ROBOT_ANSWER_RESULT;
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(str, handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel sendTtsPlayState(int state) {
        return new BleOrderModel("Ai机器人回答语音状态", new byte[]{-22, 0, 3, 0, BuiltinOptions.LogSoftmaxOptions, 4, (byte) state}, false, 0, 12, null);
    }
}
