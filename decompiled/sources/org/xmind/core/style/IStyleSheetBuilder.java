package org.xmind.core.style;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmind.core.CoreException;

/* loaded from: classes7.dex */
public interface IStyleSheetBuilder {
    IStyleSheet createStyleSheet();

    IStyleSheet loadFromFile(File file) throws IOException, CoreException;

    IStyleSheet loadFromPath(String str) throws IOException, CoreException;

    IStyleSheet loadFromStream(InputStream inputStream) throws IOException, CoreException;

    IStyleSheet loadFromUrl(URL url) throws IOException, CoreException;

    void loadProperties(InputStream inputStream, IStyleSheet iStyleSheet) throws IOException, CoreException;
}
