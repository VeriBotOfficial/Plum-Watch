package com.wakeup.commonui.utils;

import kotlin.Metadata;
import kotlin.random.Random;

/* compiled from: RandomIndexManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/commonui/utils/RandomIndexManager;", "", "<init>", "()V", "showPosition", "", "randomMaxNumber", "setRandomMaxNumber", "", "number", "setShowPosition", "position", "getShowPosition", "getRandomMaxNumber", "getRandomShowPosition", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RandomIndexManager {
    private volatile int randomMaxNumber;
    private volatile int showPosition = -1;

    public final void setRandomMaxNumber(int number) {
        this.randomMaxNumber = number;
    }

    public final void setShowPosition(int position) {
        this.showPosition = position;
    }

    public final int getShowPosition() {
        return this.showPosition;
    }

    public final int getRandomMaxNumber() {
        return this.randomMaxNumber;
    }

    public final int getRandomShowPosition() {
        int nextInt;
        if (this.randomMaxNumber < 0) {
            return -1;
        }
        if (this.showPosition + 1 < this.randomMaxNumber) {
            nextInt = Random.INSTANCE.nextInt(this.showPosition + 1, this.randomMaxNumber);
        } else {
            nextInt = this.showPosition > 0 ? Random.INSTANCE.nextInt(0, this.showPosition) : 0;
        }
        this.showPosition = nextInt;
        return this.showPosition;
    }
}
