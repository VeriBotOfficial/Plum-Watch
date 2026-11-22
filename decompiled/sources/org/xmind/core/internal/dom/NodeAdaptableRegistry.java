package org.xmind.core.internal.dom;

import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmind.core.IAdaptable;

/* loaded from: classes7.dex */
public class NodeAdaptableRegistry implements INodeAdaptableProvider {
    private Document defaultDocument;
    private INodeAdaptableFactory factory;
    private Map<IDKey, IAdaptable> idMap = new HashMap();
    private Map<Node, IAdaptable> nodeMap = new HashMap();
    private IDKey key = new IDKey(null, null);

    public NodeAdaptableRegistry(Document document, INodeAdaptableFactory iNodeAdaptableFactory) {
        this.defaultDocument = document;
        this.factory = iNodeAdaptableFactory;
    }

    public IAdaptable getAdaptable(String str) {
        return getAdaptable(str, this.defaultDocument);
    }

    public IAdaptable getAdaptable(String str, Document document) {
        Element elementById;
        IAdaptable adaptableById = getAdaptableById(str, document);
        if (adaptableById == null && (elementById = document.getElementById(str)) != null) {
            adaptableById = getAdaptableByNode(elementById);
            if (adaptableById == null) {
                adaptableById = createAdaptable(elementById);
            }
            if (adaptableById != null) {
                registerByNode(adaptableById, elementById);
                registerById(adaptableById, str, document);
            }
        }
        return adaptableById;
    }

    @Override // org.xmind.core.internal.dom.INodeAdaptableProvider
    public IAdaptable getAdaptable(Node node) {
        IAdaptable iAdaptable = this.nodeMap.get(node);
        if (iAdaptable == null && (iAdaptable = createAdaptable(node)) != null) {
            registerByNode(iAdaptable, node);
            String id2 = getId(node);
            if (id2 != null) {
                registerById(iAdaptable, id2, node.getOwnerDocument());
            }
        }
        return iAdaptable;
    }

    public void register(IAdaptable iAdaptable, String str) {
        register(iAdaptable, str, this.defaultDocument);
    }

    public void register(IAdaptable iAdaptable, String str, Document document) {
        registerById(iAdaptable, str, document);
        Element elementById = document.getElementById(str);
        if (elementById != null) {
            registerByNode(iAdaptable, elementById);
        }
    }

    public void register(IAdaptable iAdaptable, Node node) {
        registerByNode(iAdaptable, node);
        String id2 = getId(node);
        if (id2 != null) {
            registerById(iAdaptable, id2, node.getOwnerDocument());
        }
    }

    public void unregister(IAdaptable iAdaptable, String str) {
        unregister(iAdaptable, str, this.defaultDocument);
    }

    public void unregister(IAdaptable iAdaptable, String str, Document document) {
        unregisterById(iAdaptable, str, document);
        Element elementById = document.getElementById(str);
        if (elementById != null) {
            unregisterByNode(iAdaptable, elementById);
        }
    }

    public void unregister(IAdaptable iAdaptable, Node node) {
        unregisterByNode(iAdaptable, node);
        String id2 = getId(node);
        if (id2 != null) {
            unregisterById(iAdaptable, id2, node.getOwnerDocument());
        }
    }

    private String getId(Node node) {
        Node namedItem;
        String nodeValue;
        if (node.getNodeType() != 1 || (namedItem = node.getAttributes().getNamedItem("id")) == null || (nodeValue = namedItem.getNodeValue()) == null || "".equals(nodeValue)) {
            return null;
        }
        return nodeValue;
    }

    private IDKey getIDKey(String str, Document document) {
        this.key.f18856id = str;
        this.key.document = document;
        return this.key;
    }

    private IDKey createIDKey(String str, Document document) {
        return new IDKey(document, str);
    }

    public IAdaptable getAdaptableById(String str, Document document) {
        return this.idMap.get(getIDKey(str, document));
    }

    public IAdaptable getAdaptableByNode(Node node) {
        return this.nodeMap.get(node);
    }

    public void registerById(IAdaptable iAdaptable, String str, Document document) {
        this.idMap.put(createIDKey(str, document), iAdaptable);
    }

    public void registerByNode(IAdaptable iAdaptable, Node node) {
        this.nodeMap.put(node, iAdaptable);
    }

    public void unregisterById(IAdaptable iAdaptable, String str, Document document) {
        IDKey iDKey = getIDKey(str, document);
        IAdaptable iAdaptable2 = this.idMap.get(iDKey);
        if (iAdaptable2 == iAdaptable || (iAdaptable2 != null && iAdaptable2.equals(iAdaptable))) {
            this.idMap.remove(iDKey);
        }
    }

    public void unregisterByNode(IAdaptable iAdaptable, Node node) {
        IAdaptable iAdaptable2 = this.nodeMap.get(node);
        if (iAdaptable2 == iAdaptable || (iAdaptable2 != null && iAdaptable2.equals(iAdaptable))) {
            this.nodeMap.remove(node);
        }
    }

    private IAdaptable createAdaptable(Node node) {
        INodeAdaptableFactory iNodeAdaptableFactory = this.factory;
        if (iNodeAdaptableFactory == null) {
            return null;
        }
        return iNodeAdaptableFactory.createAdaptable(node);
    }
}
