package io.livekit.android.dagger;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: CoroutinesModule.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lio/livekit/android/dagger/CoroutinesModule;", "", "()V", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "mainDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "unconfinedDispatcher", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class CoroutinesModule {
    public static final CoroutinesModule INSTANCE = new CoroutinesModule();

    private CoroutinesModule() {
    }

    @Provides
    @Named(InjectionNames.DISPATCHER_DEFAULT)
    public final CoroutineDispatcher defaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Provides
    @Named(InjectionNames.DISPATCHER_IO)
    public final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    @Named(InjectionNames.DISPATCHER_MAIN)
    public final MainCoroutineDispatcher mainDispatcher() {
        return Dispatchers.getMain();
    }

    @Provides
    @Named(InjectionNames.DISPATCHER_UNCONFINED)
    public final CoroutineDispatcher unconfinedDispatcher() {
        return Dispatchers.getUnconfined();
    }
}
