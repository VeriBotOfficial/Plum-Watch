package android.gov.nist.core;

import com.autonavi.aps.amapapi.config.Const;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class GenericObjectList extends LinkedList<GenericObject> implements Serializable, Cloneable {
    protected static final String AND = "&";
    protected static final String AT = "@";
    protected static final String COLON = ":";
    protected static final String COMMA = ",";
    protected static final String DOT = ".";
    protected static final String DOUBLE_QUOTE = "\"";
    protected static final String EQUALS = "=";
    protected static final String GREATER_THAN = ">";
    protected static final String HT = "\t";
    protected static final String LESS_THAN = "<";
    protected static final String LPAREN = "(";
    protected static final String NEWLINE = "\r\n";
    protected static final String PERCENT = "%";
    protected static final String POUND = "#";
    protected static final String QUESTION = "?";
    protected static final String QUOTE = "'";
    protected static final String RETURN = "\n";
    protected static final String RPAREN = ")";
    protected static final String SEMICOLON = ";";
    protected static final String SLASH = "/";
    protected static final String SP = " ";
    protected static final String STAR = "*";
    protected int indentation;
    protected String listName;
    protected Class<?> myClass;
    private ListIterator<? extends GenericObject> myListIterator;
    private String stringRep;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return 42;
    }

    protected String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    protected static boolean isCloneable(Object obj) {
        return obj instanceof Cloneable;
    }

    public static boolean isMySubclass(Class<?> cls) {
        return GenericObjectList.class.isAssignableFrom(cls);
    }

    @Override // java.util.LinkedList
    public Object clone() {
        GenericObjectList genericObjectList = (GenericObjectList) super.clone();
        ListIterator listIterator = genericObjectList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set((GenericObject) ((GenericObject) listIterator.next()).clone());
        }
        return genericObjectList;
    }

    public void setMyClass(Class cls) {
        this.myClass = cls;
    }

    protected GenericObjectList() {
        this.listName = null;
        this.stringRep = "";
    }

    protected GenericObjectList(String str) {
        this();
        this.listName = str;
    }

    protected GenericObjectList(String str, String str2) {
        this(str);
        try {
            this.myClass = Class.forName(str2);
        } catch (ClassNotFoundException e) {
            InternalErrorHandler.handleException(e);
        }
    }

    protected GenericObjectList(String str, Class cls) {
        this(str);
        this.myClass = cls;
    }

    protected GenericObject next(ListIterator listIterator) {
        try {
            return (GenericObject) listIterator.next();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    protected GenericObject first() {
        ListIterator<GenericObject> listIterator = listIterator(0);
        this.myListIterator = listIterator;
        try {
            return listIterator.next();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    protected GenericObject next() {
        if (this.myListIterator == null) {
            this.myListIterator = listIterator(0);
        }
        try {
            return this.myListIterator.next();
        } catch (NoSuchElementException unused) {
            this.myListIterator = null;
            return null;
        }
    }

    protected void concatenate(GenericObjectList genericObjectList) {
        concatenate(genericObjectList, false);
    }

    protected void concatenate(GenericObjectList genericObjectList, boolean z) {
        if (!z) {
            addAll(genericObjectList);
        } else {
            addAll(0, genericObjectList);
        }
    }

    private void sprint(String str) {
        if (str == null) {
            this.stringRep += getIndentation();
            this.stringRep += "<null>\n";
            return;
        }
        if (str.compareTo("}") == 0 || str.compareTo("]") == 0) {
            this.indentation--;
        }
        this.stringRep += getIndentation();
        this.stringRep += str;
        this.stringRep += "\n";
        if (str.compareTo(Const.STR_MART_JSON_BEGIN) == 0 || str.compareTo("[") == 0) {
            this.indentation++;
        }
    }

    public String debugDump() {
        this.stringRep = "";
        GenericObject first = first();
        if (first == null) {
            return "<null>";
        }
        sprint("listName:");
        sprint(this.listName);
        sprint(Const.STR_MART_JSON_BEGIN);
        while (first != null) {
            sprint("[");
            sprint(first.debugDump(this.indentation));
            first = next();
            sprint("]");
        }
        sprint("}");
        return this.stringRep;
    }

    public String debugDump(int i) {
        int i2 = this.indentation;
        this.indentation = i;
        String debugDump = debugDump();
        this.indentation = i2;
        return debugDump;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addFirst(GenericObject genericObject) {
        if (this.myClass == null) {
            this.myClass = genericObject.getClass();
        } else {
            super.addFirst((GenericObjectList) genericObject);
        }
    }

    public void mergeObjects(GenericObjectList genericObjectList) {
        if (genericObjectList == null) {
            return;
        }
        ListIterator listIterator = listIterator();
        ListIterator listIterator2 = genericObjectList.listIterator();
        while (listIterator.hasNext()) {
            GenericObject genericObject = (GenericObject) listIterator.next();
            while (listIterator2.hasNext()) {
                genericObject.merge(listIterator2.next());
            }
        }
    }

    public String encode() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ListIterator listIterator = listIterator();
        if (listIterator.hasNext()) {
            while (true) {
                Object next = listIterator.next();
                if (next instanceof GenericObject) {
                    sb.append(((GenericObject) next).encode());
                } else {
                    sb.append(next.toString());
                }
                if (!listIterator.hasNext()) {
                    break;
                }
                sb.append(";");
            }
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return encode();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObjectList genericObjectList = (GenericObjectList) obj;
        if (size() != genericObjectList.size()) {
            return false;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            do {
                try {
                } catch (NoSuchElementException unused) {
                    return false;
                }
            } while (!listIterator.next().equals(genericObjectList.listIterator().next()));
        }
        ListIterator listIterator2 = genericObjectList.listIterator();
        while (listIterator2.hasNext()) {
            do {
                try {
                } catch (NoSuchElementException unused2) {
                    return false;
                }
            } while (!listIterator2.next().equals(listIterator().next()));
        }
        return true;
    }

    public boolean match(Object obj) {
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        ListIterator listIterator = ((GenericObjectList) obj).listIterator();
        if (!listIterator.hasNext()) {
            return true;
        }
        Object next = listIterator.next();
        ListIterator listIterator2 = listIterator();
        while (listIterator2.hasNext()) {
            Object next2 = listIterator2.next();
            if (next2 instanceof GenericObject) {
                System.out.println("Trying to match  = " + ((GenericObject) next2).encode());
            }
            if (GenericObject.isMySubclass(next2.getClass()) && ((GenericObject) next2).match(next)) {
                return true;
            }
            if (isMySubclass(next2.getClass()) && ((GenericObjectList) next2).match(next)) {
                return true;
            }
        }
        System.out.println(((GenericObject) next).encode());
        return false;
    }
}
