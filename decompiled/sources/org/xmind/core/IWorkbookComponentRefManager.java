package org.xmind.core;

import java.util.Collection;

/* loaded from: classes7.dex */
public interface IWorkbookComponentRefManager {
    void decreaseRef(String str, String str2);

    Collection<String> getSources();

    Collection<String> getSources(String str);

    Collection<String> getTargets();

    Collection<String> getTargets(String str);

    void increaseRef(String str, String str2);
}
