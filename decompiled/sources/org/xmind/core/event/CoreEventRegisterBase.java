package org.xmind.core.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class CoreEventRegisterBase implements ICoreEventRegister {
    private List<ICoreEventRegistration> regs = null;

    protected void addRegistration(ICoreEventRegistration iCoreEventRegistration) {
        if (iCoreEventRegistration == null) {
            return;
        }
        if (this.regs == null) {
            this.regs = new ArrayList();
        }
        this.regs.add(iCoreEventRegistration);
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public void unregisterAll() {
        List<ICoreEventRegistration> list = this.regs;
        if (list != null) {
            Iterator<ICoreEventRegistration> it = list.iterator();
            while (it.hasNext()) {
                it.next().unregister();
            }
            this.regs = null;
        }
    }

    @Override // org.xmind.core.event.ICoreEventRegister
    public boolean hasRegistration() {
        List<ICoreEventRegistration> list = this.regs;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
