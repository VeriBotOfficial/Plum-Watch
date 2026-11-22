package org.xmind.core.internal.dom;

import org.w3c.dom.Document;

/* loaded from: classes7.dex */
public class IDKey {
    public Document document;

    /* renamed from: id, reason: collision with root package name */
    public String f18856id;

    public IDKey(Document document, String str) {
        this.document = document;
        this.f18856id = str;
    }

    public int hashCode() {
        return this.document.hashCode() ^ this.f18856id.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof IDKey)) {
            IDKey iDKey = (IDKey) obj;
            if (this.document.equals(iDKey.document) && this.f18856id.equals(iDKey.f18856id)) {
                return true;
            }
        }
        return false;
    }
}
