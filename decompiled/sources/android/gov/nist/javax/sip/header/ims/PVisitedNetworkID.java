package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PVisitedNetworkID extends ParametersHeader implements PVisitedNetworkIDHeader, SIPHeaderNamesIms, ExtensionHeader {
    private boolean isQuoted;
    private String networkID;

    public PVisitedNetworkID() {
        super("P-Visited-Network-ID");
    }

    public PVisitedNetworkID(String str) {
        super("P-Visited-Network-ID");
        setVisitedNetworkID(str);
    }

    public PVisitedNetworkID(Token token) {
        super("P-Visited-Network-ID");
        setVisitedNetworkID(token.getTokenValue());
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (getVisitedNetworkID() != null) {
            if (this.isQuoted) {
                sb.append("\"").append(getVisitedNetworkID()).append("\"");
            } else {
                sb.append(getVisitedNetworkID());
            }
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public void setVisitedNetworkID(String str) {
        if (str == null) {
            throw new NullPointerException(" the networkID parameter is null");
        }
        this.networkID = str;
        this.isQuoted = true;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public void setVisitedNetworkID(Token token) {
        if (token == null) {
            throw new NullPointerException(" the networkID parameter is null");
        }
        this.networkID = token.getTokenValue();
        this.isQuoted = false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public String getVisitedNetworkID() {
        return this.networkID;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PVisitedNetworkIDHeader) {
            PVisitedNetworkIDHeader pVisitedNetworkIDHeader = (PVisitedNetworkIDHeader) obj;
            if (getVisitedNetworkID().equals(pVisitedNetworkIDHeader.getVisitedNetworkID()) && equalParameters(pVisitedNetworkIDHeader)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PVisitedNetworkID pVisitedNetworkID = (PVisitedNetworkID) super.clone();
        String str = this.networkID;
        if (str != null) {
            pVisitedNetworkID.networkID = str;
        }
        pVisitedNetworkID.isQuoted = this.isQuoted;
        return pVisitedNetworkID;
    }
}
