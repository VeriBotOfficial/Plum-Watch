package org.xmind.core.event;

/* loaded from: classes7.dex */
public interface ICoreEventSource {
    ICoreEventSupport getCoreEventSupport();

    ICoreEventRegistration registerCoreEventListener(String str, ICoreEventListener iCoreEventListener);
}
