package org.xmind.core.internal.dom;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.xmind.core.io.IInputSource;
import org.xmind.core.io.IOutputTarget;
import org.xmind.core.marker.AbstractMarkerResource;
import org.xmind.core.marker.IMarker;

/* loaded from: classes7.dex */
public class MarkerResource extends AbstractMarkerResource {
    private IInputSource source;
    private IOutputTarget target;

    public MarkerResource(IMarker iMarker, IInputSource iInputSource, IOutputTarget iOutputTarget) {
        super(iMarker);
        this.source = iInputSource;
        this.target = iOutputTarget;
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public InputStream getInputStream() {
        IInputSource iInputSource = this.source;
        if (iInputSource == null) {
            return null;
        }
        return iInputSource.getEntryStream(getFullPath());
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public OutputStream getOutputStream() {
        IOutputTarget iOutputTarget = this.target;
        if (iOutputTarget == null) {
            return null;
        }
        return iOutputTarget.getEntryStream(getFullPath());
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public InputStream openInputStream() throws IOException {
        IInputSource iInputSource = this.source;
        if (iInputSource == null) {
            throw new FileNotFoundException(getFullPath());
        }
        return iInputSource.openEntryStream(getFullPath());
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public OutputStream openOutputStream() throws IOException {
        IOutputTarget iOutputTarget = this.target;
        if (iOutputTarget == null) {
            throw new FileNotFoundException(getFullPath());
        }
        return iOutputTarget.openEntryStream(getFullPath());
    }
}
