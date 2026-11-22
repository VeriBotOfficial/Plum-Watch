package org.xmind.core.internal.event;

import org.xmind.core.event.ICoreEventListener;
import org.xmind.core.event.ICoreEventRegistration;
import org.xmind.core.event.ICoreEventSource;

/* loaded from: classes7.dex */
public class CoreEventRegistration implements ICoreEventRegistration {
    private CoreEventSupport dispatcher;
    private String eventType;
    private ICoreEventListener listener;
    private boolean once;
    private ICoreEventSource source;
    private boolean valid;

    public CoreEventRegistration(CoreEventSupport coreEventSupport, ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener) {
        this(coreEventSupport, iCoreEventSource, str, iCoreEventListener, false);
    }

    public CoreEventRegistration(CoreEventSupport coreEventSupport, ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener, boolean z) {
        this.valid = true;
        this.dispatcher = coreEventSupport;
        this.source = iCoreEventSource;
        this.eventType = str;
        this.listener = iCoreEventListener;
        this.once = z;
    }

    public ICoreEventSource getSource() {
        return this.source;
    }

    public String getEventType() {
        return this.eventType;
    }

    public ICoreEventListener getListener() {
        return this.listener;
    }

    public boolean isOnce() {
        return this.once;
    }

    @Override // org.xmind.core.event.ICoreEventRegistration
    public boolean isValid() {
        return this.valid;
    }

    @Override // org.xmind.core.event.ICoreEventRegistration
    public void unregister() {
        this.dispatcher.unregister(this);
        this.valid = false;
    }
}
