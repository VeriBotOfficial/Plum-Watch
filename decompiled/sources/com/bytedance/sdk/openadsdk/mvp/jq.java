package com.bytedance.sdk.openadsdk.mvp;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes14.dex */
public class jq {
    private final AudioManager fxn;
    private int kg = -1;
    private boolean gff = false;

    public jq(Context context) {
        this.fxn = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int fxn() {
        return this.kg;
    }

    public void fxn(boolean z) {
        fxn(z, false);
    }

    public void fxn(boolean z, boolean z2) {
        if (this.fxn == null) {
            return;
        }
        int i = 0;
        if (z) {
            int sg2 = DeviceUtils.sg();
            if (sg2 != 0) {
                this.kg = sg2;
            } else if (!z2) {
                return;
            }
            fxn(3, 0, 0);
            this.gff = true;
            return;
        }
        int i2 = this.kg;
        if (i2 == 0) {
            i2 = DeviceUtils.jq() / 15;
        } else {
            if (i2 == -1) {
                if (!z2) {
                    return;
                } else {
                    i2 = DeviceUtils.jq() / 15;
                }
            }
            this.kg = -1;
            fxn(3, i2, i);
            this.gff = true;
        }
        i = 1;
        this.kg = -1;
        fxn(3, i2, i);
        this.gff = true;
    }

    private void fxn(int i, int i2, int i3) {
        try {
            this.fxn.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
