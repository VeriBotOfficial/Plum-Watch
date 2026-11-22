package org.xmind.core.event;

import org.xmind.core.IAdaptable;
import org.xmind.core.internal.event.NullCoreEventRegistration;

/* loaded from: classes7.dex */
public class CoreEventRegister extends CoreEventRegisterBase {
    private ICoreEventListener listener;
    private ICoreEventSource source;
    private ICoreEventSupport support;

    public CoreEventRegister() {
    }

    public CoreEventRegister(ICoreEventSource iCoreEventSource) {
        this.source = iCoreEventSource;
        this.support = null;
        this.listener = null;
    }

    public CoreEventRegister(ICoreEventSupport iCoreEventSupport) {
        this.support = iCoreEventSupport;
        this.source = null;
        this.listener = null;
    }

    public CoreEventRegister(ICoreEventListener iCoreEventListener) {
        this.source = null;
        this.support = null;
        this.listener = iCoreEventListener;
    }

    public CoreEventRegister(ICoreEventSource iCoreEventSource, ICoreEventListener iCoreEventListener) {
        this.source = iCoreEventSource;
        this.support = null;
        this.listener = iCoreEventListener;
    }

    public CoreEventRegister(ICoreEventSupport iCoreEventSupport, ICoreEventListener iCoreEventListener) {
        this.source = null;
        this.support = iCoreEventSupport;
        this.listener = iCoreEventListener;
    }

    public CoreEventRegister(Object obj, ICoreEventListener iCoreEventListener) {
        ICoreEventSource iCoreEventSource = (ICoreEventSource) getAdapter(obj, ICoreEventSource.class);
        this.source = iCoreEventSource;
        if (iCoreEventSource == null) {
            this.support = (ICoreEventSupport) getAdapter(obj, ICoreEventSupport.class);
        } else {
            this.support = null;
        }
        this.listener = iCoreEventListener;
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public ICoreEventRegistration register(String str) {
        ICoreEventListener iCoreEventListener = this.listener;
        if (iCoreEventListener == null) {
            return NullCoreEventRegistration.getInstance();
        }
        ICoreEventSource iCoreEventSource = this.source;
        if (iCoreEventSource != null) {
            ICoreEventRegistration registerCoreEventListener = iCoreEventSource.registerCoreEventListener(str, iCoreEventListener);
            addRegistration(registerCoreEventListener);
            return registerCoreEventListener;
        }
        ICoreEventSupport iCoreEventSupport = this.support;
        if (iCoreEventSupport != null) {
            ICoreEventRegistration registerGlobalListener = iCoreEventSupport.registerGlobalListener(str, iCoreEventListener);
            addRegistration(registerGlobalListener);
            return registerGlobalListener;
        }
        return NullCoreEventRegistration.getInstance();
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public void setNextListener(ICoreEventListener iCoreEventListener) {
        this.listener = iCoreEventListener;
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public void setNextSource(ICoreEventSource iCoreEventSource) {
        this.source = iCoreEventSource;
        this.support = null;
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public void setNextSupport(ICoreEventSupport iCoreEventSupport) {
        this.source = null;
        this.support = iCoreEventSupport;
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public void setNextSourceFrom(Object obj) {
        ICoreEventSource iCoreEventSource = (ICoreEventSource) getAdapter(obj, ICoreEventSource.class);
        this.source = iCoreEventSource;
        if (iCoreEventSource == null) {
            this.support = (ICoreEventSupport) getAdapter(obj, ICoreEventSupport.class);
        } else {
            this.support = null;
        }
    }

    private static Object getAdapter(Object obj, Class<?> cls) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (IAdaptable.class.isInstance(obj)) {
            return ((IAdaptable) obj).getAdapter(cls);
        }
        return null;
    }
}
