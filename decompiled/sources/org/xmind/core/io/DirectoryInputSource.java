package org.xmind.core.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmind.core.Core;

/* loaded from: classes7.dex */
public class DirectoryInputSource implements IInputSource {
    private File dir;
    private FileFilter filter;

    public DirectoryInputSource(File file) {
        this(file, null);
    }

    public DirectoryInputSource(String str) {
        this(new File(str), null);
    }

    public DirectoryInputSource(File file, FileFilter fileFilter) {
        this.dir = file;
        this.filter = fileFilter;
    }

    public File getFile() {
        return this.dir;
    }

    public FileFilter getFilter() {
        return this.filter;
    }

    public void setFilter(FileFilter fileFilter) {
        this.filter = fileFilter;
    }

    public String getName() {
        return this.dir.getName();
    }

    @Override // org.xmind.core.io.IInputSource
    public Iterator<String> getEntries() {
        ArrayList arrayList = new ArrayList();
        getSubFiles("", this.dir, arrayList);
        return arrayList.iterator();
    }

    private void getSubFiles(String str, File file, List<String> list) {
        String str2;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                FileFilter fileFilter = this.filter;
                if (fileFilter == null || fileFilter.accept(file2)) {
                    if ("".equals(str)) {
                        str2 = file2.getName();
                    } else {
                        str2 = String.valueOf(str) + "/" + file2.getName();
                    }
                    if (!file2.isDirectory()) {
                        list.add(str2);
                    }
                    getSubFiles(str2, file2, list);
                }
            }
        }
    }

    @Override // org.xmind.core.io.IInputSource
    public boolean isEntryAvailable(String str) {
        return isAvailable() && !new File(this.dir, str).isDirectory();
    }

    protected boolean isAvailable() {
        return this.dir.exists() && this.dir.isDirectory();
    }

    @Override // org.xmind.core.io.IInputSource
    public boolean hasEntry(String str) {
        File file = new File(this.dir, str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        FileFilter fileFilter = this.filter;
        return fileFilter == null || fileFilter.accept(file);
    }

    @Override // org.xmind.core.io.IInputSource
    public InputStream getEntryStream(String str) {
        if (!isAvailable()) {
            return null;
        }
        File file = new File(this.dir, str);
        if (file.isFile() && file.canRead()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e) {
                Core.getLogger().log(e, "Failed to get entry input stream: " + str);
            }
        }
        return null;
    }

    @Override // org.xmind.core.io.IInputSource
    public InputStream openEntryStream(String str) throws IOException {
        return new FileInputStream(new File(this.dir, str));
    }

    public boolean closeEntryStream(String str, InputStream inputStream) {
        try {
            inputStream.close();
            return true;
        } catch (IOException e) {
            Core.getLogger().log(e, "Failed to close entry input stream: " + str);
            return false;
        }
    }

    @Override // org.xmind.core.io.IInputSource
    public long getEntrySize(String str) {
        File file = new File(this.dir, str);
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }

    @Override // org.xmind.core.io.IInputSource
    public long getEntryTime(String str) {
        File file = new File(this.dir, str);
        if (file.exists()) {
            return file.lastModified();
        }
        return -1L;
    }

    public boolean equals(Object obj) {
        FileFilter fileFilter;
        FileFilter fileFilter2;
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DirectoryInputSource)) {
            DirectoryInputSource directoryInputSource = (DirectoryInputSource) obj;
            if (this.dir.equals(directoryInputSource.dir) && ((fileFilter = this.filter) == (fileFilter2 = directoryInputSource.filter) || (fileFilter != null && fileFilter.equals(fileFilter2)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.dir.hashCode();
        FileFilter fileFilter = this.filter;
        return hashCode ^ (fileFilter == null ? 1 : fileFilter.hashCode());
    }
}
