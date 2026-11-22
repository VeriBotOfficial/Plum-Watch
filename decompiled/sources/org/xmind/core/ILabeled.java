package org.xmind.core;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes7.dex */
public interface ILabeled {
    void addLabel(String str);

    Set<String> getLabels();

    void removeAllLabels();

    void removeLabel(String str);

    void setLabels(Collection<String> collection);
}
