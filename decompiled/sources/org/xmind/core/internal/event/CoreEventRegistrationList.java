package org.xmind.core.internal.event;

import java.util.ArrayList;
import java.util.List;
import org.xmind.core.event.CoreEvent;
import org.xmind.core.event.ICoreEventRegistration;

/* loaded from: classes7.dex */
public class CoreEventRegistrationList {
    public static final int ALL = 3;
    public static final int ONLY_NORMAL = 2;
    public static final int ONLY_ONCE = 1;
    private int numOnceRegs = 0;
    private List<CoreEventRegistration> regs;

    public void add(CoreEventRegistration coreEventRegistration) {
        if (coreEventRegistration == null) {
            return;
        }
        if (this.regs == null) {
            this.regs = new ArrayList(4);
        }
        this.regs.add(coreEventRegistration);
        if (coreEventRegistration.isOnce()) {
            this.numOnceRegs++;
        }
    }

    public void remove(CoreEventRegistration coreEventRegistration) {
        List<CoreEventRegistration> list;
        if (coreEventRegistration == null || (list = this.regs) == null) {
            return;
        }
        boolean remove = list.remove(coreEventRegistration);
        if (coreEventRegistration.isOnce() && remove) {
            this.numOnceRegs--;
        }
        if (this.regs.isEmpty()) {
            this.regs = null;
        }
    }

    public boolean isEmpty() {
        List<CoreEventRegistration> list = this.regs;
        return list == null || list.isEmpty();
    }

    public void fireCoreEvent(CoreEvent coreEvent, int i) {
        List<CoreEventRegistration> list = this.regs;
        if (list == null) {
            return;
        }
        for (Object obj : list.toArray()) {
            CoreEventRegistration coreEventRegistration = (CoreEventRegistration) obj;
            if (i == 3 || ((i == 1 && coreEventRegistration.isOnce()) || (i == 2 && !coreEventRegistration.isOnce()))) {
                coreEventRegistration.getListener().handleCoreEvent(coreEvent);
                if (coreEventRegistration.isOnce()) {
                    coreEventRegistration.unregister();
                }
            }
        }
    }

    public boolean hasRegistration(ICoreEventRegistration iCoreEventRegistration) {
        List<CoreEventRegistration> list = this.regs;
        return list != null && list.contains(iCoreEventRegistration);
    }

    public boolean hasOnceRegistration() {
        return this.numOnceRegs > 0;
    }
}
