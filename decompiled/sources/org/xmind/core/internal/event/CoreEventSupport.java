package org.xmind.core.internal.event;

import java.util.HashMap;
import java.util.Map;
import org.xmind.core.event.CoreEvent;
import org.xmind.core.event.ICoreEventListener;
import org.xmind.core.event.ICoreEventRegistration;
import org.xmind.core.event.ICoreEventSource;
import org.xmind.core.event.ICoreEventSupport;

/* loaded from: classes7.dex */
public class CoreEventSupport implements ICoreEventSupport {
    private CoreEventManager globalManager;
    private Map<ICoreEventSource, CoreEventManager> managers;
    private ICoreEventSupport parent;

    private static class CoreEventManager {
        private Map<String, CoreEventRegistrationList> regs;

        private CoreEventManager() {
        }

        /* synthetic */ CoreEventManager(CoreEventManager coreEventManager) {
            this();
        }

        public void add(CoreEventRegistration coreEventRegistration) {
            this.regs = addListener(coreEventRegistration.getEventType(), coreEventRegistration, this.regs);
        }

        private Map<String, CoreEventRegistrationList> addListener(String str, CoreEventRegistration coreEventRegistration, Map<String, CoreEventRegistrationList> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            CoreEventRegistrationList coreEventRegistrationList = map.get(str);
            if (coreEventRegistrationList == null) {
                coreEventRegistrationList = new CoreEventRegistrationList();
                map.put(str, coreEventRegistrationList);
            }
            coreEventRegistrationList.add(coreEventRegistration);
            return map;
        }

        public void remove(CoreEventRegistration coreEventRegistration) {
            this.regs = removeListener(coreEventRegistration.getEventType(), coreEventRegistration, this.regs);
        }

        private Map<String, CoreEventRegistrationList> removeListener(String str, CoreEventRegistration coreEventRegistration, Map<String, CoreEventRegistrationList> map) {
            if (map != null) {
                CoreEventRegistrationList coreEventRegistrationList = map.get(str);
                if (coreEventRegistrationList != null) {
                    coreEventRegistrationList.remove(coreEventRegistration);
                    if (coreEventRegistrationList.isEmpty()) {
                        map.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
            }
            return map;
        }

        public boolean isEmpty() {
            Map<String, CoreEventRegistrationList> map = this.regs;
            return map == null || map.isEmpty();
        }

        public void dispatchCoreEvent(String str, CoreEvent coreEvent) {
            CoreEventRegistrationList coreEventRegistrationList;
            Map<String, CoreEventRegistrationList> map = this.regs;
            if (map == null || (coreEventRegistrationList = map.get(str)) == null) {
                return;
            }
            if (coreEventRegistrationList.hasOnceRegistration()) {
                coreEventRegistrationList.fireCoreEvent(coreEvent, 1);
            } else {
                coreEventRegistrationList.fireCoreEvent(coreEvent, 3);
            }
        }

        public void dispatchCoreEvent(String str, CoreEvent coreEvent, int i) {
            dispatchCoreEvent(str, coreEvent, i, this.regs);
        }

        private Map<String, CoreEventRegistrationList> dispatchCoreEvent(String str, CoreEvent coreEvent, int i, Map<String, CoreEventRegistrationList> map) {
            CoreEventRegistrationList coreEventRegistrationList;
            if (map != null && (coreEventRegistrationList = map.get(str)) != null) {
                coreEventRegistrationList.fireCoreEvent(coreEvent, i);
            }
            return map;
        }

        public boolean hasListeners(String str) {
            Map<String, CoreEventRegistrationList> map = this.regs;
            return map != null && map.containsKey(str);
        }

        public boolean hasOnceListeners(String str) {
            CoreEventRegistrationList coreEventRegistrationList;
            Map<String, CoreEventRegistrationList> map = this.regs;
            return (map == null || (coreEventRegistrationList = map.get(str)) == null || !coreEventRegistrationList.hasOnceRegistration()) ? false : true;
        }
    }

    public ICoreEventSupport getParent() {
        return this.parent;
    }

    public void setParent(ICoreEventSupport iCoreEventSupport) {
        this.parent = iCoreEventSupport;
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener) {
        return registerListener(iCoreEventSource, str, iCoreEventListener, false);
    }

    private ICoreEventRegistration registerListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener, boolean z) {
        CoreEventRegistration coreEventRegistration = new CoreEventRegistration(this, iCoreEventSource, str, iCoreEventListener, z);
        if (this.managers == null) {
            this.managers = new HashMap();
        }
        CoreEventManager coreEventManager = this.managers.get(iCoreEventSource);
        if (coreEventManager == null) {
            coreEventManager = new CoreEventManager(null);
            this.managers.put(iCoreEventSource, coreEventManager);
        }
        coreEventManager.add(coreEventRegistration);
        return coreEventRegistration;
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerGlobalListener(String str, ICoreEventListener iCoreEventListener) {
        return registerGlobalListener(str, iCoreEventListener, false);
    }

    private ICoreEventRegistration registerGlobalListener(String str, ICoreEventListener iCoreEventListener, boolean z) {
        CoreEventRegistration coreEventRegistration = new CoreEventRegistration(this, null, str, iCoreEventListener, z);
        if (this.globalManager == null) {
            this.globalManager = new CoreEventManager(null);
        }
        this.globalManager.add(coreEventRegistration);
        return coreEventRegistration;
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerOnceCoreEventListener(ICoreEventSource iCoreEventSource, String str, ICoreEventListener iCoreEventListener) {
        ICoreEventRegistration registerListener = registerListener(iCoreEventSource, str, iCoreEventListener, true);
        dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, (Object) null, iCoreEventListener), false);
        return registerListener;
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public ICoreEventRegistration registerOnceGlobalListener(String str, ICoreEventListener iCoreEventListener) {
        ICoreEventRegistration registerGlobalListener = registerGlobalListener(str, iCoreEventListener, true);
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        if (map != null) {
            for (Map.Entry<ICoreEventSource, CoreEventManager> entry : map.entrySet()) {
                if (entry.getValue().hasListeners(str)) {
                    ICoreEventSource key = entry.getKey();
                    dispatch(key, str, new CoreEvent(key, str, iCoreEventListener), false);
                }
            }
        }
        return registerGlobalListener;
    }

    protected void unregister(CoreEventRegistration coreEventRegistration) {
        CoreEventManager coreEventManager;
        ICoreEventSource source = coreEventRegistration.getSource();
        if (source == null) {
            unregisterGlobalRegistration(coreEventRegistration);
            return;
        }
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        if (map == null || map.isEmpty() || (coreEventManager = this.managers.get(source)) == null) {
            return;
        }
        coreEventManager.remove(coreEventRegistration);
        if (coreEventManager.isEmpty()) {
            this.managers.remove(source);
        }
        if (this.managers.isEmpty()) {
            this.managers = null;
        }
        if (coreEventRegistration.isOnce()) {
            String eventType = coreEventRegistration.getEventType();
            dispatch(source, eventType, new CoreEvent(source, eventType, coreEventRegistration.getListener(), (Object) null), false);
        }
    }

    private void unregisterGlobalRegistration(CoreEventRegistration coreEventRegistration) {
        CoreEventManager coreEventManager = this.globalManager;
        if (coreEventManager != null) {
            coreEventManager.remove(coreEventRegistration);
        }
        if (this.globalManager.isEmpty()) {
            this.globalManager = null;
        }
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, obj, obj2), true);
            }
        }
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchIndexedValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, int i) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, obj, obj2, i), true);
            }
        }
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchIndexedTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj, int i) {
        dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, obj, i), true);
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchTargetChange(ICoreEventSource iCoreEventSource, String str, Object obj) {
        dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, obj), true);
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatchTargetValueChange(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, Object obj3) {
        dispatch(iCoreEventSource, str, new CoreEvent(iCoreEventSource, str, obj, obj2, obj3), true);
    }

    @Override // org.xmind.core.event.ICoreEventSupport
    public void dispatch(ICoreEventSource iCoreEventSource, CoreEvent coreEvent) {
        dispatch(iCoreEventSource, coreEvent.getType(), coreEvent, true);
    }

    private void dispatch(ICoreEventSource iCoreEventSource, String str, CoreEvent coreEvent, boolean z) {
        dispatchBySource(iCoreEventSource, str, coreEvent, z);
        dispatchGlobal(str, coreEvent, z);
    }

    private void dispatchBySource(ICoreEventSource iCoreEventSource, String str, CoreEvent coreEvent, boolean z) {
        CoreEventManager coreEventManager;
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        if (map == null || map.isEmpty() || (coreEventManager = this.managers.get(iCoreEventSource)) == null || coreEventManager.isEmpty()) {
            return;
        }
        if (z) {
            coreEventManager.dispatchCoreEvent(str, coreEvent);
        } else {
            coreEventManager.dispatchCoreEvent(str, coreEvent, 2);
        }
    }

    private void dispatchGlobal(String str, CoreEvent coreEvent, boolean z) {
        CoreEventManager coreEventManager = this.globalManager;
        if (coreEventManager != null) {
            if (z) {
                coreEventManager.dispatchCoreEvent(str, coreEvent);
            } else {
                coreEventManager.dispatchCoreEvent(str, coreEvent, 2);
            }
        }
        if (getParent() == null || !(getParent() instanceof CoreEventSupport)) {
            return;
        }
        ((CoreEventSupport) getParent()).dispatchGlobal(str, coreEvent, z);
    }

    public void dispose() {
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        if (map != null) {
            map.clear();
            this.managers = null;
        }
    }

    public boolean hasListeners(ICoreEventSource iCoreEventSource, String str) {
        CoreEventManager coreEventManager;
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        return (map == null || (coreEventManager = map.get(iCoreEventSource)) == null || !coreEventManager.hasListeners(str)) ? false : true;
    }

    public boolean hasOnceListeners(ICoreEventSource iCoreEventSource, String str) {
        CoreEventManager coreEventManager;
        Map<ICoreEventSource, CoreEventManager> map = this.managers;
        return (map == null || (coreEventManager = map.get(iCoreEventSource)) == null || !coreEventManager.hasOnceListeners(str)) ? false : true;
    }
}
