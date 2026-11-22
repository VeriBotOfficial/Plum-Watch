package org.xmind.core.internal.event;

import org.xmind.core.event.ICoreEventRegistration;

/* loaded from: classes7.dex */
public class NullCoreEventRegistration implements ICoreEventRegistration {
    private static final NullCoreEventRegistration instance = new NullCoreEventRegistration();
    private boolean valid = true;

    private NullCoreEventRegistration() {
    }

    @Override // org.xmind.core.event.ICoreEventRegistration
    public void unregister() {
        this.valid = false;
    }

    @Override // org.xmind.core.event.ICoreEventRegistration
    public boolean isValid() {
        return this.valid;
    }

    public static NullCoreEventRegistration getInstance() {
        return instance;
    }
}
