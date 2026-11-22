package org.xmind.core.internal;

import org.xmind.core.marker.IMarker;
import org.xmind.core.marker.IMarkerGroup;

/* loaded from: classes7.dex */
public abstract class MarkerGroup implements IMarkerGroup {
    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        return null;
    }

    @Override // org.xmind.core.marker.IMarkerGroup
    public IMarker getMarker(String str) {
        if (str == null) {
            return null;
        }
        for (IMarker iMarker : getMarkers()) {
            if (str.equals(iMarker.getId())) {
                return iMarker;
            }
        }
        return null;
    }
}
