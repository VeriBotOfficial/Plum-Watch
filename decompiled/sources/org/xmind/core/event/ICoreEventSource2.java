package org.xmind.core.event;

/* loaded from: classes7.dex */
public interface ICoreEventSource2 {
    boolean hasOnceListeners(String str);

    ICoreEventRegistration registerOnceCoreEventListener(String str, ICoreEventListener iCoreEventListener);
}
