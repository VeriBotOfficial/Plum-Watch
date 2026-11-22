package org.xmind.core.event;

/* loaded from: classes7.dex */
public interface ICoreEventRegister {
    boolean hasRegistration();

    ICoreEventRegistration register(String str);

    void setNextListener(ICoreEventListener iCoreEventListener);

    void setNextSource(ICoreEventSource iCoreEventSource);

    void setNextSourceFrom(Object obj);

    void setNextSupport(ICoreEventSupport iCoreEventSupport);

    void unregisterAll();
}
