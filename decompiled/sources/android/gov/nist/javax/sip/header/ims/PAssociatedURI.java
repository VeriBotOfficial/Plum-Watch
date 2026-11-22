package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.javax.sip.address.URI;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PAssociatedURI extends AddressParametersHeader implements PAssociatedURIHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PAssociatedURI() {
        super("P-Associated-URI");
    }

    public PAssociatedURI(AddressImpl addressImpl) {
        super("P-Associated-URI");
        this.address = addressImpl;
    }

    public PAssociatedURI(GenericURI genericURI) {
        super("P-Associated-URI");
        this.address = new AddressImpl();
        this.address.setURI(genericURI);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.LESS_THAN);
        }
        this.address.encode(sb);
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.GREATER_THAN);
        }
        if (this.parameters.isEmpty()) {
            return sb;
        }
        return this.parameters.encode(sb.append(";"));
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public void setAssociatedURI(URI uri) throws NullPointerException {
        if (uri == null) {
            throw new NullPointerException("null URI");
        }
        this.address.setURI(uri);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public URI getAssociatedURI() {
        return this.address.getURI();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PAssociatedURI pAssociatedURI = (PAssociatedURI) super.clone();
        if (this.address != null) {
            pAssociatedURI.address = (AddressImpl) this.address.clone();
        }
        return pAssociatedURI;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
