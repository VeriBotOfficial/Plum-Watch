package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ExtensionHeader;

/* loaded from: classes.dex */
public class ExtensionHeaderImpl extends SIPHeader implements ExtensionHeader {
    private static final long serialVersionUID = -8693922839612081849L;
    protected String value;

    public ExtensionHeaderImpl() {
    }

    public ExtensionHeaderImpl(String str) {
        super(str);
    }

    public void setName(String str) {
        this.headerName = str;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) {
        this.value = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public String getHeaderValue() {
        String str = this.value;
        if (str != null) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder(encode());
            while (sb.length() > 0 && sb.charAt(0) != ':') {
                sb.deleteCharAt(0);
            }
            sb.deleteCharAt(0);
            String trim = sb.toString().trim();
            this.value = trim;
            return trim;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return new StringBuffer(this.headerName).append(": ").append(this.value).append("\r\n").toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(encodeBody());
    }

    public String encodeBody() {
        return getHeaderValue();
    }
}
