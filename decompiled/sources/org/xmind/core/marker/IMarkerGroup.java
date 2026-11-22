package org.xmind.core.marker;

import java.util.List;
import org.xmind.core.IAdaptable;
import org.xmind.core.IIdentifiable;
import org.xmind.core.INamed;

/* loaded from: classes7.dex */
public interface IMarkerGroup extends IAdaptable, IIdentifiable, INamed {
    void addMarker(IMarker iMarker);

    IMarker getMarker(String str);

    List<IMarker> getMarkers();

    IMarkerSheet getOwnedSheet();

    IMarkerSheet getParent();

    boolean isHidden();

    boolean isSingleton();

    void removeMarker(IMarker iMarker);

    void setHidden(boolean z);

    void setSingleton(boolean z);
}
