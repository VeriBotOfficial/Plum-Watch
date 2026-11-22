package org.xmind.core.util;

import java.util.Collection;

/* loaded from: classes7.dex */
public interface IRefCounter {
    void decreaseRef(String str);

    Collection<String> getCountedRefs();

    int getRefCount(String str);

    Collection<String> getRefs();

    void increaseRef(String str);
}
