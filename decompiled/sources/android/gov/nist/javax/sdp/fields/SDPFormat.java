package android.gov.nist.javax.sdp.fields;

/* loaded from: classes.dex */
public class SDPFormat extends SDPObject {
    protected String format;

    public void setFormat(String str) {
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }

    public SDPFormat(String str) {
        this.format = str;
    }

    public SDPFormat() {
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.format;
    }
}
