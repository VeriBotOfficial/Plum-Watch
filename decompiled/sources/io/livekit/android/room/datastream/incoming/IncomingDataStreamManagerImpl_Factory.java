package io.livekit.android.room.datastream.incoming;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class IncomingDataStreamManagerImpl_Factory implements Factory<IncomingDataStreamManagerImpl> {
    @Override // javax.inject.Provider
    public IncomingDataStreamManagerImpl get() {
        return newInstance();
    }

    public static IncomingDataStreamManagerImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IncomingDataStreamManagerImpl newInstance() {
        return new IncomingDataStreamManagerImpl();
    }

    private static final class InstanceHolder {
        private static final IncomingDataStreamManagerImpl_Factory INSTANCE = new IncomingDataStreamManagerImpl_Factory();

        private InstanceHolder() {
        }
    }
}
