package org.xmind.core.internal;

import android.gov.nist.core.Separators;
import org.xmind.core.marker.IMarker;

/* loaded from: classes7.dex */
public abstract class Marker implements IMarker {
    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        return null;
    }

    public String toString() {
        return "MARKER (" + getName() + Separators.RPAREN;
    }
}
