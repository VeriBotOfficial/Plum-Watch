package org.xmind.core.internal.dom;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmind.core.IFileEntry;
import org.xmind.core.internal.EncryptionData;
import org.xmind.core.util.DOMUtils;

/* loaded from: classes7.dex */
public class EncryptionDataImpl extends EncryptionData {
    private FileEntryImpl entry;
    private Element implementation;

    public EncryptionDataImpl(Element element, FileEntryImpl fileEntryImpl) {
        this.implementation = element;
        this.entry = fileEntryImpl;
    }

    @Override // org.xmind.core.internal.EncryptionData, org.xmind.core.IAdaptable
    public Object getAdapter(Class cls) {
        if (cls == Node.class || cls == Element.class) {
            return getImplementation();
        }
        return super.getAdapter(cls);
    }

    public Element getImplementation() {
        return this.implementation;
    }

    @Override // org.xmind.core.IEncryptionData
    public int getIntAttribute(int i, String... strArr) {
        String attribute = getAttribute(strArr);
        if (attribute == null) {
            return i;
        }
        try {
            return Integer.parseInt(attribute);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // org.xmind.core.IEncryptionData
    public String getAttribute(String... strArr) {
        if (strArr.length <= 0) {
            return null;
        }
        Element element = this.implementation;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (i == strArr.length - 1) {
                return DOMUtils.getAttribute(element, str);
            }
            element = DOMUtils.getFirstChildElementByTag(element, str);
        }
        return null;
    }

    @Override // org.xmind.core.IEncryptionData
    public void setAttribute(String str, String... strArr) {
        if (strArr.length > 0) {
            Element element = this.implementation;
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                if (i == strArr.length - 1) {
                    DOMUtils.setAttribute(element, str2, str);
                }
                Element firstChildElementByTag = DOMUtils.getFirstChildElementByTag(element, str2);
                element = firstChildElementByTag == null ? DOMUtils.createElement(element, str2) : firstChildElementByTag;
            }
        }
    }

    @Override // org.xmind.core.IEncryptionData
    public String getChecksum() {
        return getAttribute(DOMConstants.ATTR_CHECKSUM);
    }

    @Override // org.xmind.core.IEncryptionData
    public String getChecksumType() {
        return getAttribute(DOMConstants.ATTR_CHECKSUM_TYPE);
    }

    @Override // org.xmind.core.IEncryptionData
    public void setChecksum(String str) {
        setAttribute(str, DOMConstants.ATTR_CHECKSUM);
    }

    @Override // org.xmind.core.IEncryptionData
    public void setChecksumType(String str) {
        setAttribute(str, DOMConstants.ATTR_CHECKSUM_TYPE);
    }

    @Override // org.xmind.core.IEncryptionData
    public IFileEntry getFileEntry() {
        return this.entry;
    }
}
