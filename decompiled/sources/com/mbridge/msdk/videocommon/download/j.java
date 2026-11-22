package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardVideoRefactorManager.java */
/* loaded from: classes17.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f12645a;
    private AtomicBoolean b;

    /* compiled from: RewardVideoRefactorManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final j f12646a = new j();
    }

    public static j a() {
        return b.f12646a;
    }

    public boolean b(int i) {
        if (MBridgeConstans.DEBUG) {
            o0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f12645a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f12645a = new AtomicBoolean(q0.a().a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.f12645a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f12645a.get();
    }

    private j() {
    }

    public boolean a(int i) {
        if (MBridgeConstans.DEBUG) {
            o0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(q0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.b.get();
    }
}
