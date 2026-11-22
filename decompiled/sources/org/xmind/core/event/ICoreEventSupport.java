package org.xmind.core.event;

/* loaded from: classes7.dex */
public interface ICoreEventSupport {
    void dispatch(ICoreEventSource iCoreEventSource, CoreEvent coreEvent);

    void dispatchIndexedTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj, int i);

    void dispatchIndexedValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, int i);

    void dispatchTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj);

    void dispatchTargetValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, Object obj3);

    void dispatchValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2);

    ICoreEventRegistration registerCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener);

    ICoreEventRegistration registerGlobalListener(String str, ICoreEventListener iCoreEventListener);

    ICoreEventRegistration registerOnceCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener);

    ICoreEventRegistration registerOnceGlobalListener(String str, ICoreEventListener iCoreEventListener);
}
