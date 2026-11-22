package android.gov.nist.javax.sip.address;

import android.javax.sip.address.AddressFactory;
import android.javax.sip.address.SipURI;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface AddressFactoryEx extends AddressFactory {
    SipURI createSipURI(String str) throws ParseException;
}
