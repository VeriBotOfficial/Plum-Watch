package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.BandWidth;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class BandwidthField extends SDPField implements BandWidth {
    protected int bandwidth;
    protected String bwtype;

    public BandwidthField() {
        super(SDPFieldNames.BANDWIDTH_FIELD);
    }

    public String getBwtype() {
        return this.bwtype;
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public void setBwtype(String str) {
        this.bwtype = str;
    }

    public void setBandwidth(int i) {
        this.bandwidth = i;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.bwtype;
        String str2 = SDPFieldNames.BANDWIDTH_FIELD;
        if (str != null) {
            str2 = SDPFieldNames.BANDWIDTH_FIELD + this.bwtype + ":";
        }
        return str2 + this.bandwidth + "\r\n";
    }

    @Override // android.javax.sdp.BandWidth
    public String getType() throws SdpParseException {
        return getBwtype();
    }

    @Override // android.javax.sdp.BandWidth
    public void setType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The type is null");
        }
        setBwtype(str);
    }

    @Override // android.javax.sdp.BandWidth
    public int getValue() throws SdpParseException {
        return getBandwidth();
    }

    @Override // android.javax.sdp.BandWidth
    public void setValue(int i) throws SdpException {
        setBandwidth(i);
    }
}
