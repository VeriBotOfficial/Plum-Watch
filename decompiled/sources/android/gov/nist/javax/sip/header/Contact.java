package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.address.Address;
import android.javax.sip.header.ContactHeader;
import java.text.ParseException;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class Contact extends AddressParametersHeader implements ContactHeader {
    public static final String ACTION = "action";
    public static final String EXPIRES = "expires";
    public static final String PROXY = "proxy";
    public static final String Q = "q";
    public static final String REDIRECT = "redirect";
    private static final long serialVersionUID = 1677294871695706288L;
    private ContactList contactList;
    protected boolean wildCardFlag;

    public Contact() {
        super("Contact");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase("methods")) {
            nameValue2.setQuotedValue();
        }
        this.parameters.set(nameValue2);
    }

    protected String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        if (this.wildCardFlag) {
            sb.append('*');
            return sb;
        }
        if (this.address.getAddressType() == 1) {
            this.address.encode(sb);
        } else {
            sb.append(Typography.less);
            this.address.encode(sb);
            sb.append(Typography.greater);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    public ContactList getContactList() {
        return this.contactList;
    }

    public boolean getWildCardFlag() {
        return this.wildCardFlag;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.javax.sip.header.HeaderAddress
    public Address getAddress() {
        return this.address;
    }

    public NameValueList getContactParms() {
        return this.parameters;
    }

    @Override // android.javax.sip.header.ContactHeader
    public int getExpires() {
        return getParameterAsInt("expires");
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setExpires(int i) {
        this.parameters.set("expires", Integer.valueOf(i));
    }

    @Override // android.javax.sip.header.ContactHeader
    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public void setWildCardFlag(boolean z) {
        this.wildCardFlag = true;
        this.address = new AddressImpl();
        this.address.setWildCardFlag();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.javax.sip.header.HeaderAddress
    public void setAddress(Address address) {
        if (address == null) {
            throw new NullPointerException("null address");
        }
        this.address = (AddressImpl) address;
        this.wildCardFlag = false;
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setQValue(float f) throws InvalidArgumentException {
        if (f != -1.0f && (f < 0.0f || f > 1.0f)) {
            throw new InvalidArgumentException("JAIN-SIP Exception, Contact, setQValue(), the qValue is not between 0 and 1");
        }
        this.parameters.set("q", Float.valueOf(f));
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Contact contact = (Contact) super.clone();
        ContactList contactList = this.contactList;
        if (contactList != null) {
            contact.contactList = (ContactList) contactList.clone();
        }
        return contact;
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setWildCard() {
        setWildCardFlag(true);
    }

    @Override // android.javax.sip.header.ContactHeader
    public boolean isWildCard() {
        return this.address.isWildcard();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof ContactHeader) && super.equals(obj);
    }

    public void removeSipInstanceParam() {
        if (this.parameters != null) {
            this.parameters.delete(ParameterNames.SIP_INSTANCE);
        }
    }

    public String getSipInstanceParam() {
        return (String) this.parameters.getValue(ParameterNames.SIP_INSTANCE);
    }

    public void setSipInstanceParam(String str) {
        this.parameters.set(ParameterNames.SIP_INSTANCE, str);
    }

    public void removePubGruuParam() {
        if (this.parameters != null) {
            this.parameters.delete(ParameterNames.PUB_GRUU);
        }
    }

    public String getPubGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.PUB_GRUU);
    }

    public void setPubGruuParam(String str) {
        this.parameters.set(ParameterNames.PUB_GRUU, str);
    }

    public void removeTempGruuParam() {
        if (this.parameters != null) {
            this.parameters.delete(ParameterNames.TEMP_GRUU);
        }
    }

    public String getTempGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.TEMP_GRUU);
    }

    public void setTempGruuParam(String str) {
        this.parameters.set(ParameterNames.TEMP_GRUU, str);
    }
}
