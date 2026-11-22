package org.xmind.core.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmind.core.util.IRefCounter;

/* loaded from: classes7.dex */
public abstract class AbstractRefCounter implements IRefCounter {
    private static final Set<String> NO_RESOURCE_IDS = Collections.emptySet();
    private Map<String, Integer> counts = null;

    protected abstract Object findResource(String str);

    protected abstract void postDecreaseRef(String str, Object obj);

    protected abstract void postIncreaseRef(String str, Object obj);

    @Override // org.xmind.core.util.IRefCounter
    public Collection<String> getRefs() {
        Map<String, Integer> map = this.counts;
        if (map == null) {
            return NO_RESOURCE_IDS;
        }
        return map.keySet();
    }

    @Override // org.xmind.core.util.IRefCounter
    public Collection<String> getCountedRefs() {
        if (this.counts == null) {
            return NO_RESOURCE_IDS;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Integer> entry : this.counts.entrySet()) {
            if (entry.getValue() != null && entry.getValue().intValue() > 0) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    @Override // org.xmind.core.util.IRefCounter
    public void increaseRef(String str) {
        int valueOf;
        Object findResource = findResource(str);
        if (findResource == null) {
            return;
        }
        if (this.counts == null) {
            this.counts = new HashMap();
        }
        Integer num = this.counts.get(str);
        if (num == null) {
            valueOf = 1;
        } else {
            valueOf = Integer.valueOf(num.intValue() + 1);
        }
        this.counts.put(str, valueOf);
        postIncreaseRef(str, findResource);
    }

    @Override // org.xmind.core.util.IRefCounter
    public void decreaseRef(String str) {
        Object findResource;
        Integer num;
        if (this.counts == null || (findResource = findResource(str)) == null || (num = this.counts.get(str)) == null || num.intValue() <= 0) {
            return;
        }
        this.counts.put(str, Integer.valueOf(num.intValue() - 1));
        postDecreaseRef(str, findResource);
    }

    @Override // org.xmind.core.util.IRefCounter
    public int getRefCount(String str) {
        Integer num;
        Map<String, Integer> map = this.counts;
        if (map == null || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
