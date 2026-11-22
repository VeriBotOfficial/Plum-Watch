package android.gov.nist.javax.sip.header;

import android.javax.sip.header.SupportedHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Supported extends SIPHeader implements SupportedHeader {
    private static final long serialVersionUID = -7679667592702854542L;
    protected String optionTag;

    public Supported() {
        super("Supported");
        this.optionTag = null;
    }

    public Supported(String str) {
        super("Supported");
        this.optionTag = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.headerName + ":";
        if (this.optionTag != null) {
            str = str + " " + this.optionTag;
        }
        return str + "\r\n";
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.optionTag;
        return str != null ? sb.append(str) : sb.append("");
    }

    @Override // android.javax.sip.header.OptionTag
    public void setOptionTag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Supported, setOptionTag(), the optionTag parameter is null");
        }
        this.optionTag = str;
    }

    @Override // android.javax.sip.header.OptionTag
    public String getOptionTag() {
        return this.optionTag;
    }
}
