package android.gov.nist.core;

import java.util.Map;

/* loaded from: classes.dex */
public class NameValue extends GenericObject implements Map.Entry<String, String> {
    private static final long serialVersionUID = -1857729012596437950L;
    protected final boolean isFlagParameter;
    protected boolean isQuotedString;
    private String name;
    private String quotes;
    private String separator;
    private Object value;

    public NameValue() {
        this.name = null;
        this.value = "";
        this.separator = "=";
        this.quotes = "";
        this.isFlagParameter = false;
    }

    public NameValue(String str, Object obj, boolean z) {
        this.name = str;
        this.value = obj;
        this.separator = "=";
        this.quotes = "";
        this.isFlagParameter = z;
    }

    public NameValue(String str, Object obj) {
        this(str, obj, false);
    }

    public void setSeparator(String str) {
        this.separator = str;
    }

    public void setQuotedValue() {
        this.isQuotedString = true;
        this.quotes = "\"";
    }

    public boolean isValueQuoted() {
        return this.isQuotedString;
    }

    public String getName() {
        return this.name;
    }

    public Object getValueAsObject() {
        return getValueAsObject(true);
    }

    public Object getValueAsObject(boolean z) {
        if (this.isFlagParameter) {
            return "";
        }
        if (!z && this.isQuotedString) {
            return this.quotes + this.value.toString() + this.quotes;
        }
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValueAsObject(Object obj) {
        this.value = obj;
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        Object obj;
        Object obj2;
        String str = this.name;
        if (str == null || (obj2 = this.value) == null || this.isFlagParameter) {
            if (str == null && (obj = this.value) != null) {
                if (GenericObject.isMySubclass(obj.getClass())) {
                    ((GenericObject) this.value).encode(sb);
                    return sb;
                }
                if (GenericObjectList.isMySubclass(this.value.getClass())) {
                    sb.append(((GenericObjectList) this.value).encode());
                    return sb;
                }
                sb.append(this.quotes).append(this.value.toString()).append(this.quotes);
                return sb;
            }
            if (str != null && (this.value == null || this.isFlagParameter)) {
                sb.append(str);
            }
            return sb;
        }
        if (GenericObject.isMySubclass(obj2.getClass())) {
            GenericObject genericObject = (GenericObject) this.value;
            sb.append(this.name).append(this.separator).append(this.quotes);
            genericObject.encode(sb);
            sb.append(this.quotes);
            return sb;
        }
        if (GenericObjectList.isMySubclass(this.value.getClass())) {
            sb.append(this.name).append(this.separator).append(((GenericObjectList) this.value).encode());
            return sb;
        }
        if (this.value.toString().length() == 0) {
            if (this.isQuotedString) {
                sb.append(this.name).append(this.separator).append(this.quotes).append(this.quotes);
                return sb;
            }
            sb.append(this.name).append(this.separator);
            return sb;
        }
        sb.append(this.name).append(this.separator).append(this.quotes).append(this.value.toString()).append(this.quotes);
        return sb;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        NameValue nameValue = (NameValue) super.clone();
        Object obj = this.value;
        if (obj != null) {
            nameValue.value = makeClone(obj);
        }
        return nameValue;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        String str;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        NameValue nameValue = (NameValue) obj;
        if (this == nameValue) {
            return true;
        }
        String str2 = this.name;
        if ((str2 == null && nameValue.name != null) || (str2 != null && nameValue.name == null)) {
            return false;
        }
        if (str2 != null && (str = nameValue.name) != null && str2.compareToIgnoreCase(str) != 0) {
            return false;
        }
        Object obj2 = this.value;
        if ((obj2 != null && nameValue.value == null) || (obj2 == null && nameValue.value != null)) {
            return false;
        }
        Object obj3 = nameValue.value;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 instanceof String) {
            if (this.isQuotedString) {
                return obj2.equals(obj3);
            }
            return ((String) obj2).compareToIgnoreCase((String) obj3) == 0;
        }
        return obj2.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.name;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        String str2 = this.value == null ? null : str;
        this.value = str;
        return str2;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return encode().toLowerCase().hashCode();
    }
}
