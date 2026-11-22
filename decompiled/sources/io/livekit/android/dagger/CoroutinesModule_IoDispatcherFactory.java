package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class CoroutinesModule_IoDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return ioDispatcher();
    }

    public static CoroutinesModule_IoDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher ioDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.ioDispatcher());
    }

    private static final class InstanceHolder {
        private static final CoroutinesModule_IoDispatcherFactory INSTANCE = new CoroutinesModule_IoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
