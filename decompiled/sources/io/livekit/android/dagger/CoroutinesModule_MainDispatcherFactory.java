package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes6.dex */
public final class CoroutinesModule_MainDispatcherFactory implements Factory<MainCoroutineDispatcher> {
    @Override // javax.inject.Provider
    public MainCoroutineDispatcher get() {
        return mainDispatcher();
    }

    public static CoroutinesModule_MainDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainCoroutineDispatcher mainDispatcher() {
        return (MainCoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.mainDispatcher());
    }

    private static final class InstanceHolder {
        private static final CoroutinesModule_MainDispatcherFactory INSTANCE = new CoroutinesModule_MainDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
