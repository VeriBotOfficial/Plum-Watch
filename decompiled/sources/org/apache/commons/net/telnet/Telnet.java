package org.apache.commons.net.telnet;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import org.apache.commons.net.SocketClient;

/* loaded from: classes8.dex */
class Telnet extends SocketClient {
    static final int DEFAULT_PORT = 23;
    static final int DO_MASK = 2;
    static final int REQUESTED_DO_MASK = 8;
    static final int REQUESTED_WILL_MASK = 4;
    protected static final int TERMINAL_TYPE = 24;
    protected static final int TERMINAL_TYPE_IS = 0;
    protected static final int TERMINAL_TYPE_SEND = 1;
    static final int WILL_MASK = 1;
    static final boolean debug = false;
    static final boolean debugoptions = false;
    private final int[] doResponse;
    private TelnetNotificationHandler notifhand;
    private final TelnetOptionHandler[] optionHandlers;
    private final int[] options;
    private volatile OutputStream spyStream;
    private String terminalType;
    private final int[] willResponse;
    static final byte[] COMMAND_DO = {-1, -3};
    static final byte[] COMMAND_DONT = {-1, -2};
    static final byte[] COMMAND_WILL = {-1, -5};
    static final byte[] COMMAND_WONT = {-1, -4};
    static final byte[] COMMAND_SB = {-1, -6};
    static final byte[] COMMAND_SE = {-1, TransmissionUnpacked.HD_VAL_MAGIC_HB};
    static final byte[] COMMAND_IS = {24, 0};
    static final byte[] COMMAND_AYT = {-1, -10};
    private final Object aytMonitor = new Object();
    private volatile boolean aytFlag = true;

    Telnet() {
        setDefaultPort(23);
        this.doResponse = new int[256];
        this.willResponse = new int[256];
        this.options = new int[256];
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    Telnet(String str) {
        setDefaultPort(23);
        this.doResponse = new int[256];
        this.willResponse = new int[256];
        this.options = new int[256];
        this.terminalType = str;
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    @Override // org.apache.commons.net.SocketClient
    protected void _connectAction_() throws IOException {
        for (int i = 0; i < 256; i++) {
            this.doResponse[i] = 0;
            this.willResponse[i] = 0;
            this.options[i] = 0;
            TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
            if (telnetOptionHandler != null) {
                telnetOptionHandler.setDo(false);
                this.optionHandlers[i].setWill(false);
            }
        }
        super._connectAction_();
        this._input_ = new BufferedInputStream(this._input_);
        this._output_ = new BufferedOutputStream(this._output_);
        for (int i2 = 0; i2 < 256; i2++) {
            TelnetOptionHandler telnetOptionHandler2 = this.optionHandlers[i2];
            if (telnetOptionHandler2 != null) {
                if (telnetOptionHandler2.getInitLocal()) {
                    requestWill(this.optionHandlers[i2].getOptionCode());
                }
                if (this.optionHandlers[i2].getInitRemote()) {
                    requestDo(this.optionHandlers[i2].getOptionCode());
                }
            }
        }
    }

    void _registerSpyStream(OutputStream outputStream) {
        this.spyStream = outputStream;
    }

    final boolean _sendAYT(Duration duration) throws IOException, IllegalArgumentException, InterruptedException {
        boolean z;
        synchronized (this.aytMonitor) {
            synchronized (this) {
                z = false;
                this.aytFlag = false;
                this._output_.write(COMMAND_AYT);
                this._output_.flush();
            }
            this.aytMonitor.wait(duration.toMillis());
            if (this.aytFlag) {
                z = true;
            } else {
                this.aytFlag = true;
            }
        }
        return z;
    }

    final synchronized void _sendCommand(byte b) throws IOException {
        this._output_.write(255);
        this._output_.write(b);
        this._output_.flush();
    }

    final synchronized void _sendSubnegotiation(int[] iArr) throws IOException {
        if (iArr != null) {
            this._output_.write(COMMAND_SB);
            for (int i : iArr) {
                byte b = (byte) i;
                if (b == -1) {
                    this._output_.write(b);
                }
                this._output_.write(b);
            }
            this._output_.write(COMMAND_SE);
            this._output_.flush();
        }
    }

    void _stopSpyStream() {
        this.spyStream = null;
    }

    void addOptionHandler(TelnetOptionHandler telnetOptionHandler) throws InvalidTelnetOptionException, IOException {
        int optionCode = telnetOptionHandler.getOptionCode();
        if (!TelnetOption.isValidOption(optionCode)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", optionCode);
        }
        TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
        if (telnetOptionHandlerArr[optionCode] != null) {
            throw new InvalidTelnetOptionException("Already registered option", optionCode);
        }
        telnetOptionHandlerArr[optionCode] = telnetOptionHandler;
        if (isConnected()) {
            if (telnetOptionHandler.getInitLocal()) {
                requestWill(optionCode);
            }
            if (telnetOptionHandler.getInitRemote()) {
                requestDo(optionCode);
            }
        }
    }

    void deleteOptionHandler(int i) throws InvalidTelnetOptionException, IOException {
        if (!TelnetOption.isValidOption(i)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", i);
        }
        TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
        TelnetOptionHandler telnetOptionHandler = telnetOptionHandlerArr[i];
        if (telnetOptionHandler == null) {
            throw new InvalidTelnetOptionException("Unregistered option", i);
        }
        telnetOptionHandlerArr[i] = null;
        if (telnetOptionHandler.getWill()) {
            requestWont(i);
        }
        if (telnetOptionHandler.getDo()) {
            requestDont(i);
        }
    }

    final synchronized void processAYTResponse() {
        if (!this.aytFlag) {
            synchronized (this.aytMonitor) {
                this.aytFlag = true;
                this.aytMonitor.notifyAll();
            }
        }
    }

    void processCommand(int i) {
        TelnetNotificationHandler telnetNotificationHandler = this.notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(5, i);
        }
    }

    void processDo(int i) throws IOException {
        boolean z;
        String str;
        TelnetNotificationHandler telnetNotificationHandler = this.notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(1, i);
        }
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
        if (telnetOptionHandler != null) {
            z = telnetOptionHandler.getAcceptLocal();
        } else {
            z = (i != 24 || (str = this.terminalType) == null || str.isEmpty()) ? false : true;
        }
        int[] iArr = this.willResponse;
        int i2 = iArr[i];
        if (i2 > 0) {
            int i3 = i2 - 1;
            iArr[i] = i3;
            if (i3 > 0 && stateIsWill(i)) {
                int[] iArr2 = this.willResponse;
                iArr2[i] = iArr2[i] - 1;
            }
        }
        if (this.willResponse[i] == 0 && requestedWont(i)) {
            if (z) {
                setWantWill(i);
                sendWill(i);
            } else {
                int[] iArr3 = this.willResponse;
                iArr3[i] = iArr3[i] + 1;
                sendWont(i);
            }
        }
        setWill(i);
    }

    void processDont(int i) throws IOException {
        TelnetNotificationHandler telnetNotificationHandler = this.notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(2, i);
        }
        int[] iArr = this.willResponse;
        int i2 = iArr[i];
        if (i2 > 0) {
            int i3 = i2 - 1;
            iArr[i] = i3;
            if (i3 > 0 && stateIsWont(i)) {
                this.willResponse[i] = r0[i] - 1;
            }
        }
        if (this.willResponse[i] == 0 && requestedWill(i)) {
            if (stateIsWill(i) || requestedWill(i)) {
                sendWont(i);
            }
            setWantWont(i);
        }
        setWont(i);
    }

    void processSuboption(int[] iArr, int i) throws IOException {
        if (i > 0) {
            TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
            int i2 = iArr[0];
            TelnetOptionHandler telnetOptionHandler = telnetOptionHandlerArr[i2];
            if (telnetOptionHandler != null) {
                _sendSubnegotiation(telnetOptionHandler.answerSubnegotiation(iArr, i));
            } else if (i > 1 && i2 == 24 && iArr[1] == 1) {
                sendTerminalType();
            }
        }
    }

    void processWill(int i) throws IOException {
        TelnetNotificationHandler telnetNotificationHandler = this.notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(3, i);
        }
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
        boolean acceptRemote = telnetOptionHandler != null ? telnetOptionHandler.getAcceptRemote() : false;
        int[] iArr = this.doResponse;
        int i2 = iArr[i];
        if (i2 > 0) {
            int i3 = i2 - 1;
            iArr[i] = i3;
            if (i3 > 0 && stateIsDo(i)) {
                this.doResponse[i] = r1[i] - 1;
            }
        }
        if (this.doResponse[i] == 0 && requestedDont(i)) {
            if (acceptRemote) {
                setWantDo(i);
                sendDo(i);
            } else {
                int[] iArr2 = this.doResponse;
                iArr2[i] = iArr2[i] + 1;
                sendDont(i);
            }
        }
        setDo(i);
    }

    void processWont(int i) throws IOException {
        TelnetNotificationHandler telnetNotificationHandler = this.notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(4, i);
        }
        int[] iArr = this.doResponse;
        int i2 = iArr[i];
        if (i2 > 0) {
            int i3 = i2 - 1;
            iArr[i] = i3;
            if (i3 > 0 && stateIsDont(i)) {
                this.doResponse[i] = r0[i] - 1;
            }
        }
        if (this.doResponse[i] == 0 && requestedDo(i)) {
            if (stateIsDo(i) || requestedDo(i)) {
                sendDont(i);
            }
            setWantDont(i);
        }
        setDont(i);
    }

    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        this.notifhand = telnetNotificationHandler;
    }

    final synchronized void requestDo(int i) throws IOException {
        if ((this.doResponse[i] == 0 && stateIsDo(i)) || requestedDo(i)) {
            return;
        }
        setWantDo(i);
        int[] iArr = this.doResponse;
        iArr[i] = iArr[i] + 1;
        sendDo(i);
    }

    final synchronized void requestDont(int i) throws IOException {
        if ((this.doResponse[i] == 0 && stateIsDont(i)) || requestedDont(i)) {
            return;
        }
        setWantDont(i);
        int[] iArr = this.doResponse;
        iArr[i] = iArr[i] + 1;
        sendDont(i);
    }

    boolean requestedDo(int i) {
        return (this.options[i] & 8) != 0;
    }

    boolean requestedDont(int i) {
        return !requestedDo(i);
    }

    boolean requestedWill(int i) {
        return (this.options[i] & 4) != 0;
    }

    boolean requestedWont(int i) {
        return !requestedWill(i);
    }

    final synchronized void requestWill(int i) throws IOException {
        if ((this.willResponse[i] == 0 && stateIsWill(i)) || requestedWill(i)) {
            return;
        }
        setWantWill(i);
        int[] iArr = this.doResponse;
        iArr[i] = iArr[i] + 1;
        sendWill(i);
    }

    final synchronized void requestWont(int i) throws IOException {
        if ((this.willResponse[i] == 0 && stateIsWont(i)) || requestedWont(i)) {
            return;
        }
        setWantWont(i);
        int[] iArr = this.doResponse;
        iArr[i] = iArr[i] + 1;
        sendWont(i);
    }

    final synchronized void sendByte(int i) throws IOException {
        this._output_.write(i);
        spyWrite(i);
    }

    final synchronized void sendDo(int i) throws IOException {
        this._output_.write(COMMAND_DO);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void sendDont(int i) throws IOException {
        this._output_.write(COMMAND_DONT);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void sendTerminalType() throws IOException {
        if (this.terminalType != null) {
            this._output_.write(COMMAND_SB);
            this._output_.write(COMMAND_IS);
            this._output_.write(this.terminalType.getBytes(getCharset()));
            this._output_.write(COMMAND_SE);
            this._output_.flush();
        }
    }

    final synchronized void sendWill(int i) throws IOException {
        this._output_.write(COMMAND_WILL);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void sendWont(int i) throws IOException {
        this._output_.write(COMMAND_WONT);
        this._output_.write(i);
        this._output_.flush();
    }

    void setDo(int i) throws IOException {
        TelnetOptionHandler telnetOptionHandler;
        int[] iArr = this.options;
        iArr[i] = iArr[i] | 2;
        if (!requestedDo(i) || (telnetOptionHandler = this.optionHandlers[i]) == null) {
            return;
        }
        telnetOptionHandler.setDo(true);
        int[] startSubnegotiationRemote = this.optionHandlers[i].startSubnegotiationRemote();
        if (startSubnegotiationRemote != null) {
            _sendSubnegotiation(startSubnegotiationRemote);
        }
    }

    void setDont(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] & (-3);
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
        if (telnetOptionHandler != null) {
            telnetOptionHandler.setDo(false);
        }
    }

    void setWantDo(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] | 8;
    }

    void setWantDont(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] & (-9);
    }

    void setWantWill(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] | 4;
    }

    void setWantWont(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] & (-5);
    }

    void setWill(int i) throws IOException {
        TelnetOptionHandler telnetOptionHandler;
        int[] iArr = this.options;
        iArr[i] = iArr[i] | 1;
        if (!requestedWill(i) || (telnetOptionHandler = this.optionHandlers[i]) == null) {
            return;
        }
        telnetOptionHandler.setWill(true);
        int[] startSubnegotiationLocal = this.optionHandlers[i].startSubnegotiationLocal();
        if (startSubnegotiationLocal != null) {
            _sendSubnegotiation(startSubnegotiationLocal);
        }
    }

    void setWont(int i) {
        int[] iArr = this.options;
        iArr[i] = iArr[i] & (-2);
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
        if (telnetOptionHandler != null) {
            telnetOptionHandler.setWill(false);
        }
    }

    void spyRead(int i) {
        OutputStream outputStream = this.spyStream;
        if (outputStream == null || i == 13) {
            return;
        }
        if (i == 10) {
            try {
                outputStream.write(13);
            } catch (IOException unused) {
                this.spyStream = null;
                return;
            }
        }
        outputStream.write(i);
        outputStream.flush();
    }

    void spyWrite(int i) {
        OutputStream outputStream;
        if ((stateIsDo(1) && requestedDo(1)) || (outputStream = this.spyStream) == null) {
            return;
        }
        try {
            outputStream.write(i);
            outputStream.flush();
        } catch (IOException unused) {
            this.spyStream = null;
        }
    }

    boolean stateIsDo(int i) {
        return (this.options[i] & 2) != 0;
    }

    boolean stateIsDont(int i) {
        return !stateIsDo(i);
    }

    boolean stateIsWill(int i) {
        return (this.options[i] & 1) != 0;
    }

    boolean stateIsWont(int i) {
        return !stateIsWill(i);
    }

    public void unregisterNotifHandler() {
        this.notifhand = null;
    }
}
