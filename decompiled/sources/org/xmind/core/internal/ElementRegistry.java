package org.xmind.core.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.xmind.core.IIdentifiable;

/* loaded from: classes7.dex */
public class ElementRegistry {
    private Map<Object, Object> map = new HashMap();

    public Object getElement(Object obj) {
        return this.map.get(obj);
    }

    public Collection<Object> getRegisteredElements() {
        return this.map.values();
    }

    public void registerByKey(Object obj, Object obj2) {
        this.map.put(obj, obj2);
    }

    public void unregisterByKey(Object obj) {
        this.map.remove(obj);
    }

    public void register(IIdentifiable iIdentifiable) {
        if (iIdentifiable != null) {
            registerByKey(iIdentifiable.getId(), iIdentifiable);
        }
    }

    public void unregister(IIdentifiable iIdentifiable) {
        if (iIdentifiable != null) {
            unregisterByKey(iIdentifiable.getId());
        }
    }
}
