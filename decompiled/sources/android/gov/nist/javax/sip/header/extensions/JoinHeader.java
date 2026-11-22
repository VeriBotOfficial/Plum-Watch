package android.gov.nist.javax.sip.header.extensions;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface JoinHeader extends Parameters, Header {
    public static final String NAME = "Join";

    String getCallId();

    String getFromTag();

    String getToTag();

    void setCallId(String str) throws ParseException;

    void setFromTag(String str) throws ParseException;

    void setToTag(String str) throws ParseException;
}
