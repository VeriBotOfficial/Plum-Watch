package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class CoroutinesModule_DefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return defaultDispatcher();
    }

    public static CoroutinesModule_DefaultDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher defaultDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.defaultDispatcher());
    }

    private static final class InstanceHolder {
        private static final CoroutinesModule_DefaultDispatcherFactory INSTANCE = new CoroutinesModule_DefaultDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
