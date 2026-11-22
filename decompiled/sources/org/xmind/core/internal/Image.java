package org.xmind.core.internal;

import org.xmind.core.IImage;
import org.xmind.core.ITitled;
import org.xmind.core.ITopic;

/* loaded from: classes7.dex */
public abstract class Image extends AbstractWorkbookComponent implements IImage {
    @Override // org.xmind.core.internal.AbstractWorkbookComponent, org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        if (cls == ITitled.class || cls == ITopic.class) {
            return getParent();
        }
        return super.getAdapter(cls);
    }
}
