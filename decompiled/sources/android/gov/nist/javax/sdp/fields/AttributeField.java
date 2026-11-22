package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.NameValue;
import android.javax.sdp.Attribute;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class AttributeField extends SDPField implements Attribute {
    protected NameValue attribute;

    public NameValue getAttribute() {
        return this.attribute;
    }

    public AttributeField() {
        super(SDPFieldNames.ATTRIBUTE_FIELD);
    }

    public void setAttribute(NameValue nameValue) {
        this.attribute = nameValue;
        nameValue.setSeparator(":");
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        NameValue nameValue = this.attribute;
        String str = SDPFieldNames.ATTRIBUTE_FIELD;
        if (nameValue != null) {
            str = SDPFieldNames.ATTRIBUTE_FIELD + this.attribute.encode();
        }
        return str + "\r\n";
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    @Override // android.javax.sdp.Attribute
    public String getName() throws SdpParseException {
        String name;
        NameValue attribute = getAttribute();
        if (attribute == null || (name = attribute.getName()) == null) {
            return null;
        }
        return name;
    }

    @Override // android.javax.sdp.Attribute
    public void setName(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The name is null");
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setName(str);
        setAttribute(attribute);
    }

    @Override // android.javax.sdp.Attribute
    public boolean hasValue() throws SdpParseException {
        NameValue attribute = getAttribute();
        return (attribute == null || attribute.getValueAsObject() == null) ? false : true;
    }

    @Override // android.javax.sdp.Attribute
    public String getValue() throws SdpParseException {
        Object valueAsObject;
        NameValue attribute = getAttribute();
        if (attribute == null || (valueAsObject = attribute.getValueAsObject()) == null) {
            return null;
        }
        if (valueAsObject instanceof String) {
            return (String) valueAsObject;
        }
        return valueAsObject.toString();
    }

    @Override // android.javax.sdp.Attribute
    public void setValue(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The value is null");
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    public void setValueAllowNull(String str) {
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AttributeField attributeField = (AttributeField) super.clone();
        NameValue nameValue = this.attribute;
        if (nameValue != null) {
            attributeField.attribute = (NameValue) nameValue.clone();
        }
        return attributeField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof AttributeField)) {
            return false;
        }
        AttributeField attributeField = (AttributeField) obj;
        boolean equalsIgnoreCase = attributeField.getAttribute().getName().equalsIgnoreCase(getAttribute().getName());
        if (getAttribute().getValueAsObject() != null) {
            z = getAttribute().getValueAsObject().equals(attributeField.getAttribute().getValueAsObject());
        } else {
            z = attributeField.getAttribute().getValueAsObject() == null;
        }
        return equalsIgnoreCase && z;
    }

    public int hashCode() {
        if (getAttribute() == null) {
            throw new UnsupportedOperationException("Attribute is null cannot compute hashCode ");
        }
        return encode().hashCode();
    }
}
