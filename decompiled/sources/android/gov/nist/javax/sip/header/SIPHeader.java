package android.gov.nist.javax.sip.header;

import android.javax.sip.header.Header;

/* loaded from: classes.dex */
public abstract class SIPHeader extends SIPObject implements SIPHeaderNames, Header, HeaderExt {
    protected String headerName;

    protected abstract StringBuilder encodeBody(StringBuilder sb);

    public boolean isHeaderList() {
        return false;
    }

    protected SIPHeader(String str) {
        this.headerName = str.intern();
    }

    public SIPHeader() {
    }

    public String getHeaderName() {
        return this.headerName;
    }

    public String getName() {
        return this.headerName;
    }

    public void setHeaderName(String str) {
        this.headerName = str;
    }

    public String getHeaderValue() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(this.headerName).append(":").append(" ");
        encodeBody(sb);
        sb.append("\r\n");
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderExt
    public String getValue() {
        return getHeaderValue();
    }

    public int hashCode() {
        return this.headerName.hashCode();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.javax.sip.header.Header
    public final String toString() {
        return encode();
    }
}
