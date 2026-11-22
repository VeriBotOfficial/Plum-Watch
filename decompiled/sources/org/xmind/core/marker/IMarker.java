package org.xmind.core.marker;

import org.xmind.core.IAdaptable;
import org.xmind.core.IIdentifiable;
import org.xmind.core.INamed;

/* loaded from: classes7.dex */
public interface IMarker extends IAdaptable, IIdentifiable, INamed {
    IMarkerSheet getOwnedSheet();

    IMarkerGroup getParent();

    IMarkerResource getResource();

    String getResourcePath();

    boolean isHidden();

    void setHidden(boolean z);
}
