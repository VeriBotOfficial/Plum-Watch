package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.header.RouteHeader;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class Route extends AddressParametersHeader implements RouteHeader {
    private static final long serialVersionUID = 5683577362998368846L;

    public Route() {
        super("Route");
    }

    public Route(AddressImpl addressImpl) {
        super("Route");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public int hashCode() {
        return this.address.getHostPort().encode().toLowerCase().hashCode();
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        if (this.address.getAddressType() != 1) {
            sb.append(Typography.less);
            this.address.encode(sb);
            sb.append(Typography.greater);
        } else {
            this.address.encode(sb);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof RouteHeader) && super.equals(obj);
    }
}
