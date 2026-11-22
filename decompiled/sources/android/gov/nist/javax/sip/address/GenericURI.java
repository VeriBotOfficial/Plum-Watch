package android.gov.nist.javax.sip.address;

import android.javax.sip.address.URI;
import java.text.ParseException;

/* loaded from: classes.dex */
public class GenericURI extends NetObject implements URI {
    public static final String ISUB = "isub";
    public static final String PHONE_CONTEXT_TAG = "context-tag";
    public static final String POSTDIAL = "postdial";
    public static final String PROVIDER_TAG = "provider-tag";
    public static final String SIP = "sip";
    public static final String SIPS = "sips";
    public static final String TEL = "tel";
    private static final long serialVersionUID = 3237685256878068790L;
    protected String scheme;
    protected String uriString;

    protected GenericURI() {
    }

    public GenericURI(String str) throws ParseException {
        try {
            this.uriString = str;
            this.scheme = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new ParseException("GenericURI, Bad URI format", 0);
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return this.uriString;
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        return sb.append(this.uriString);
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.javax.sip.address.URI
    public String toString() {
        return encode();
    }

    @Override // android.javax.sip.address.URI
    public String getScheme() {
        return this.scheme;
    }

    @Override // android.javax.sip.address.URI
    public boolean isSipURI() {
        return this instanceof SipUri;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof URI) {
            return toString().equalsIgnoreCase(((URI) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
