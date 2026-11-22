package org.xmind.core.internal;

import java.util.Collection;
import java.util.Collections;
import org.xmind.core.style.IStyle;
import org.xmind.core.style.IStyleSheet;

/* loaded from: classes7.dex */
public abstract class Style implements IStyle {
    protected static final Collection<String> NO_VALUES = Collections.emptySet();

    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        return null;
    }

    @Override // org.xmind.core.IProperties
    public String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property == null ? str2 : property;
    }

    @Override // org.xmind.core.IProperties
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // org.xmind.core.style.IStyle
    public IStyle getDefaultStyle(String str) {
        if (str == null) {
            return null;
        }
        return getDefaultStyleById(getDefaultStyleId(str));
    }

    @Override // org.xmind.core.style.IStyle
    public IStyle getDefaultStyleById(String str) {
        IStyleSheet ownedStyleSheet;
        if (str == null || (ownedStyleSheet = getOwnedStyleSheet()) == null) {
            return null;
        }
        return ownedStyleSheet.findStyle(str);
    }
}
