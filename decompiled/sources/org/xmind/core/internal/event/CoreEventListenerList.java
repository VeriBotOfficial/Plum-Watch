package org.xmind.core.internal.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xmind.core.event.CoreEvent;
import org.xmind.core.event.ICoreEventListener;

/* loaded from: classes7.dex */
public class CoreEventListenerList {
    private List<ICoreEventListener> listeners;

    public CoreEventListenerList(ICoreEventListener iCoreEventListener) {
        ArrayList arrayList = new ArrayList(4);
        this.listeners = arrayList;
        arrayList.add(iCoreEventListener);
    }

    public CoreEventListenerList(ICoreEventListener[] iCoreEventListenerArr) {
        ArrayList arrayList = new ArrayList(iCoreEventListenerArr.length);
        this.listeners = arrayList;
        arrayList.addAll(Arrays.asList(iCoreEventListenerArr));
    }

    public void add(ICoreEventListener iCoreEventListener) {
        if (iCoreEventListener == null) {
            return;
        }
        if (this.listeners == null) {
            this.listeners = new ArrayList(4);
        }
        this.listeners.add(iCoreEventListener);
    }

    public void remove(ICoreEventListener iCoreEventListener) {
        List<ICoreEventListener> list;
        if (iCoreEventListener == null || (list = this.listeners) == null) {
            return;
        }
        list.remove(iCoreEventListener);
    }

    public boolean isEmpty() {
        List<ICoreEventListener> list = this.listeners;
        return list == null || list.isEmpty();
    }

    public void fireCoreEvent(CoreEvent coreEvent) {
        List<ICoreEventListener> list = this.listeners;
        if (list == null) {
            return;
        }
        for (Object obj : list.toArray()) {
            ((ICoreEventListener) obj).handleCoreEvent(coreEvent);
        }
    }

    public boolean hasListener(ICoreEventListener iCoreEventListener) {
        List<ICoreEventListener> list = this.listeners;
        return list != null && list.contains(iCoreEventListener);
    }
}
