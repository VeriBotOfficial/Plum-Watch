package org.xmind.core.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmind.core.Core;
import org.xmind.core.CoreException;
import org.xmind.core.IAdaptable;
import org.xmind.core.ITopic;
import org.xmind.core.internal.dom.INodeAdaptableProvider;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* loaded from: classes7.dex */
public class DOMUtils {
    private static final ErrorHandler NULL_ERROR_HANDLER = new ErrorHandler() { // from class: org.xmind.core.util.DOMUtils.1
        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
        }
    };

    private static class ElementIterator implements Iterator<Element> {
        private Node child;
        private Element next;
        private String tagName;

        @Override // java.util.Iterator
        public void remove() {
        }

        public ElementIterator(Node node) {
            this(node, null);
        }

        public ElementIterator(Node node, String str) {
            this.tagName = str;
            this.child = node.getFirstChild();
            this.next = findNextElement();
        }

        private Element findNextElement() {
            if (this.child == null) {
                this.next = null;
            } else {
                while (true) {
                    Node node = this.child;
                    if (node == null || DOMUtils.isElementByTag(node, this.tagName)) {
                        break;
                    }
                    this.child = this.child.getNextSibling();
                }
                Node node2 = this.child;
                if (node2 != null) {
                    this.next = (Element) node2;
                    this.child = node2.getNextSibling();
                } else {
                    this.next = null;
                }
            }
            return this.next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public Element next() {
            Element element = this.next;
            this.next = findNextElement();
            return element;
        }
    }

    public static class AdaptableIterator<T extends IAdaptable> implements Iterator<T> {
        private T next;
        private Node node;
        private INodeAdaptableProvider provider;
        private boolean reversed;
        private String tagName;

        @Override // java.util.Iterator
        public void remove() {
        }

        public AdaptableIterator(Node node, String str, INodeAdaptableProvider iNodeAdaptableProvider, boolean z) {
            Node firstChild;
            this.tagName = str;
            this.provider = iNodeAdaptableProvider;
            this.reversed = z;
            if (z) {
                firstChild = node.getLastChild();
            } else {
                firstChild = node.getFirstChild();
            }
            this.node = firstChild;
            this.next = findNext();
        }

        private T findNext() {
            T t;
            do {
                Node node = this.node;
                t = null;
                if (node == null) {
                    return null;
                }
                if (DOMUtils.isElementByTag(node, this.tagName)) {
                    t = (T) this.provider.getAdaptable(this.node);
                }
                this.node = this.reversed ? this.node.getPreviousSibling() : this.node.getNextSibling();
            } while (t == null);
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = this.next;
            this.next = findNext();
            return t;
        }
    }

    private static class DelegateSet<T> extends AbstractSet<T> {
        private Collection<T> c;

        public DelegateSet(Collection<T> collection) {
            this.c = collection;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return this.c.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c.size();
        }
    }

    private DOMUtils() {
    }

    private static Transformer getDefaultTransformer() throws CoreException {
        try {
            return TransformerFactory.newInstance().newTransformer();
        } catch (TransformerException e) {
            throw new CoreException(15, e);
        }
    }

    public static DocumentBuilder getDefaultDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        try {
            newInstance.setAttribute("http://apache.org/xml/features/continue-after-fatal-error", true);
        } catch (Exception unused) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception unused2) {
        }
        try {
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        } catch (Exception unused3) {
        }
        try {
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
        } catch (Exception unused4) {
        }
        newInstance.setXIncludeAware(false);
        newInstance.setExpandEntityReferences(false);
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringElementContentWhitespace(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setErrorHandler(NULL_ERROR_HANDLER);
        return newDocumentBuilder;
    }

    public static String toString(Node node) {
        if (node == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(node.getNodeName());
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null && attributes.getLength() > 0) {
            for (int i = 0; i < attributes.getLength(); i++) {
                sb.append(' ');
                Node item = attributes.item(i);
                sb.append(item.getNodeName());
                sb.append("=\"");
                sb.append(item.getNodeValue());
                sb.append('\"');
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static Document doCreateDocument() throws ParserConfigurationException {
        return getDefaultDocumentBuilder().newDocument();
    }

    public static Document createDocument() {
        try {
            return getDefaultDocumentBuilder().newDocument();
        } catch (ParserConfigurationException unused) {
            return null;
        }
    }

    public static Document createDocument(String str) {
        Document createDocument = createDocument();
        createElement(createDocument, str);
        return createDocument;
    }

    public static Document loadDocument(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            return getDefaultDocumentBuilder().parse(inputStream);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static Document loadDocument(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return loadDocument(byteArrayInputStream);
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static void save(Node node, OutputStream outputStream, boolean z) throws IOException, CoreException {
        save(getDefaultTransformer(), node, outputStream, z);
    }

    public static void save(IAdaptable iAdaptable, OutputStream outputStream, boolean z) throws IOException, CoreException {
        save(getDefaultTransformer(), iAdaptable, outputStream, z);
    }

    public static void save(Transformer transformer, IAdaptable iAdaptable, OutputStream outputStream, boolean z) throws IOException {
        Node node = (Node) iAdaptable.getAdapter(Node.class);
        if (node != null) {
            save(transformer, node, outputStream, z);
        }
    }

    public static void save(Transformer transformer, Node node, OutputStream outputStream, boolean z) throws IOException {
        try {
            try {
                transformer.transform(new DOMSource(node), new StreamResult(outputStream));
            } catch (TransformerException e) {
                throw new IOException(e.getMessage());
            }
        } finally {
            if (z) {
                outputStream.close();
            }
        }
    }

    public static Element createElement(Node node, String str) {
        Element createElement = (node.getNodeType() == 9 ? (Document) node : node.getOwnerDocument()).createElement(str);
        node.appendChild(createElement);
        return createElement;
    }

    public static String getPrefix(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    public static String getLocalName(String str) {
        int indexOf = str.indexOf(58);
        return indexOf >= 0 ? str.substring(indexOf + 1) : str;
    }

    public static String getQualifiedName(String str, String str2) {
        return String.valueOf(str) + ":" + str2;
    }

    public static Element createText(Node node, String str, String str2) {
        Element createElement = createElement(node, str);
        createElement.appendChild(node.getOwnerDocument().createTextNode(str2));
        return createElement;
    }

    public static Attr createAttr(Element element, String str, Object obj) {
        if (obj == null) {
            return null;
        }
        Attr createAttribute = element.getOwnerDocument().createAttribute(str);
        createAttribute.setNodeValue(obj.toString());
        element.getAttributes().setNamedItem(createAttribute);
        return createAttribute;
    }

    public static void setAttribute(Element element, String str, Object obj) {
        if (obj != null) {
            element.setAttribute(str, obj.toString());
        } else if (element.hasAttribute(str)) {
            element.removeAttribute(str);
        }
    }

    public static String getAttribute(Element element, String str) {
        if (!element.hasAttribute(str)) {
            String localName = getLocalName(str);
            if (str.equals(localName)) {
                return null;
            }
            return getAttribute(element, localName);
        }
        return element.getAttribute(str);
    }

    public static boolean isElementByTag(Node node, String str) {
        if (!(node instanceof Element)) {
            return false;
        }
        if (str == null) {
            return true;
        }
        String tagName = ((Element) node).getTagName();
        return tagName.equals(str) || getLocalName(tagName).equals(getLocalName(str));
    }

    public static Iterator<Element> childElementIter(Node node) {
        return new ElementIterator(node);
    }

    public static Iterator<Element> childElementIterByTag(Node node, String str) {
        return new ElementIterator(node, str);
    }

    public static boolean hasChildElement(Node node) {
        return childElementIter(node).hasNext();
    }

    public static boolean hasChildElementByTag(Node node, String str) {
        return childElementIterByTag(node, str).hasNext();
    }

    public static int getElementIndex(Node node, String str, Element element) {
        Iterator<Element> childElementIterByTag = childElementIterByTag(node, str);
        int i = 0;
        while (childElementIterByTag.hasNext()) {
            if (childElementIterByTag.next() == element) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int getNodeIndex(Node node, Node node2) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (node2 == childNodes.item(i)) {
                return i;
            }
        }
        return -1;
    }

    public static Element getFirstChildElement(Node node) {
        return childElementIter(node).next();
    }

    public static Element getFirstChildElementByTag(Node node, String str) {
        return childElementIterByTag(node, str).next();
    }

    public static int getNumChildElementsByTag(Node node, String str) {
        Iterator<Element> childElementIterByTag = childElementIterByTag(node, str);
        int i = 0;
        while (childElementIterByTag.hasNext()) {
            childElementIterByTag.next();
            i++;
        }
        return i;
    }

    public static Element[] getChildElementsByTag(Node node, String str) {
        ArrayList arrayList = new ArrayList(node.getChildNodes().getLength());
        Iterator<Element> childElementIterByTag = childElementIterByTag(node, str);
        while (childElementIterByTag.hasNext()) {
            arrayList.add(childElementIterByTag.next());
        }
        return (Element[]) arrayList.toArray(new Element[arrayList.size()]);
    }

    public static Element[] getChildElements(Node node) {
        ArrayList arrayList = new ArrayList(node.getChildNodes().getLength());
        Iterator<Element> childElementIter = childElementIter(node);
        while (childElementIter.hasNext()) {
            arrayList.add(childElementIter.next());
        }
        return (Element[]) arrayList.toArray(new Element[arrayList.size()]);
    }

    public static Element ensureChildElement(Node node, String str) {
        Element firstChildElementByTag;
        if (node.getNodeType() == 9) {
            firstChildElementByTag = ((Document) node).getDocumentElement();
        } else {
            firstChildElementByTag = getFirstChildElementByTag(node, str);
        }
        return firstChildElementByTag == null ? createElement(node, str) : firstChildElementByTag;
    }

    public static void createCentalTopicElement(Node node, ITopic iTopic) {
        if (iTopic == null) {
            createElement(node, "topic");
        } else {
            createElement(node, iTopic.getTitleText());
        }
    }

    public static <T extends IAdaptable> List<T> getChildList(Element element, String str, INodeAdaptableProvider iNodeAdaptableProvider) {
        return getChildren(element, str, iNodeAdaptableProvider);
    }

    public static <T extends IAdaptable> Set<T> getChildSet(Element element, String str, INodeAdaptableProvider iNodeAdaptableProvider) {
        return unmodifiableSet(getChildren(element, str, iNodeAdaptableProvider));
    }

    public static <T extends IAdaptable> Iterator<T> getChildIterator(Element element, String str, final INodeAdaptableProvider iNodeAdaptableProvider, final Class<T> cls) {
        final Iterator<Element> childElementIterByTag = childElementIterByTag(element, str);
        return (Iterator<T>) new Iterator<T>() { // from class: org.xmind.core.util.DOMUtils.2
            IAdaptable next = findNext();

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            private IAdaptable findNext() {
                while (childElementIterByTag.hasNext()) {
                    IAdaptable adaptable = iNodeAdaptableProvider.getAdaptable((Element) childElementIterByTag.next());
                    if (adaptable != null && cls.isInstance(adaptable)) {
                        return (IAdaptable) cls.cast(adaptable);
                    }
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.next != null;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // java.util.Iterator
            public IAdaptable next() {
                IAdaptable iAdaptable = this.next;
                this.next = findNext();
                return iAdaptable;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static <T> Iterator<T> emptyIter() {
        return new Iterator<T>() { // from class: org.xmind.core.util.DOMUtils.3
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public T next() {
                return null;
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        };
    }

    public static <T extends IAdaptable> List<T> getChildren(Element element, String str, INodeAdaptableProvider iNodeAdaptableProvider) {
        ArrayList arrayList = new ArrayList(element.getChildNodes().getLength());
        Iterator<Element> childElementIterByTag = childElementIterByTag(element, str);
        while (childElementIterByTag.hasNext()) {
            IAdaptable adaptable = iNodeAdaptableProvider.getAdaptable(childElementIterByTag.next());
            if (adaptable != null) {
                arrayList.add(adaptable);
            }
        }
        return arrayList;
    }

    public static <T extends IAdaptable> List<T> getChildren(Node node, INodeAdaptableProvider iNodeAdaptableProvider) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            IAdaptable adaptable = iNodeAdaptableProvider.getAdaptable(childNodes.item(i));
            if (adaptable != null) {
                arrayList.add(adaptable);
            }
        }
        return arrayList;
    }

    public static <T> Set<T> unmodifiableSet(Collection<T> collection) {
        return new DelegateSet(collection);
    }

    public static String getTextContentByTag(Node node, String str) {
        Node firstChild;
        Element firstChildElementByTag = getFirstChildElementByTag(node, str);
        if (firstChildElementByTag == null || (firstChild = firstChildElementByTag.getFirstChild()) == null) {
            return null;
        }
        return firstChild.getTextContent();
    }

    public static void setText(Node node, String str) {
        Node findTextNode = findTextNode(node);
        if (findTextNode == null) {
            node.setTextContent(str);
        } else if (str == null) {
            node.removeChild(findTextNode);
        } else {
            findTextNode.setTextContent(str);
        }
    }

    public static Node findTextNode(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 3) {
                return item;
            }
        }
        return null;
    }

    public static void setText(Node node, String str, String str2) {
        Element firstChildElementByTag = getFirstChildElementByTag(node, str);
        if (firstChildElementByTag == null) {
            if (str2 != null) {
                createText(node, str, str2);
            }
        } else {
            setText(firstChildElementByTag, str2);
            if (firstChildElementByTag.hasChildNodes() || firstChildElementByTag.hasAttributes()) {
                return;
            }
            node.removeChild(firstChildElementByTag);
        }
    }

    public static Element addIdAttribute(Element element) {
        if (!element.hasAttribute("id")) {
            element.setAttribute("id", Core.getIdFactory().createId());
            element.setIdAttribute("id", true);
        }
        return element;
    }

    public static String replaceId(Element element) {
        String createId = Core.getIdFactory().createId();
        replaceId(element, createId);
        return createId;
    }

    public static Element replaceId(Element element, String str) {
        if (str == null) {
            return element;
        }
        element.setAttribute("id", str);
        element.setIdAttribute("id", true);
        return element;
    }

    public static boolean isOrphanNode(Node node) {
        if (node == null) {
            return true;
        }
        if (node.getNodeType() == 9) {
            return false;
        }
        return isOrphanNode(node.getParentNode());
    }

    public static Document getOwnerDocument(Node node) {
        return node.getNodeType() == 9 ? (Document) node : node.getOwnerDocument();
    }
}
