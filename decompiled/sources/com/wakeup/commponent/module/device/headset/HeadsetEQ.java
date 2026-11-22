package com.wakeup.commponent.module.device.headset;

import com.wakeup.common.storage.DeviceDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: HeadsetEQ.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t¨\u0006)"}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetEQ;", "", "<init>", "()V", DOMConstants.ATTR_MODE, "", "getMode", "()I", "setMode", "(I)V", "eq_up_1", "getEq_up_1", "setEq_up_1", "eq_up_2", "getEq_up_2", "setEq_up_2", "eq_up_3", "getEq_up_3", "setEq_up_3", "eq_up_4", "getEq_up_4", "setEq_up_4", "eq_up_5", "getEq_up_5", "setEq_up_5", "eq_up_6", "getEq_up_6", "setEq_up_6", "eq_up_7", "getEq_up_7", "setEq_up_7", "eq_up_8", "getEq_up_8", "setEq_up_8", "eq_up_9", "getEq_up_9", "setEq_up_9", "eq_up_10", "getEq_up_10", "setEq_up_10", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeadsetEQ {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODEL_TYPE_CUSTOM = 7;
    private int mode = INSTANCE.getModelType1();
    private int eq_up_1 = 8;
    private int eq_up_2 = 8;
    private int eq_up_3 = 8;
    private int eq_up_4 = 8;
    private int eq_up_5 = 8;
    private int eq_up_6 = 8;
    private int eq_up_7 = 8;
    private int eq_up_8 = 8;
    private int eq_up_9 = 8;
    private int eq_up_10 = 8;

    /* compiled from: HeadsetEQ.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetEQ$Companion;", "", "<init>", "()V", "MODEL_TYPE_CUSTOM", "", "getModelType1", "getModelType2", "getModelType3", "getModelType4", "getModelType5", "getModelType6", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getModelType1() {
            return !DeviceDao.isSupport(212) ? 1 : 0;
        }

        public final int getModelType2() {
            return DeviceDao.isSupport(212) ? 1 : 2;
        }

        public final int getModelType3() {
            return DeviceDao.isSupport(212) ? 2 : 3;
        }

        public final int getModelType4() {
            return DeviceDao.isSupport(212) ? 3 : 4;
        }

        public final int getModelType5() {
            return DeviceDao.isSupport(212) ? 4 : 5;
        }

        public final int getModelType6() {
            return DeviceDao.isSupport(212) ? 5 : 6;
        }
    }

    public final int getMode() {
        return this.mode;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public final int getEq_up_1() {
        return this.eq_up_1;
    }

    public final void setEq_up_1(int i) {
        this.eq_up_1 = i;
    }

    public final int getEq_up_2() {
        return this.eq_up_2;
    }

    public final void setEq_up_2(int i) {
        this.eq_up_2 = i;
    }

    public final int getEq_up_3() {
        return this.eq_up_3;
    }

    public final void setEq_up_3(int i) {
        this.eq_up_3 = i;
    }

    public final int getEq_up_4() {
        return this.eq_up_4;
    }

    public final void setEq_up_4(int i) {
        this.eq_up_4 = i;
    }

    public final int getEq_up_5() {
        return this.eq_up_5;
    }

    public final void setEq_up_5(int i) {
        this.eq_up_5 = i;
    }

    public final int getEq_up_6() {
        return this.eq_up_6;
    }

    public final void setEq_up_6(int i) {
        this.eq_up_6 = i;
    }

    public final int getEq_up_7() {
        return this.eq_up_7;
    }

    public final void setEq_up_7(int i) {
        this.eq_up_7 = i;
    }

    public final int getEq_up_8() {
        return this.eq_up_8;
    }

    public final void setEq_up_8(int i) {
        this.eq_up_8 = i;
    }

    public final int getEq_up_9() {
        return this.eq_up_9;
    }

    public final void setEq_up_9(int i) {
        this.eq_up_9 = i;
    }

    public final int getEq_up_10() {
        return this.eq_up_10;
    }

    public final void setEq_up_10(int i) {
        this.eq_up_10 = i;
    }
}
