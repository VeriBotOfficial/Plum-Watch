package org.xmind.core.marker;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes7.dex */
public interface IMarkerResource {
    InputStream getInputStream();

    InputStream getInputStream(IMarkerVariation iMarkerVariation);

    OutputStream getOutputStream();

    OutputStream getOutputStream(IMarkerVariation iMarkerVariation);

    String getPath();

    List<IMarkerVariation> getVariations();

    InputStream openInputStream() throws IOException;

    OutputStream openOutputStream() throws IOException;
}
