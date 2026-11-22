package org.xmind.core.internal.dom;

import org.xmind.core.io.IInputSource;
import org.xmind.core.io.IOutputTarget;
import org.xmind.core.marker.IMarker;
import org.xmind.core.marker.IMarkerResource;
import org.xmind.core.marker.IMarkerResourceProvider;

/* loaded from: classes7.dex */
public class MarkerResourceProvider implements IMarkerResourceProvider {
    private IInputSource source;
    private IOutputTarget target;

    @Override // org.xmind.core.marker.IMarkerResourceProvider
    public boolean isPermanent() {
        return false;
    }

    public MarkerResourceProvider(IInputSource iInputSource, IOutputTarget iOutputTarget) {
        this.source = iInputSource;
        this.target = iOutputTarget;
    }

    @Override // org.xmind.core.marker.IMarkerResourceProvider
    public IMarkerResource getMarkerResource(IMarker iMarker) {
        return new MarkerResource(iMarker, this.source, this.target);
    }
}
