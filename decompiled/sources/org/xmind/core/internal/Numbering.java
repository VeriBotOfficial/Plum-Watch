package org.xmind.core.internal;

import org.xmind.core.INumbering;
import org.xmind.core.ITopic;

/* loaded from: classes7.dex */
public abstract class Numbering extends AbstractWorkbookComponent implements INumbering {
    @Override // org.xmind.core.INumbering
    public String getParentFormat() {
        ITopic parent;
        ITopic parent2 = getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return null;
        }
        return parent.getNumbering().getComputedFormat();
    }

    @Override // org.xmind.core.INumbering
    public String getComputedFormat() {
        String numberFormat = getNumberFormat();
        if (numberFormat != null) {
            return numberFormat;
        }
        if (ITopic.ATTACHED.equals(getParent().getType())) {
            return getParentFormat();
        }
        return null;
    }

    @Override // org.xmind.core.INumbering
    public String getParentSeparator() {
        ITopic parent;
        ITopic parent2 = getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return null;
        }
        return parent.getNumbering().getComputedSeparator();
    }

    @Override // org.xmind.core.INumbering
    public String getComputedSeparator() {
        String separator = getSeparator();
        if (separator != null) {
            return separator;
        }
        if (ITopic.ATTACHED.equals(getParent().getType())) {
            return getParentSeparator();
        }
        return null;
    }
}
