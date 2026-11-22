package org.xmind.core.internal.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmind.core.IAdaptable;
import org.xmind.core.internal.ElementRegistry;

/* loaded from: classes7.dex */
public class NodeAdaptableProvider implements INodeAdaptableProvider {
    private INodeAdaptableFactory factory;
    private Document primaryDocument;
    private ElementRegistry registry;

    public NodeAdaptableProvider(ElementRegistry elementRegistry, INodeAdaptableFactory iNodeAdaptableFactory, Document document) {
        this.registry = elementRegistry;
        this.factory = iNodeAdaptableFactory;
        this.primaryDocument = document;
    }

    private Object getID(Node node) {
        String attribute;
        if (!(node instanceof Element) || (attribute = ((Element) node).getAttribute("id")) == null || "".equals(attribute)) {
            return null;
        }
        Document ownerDocument = node.getNodeType() == 9 ? (Document) node : node.getOwnerDocument();
        return ownerDocument.equals(this.primaryDocument) ? attribute : new IDKey(ownerDocument, attribute);
    }

    @Override // org.xmind.core.internal.dom.INodeAdaptableProvider
    public IAdaptable getAdaptable(Node node) {
        Object element;
        if (node == null) {
            return null;
        }
        Object id2 = getID(node);
        if (id2 != null && (element = this.registry.getElement(id2)) != null && (element instanceof IAdaptable)) {
            return (IAdaptable) element;
        }
        Object element2 = this.registry.getElement(node);
        if (element2 instanceof IAdaptable) {
            return (IAdaptable) element2;
        }
        IAdaptable createAdaptable = createAdaptable(node);
        if (createAdaptable == null) {
            return null;
        }
        register(createAdaptable, node);
        return createAdaptable;
    }

    private void register(IAdaptable iAdaptable, Node node) {
        Object id2 = getID(node);
        if (id2 != null) {
            this.registry.registerByKey(id2, iAdaptable);
        }
        this.registry.registerByKey(node, iAdaptable);
    }

    private IAdaptable createAdaptable(Node node) {
        IAdaptable createAdaptable = this.factory.createAdaptable(node);
        if (createAdaptable == null || createAdaptable.getAdapter(Node.class) != node) {
            return null;
        }
        return createAdaptable;
    }
}
