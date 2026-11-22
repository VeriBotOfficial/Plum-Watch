package org.xmind.core.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.xmind.core.style.IStyle;
import org.xmind.core.style.IStyleSheet;
import org.xmind.core.util.DOMUtils;

/* loaded from: classes7.dex */
public abstract class StyleSheet implements IStyleSheet {
    protected static final Set<IStyle> NO_STYLES = Collections.emptySet();
    private IStyleSheet parent = null;

    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        return null;
    }

    protected abstract IStyle getLocalStyle(String str);

    @Override // org.xmind.core.style.IStyleSheet
    public Set<IStyle> getAllStyles() {
        Set<IStyle> styles = getStyles(IStyleSheet.NORMAL_STYLES);
        Set<IStyle> styles2 = getStyles("master-styles");
        Set<IStyle> styles3 = getStyles("automatic-styles");
        int size = styles.size() + styles2.size() + styles3.size();
        if (size == 0) {
            return NO_STYLES;
        }
        ArrayList arrayList = new ArrayList(size);
        arrayList.addAll(styles3);
        arrayList.addAll(styles2);
        arrayList.addAll(styles);
        return DOMUtils.unmodifiableSet(arrayList);
    }

    @Override // org.xmind.core.style.IStyleSheet
    public boolean isEmpty() {
        return getAllStyles().isEmpty();
    }

    @Override // org.xmind.core.style.IStyleSheet
    public IStyleSheet getParentSheet() {
        return this.parent;
    }

    @Override // org.xmind.core.style.IStyleSheet
    public void setParentSheet(IStyleSheet iStyleSheet) {
        this.parent = iStyleSheet;
    }

    @Override // org.xmind.core.style.IStyleSheet
    public IStyle findStyle(String str) {
        IStyleSheet iStyleSheet;
        if (str == null) {
            return null;
        }
        IStyle localStyle = getLocalStyle(str);
        return (localStyle == null && (iStyleSheet = this.parent) != null) ? iStyleSheet.findStyle(str) : localStyle;
    }
}
