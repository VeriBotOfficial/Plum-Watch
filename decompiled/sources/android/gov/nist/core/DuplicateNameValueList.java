package android.gov.nist.core;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DuplicateNameValueList implements Serializable, Cloneable {
    private static final long serialVersionUID = -5611332957903796952L;
    private MultiValueMapImpl<NameValue> nameValueMap = new MultiValueMapImpl<>();

    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    public StringBuilder encode(StringBuilder sb) {
        if (!this.nameValueMap.isEmpty()) {
            Iterator it = this.nameValueMap.values().iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next instanceof GenericObject) {
                        ((GenericObject) next).encode(sb);
                    } else {
                        sb.append(next.toString());
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(";");
                }
            }
        }
        return sb;
    }

    public String toString() {
        return encode();
    }

    public void set(NameValue nameValue) {
        this.nameValueMap.put(nameValue.getName().toLowerCase(), (String) nameValue);
    }

    public void set(String str, Object obj) {
        this.nameValueMap.put(str.toLowerCase(), (String) new NameValue(str, obj));
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        DuplicateNameValueList duplicateNameValueList = (DuplicateNameValueList) obj;
        if (this.nameValueMap.size() != duplicateNameValueList.nameValueMap.size()) {
            return false;
        }
        for (String str : this.nameValueMap.keySet()) {
            Collection nameValue = getNameValue(str);
            List<NameValue> list = duplicateNameValueList.nameValueMap.get((Object) str);
            if (list == null || !list.equals(nameValue)) {
                return false;
            }
        }
        return true;
    }

    public Object getValue(String str) {
        Collection nameValue = getNameValue(str.toLowerCase());
        if (nameValue != null) {
            return nameValue;
        }
        return null;
    }

    public Collection getNameValue(String str) {
        return this.nameValueMap.get((Object) str.toLowerCase());
    }

    public boolean hasNameValue(String str) {
        return this.nameValueMap.containsKey(str.toLowerCase());
    }

    public boolean delete(String str) {
        String lowerCase = str.toLowerCase();
        if (!this.nameValueMap.containsKey(lowerCase)) {
            return false;
        }
        this.nameValueMap.remove((Object) lowerCase);
        return true;
    }

    public Object clone() {
        DuplicateNameValueList duplicateNameValueList = new DuplicateNameValueList();
        Iterator it = this.nameValueMap.values().iterator();
        while (it.hasNext()) {
            duplicateNameValueList.set((NameValue) ((NameValue) it.next()).clone());
        }
        return duplicateNameValueList;
    }

    public Iterator<NameValue> iterator() {
        return this.nameValueMap.values().iterator();
    }

    public Iterator<String> getNames() {
        return this.nameValueMap.keySet().iterator();
    }

    public String getParameter(String str) {
        Object value = getValue(str);
        if (value == null) {
            return null;
        }
        if (value instanceof GenericObject) {
            return ((GenericObject) value).encode();
        }
        return value.toString();
    }

    public void clear() {
        this.nameValueMap.clear();
    }

    public boolean isEmpty() {
        return this.nameValueMap.isEmpty();
    }

    public NameValue put(String str, NameValue nameValue) {
        return (NameValue) this.nameValueMap.put(str, (String) nameValue);
    }

    public NameValue remove(Object obj) {
        return (NameValue) this.nameValueMap.remove(obj);
    }

    public int size() {
        return this.nameValueMap.size();
    }

    public Collection<NameValue> values() {
        return this.nameValueMap.values();
    }

    public int hashCode() {
        return this.nameValueMap.keySet().hashCode();
    }
}
