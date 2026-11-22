package org.xmind.core.internal.event;

import org.xmind.core.event.CoreEvent;
import org.xmind.core.event.ICoreEventListener;
import org.xmind.core.event.ICoreEventRegistration;
import org.xmind.core.event.ICoreEventSource;
import org.xmind.core.event.ICoreEventSupport;

/* loaded from: classes7.dex */
public class NullCoreEventSupport implements ICoreEventSupport {
    private static final NullCoreEventSupport instance = new NullCoreEventSupport();

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatch(ICoreEventSource iCoreEventSource, CoreEvent coreEvent) {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchIndexedTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj, int i) {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchIndexedValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, int i) {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj) {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchTargetValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, Object obj3) {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2) {
    }

    public boolean hasListeners(ICoreEventSource iCoreEventSource, String str) {
        return false;
    }

    public boolean hasOnceListeners(ICoreEventSource iCoreEventSource, String str) {
        return false;
    }

    private NullCoreEventSupport() {
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener) {
        return NullCoreEventRegistration.getInstance();
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerGlobalListener(String str, ICoreEventListener iCoreEventListener) {
        return NullCoreEventRegistration.getInstance();
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerOnceCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener) {
        return NullCoreEventRegistration.getInstance();
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerOnceGlobalListener(String str, ICoreEventListener iCoreEventListener) {
        return NullCoreEventRegistration.getInstance();
    }

    public static NullCoreEventSupport getInstance() {
        return instance;
    }
}
