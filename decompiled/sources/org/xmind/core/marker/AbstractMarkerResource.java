package org.xmind.core.marker;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class AbstractMarkerResource implements IMarkerResource {
    private String mainPath;
    private IMarker marker;
    private List<IMarkerVariation> variations;

    protected void loadVariations(List<IMarkerVariation> list) {
    }

    public AbstractMarkerResource(IMarker iMarker) {
        this(iMarker, null);
    }

    public AbstractMarkerResource(IMarker iMarker, String str) {
        this.variations = null;
        if (iMarker == null) {
            throw new IllegalArgumentException();
        }
        this.marker = iMarker;
        this.mainPath = str == null ? "/" : str;
    }

    protected IMarker getMarker() {
        return this.marker;
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public String getPath() {
        return this.marker.getResourcePath();
    }

    public String getFullPath() {
        String path = getPath();
        return !path.startsWith("/") ? String.valueOf(getMainPath()) + path : path;
    }

    protected String getMainPath() {
        return this.mainPath;
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public synchronized List<IMarkerVariation> getVariations() {
        if (this.variations == null) {
            ArrayList arrayList = new ArrayList();
            this.variations = arrayList;
            loadVariations(arrayList);
        }
        return this.variations;
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public InputStream getInputStream(IMarkerVariation iMarkerVariation) {
        return getInputStream();
    }

    @Override // org.xmind.core.marker.IMarkerResource
    public OutputStream getOutputStream(IMarkerVariation iMarkerVariation) {
        return getOutputStream();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractMarkerResource)) {
            return false;
        }
        return this.marker.equals(((AbstractMarkerResource) obj).marker);
    }
}
