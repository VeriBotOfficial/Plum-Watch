package io.livekit.android.dagger;

import dagger.Module;
import dagger.Provides;
import io.livekit.android.memory.CloseableManager;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: MemoryModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lio/livekit/android/dagger/MemoryModule;", "", "()V", "closeableManager", "Lio/livekit/android/memory/CloseableManager;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class MemoryModule {
    public static final MemoryModule INSTANCE = new MemoryModule();

    private MemoryModule() {
    }

    @Provides
    @Singleton
    public final CloseableManager closeableManager() {
        return new CloseableManager();
    }
}
