package org.xmind.core.io;

import java.io.File;
import java.io.FileFilter;
import org.xmind.core.util.FileUtils;

/* loaded from: classes7.dex */
public class DirectoryStorage implements IStorage {
    private File dir;
    private FileFilter filter;

    public DirectoryStorage(File file) {
        this(file, null);
    }

    public DirectoryStorage(File file, FileFilter fileFilter) {
        this.dir = file;
        this.filter = fileFilter;
    }

    @Override // org.xmind.core.io.IStorage
    public String getFullPath() {
        return this.dir.getAbsolutePath();
    }

    @Override // org.xmind.core.io.IStorage
    public IInputSource getInputSource() {
        return new DirectoryInputSource(this.dir, this.filter);
    }

    @Override // org.xmind.core.io.IStorage
    public String getName() {
        return this.dir.getName();
    }

    @Override // org.xmind.core.io.IStorage
    public IOutputTarget getOutputTarget() {
        return new DirectoryOutputTarget(this.dir);
    }

    @Override // org.xmind.core.io.IStorage
    public void clear() {
        FileUtils.delete(this.dir);
    }
}
