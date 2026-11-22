package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.WWWAuthenticateHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface WWWAuthenticateHeaderIms extends WWWAuthenticateHeader {
    public static final String CK = "ck";
    public static final String IK = "ik";

    String getCK();

    String getIK();

    void setCK(String str) throws ParseException;

    void setIK(String str) throws ParseException;
}
