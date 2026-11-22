package org.xmind.core.internal.dom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.xmind.core.CoreException;
import org.xmind.core.io.IInputSource;
import org.xmind.core.util.IXMLLoader;

/* loaded from: classes7.dex */
public abstract class XMLLoader implements IXMLLoader {
    private Map<String, Document> loadedDocuments = null;

    protected abstract Document doLoadXMLFile(IInputSource iInputSource, String str) throws IOException, CoreException;

    @Override // org.xmind.core.util.IXMLLoader
    public Document loadXMLFile(IInputSource iInputSource, String str) throws IOException, CoreException {
        Document document;
        Map<String, Document> map = this.loadedDocuments;
        if (map != null && (document = map.get(str)) != null) {
            return document;
        }
        Document doLoadXMLFile = doLoadXMLFile(iInputSource, str);
        if (this.loadedDocuments == null) {
            this.loadedDocuments = new HashMap();
        }
        this.loadedDocuments.put(str, doLoadXMLFile);
        return doLoadXMLFile;
    }
}
