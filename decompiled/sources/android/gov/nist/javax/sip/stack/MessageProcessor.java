package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.header.Via;
import android.javax.sip.InvalidArgumentException;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class MessageProcessor {
    protected static final String IN6_ADDR_ANY = "::0";
    protected static final String IN_ADDR_ANY = "0.0.0.0";
    private static StackLogger logger = CommonLogger.getLogger(MessageProcessor.class);
    private InetAddress ipAddress;
    private ListeningPointImpl listeningPoint;
    private int port;
    private String savedIpAddress;
    private String sentBy;
    private HostPort sentByHostPort;
    private boolean sentBySet;
    protected SIPTransactionStack sipStack;
    protected String transport;

    public abstract MessageChannel createMessageChannel(HostPort hostPort) throws IOException;

    public abstract MessageChannel createMessageChannel(InetAddress inetAddress, int i) throws IOException;

    public abstract int getDefaultTargetPort();

    public abstract int getMaximumMessageSize();

    public abstract SIPTransactionStack getSIPStack();

    public abstract boolean inUse();

    public abstract boolean isSecure();

    public abstract void start() throws IOException;

    public abstract void stop();

    protected MessageProcessor(String str) {
        this.transport = str;
    }

    protected MessageProcessor(InetAddress inetAddress, int i, String str, SIPTransactionStack sIPTransactionStack) {
        this(str);
        initialize(inetAddress, i, sIPTransactionStack);
    }

    public final void initialize(InetAddress inetAddress, int i, SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
        this.savedIpAddress = inetAddress.getHostAddress();
        this.ipAddress = inetAddress;
        this.port = i;
        HostPort hostPort = new HostPort();
        this.sentByHostPort = hostPort;
        hostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.sentByHostPort.setPort(i);
    }

    public String getTransport() {
        return this.transport;
    }

    public int getPort() {
        return this.port;
    }

    public Via getViaHeader() {
        try {
            Via via = new Via();
            HostPort hostPort = this.sentByHostPort;
            if (hostPort != null) {
                via.setSentBy(hostPort);
                via.setTransport(getTransport());
                return via;
            }
            Host host = new Host();
            host.setHostname(getIpAddress().getHostAddress());
            via.setHost(host);
            via.setPort(getPort());
            via.setTransport(getTransport());
            return via;
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public ListeningPointImpl getListeningPoint() {
        if (this.listeningPoint == null && logger.isLoggingEnabled()) {
            logger.logError("getListeningPoint" + this + " returning null listeningpoint");
        }
        return this.listeningPoint;
    }

    public void setListeningPoint(ListeningPointImpl listeningPointImpl) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setListeningPoint" + this + " listeningPoint = " + listeningPointImpl);
        }
        if (listeningPointImpl.getPort() != getPort()) {
            InternalErrorHandler.handleException("lp mismatch with provider", logger);
        }
        this.listeningPoint = listeningPointImpl;
    }

    public String getSavedIpAddress() {
        return this.savedIpAddress;
    }

    public InetAddress getIpAddress() {
        return this.ipAddress;
    }

    protected void setIpAddress(InetAddress inetAddress) {
        this.sentByHostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.ipAddress = inetAddress;
    }

    public void setSentBy(String str) throws ParseException {
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            HostPort hostPort = new HostPort();
            this.sentByHostPort = hostPort;
            hostPort.setHost(new Host(str));
        } else {
            HostPort hostPort2 = new HostPort();
            this.sentByHostPort = hostPort2;
            hostPort2.setHost(new Host(str.substring(0, indexOf)));
            try {
                this.sentByHostPort.setPort(Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException unused) {
                throw new ParseException("Bad format encountered at ", indexOf);
            }
        }
        this.sentBySet = true;
        this.sentBy = str;
    }

    public String getSentBy() {
        HostPort hostPort;
        if (this.sentBy == null && (hostPort = this.sentByHostPort) != null) {
            this.sentBy = hostPort.toString();
        }
        return this.sentBy;
    }

    public boolean isSentBySet() {
        return this.sentBySet;
    }

    public static int getDefaultPort(String str) {
        return str.equalsIgnoreCase("TLS") ? 5061 : 5060;
    }
}
