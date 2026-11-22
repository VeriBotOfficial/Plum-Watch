package org.xmind.core.internal.dom;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmind.core.IEncryptionData;
import org.xmind.core.IFileEntry;
import org.xmind.core.IFileEntryFilter;
import org.xmind.core.IManifest;
import org.xmind.core.IWorkbook;
import org.xmind.core.internal.FileEntry;
import org.xmind.core.internal.security.Crypto;
import org.xmind.core.io.IStorage;
import org.xmind.core.util.DOMUtils;

/* loaded from: classes7.dex */
public class FileEntryImpl extends FileEntry {
    private EncryptionDataImpl encData;
    private Element implementation;
    private ManifestImpl ownedManifest;
    private Integer refCount = null;
    private boolean ignoreEncryption = false;

    public FileEntryImpl(Element element, ManifestImpl manifestImpl) {
        this.implementation = element;
        this.ownedManifest = manifestImpl;
    }

    public Element getImplementation() {
        return this.implementation;
    }

    @Override // org.xmind.core.IFileEntry
    public String getMediaType() {
        return this.implementation.getAttribute(DOMConstants.ATTR_MEDIA_TYPE);
    }

    public IManifest getOwnedManifest() {
        return this.ownedManifest;
    }

    @Override // org.xmind.core.IFileEntry
    public String getPath() {
        return this.implementation.getAttribute(DOMConstants.ATTR_FULL_PATH);
    }

    @Override // org.xmind.core.internal.AbstractWorkbookComponent, org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        if (cls == Node.class || cls == Element.class) {
            return this.implementation;
        }
        return super.getAdapter(cls);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof FileEntryImpl) && this.implementation == ((FileEntryImpl) obj).implementation;
    }

    public int hashCode() {
        return this.implementation.hashCode();
    }

    public String toString() {
        return DOMUtils.toString(this.implementation);
    }

    @Override // org.xmind.core.IFileEntry
    public int getReferenceCount() {
        Integer num = this.refCount;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // org.xmind.core.IFileEntry
    public boolean hasBeenReferred() {
        return this.refCount != null;
    }

    @Override // org.xmind.core.IFileEntry
    public void increaseReference() {
        IFileEntry fileEntry;
        int referenceCount = getReferenceCount();
        this.refCount = Integer.valueOf(referenceCount + 1);
        if (referenceCount <= 0) {
            this.ownedManifest.insertFileEntry(this);
        }
        String parentPath = InternalDOMUtils.getParentPath(getPath());
        if (parentPath == null || (fileEntry = this.ownedManifest.getFileEntry(parentPath)) == null) {
            return;
        }
        fileEntry.increaseReference();
    }

    @Override // org.xmind.core.IFileEntry
    public void decreaseReference() {
        IFileEntry fileEntry;
        Integer num = this.refCount;
        if (num == null) {
            return;
        }
        int intValue = num.intValue() - 1;
        this.refCount = Integer.valueOf(intValue);
        if (intValue <= 0) {
            this.ownedManifest.removeFileEntry(this);
        }
        String parentPath = InternalDOMUtils.getParentPath(getPath());
        if (parentPath == null || (fileEntry = this.ownedManifest.getFileEntry(parentPath)) == null) {
            return;
        }
        fileEntry.decreaseReference();
    }

    private IStorage getStorage() {
        IWorkbook ownedWorkbook = this.ownedManifest.getOwnedWorkbook();
        if (ownedWorkbook != null) {
            return ownedWorkbook.getTempStorage();
        }
        return null;
    }

    @Override // org.xmind.core.IFileEntry
    public InputStream getInputStream() {
        IStorage storage;
        if (isDirectory() || (storage = getStorage()) == null) {
            return null;
        }
        return storage.getInputSource().getEntryStream(getPath());
    }

    @Override // org.xmind.core.IFileEntry
    public OutputStream getOutputStream() {
        IStorage storage;
        if (isDirectory() || (storage = getStorage()) == null) {
            return null;
        }
        return storage.getOutputTarget().getEntryStream(getPath());
    }

    @Override // org.xmind.core.IFileEntry
    public InputStream openInputStream() throws IOException {
        if (isDirectory()) {
            throw new FileNotFoundException(getPath());
        }
        IStorage storage = getStorage();
        if (storage == null) {
            throw new FileNotFoundException(getPath());
        }
        return storage.getInputSource().openEntryStream(getPath());
    }

    @Override // org.xmind.core.IFileEntry
    public OutputStream openOutputStream() throws IOException {
        if (isDirectory()) {
            throw new FileNotFoundException(getPath());
        }
        IStorage storage = getStorage();
        if (storage == null) {
            throw new FileNotFoundException(getPath());
        }
        return storage.getOutputTarget().openEntryStream(getPath());
    }

    @Override // org.xmind.core.IFileEntry
    public long getTime() {
        IStorage storage = getStorage();
        if (storage != null) {
            return storage.getInputSource().getEntryTime(getPath());
        }
        return -1L;
    }

    @Override // org.xmind.core.IFileEntry
    public void setTime(long j) {
        IStorage storage = getStorage();
        if (storage != null) {
            storage.getOutputTarget().setEntryTime(getPath(), j);
        }
    }

    @Override // org.xmind.core.IFileEntry
    public Iterator<IFileEntry> iterSubEntries() {
        final String path = getPath();
        return this.ownedManifest.iterFileEntries(new IFileEntryFilter() { // from class: org.xmind.core.internal.dom.FileEntryImpl.1
            @Override // org.xmind.core.IFileEntryFilter
            public boolean select(String str, String str2, boolean z) {
                return str.length() > path.length() && str.startsWith(path);
            }
        });
    }

    @Override // org.xmind.core.IFileEntry
    public boolean isDirectory() {
        return getPath().endsWith("/");
    }

    @Override // org.xmind.core.IFileEntry
    public long getSize() {
        IStorage storage = getStorage();
        if (storage != null) {
            return storage.getInputSource().getEntrySize(getPath());
        }
        return -1L;
    }

    @Override // org.xmind.core.IFileEntry
    public IEncryptionData getEncryptionData() {
        Element firstChildElementByTag = DOMUtils.getFirstChildElementByTag(this.implementation, DOMConstants.TAG_ENCRYPTION_DATA);
        if (firstChildElementByTag == null) {
            if (this.encData != null) {
                this.encData = null;
            }
        } else if (this.encData == null) {
            this.encData = new EncryptionDataImpl(firstChildElementByTag, this);
        }
        return this.encData;
    }

    @Override // org.xmind.core.IFileEntry
    public IEncryptionData createEncryptionData() {
        IEncryptionData encryptionData = getEncryptionData();
        if (encryptionData != null) {
            return encryptionData;
        }
        EncryptionDataImpl encryptionDataImpl = new EncryptionDataImpl(DOMUtils.createElement(this.implementation, DOMConstants.TAG_ENCRYPTION_DATA), this);
        this.encData = encryptionDataImpl;
        Crypto.initEncryptionData(encryptionDataImpl);
        return this.encData;
    }

    @Override // org.xmind.core.IFileEntry
    public void deleteEncryptionData() {
        EncryptionDataImpl encryptionDataImpl = this.encData;
        if (encryptionDataImpl != null) {
            Element implementation = encryptionDataImpl.getImplementation();
            if (implementation != null) {
                Node parentNode = implementation.getParentNode();
                Element element = this.implementation;
                if (parentNode == element) {
                    element.removeChild(implementation);
                }
            }
            this.encData = null;
        }
    }

    public void setIgnoreEncryption(boolean z) {
        this.ignoreEncryption = z;
    }

    public boolean isIgnoreEncryption() {
        return this.ignoreEncryption;
    }

    @Override // org.xmind.core.IWorkbookComponent
    public IWorkbook getOwnedWorkbook() {
        return this.ownedManifest.getOwnedWorkbook();
    }

    @Override // org.xmind.core.IWorkbookComponent
    public boolean isOrphan() {
        return DOMUtils.isOrphanNode(getImplementation());
    }
}
