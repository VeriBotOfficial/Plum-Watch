package org.xmind.core.internal;

import org.xmind.core.IAdaptable;
import org.xmind.core.IWorkbook;
import org.xmind.core.IWorkbookComponent;

/* loaded from: classes7.dex */
public abstract class AbstractWorkbookComponent implements IAdaptable, IWorkbookComponent {
    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        if (cls == IWorkbook.class) {
            return getOwnedWorkbook();
        }
        return null;
    }
}
