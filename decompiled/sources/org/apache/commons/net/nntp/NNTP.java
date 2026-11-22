package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.text.Typography;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;

/* loaded from: classes8.dex */
public class NNTP extends SocketClient {
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    public static final int DEFAULT_PORT = 119;
    protected ProtocolCommandSupport _commandSupport_;
    boolean _isAllowedToPost;
    protected BufferedReader _reader_;
    protected BufferedWriter _writer_;
    private int replyCode;
    private String replyString;

    public NNTP() {
        setDefaultPort(119);
        this.replyString = null;
        this._reader_ = null;
        this._writer_ = null;
        this._isAllowedToPost = false;
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    @Override // org.apache.commons.net.SocketClient
    protected void _connectAction_() throws IOException {
        super._connectAction_();
        InputStream inputStream = this._input_;
        Charset charset = DEFAULT_ENCODING;
        this._reader_ = new CRLFLineReader(new InputStreamReader(inputStream, charset));
        this._writer_ = new BufferedWriter(new OutputStreamWriter(this._output_, charset));
        getReply();
        this._isAllowedToPost = this.replyCode == 200;
    }

    public int article() throws IOException {
        return sendCommand(0);
    }

    @Deprecated
    public int article(int i) throws IOException {
        return article(i);
    }

    public int article(long j) throws IOException {
        return sendCommand(0, Long.toString(j));
    }

    public int article(String str) throws IOException {
        return sendCommand(0, str);
    }

    public int authinfoPass(String str) throws IOException {
        return sendCommand(15, "PASS " + str);
    }

    public int authinfoUser(String str) throws IOException {
        return sendCommand(15, "USER " + str);
    }

    public int body() throws IOException {
        return sendCommand(1);
    }

    @Deprecated
    public int body(int i) throws IOException {
        return body(i);
    }

    public int body(long j) throws IOException {
        return sendCommand(1, Long.toString(j));
    }

    public int body(String str) throws IOException {
        return sendCommand(1, str);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        this._reader_ = null;
        this._writer_ = null;
        this.replyString = null;
        this._isAllowedToPost = false;
    }

    @Override // org.apache.commons.net.SocketClient
    protected ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public int getReply() throws IOException {
        String readLine = this._reader_.readLine();
        this.replyString = readLine;
        if (readLine == null) {
            throw new NNTPConnectionClosedException("Connection closed without indication.");
        }
        if (readLine.length() < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + this.replyString);
        }
        try {
            int parseInt = Integer.parseInt(this.replyString.substring(0, 3));
            this.replyCode = parseInt;
            fireReplyReceived(parseInt, this.replyString + "\r\n");
            int i = this.replyCode;
            if (i != 400) {
                return i;
            }
            throw new NNTPConnectionClosedException("NNTP response 400 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + this.replyString);
        }
    }

    public int getReplyCode() {
        return this.replyCode;
    }

    public String getReplyString() {
        return this.replyString;
    }

    public int group(String str) throws IOException {
        return sendCommand(2, str);
    }

    public int head() throws IOException {
        return sendCommand(3);
    }

    @Deprecated
    public int head(int i) throws IOException {
        return head(i);
    }

    public int head(long j) throws IOException {
        return sendCommand(3, Long.toString(j));
    }

    public int head(String str) throws IOException {
        return sendCommand(3, str);
    }

    public int help() throws IOException {
        return sendCommand(4);
    }

    public int ihave(String str) throws IOException {
        return sendCommand(5, str);
    }

    public boolean isAllowedToPost() {
        return this._isAllowedToPost;
    }

    public int last() throws IOException {
        return sendCommand(6);
    }

    public int list() throws IOException {
        return sendCommand(7);
    }

    public int listActive(String str) throws IOException {
        return sendCommand(7, "ACTIVE " + str);
    }

    public int newgroups(String str, String str2, boolean z, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        if (z) {
            sb.append(" GMT");
        }
        if (str3 != null) {
            sb.append(" <");
            sb.append(str3);
            sb.append(Typography.greater);
        }
        return sendCommand(8, sb.toString());
    }

    public int newnews(String str, String str2, String str3, boolean z, String str4) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        sb.append(' ');
        sb.append(str3);
        if (z) {
            sb.append(" GMT");
        }
        if (str4 != null) {
            sb.append(" <");
            sb.append(str4);
            sb.append(Typography.greater);
        }
        return sendCommand(9, sb.toString());
    }

    public int next() throws IOException {
        return sendCommand(10);
    }

    public int post() throws IOException {
        return sendCommand(11);
    }

    public int quit() throws IOException {
        return sendCommand(12);
    }

    public int sendCommand(int i) throws IOException {
        return sendCommand(i, (String) null);
    }

    public int sendCommand(int i, String str) throws IOException {
        return sendCommand(NNTPCommand.getCommand(i), str);
    }

    public int sendCommand(String str) throws IOException {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        sb.append("\r\n");
        BufferedWriter bufferedWriter = this._writer_;
        String sb2 = sb.toString();
        bufferedWriter.write(sb2);
        this._writer_.flush();
        fireCommandSent(str, sb2);
        return getReply();
    }

    public int stat() throws IOException {
        return sendCommand(14);
    }

    @Deprecated
    public int stat(int i) throws IOException {
        return stat(i);
    }

    public int stat(long j) throws IOException {
        return sendCommand(14, Long.toString(j));
    }

    public int stat(String str) throws IOException {
        return sendCommand(14, str);
    }

    public int xhdr(String str, String str2) throws IOException {
        return sendCommand(17, str + " " + str2);
    }

    public int xover(String str) throws IOException {
        return sendCommand(16, str);
    }
}
