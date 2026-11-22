package io.livekit.android.room;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class DefaultsManager_Factory implements Factory<DefaultsManager> {
    @Override // javax.inject.Provider
    public DefaultsManager get() {
        return newInstance();
    }

    public static DefaultsManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultsManager newInstance() {
        return new DefaultsManager();
    }

    private static final class InstanceHolder {
        private static final DefaultsManager_Factory INSTANCE = new DefaultsManager_Factory();

        private InstanceHolder() {
        }
    }
}
