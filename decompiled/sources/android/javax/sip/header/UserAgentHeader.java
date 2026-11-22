package android.javax.sip.header;

import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public interface UserAgentHeader extends Header {
    public static final String NAME = "User-Agent";

    ListIterator getProduct();

    void setProduct(List list) throws ParseException;
}
