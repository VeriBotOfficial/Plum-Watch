package android.gov.nist.javax.sdp;

import android.javax.sdp.SessionDescription;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class SdpEncoderImpl {
    public void setRtpmapAttribute(boolean z) {
    }

    public void setTypedTime(boolean z) {
    }

    public void setEncoding(String str) throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException("Method not supported");
    }

    public void output(SessionDescription sessionDescription, OutputStream outputStream) throws IOException {
        if (outputStream instanceof ObjectOutputStream) {
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) outputStream;
            if (sessionDescription != null) {
                objectOutputStream.writeObject(sessionDescription);
                return;
            }
            throw new IOException("The parameter is null");
        }
        throw new IOException("The output stream has to be an instance of ObjectOutputStream");
    }
}
