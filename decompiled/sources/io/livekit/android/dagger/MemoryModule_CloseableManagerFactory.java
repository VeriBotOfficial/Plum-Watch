package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.memory.CloseableManager;

/* loaded from: classes6.dex */
public final class MemoryModule_CloseableManagerFactory implements Factory<CloseableManager> {
    @Override // javax.inject.Provider
    public CloseableManager get() {
        return closeableManager();
    }

    public static MemoryModule_CloseableManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CloseableManager closeableManager() {
        return (CloseableManager) Preconditions.checkNotNullFromProvides(MemoryModule.INSTANCE.closeableManager());
    }

    private static final class InstanceHolder {
        private static final MemoryModule_CloseableManagerFactory INSTANCE = new MemoryModule_CloseableManagerFactory();

        private InstanceHolder() {
        }
    }
}
