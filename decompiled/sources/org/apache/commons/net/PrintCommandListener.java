package org.apache.commons.net;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.net.io.Util;

/* loaded from: classes8.dex */
public class PrintCommandListener implements ProtocolCommandListener {
    private final boolean directionMarker;
    private final char eolMarker;
    private final boolean nologin;
    private final PrintWriter writer;

    public PrintCommandListener(PrintStream printStream) {
        this(Util.newPrintWriter(printStream));
    }

    public PrintCommandListener(PrintStream printStream, boolean z) {
        this(Util.newPrintWriter(printStream), z);
    }

    public PrintCommandListener(PrintStream printStream, boolean z, char c) {
        this(Util.newPrintWriter(printStream), z, c);
    }

    public PrintCommandListener(PrintStream printStream, boolean z, char c, boolean z2) {
        this(Util.newPrintWriter(printStream), z, c, z2);
    }

    public PrintCommandListener(PrintWriter printWriter) {
        this(printWriter, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z) {
        this(printWriter, z, (char) 0);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z, char c) {
        this(printWriter, z, c, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z, char c, boolean z2) {
        this.writer = printWriter;
        this.nologin = z;
        this.eolMarker = c;
        this.directionMarker = z2;
    }

    private String getPrintableString(String str) {
        int indexOf;
        if (this.eolMarker == 0 || (indexOf = str.indexOf("\r\n")) <= 0) {
            return str;
        }
        return str.substring(0, indexOf) + this.eolMarker + str.substring(indexOf);
    }

    @Override // org.apache.commons.net.ProtocolCommandListener
    public void protocolCommandSent(ProtocolCommandEvent protocolCommandEvent) {
        if (this.directionMarker) {
            this.writer.print("> ");
        }
        if (this.nologin) {
            String command = protocolCommandEvent.getCommand();
            if ("PASS".equalsIgnoreCase(command) || "USER".equalsIgnoreCase(command)) {
                this.writer.print(command);
                this.writer.println(" *******");
            } else if ("LOGIN".equalsIgnoreCase(command)) {
                String message = protocolCommandEvent.getMessage();
                this.writer.print(message.substring(0, message.indexOf("LOGIN") + "LOGIN".length()));
                this.writer.println(" *******");
            } else {
                this.writer.print(getPrintableString(protocolCommandEvent.getMessage()));
            }
        } else {
            this.writer.print(getPrintableString(protocolCommandEvent.getMessage()));
        }
        this.writer.flush();
    }

    @Override // org.apache.commons.net.ProtocolCommandListener
    public void protocolReplyReceived(ProtocolCommandEvent protocolCommandEvent) {
        if (this.directionMarker) {
            this.writer.print("< ");
        }
        this.writer.print(protocolCommandEvent.getMessage());
        this.writer.flush();
    }
}
