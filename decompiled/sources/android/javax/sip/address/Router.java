package android.javax.sip.address;

import android.javax.sip.SipException;
import android.javax.sip.message.Request;
import java.util.ListIterator;

/* loaded from: classes.dex */
public interface Router {
    Hop getNextHop(Request request) throws SipException;

    ListIterator getNextHops(Request request);

    Hop getOutboundProxy();
}
