package org.xmind.core.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmind.core.CoreException;
import org.xmind.core.comment.ICommentManager;
import org.xmind.core.comment.ICommentManagerBuilder;

/* loaded from: classes7.dex */
public abstract class CommentManagerBuilder implements ICommentManagerBuilder {
    @Override // org.xmind.core.comment.ICommentManagerBuilder
    public ICommentManager loadFromFile(File file) throws IOException, CoreException {
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return loadFromStream(fileInputStream);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // org.xmind.core.comment.ICommentManagerBuilder
    public ICommentManager loadFromPath(String str) throws IOException, CoreException {
        return loadFromFile(new File(str));
    }

    @Override // org.xmind.core.comment.ICommentManagerBuilder
    public ICommentManager loadFromUrl(URL url) throws IOException, CoreException {
        InputStream openStream = url.openStream();
        try {
            return loadFromStream(openStream);
        } finally {
            try {
                openStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
