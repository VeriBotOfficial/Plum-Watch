package org.xmind.core.marker;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmind.core.CoreException;

/* loaded from: classes7.dex */
public interface IMarkerSheetBuilder {
    IMarkerSheet createMarkerSheet(IMarkerResourceProvider iMarkerResourceProvider);

    IMarkerSheet loadFromFile(File file, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException;

    IMarkerSheet loadFromPath(String str, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException;

    IMarkerSheet loadFromStream(InputStream inputStream, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException;

    IMarkerSheet loadFromURL(URL url, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException;

    void loadProperties(InputStream inputStream, IMarkerSheet iMarkerSheet) throws IOException, CoreException;
}
