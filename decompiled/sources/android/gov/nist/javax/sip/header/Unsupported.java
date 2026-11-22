package android.gov.nist.javax.sip.header;

import android.javax.sip.header.UnsupportedHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Unsupported extends SIPHeader implements UnsupportedHeader {
    private static final long serialVersionUID = -2479414149440236199L;
    protected String optionTag;

    public Unsupported() {
        super("Unsupported");
    }

    public Unsupported(String str) {
        super("Unsupported");
        this.optionTag = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.optionTag);
    }

    @Override // android.javax.sip.header.OptionTag
    public String getOptionTag() {
        return this.optionTag;
    }

    @Override // android.javax.sip.header.OptionTag
    public void setOptionTag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,  Unsupported, setOptionTag(), The option tag parameter is null");
        }
        this.optionTag = str;
    }
}
