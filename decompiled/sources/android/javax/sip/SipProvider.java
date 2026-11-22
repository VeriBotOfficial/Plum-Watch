package android.javax.sip;

import android.javax.sip.header.CallIdHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.util.TooManyListenersException;

/* loaded from: classes.dex */
public interface SipProvider {
    void addListeningPoint(ListeningPoint listeningPoint) throws ObjectInUseException, TransportAlreadySupportedException;

    void addSipListener(SipListener sipListener) throws TooManyListenersException;

    ListeningPoint getListeningPoint();

    ListeningPoint getListeningPoint(String str);

    ListeningPoint[] getListeningPoints();

    CallIdHeader getNewCallId();

    ClientTransaction getNewClientTransaction(Request request) throws TransactionUnavailableException;

    Dialog getNewDialog(Transaction transaction) throws SipException;

    ServerTransaction getNewServerTransaction(Request request) throws TransactionAlreadyExistsException, TransactionUnavailableException;

    SipStack getSipStack();

    void removeListeningPoint(ListeningPoint listeningPoint) throws ObjectInUseException;

    void removeSipListener(SipListener sipListener);

    void sendRequest(Request request) throws SipException;

    void sendResponse(Response response) throws SipException;

    void setAutomaticDialogSupportEnabled(boolean z);

    void setListeningPoint(ListeningPoint listeningPoint) throws ObjectInUseException;
}
