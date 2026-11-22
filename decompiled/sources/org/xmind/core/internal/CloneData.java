package org.xmind.core.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmind.core.ICloneData;

/* loaded from: classes7.dex */
public class CloneData implements ICloneData {
    private ICloneData parent;
    private Collection<Object> sources;
    private Map<Object, Object> clonedElements = new HashMap();
    private Map<Object, List<ICloneDataListener>> listeners = new HashMap();
    private Map<Object, Object> caches = new HashMap();

    private static class CategorizedString {
        private String category;
        private String source;

        public CategorizedString(String str, String str2) {
            this.category = str;
            this.source = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && (obj instanceof CategorizedString)) {
                CategorizedString categorizedString = (CategorizedString) obj;
                if (this.category.equals(categorizedString.category) && this.source.equals(categorizedString.source)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.category.hashCode() ^ this.source.hashCode();
        }
    }

    public CloneData(Collection<? extends Object> collection, ICloneData iCloneData) {
        this.sources = new ArrayList(collection);
        this.parent = iCloneData;
    }

    @Override // org.xmind.core.ICloneData
    public String getString(String str, String str2) {
        return (String) get(new CategorizedString(str, str2));
    }

    @Override // org.xmind.core.ICloneData
    public void putString(String str, String str2, String str3) {
        CategorizedString categorizedString = new CategorizedString(str, str2);
        doPut(categorizedString, str3);
        fireStringCloned(categorizedString, str, str2, str3);
    }

    @Override // org.xmind.core.ICloneData
    public Object get(Object obj) {
        ICloneData iCloneData;
        Object obj2 = this.clonedElements.isEmpty() ? null : this.clonedElements.get(obj);
        return (obj2 != null || (iCloneData = this.parent) == null) ? obj2 : iCloneData.get(obj);
    }

    @Override // org.xmind.core.ICloneData
    public boolean hasCloned() {
        if (!this.clonedElements.isEmpty()) {
            Iterator<Object> it = this.clonedElements.values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    return true;
                }
            }
        }
        ICloneData iCloneData = this.parent;
        if (iCloneData != null) {
            return iCloneData.hasCloned();
        }
        return false;
    }

    @Override // org.xmind.core.ICloneData
    public Collection<Object> getCloneds() {
        ArrayList arrayList = new ArrayList(this.sources.size());
        Iterator<Object> it = this.sources.iterator();
        while (it.hasNext()) {
            Object obj = get(it.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // org.xmind.core.ICloneData
    public Collection<Object> getSources() {
        return this.sources;
    }

    public ICloneData getParent() {
        return this.parent;
    }

    @Override // org.xmind.core.ICloneData
    public void put(Object obj, Object obj2) {
        doPut(obj, obj2);
        fireObjectCloned(obj, obj2);
    }

    protected void doPut(Object obj, Object obj2) {
        this.clonedElements.put(obj, obj2);
        ICloneData iCloneData = this.parent;
        if (iCloneData != null) {
            iCloneData.put(obj, obj2);
        }
    }

    public void cache(Object obj, Object obj2) {
        this.caches.put(obj, obj2);
    }

    public Object getCache(Object obj) {
        if (this.caches.isEmpty()) {
            return null;
        }
        return this.caches.get(obj);
    }

    private void fireObjectCloned(Object obj, Object obj2) {
        if (this.listeners.isEmpty()) {
            return;
        }
        List<ICloneDataListener> list = this.listeners.get(obj);
        if (list == null || list.isEmpty()) {
            this.listeners.remove(obj);
            return;
        }
        for (Object obj3 : list.toArray()) {
            ((ICloneDataListener) obj3).objectCloned(obj, obj2);
        }
    }

    private void fireStringCloned(Object obj, String str, String str2, String str3) {
        if (this.listeners.isEmpty()) {
            return;
        }
        List<ICloneDataListener> list = this.listeners.get(obj);
        if (list == null || list.isEmpty()) {
            this.listeners.remove(obj);
            return;
        }
        for (Object obj2 : list.toArray()) {
            ((ICloneDataListener) obj2).stringCloned(str, str2, str3);
        }
    }

    public void addCloneDataListener(Object obj, ICloneDataListener iCloneDataListener) {
        List<ICloneDataListener> list = this.listeners.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.listeners.put(obj, list);
        }
        list.add(iCloneDataListener);
    }

    public void removeCloneDataListener(Object obj, ICloneDataListener iCloneDataListener) {
        List<ICloneDataListener> list;
        if (this.listeners.isEmpty() || (list = this.listeners.get(obj)) == null) {
            return;
        }
        list.remove(iCloneDataListener);
        if (list.isEmpty()) {
            this.listeners.remove(obj);
        }
    }

    public void addCloneDataListener(String str, String str2, ICloneDataListener iCloneDataListener) {
        addCloneDataListener(new CategorizedString(str, str2), iCloneDataListener);
    }

    public void removeCloneDataListener(String str, String str2, ICloneDataListener iCloneDataListener) {
        removeCloneDataListener(new CategorizedString(str, str2), iCloneDataListener);
    }

    @Override // org.xmind.core.ICloneData
    public boolean isCloned(Object obj) {
        Map<Object, Object> map = this.clonedElements;
        if (map != null && map.containsKey(obj)) {
            return true;
        }
        ICloneData iCloneData = this.parent;
        return iCloneData != null && iCloneData.isCloned(obj);
    }

    @Override // org.xmind.core.ICloneData
    public boolean isCloned(String str, String str2) {
        return isCloned(new CategorizedString(str, str2));
    }
}
