package android.gov.nist.javax.sip.header;

import android.gov.nist.core.GenericObject;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.header.Header;
import com.autonavi.aps.amapapi.config.Const;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class SIPHeaderList<HDR extends SIPHeader> extends SIPHeader implements List<HDR>, Header {
    private static boolean prettyEncode = false;
    protected List<HDR> hlist;
    private Class<HDR> myClass;

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public boolean isHeaderList() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public String getName() {
        return this.headerName;
    }

    private SIPHeaderList() {
        this.hlist = new LinkedList();
    }

    protected SIPHeaderList(Class<HDR> cls, String str) {
        this();
        this.headerName = str;
        this.myClass = cls;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(HDR hdr) {
        this.hlist.add(hdr);
        return true;
    }

    public void addFirst(HDR hdr) {
        this.hlist.add(0, hdr);
    }

    public void add(HDR hdr, boolean z) {
        if (z) {
            addFirst(hdr);
        } else {
            add((SIPHeaderList<HDR>) hdr);
        }
    }

    public void concatenate(SIPHeaderList<HDR> sIPHeaderList, boolean z) throws IllegalArgumentException {
        if (!z) {
            addAll(sIPHeaderList);
        } else {
            addAll(0, sIPHeaderList);
        }
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        if (this.hlist.isEmpty()) {
            sb.append(this.headerName).append(AbstractJsonLexerKt.COLON).append("\r\n");
            return sb;
        }
        if (this.headerName.equals("WWW-Authenticate") || this.headerName.equals("Proxy-Authenticate") || this.headerName.equals("Authorization") || this.headerName.equals("Proxy-Authorization") || ((prettyEncode && (this.headerName.equals("Via") || this.headerName.equals("Route") || this.headerName.equals("Record-Route"))) || getClass().equals(ExtensionHeaderList.class))) {
            ListIterator<HDR> listIterator = this.hlist.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().encode(sb);
            }
            return sb;
        }
        sb.append(this.headerName).append(":").append(" ");
        encodeBody(sb);
        sb.append("\r\n");
        return sb;
    }

    public List<String> getHeadersAsEncodedStrings() {
        LinkedList linkedList = new LinkedList();
        ListIterator<HDR> listIterator = this.hlist.listIterator();
        while (listIterator.hasNext()) {
            linkedList.add(listIterator.next().toString());
        }
        return linkedList;
    }

    public Header getFirst() {
        List<HDR> list = this.hlist;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.hlist.get(0);
    }

    public Header getLast() {
        List<HDR> list = this.hlist;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.hlist.get(r0.size() - 1);
    }

    public Class<HDR> getMyClass() {
        return this.myClass;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.hlist.isEmpty();
    }

    @Override // java.util.List
    public ListIterator<HDR> listIterator() {
        return this.hlist.listIterator(0);
    }

    public List<HDR> getHeaderList() {
        return this.hlist;
    }

    @Override // java.util.List
    public ListIterator<HDR> listIterator(int i) {
        return this.hlist.listIterator(i);
    }

    public void removeFirst() {
        if (this.hlist.size() != 0) {
            this.hlist.remove(0);
        }
    }

    public void removeLast() {
        if (this.hlist.size() != 0) {
            this.hlist.remove(r0.size() - 1);
        }
    }

    public boolean remove(HDR hdr) {
        if (this.hlist.size() == 0) {
            return false;
        }
        return this.hlist.remove(hdr);
    }

    protected void setMyClass(Class<HDR> cls) {
        this.myClass = cls;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String debugDump(int i) {
        this.stringRepresentation = "";
        String indentation = new Indentation(i).getIndentation();
        sprint(indentation + getClass().getName());
        sprint(indentation + Const.STR_MART_JSON_BEGIN);
        Iterator<HDR> it = this.hlist.iterator();
        while (it.hasNext()) {
            sprint(indentation + it.next().debugDump());
        }
        sprint(indentation + "}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        return debugDump(0);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.hlist.toArray();
    }

    public int indexOf(GenericObject genericObject) {
        return this.hlist.indexOf(genericObject);
    }

    @Override // java.util.List
    public void add(int i, HDR hdr) throws IndexOutOfBoundsException {
        this.hlist.add(i, hdr);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SIPHeaderList)) {
            return false;
        }
        List<HDR> list = this.hlist;
        List<HDR> list2 = ((SIPHeaderList) obj).hlist;
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return list2 == null || list2.size() == 0;
        }
        return list.equals(list2);
    }

    public boolean match(SIPHeaderList<?> sIPHeaderList) {
        if (sIPHeaderList == null) {
            return true;
        }
        if (!getClass().equals(sIPHeaderList.getClass())) {
            return false;
        }
        List<HDR> list = this.hlist;
        List<?> list2 = sIPHeaderList.hlist;
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<?> it = list2.iterator();
        while (it.hasNext()) {
            SIPHeader sIPHeader = (SIPHeader) it.next();
            Iterator<HDR> it2 = this.hlist.iterator();
            boolean z = false;
            while (it2.hasNext() && !z) {
                z = it2.next().match(sIPHeader);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        try {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) getClass().getConstructor(null).newInstance(null);
            sIPHeaderList.headerName = this.headerName;
            sIPHeaderList.myClass = this.myClass;
            return sIPHeaderList.clonehlist(this.hlist);
        } catch (Exception e) {
            throw new RuntimeException("Could not clone!", e);
        }
    }

    protected final SIPHeaderList<HDR> clonehlist(List<HDR> list) {
        if (list != null) {
            Iterator<HDR> it = list.iterator();
            while (it.hasNext()) {
                this.hlist.add((SIPHeader) it.next().clone());
            }
        }
        return this;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.hlist.size();
    }

    protected String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        ListIterator<HDR> listIterator = listIterator();
        while (true) {
            HDR next = listIterator.next();
            if (next == this) {
                throw new RuntimeException("Unexpected circularity in SipHeaderList");
            }
            next.encodeBody(sb);
            if (!listIterator.hasNext()) {
                return sb;
            }
            if (!this.headerName.equals("Privacy")) {
                sb.append(",");
            } else {
                sb.append(";");
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends HDR> collection) {
        return this.hlist.addAll(collection);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends HDR> collection) {
        return this.hlist.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.hlist.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.hlist.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.hlist.contains(obj);
    }

    @Override // java.util.List
    public HDR get(int i) {
        return this.hlist.get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.hlist.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<HDR> iterator() {
        return this.hlist.listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.hlist.lastIndexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.hlist.remove(obj);
    }

    @Override // java.util.List
    public HDR remove(int i) {
        return this.hlist.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.hlist.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.hlist.retainAll(collection);
    }

    @Override // java.util.List
    public List<HDR> subList(int i, int i2) {
        return this.hlist.subList(i, i2);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public int hashCode() {
        return this.headerName.hashCode();
    }

    @Override // java.util.List
    public HDR set(int i, HDR hdr) {
        return this.hlist.set(i, hdr);
    }

    public static void setPrettyEncode(boolean z) {
        prettyEncode = z;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.hlist.toArray(tArr);
    }
}
