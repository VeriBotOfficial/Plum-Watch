package org.xmind.core;

import java.util.Iterator;
import org.xmind.core.util.Property;

/* loaded from: classes7.dex */
public interface IProperties {
    String getProperty(String str);

    String getProperty(String str, String str2);

    boolean isEmpty();

    Iterator<Property> properties();

    void setProperty(String str, String str2);

    int size();
}
