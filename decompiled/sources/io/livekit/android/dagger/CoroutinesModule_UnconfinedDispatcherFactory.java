package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class CoroutinesModule_UnconfinedDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return unconfinedDispatcher();
    }

    public static CoroutinesModule_UnconfinedDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher unconfinedDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.unconfinedDispatcher());
    }

    private static final class InstanceHolder {
        private static final CoroutinesModule_UnconfinedDispatcherFactory INSTANCE = new CoroutinesModule_UnconfinedDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
