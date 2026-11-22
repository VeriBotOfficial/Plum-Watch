package org.xmind.core.marker;

import org.xmind.core.IAdaptable;
import org.xmind.core.ITopicComponent;

/* loaded from: classes7.dex */
public interface IMarkerRef extends IAdaptable, ITopicComponent {
    String getDescription();

    IMarker getMarker();

    String getMarkerId();
}
