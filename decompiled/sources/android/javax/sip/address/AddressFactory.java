package android.javax.sip.address;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface AddressFactory {
    Address createAddress(URI uri);

    Address createAddress(String str) throws ParseException;

    Address createAddress(String str, URI uri) throws ParseException;

    SipURI createSipURI(String str, String str2) throws ParseException;

    TelURL createTelURL(String str) throws ParseException;

    URI createURI(String str) throws ParseException;
}
