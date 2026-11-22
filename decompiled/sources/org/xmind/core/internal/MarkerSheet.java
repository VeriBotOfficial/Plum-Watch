package org.xmind.core.internal;

import org.xmind.core.marker.IMarker;
import org.xmind.core.marker.IMarkerGroup;
import org.xmind.core.marker.IMarkerSheet;

/* loaded from: classes7.dex */
public abstract class MarkerSheet implements IMarkerSheet {
    private IMarkerSheet parent = null;

    @Override // org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        return null;
    }

    protected abstract IMarker getLocalMarker(String str);

    protected abstract IMarkerGroup getLocalMarkerGroup(String str);

    @Override // org.xmind.core.marker.IMarkerSheet
    public boolean isEmpty() {
        return getMarkerGroups().isEmpty();
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public void setParentSheet(IMarkerSheet iMarkerSheet) {
        this.parent = iMarkerSheet;
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public IMarkerSheet getParentSheet() {
        return this.parent;
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public IMarker findMarker(String str) {
        IMarker localMarker = getLocalMarker(str);
        if (localMarker != null) {
            return localMarker;
        }
        IMarkerSheet iMarkerSheet = this.parent;
        if (iMarkerSheet != null) {
            return iMarkerSheet.findMarker(str);
        }
        return null;
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public IMarker getMarker(String str) {
        return getLocalMarker(str);
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public IMarkerGroup findMarkerGroup(String str) {
        IMarkerGroup localMarkerGroup = getLocalMarkerGroup(str);
        if (localMarkerGroup != null) {
            return localMarkerGroup;
        }
        IMarkerSheet iMarkerSheet = this.parent;
        if (iMarkerSheet != null) {
            return iMarkerSheet.findMarkerGroup(str);
        }
        return null;
    }

    @Override // org.xmind.core.marker.IMarkerSheet
    public IMarkerGroup getMarkerGroup(String str) {
        return getLocalMarkerGroup(str);
    }
}
