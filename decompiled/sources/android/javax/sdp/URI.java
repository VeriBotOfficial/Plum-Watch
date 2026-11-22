package android.javax.sdp;

import java.net.URL;

/* loaded from: classes.dex */
public interface URI extends Field {
    URL get() throws SdpParseException;

    void set(URL url) throws SdpException;
}
