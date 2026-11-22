package android.javax.sip.address;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.Parameters;
import java.text.ParseException;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SipURI extends URI, Parameters {
    String getHeader(String str);

    Iterator getHeaderNames();

    String getHost();

    String getMAddrParam();

    String getMethodParam();

    int getPort();

    int getTTLParam();

    String getTransportParam();

    String getUser();

    String getUserParam();

    String getUserPassword();

    boolean hasLrParam();

    boolean isSecure();

    void removePort();

    void setHeader(String str, String str2) throws ParseException;

    void setHost(String str) throws ParseException;

    void setLrParam();

    void setMAddrParam(String str) throws ParseException;

    void setMethodParam(String str) throws ParseException;

    void setPort(int i);

    void setSecure(boolean z);

    void setTTLParam(int i) throws InvalidArgumentException;

    void setTransportParam(String str) throws ParseException;

    void setUser(String str) throws ParseException;

    void setUserParam(String str) throws ParseException;

    void setUserPassword(String str) throws ParseException;

    @Override // android.javax.sip.address.URI
    String toString();
}
