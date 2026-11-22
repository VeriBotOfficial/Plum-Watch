package com.wakeup.common.storage;

import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.facebook.react.uimanager.ViewProps;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MockSleepSoundDevice.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00029:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00107\u001a\u000208R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/wakeup/common/storage/MockSleepSoundDevice;", "", "<init>", "()V", "mockEnabled", "", "value", ViewProps.ENABLED, "getEnabled", "()Z", "setEnabled", "(Z)V", "fakeMac", "", "getFakeMac", "()Ljava/lang/String;", "setFakeMac", "(Ljava/lang/String;)V", "total", "", "getTotal", "()I", "setTotal", "(I)V", BidResponsed.KEY_CUR, "getCur", "setCur", "singleSize", "getSingleSize", "setSingleSize", "fileNames", "", "getFileNames", "()Ljava/util/List;", "sendBehavior", "Lcom/wakeup/common/storage/MockSleepSoundDevice$SendBehavior;", "getSendBehavior", "()Lcom/wakeup/common/storage/MockSleepSoundDevice$SendBehavior;", "setSendBehavior", "(Lcom/wakeup/common/storage/MockSleepSoundDevice$SendBehavior;)V", "sendFailCode", "getSendFailCode", "setSendFailCode", "infoBehavior", "Lcom/wakeup/common/storage/MockSleepSoundDevice$InfoBehavior;", "getInfoBehavior", "()Lcom/wakeup/common/storage/MockSleepSoundDevice$InfoBehavior;", "setInfoBehavior", "(Lcom/wakeup/common/storage/MockSleepSoundDevice$InfoBehavior;)V", "progressStepMs", "", "getProgressStepMs", "()J", "setProgressStepMs", "(J)V", TimerController.RESET_COMMAND, "", "SendBehavior", "InfoBehavior", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MockSleepSoundDevice {
    private static int cur;
    private static boolean mockEnabled;
    public static final MockSleepSoundDevice INSTANCE = new MockSleepSoundDevice();
    private static String fakeMac = "00:11:22:33:44:27";
    private static int total = 3;
    private static int singleSize = 240000;
    private static final List<String> fileNames = new ArrayList();
    private static SendBehavior sendBehavior = SendBehavior.SUCCESS;
    private static int sendFailCode = 501;
    private static InfoBehavior infoBehavior = InfoBehavior.SUCCESS;
    private static long progressStepMs = 60;

    public final boolean getEnabled() {
        return false;
    }

    private MockSleepSoundDevice() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MockSleepSoundDevice.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/common/storage/MockSleepSoundDevice$SendBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", AMapLocationStaticsEntity.FAIL_STATUS, "STUCK", "SLOW", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SendBehavior[] $VALUES;
        public static final SendBehavior SUCCESS = new SendBehavior("SUCCESS", 0);
        public static final SendBehavior FAIL = new SendBehavior(AMapLocationStaticsEntity.FAIL_STATUS, 1);
        public static final SendBehavior STUCK = new SendBehavior("STUCK", 2);
        public static final SendBehavior SLOW = new SendBehavior("SLOW", 3);

        private static final /* synthetic */ SendBehavior[] $values() {
            return new SendBehavior[]{SUCCESS, FAIL, STUCK, SLOW};
        }

        public static EnumEntries<SendBehavior> getEntries() {
            return $ENTRIES;
        }

        static {
            SendBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SendBehavior(String str, int i) {
        }

        public static SendBehavior valueOf(String str) {
            return (SendBehavior) Enum.valueOf(SendBehavior.class, str);
        }

        public static SendBehavior[] values() {
            return (SendBehavior[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MockSleepSoundDevice.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/storage/MockSleepSoundDevice$InfoBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "TIMEOUT", AMapLocationStaticsEntity.FAIL_STATUS, "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InfoBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoBehavior[] $VALUES;
        public static final InfoBehavior SUCCESS = new InfoBehavior("SUCCESS", 0);
        public static final InfoBehavior TIMEOUT = new InfoBehavior("TIMEOUT", 1);
        public static final InfoBehavior FAIL = new InfoBehavior(AMapLocationStaticsEntity.FAIL_STATUS, 2);

        private static final /* synthetic */ InfoBehavior[] $values() {
            return new InfoBehavior[]{SUCCESS, TIMEOUT, FAIL};
        }

        public static EnumEntries<InfoBehavior> getEntries() {
            return $ENTRIES;
        }

        static {
            InfoBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private InfoBehavior(String str, int i) {
        }

        public static InfoBehavior valueOf(String str) {
            return (InfoBehavior) Enum.valueOf(InfoBehavior.class, str);
        }

        public static InfoBehavior[] values() {
            return (InfoBehavior[]) $VALUES.clone();
        }
    }

    public final void setEnabled(boolean z) {
        mockEnabled = z;
    }

    public final String getFakeMac() {
        return fakeMac;
    }

    public final void setFakeMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        fakeMac = str;
    }

    public final int getTotal() {
        return total;
    }

    public final void setTotal(int i) {
        total = i;
    }

    public final int getCur() {
        return cur;
    }

    public final void setCur(int i) {
        cur = i;
    }

    public final int getSingleSize() {
        return singleSize;
    }

    public final void setSingleSize(int i) {
        singleSize = i;
    }

    public final List<String> getFileNames() {
        return fileNames;
    }

    public final SendBehavior getSendBehavior() {
        return sendBehavior;
    }

    public final void setSendBehavior(SendBehavior sendBehavior2) {
        Intrinsics.checkNotNullParameter(sendBehavior2, "<set-?>");
        sendBehavior = sendBehavior2;
    }

    public final int getSendFailCode() {
        return sendFailCode;
    }

    public final void setSendFailCode(int i) {
        sendFailCode = i;
    }

    public final InfoBehavior getInfoBehavior() {
        return infoBehavior;
    }

    public final void setInfoBehavior(InfoBehavior infoBehavior2) {
        Intrinsics.checkNotNullParameter(infoBehavior2, "<set-?>");
        infoBehavior = infoBehavior2;
    }

    public final long getProgressStepMs() {
        return progressStepMs;
    }

    public final void setProgressStepMs(long j) {
        progressStepMs = j;
    }

    public final void reset() {
        mockEnabled = false;
        cur = 0;
        fileNames.clear();
        sendBehavior = SendBehavior.SUCCESS;
        infoBehavior = InfoBehavior.SUCCESS;
    }
}
