package org.xmind.core.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmind.core.CoreException;
import org.xmind.core.marker.IMarkerResourceProvider;
import org.xmind.core.marker.IMarkerSheet;
import org.xmind.core.marker.IMarkerSheetBuilder;

/* loaded from: classes7.dex */
public abstract class MarkerSheetBuilder implements IMarkerSheetBuilder {
    @Override // org.xmind.core.marker.IMarkerSheetBuilder
    public IMarkerSheet loadFromPath(String str, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException {
        return loadFromFile(new File(str), iMarkerResourceProvider);
    }

    @Override // org.xmind.core.marker.IMarkerSheetBuilder
    public IMarkerSheet loadFromFile(File file, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException {
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return loadFromStream(fileInputStream, iMarkerResourceProvider);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // org.xmind.core.marker.IMarkerSheetBuilder
    public IMarkerSheet loadFromURL(URL url, IMarkerResourceProvider iMarkerResourceProvider) throws IOException, CoreException {
        InputStream openStream = url.openStream();
        try {
            return loadFromStream(openStream, iMarkerResourceProvider);
        } finally {
            try {
                openStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
