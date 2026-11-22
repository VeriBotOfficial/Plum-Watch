package com.wakeup.commponent.module.device.headset;

import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HeadsetKey.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetKey;", "", "<init>", "()V", "leftOneKey", "", "getLeftOneKey", "()I", "setLeftOneKey", "(I)V", "leftDoubleKey", "getLeftDoubleKey", "setLeftDoubleKey", "leftThreeKey", "getLeftThreeKey", "setLeftThreeKey", "leftLongKey", "getLeftLongKey", "setLeftLongKey", "rightOneKey", "getRightOneKey", "setRightOneKey", "rightDoubleKey", "getRightDoubleKey", "setRightDoubleKey", "rightThreeKey", "getRightThreeKey", "setRightThreeKey", "rightLongKey", "getRightLongKey", "setRightLongKey", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeadsetKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int FUNCTION_ID_ANC = 9;
    public static final int FUNCTION_ID_ASSISTANT = 2;
    public static final int FUNCTION_ID_CALLBACK = 1;
    public static final int FUNCTION_ID_GAME_MODEL = 8;
    public static final int FUNCTION_ID_NEXT_MUSIC = 4;
    public static final int FUNCTION_ID_NOT = 0;
    public static final int FUNCTION_ID_PAUSE = 7;
    public static final int FUNCTION_ID_PRE_MUSIC = 3;
    public static final int FUNCTION_ID_VOLUME_DOWN = 6;
    public static final int FUNCTION_ID_VOLUME_UP = 5;
    public static final int KEY_TYPE_DOUBLE_KEY = 2;
    public static final int KEY_TYPE_LONG_KEY = 4;
    public static final int KEY_TYPE_ONE_KEY = 1;
    public static final int KEY_TYPE_THREE_KEY = 3;
    private int leftDoubleKey;
    private int leftLongKey;
    private int leftOneKey;
    private int leftThreeKey;
    private int rightDoubleKey;
    private int rightLongKey;
    private int rightOneKey;
    private int rightThreeKey;

    public final int getLeftOneKey() {
        return this.leftOneKey;
    }

    public final void setLeftOneKey(int i) {
        this.leftOneKey = i;
    }

    public final int getLeftDoubleKey() {
        return this.leftDoubleKey;
    }

    public final void setLeftDoubleKey(int i) {
        this.leftDoubleKey = i;
    }

    public final int getLeftThreeKey() {
        return this.leftThreeKey;
    }

    public final void setLeftThreeKey(int i) {
        this.leftThreeKey = i;
    }

    public final int getLeftLongKey() {
        return this.leftLongKey;
    }

    public final void setLeftLongKey(int i) {
        this.leftLongKey = i;
    }

    public final int getRightOneKey() {
        return this.rightOneKey;
    }

    public final void setRightOneKey(int i) {
        this.rightOneKey = i;
    }

    public final int getRightDoubleKey() {
        return this.rightDoubleKey;
    }

    public final void setRightDoubleKey(int i) {
        this.rightDoubleKey = i;
    }

    public final int getRightThreeKey() {
        return this.rightThreeKey;
    }

    public final void setRightThreeKey(int i) {
        this.rightThreeKey = i;
    }

    public final int getRightLongKey() {
        return this.rightLongKey;
    }

    public final void setRightLongKey(int i) {
        this.rightLongKey = i;
    }

    /* compiled from: HeadsetKey.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetKey$Companion;", "", "<init>", "()V", "KEY_TYPE_ONE_KEY", "", "KEY_TYPE_DOUBLE_KEY", "KEY_TYPE_THREE_KEY", "KEY_TYPE_LONG_KEY", "FUNCTION_ID_NOT", "FUNCTION_ID_CALLBACK", "FUNCTION_ID_ASSISTANT", "FUNCTION_ID_PRE_MUSIC", "FUNCTION_ID_NEXT_MUSIC", "FUNCTION_ID_VOLUME_UP", "FUNCTION_ID_VOLUME_DOWN", "FUNCTION_ID_PAUSE", "FUNCTION_ID_GAME_MODEL", "FUNCTION_ID_ANC", "getKeyDes", "", "kotlin.jvm.PlatformType", "key", "(I)Ljava/lang/String;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getKeyDes(int key) {
            switch (key) {
                case 0:
                    return StringUtils.getString(R.string.headphone_no_effect);
                case 1:
                    return StringUtils.getString(R.string.headphone_call_back);
                case 2:
                    return StringUtils.getString(R.string.headphone_voice_assistant);
                case 3:
                    return StringUtils.getString(R.string.headphone_previous_piece);
                case 4:
                    return StringUtils.getString(R.string.headphone_next_track);
                case 5:
                    return StringUtils.getString(R.string.hs_control_volume_up);
                case 6:
                    return StringUtils.getString(R.string.hs_control_volume_down);
                case 7:
                    return StringUtils.getString(R.string.hs_control_play_pause);
                case 8:
                    return StringUtils.getString(R.string.headphone_game_mode);
                case 9:
                    return "ANC模式切换";
                default:
                    return StringUtils.getString(R.string.headphone_no_effect);
            }
        }
    }
}
