package io.livekit.android.audio;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class NoAudioHandler_Factory implements Factory<NoAudioHandler> {
    @Override // javax.inject.Provider
    public NoAudioHandler get() {
        return newInstance();
    }

    public static NoAudioHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NoAudioHandler newInstance() {
        return new NoAudioHandler();
    }

    private static final class InstanceHolder {
        private static final NoAudioHandler_Factory INSTANCE = new NoAudioHandler_Factory();

        private InstanceHolder() {
        }
    }
}
