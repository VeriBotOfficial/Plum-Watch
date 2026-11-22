package io.livekit.android.audio;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class NoopCommunicationWorkaround_Factory implements Factory<NoopCommunicationWorkaround> {
    @Override // javax.inject.Provider
    public NoopCommunicationWorkaround get() {
        return newInstance();
    }

    public static NoopCommunicationWorkaround_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NoopCommunicationWorkaround newInstance() {
        return new NoopCommunicationWorkaround();
    }

    private static final class InstanceHolder {
        private static final NoopCommunicationWorkaround_Factory INSTANCE = new NoopCommunicationWorkaround_Factory();

        private InstanceHolder() {
        }
    }
}
