package android.javax.sdp;

/* loaded from: classes.dex */
public interface Phone extends Field {
    String getValue() throws SdpParseException;

    void setValue(String str) throws SdpException;
}
