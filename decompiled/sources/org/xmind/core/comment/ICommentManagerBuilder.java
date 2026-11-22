package org.xmind.core.comment;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmind.core.CoreException;

/* loaded from: classes7.dex */
public interface ICommentManagerBuilder {
    ICommentManager createCommentManager();

    ICommentManager loadFromFile(File file) throws IOException, CoreException;

    ICommentManager loadFromPath(String str) throws IOException, CoreException;

    ICommentManager loadFromStream(InputStream inputStream) throws IOException, CoreException;

    ICommentManager loadFromUrl(URL url) throws IOException, CoreException;
}
