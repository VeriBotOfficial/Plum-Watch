package com.wakeup.commponent.module.device.headset;

import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadsetSettings.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetSettings;", "", "<init>", "()V", "keySettings", "Lcom/wakeup/commponent/module/device/headset/HeadsetKey;", "getKeySettings", "()Lcom/wakeup/commponent/module/device/headset/HeadsetKey;", "setKeySettings", "(Lcom/wakeup/commponent/module/device/headset/HeadsetKey;)V", "eqSettings", "Lcom/wakeup/commponent/module/device/headset/HeadsetEQ;", "getEqSettings", "()Lcom/wakeup/commponent/module/device/headset/HeadsetEQ;", "setEqSettings", "(Lcom/wakeup/commponent/module/device/headset/HeadsetEQ;)V", "anc", "", "getAnc", "()I", "setAnc", "(I)V", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeadsetSettings {
    public static final int ANC_MODEL_COM = 0;
    public static final int ANC_MODEL_NR = 1;
    public static final int ANC_MODEL_TRA = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int anc;
    private HeadsetKey keySettings = new HeadsetKey();
    private HeadsetEQ eqSettings = new HeadsetEQ();

    public final HeadsetKey getKeySettings() {
        return this.keySettings;
    }

    public final void setKeySettings(HeadsetKey headsetKey) {
        Intrinsics.checkNotNullParameter(headsetKey, "<set-?>");
        this.keySettings = headsetKey;
    }

    public final HeadsetEQ getEqSettings() {
        return this.eqSettings;
    }

    public final void setEqSettings(HeadsetEQ headsetEQ) {
        Intrinsics.checkNotNullParameter(headsetEQ, "<set-?>");
        this.eqSettings = headsetEQ;
    }

    public final int getAnc() {
        return this.anc;
    }

    public final void setAnc(int i) {
        this.anc = i;
    }

    /* compiled from: HeadsetSettings.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/device/headset/HeadsetSettings$Companion;", "", "<init>", "()V", "ANC_MODEL_COM", "", "ANC_MODEL_NR", "ANC_MODEL_TRA", "getAncDes", "", "kotlin.jvm.PlatformType", "key", "(I)Ljava/lang/String;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getAncDes(int key) {
            if (key == 0) {
                return StringUtils.getString(R.string.hs_anc_mode_0);
            }
            if (key == 1) {
                return StringUtils.getString(R.string.headphone_noise_reduction_mode);
            }
            if (key == 2) {
                return StringUtils.getString(R.string.headphone_transparency_mode);
            }
            return StringUtils.getString(R.string.hs_anc_mode_0);
        }
    }
}
