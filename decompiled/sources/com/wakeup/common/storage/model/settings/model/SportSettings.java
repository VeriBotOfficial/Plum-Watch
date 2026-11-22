package com.wakeup.common.storage.model.settings.model;

import kotlin.Metadata;

/* compiled from: SportSettings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/SportSettings;", "", "<init>", "()V", "autoPauseSwitch", "", "getAutoPauseSwitch", "()Z", "setAutoPauseSwitch", "(Z)V", "startRemindSwitch", "getStartRemindSwitch", "setStartRemindSwitch", "endRemindSwitch", "getEndRemindSwitch", "setEndRemindSwitch", "keyPauseSwitch", "getKeyPauseSwitch", "setKeyPauseSwitch", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportSettings {
    private boolean keyPauseSwitch;
    private boolean autoPauseSwitch = true;
    private boolean startRemindSwitch = true;
    private boolean endRemindSwitch = true;

    public final boolean getAutoPauseSwitch() {
        return this.autoPauseSwitch;
    }

    public final void setAutoPauseSwitch(boolean z) {
        this.autoPauseSwitch = z;
    }

    public final boolean getStartRemindSwitch() {
        return this.startRemindSwitch;
    }

    public final void setStartRemindSwitch(boolean z) {
        this.startRemindSwitch = z;
    }

    public final boolean getEndRemindSwitch() {
        return this.endRemindSwitch;
    }

    public final void setEndRemindSwitch(boolean z) {
        this.endRemindSwitch = z;
    }

    public final boolean getKeyPauseSwitch() {
        return this.keyPauseSwitch;
    }

    public final void setKeyPauseSwitch(boolean z) {
        this.keyPauseSwitch = z;
    }
}
