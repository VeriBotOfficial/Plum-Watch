package android.gov.nist.javax.sip.header;

import android.javax.sip.header.UserAgentHeader;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class UserAgent extends SIPHeader implements UserAgentHeader {
    private static final long serialVersionUID = 4561239179796364295L;
    protected List productTokens;

    private StringBuilder encodeProduct(StringBuilder sb) {
        ListIterator listIterator = this.productTokens.listIterator();
        while (listIterator.hasNext()) {
            sb.append((String) listIterator.next());
        }
        return sb;
    }

    public void addProductToken(String str) {
        this.productTokens.add(str);
    }

    public UserAgent() {
        super("User-Agent");
        this.productTokens = new LinkedList();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return encodeProduct(sb);
    }

    @Override // android.javax.sip.header.UserAgentHeader
    public ListIterator getProduct() {
        List list = this.productTokens;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.productTokens.listIterator();
    }

    @Override // android.javax.sip.header.UserAgentHeader
    public void setProduct(List list) throws ParseException {
        if (list == null) {
            throw new NullPointerException("JAIN-SIP Exception, UserAgent, setProduct(), the  product parameter is null");
        }
        this.productTokens = list;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        UserAgent userAgent = (UserAgent) super.clone();
        if (this.productTokens != null) {
            userAgent.productTokens = new LinkedList(this.productTokens);
        }
        return userAgent;
    }
}
