package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.Media;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;
import java.util.Vector;

/* loaded from: classes.dex */
public class MediaField extends SDPField implements Media {
    protected Vector formats;
    protected String media;
    protected int nports;
    protected int port;
    protected String proto;

    public MediaField() {
        super(SDPFieldNames.MEDIA_FIELD);
        this.formats = new Vector();
    }

    public String getMedia() {
        return this.media;
    }

    public int getPort() {
        return this.port;
    }

    public int getNports() {
        return this.nports;
    }

    public String getProto() {
        return this.proto;
    }

    public Vector getFormats() {
        return this.formats;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setNports(int i) {
        this.nports = i;
    }

    public void setProto(String str) {
        this.proto = str;
    }

    public void setFormats(Vector vector) {
        this.formats = vector;
    }

    @Override // android.javax.sdp.Media
    public String getMediaType() throws SdpParseException {
        return getMedia();
    }

    @Override // android.javax.sdp.Media
    public void setMediaType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The mediaType is null");
        }
        setMedia(str);
    }

    @Override // android.javax.sdp.Media
    public int getMediaPort() throws SdpParseException {
        return getPort();
    }

    @Override // android.javax.sdp.Media
    public void setMediaPort(int i) throws SdpException {
        if (i < 0) {
            throw new SdpException("The port is < 0");
        }
        setPort(i);
    }

    @Override // android.javax.sdp.Media
    public int getPortCount() throws SdpParseException {
        return getNports();
    }

    @Override // android.javax.sdp.Media
    public void setPortCount(int i) throws SdpException {
        if (i < 0) {
            throw new SdpException("The port count is < 0");
        }
        setNports(i);
    }

    @Override // android.javax.sdp.Media
    public String getProtocol() throws SdpParseException {
        return getProto();
    }

    @Override // android.javax.sdp.Media
    public void setProtocol(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The protocol is null");
        }
        setProto(str);
    }

    @Override // android.javax.sdp.Media
    public Vector getMediaFormats(boolean z) throws SdpParseException {
        if (z || this.formats.size() != 0) {
            return this.formats;
        }
        return null;
    }

    @Override // android.javax.sdp.Media
    public void setMediaFormats(Vector vector) throws SdpException {
        if (vector == null) {
            throw new SdpException("The mediaFormats is null");
        }
        this.formats = vector;
    }

    private String encodeFormats() {
        StringBuilder sb = new StringBuilder(this.formats.size() * 3);
        for (int i = 0; i < this.formats.size(); i++) {
            sb.append(this.formats.elementAt(i));
            if (i < this.formats.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.media;
        String str2 = SDPFieldNames.MEDIA_FIELD;
        if (str != null) {
            str2 = SDPFieldNames.MEDIA_FIELD + this.media.toLowerCase() + " " + this.port;
        }
        if (this.nports > 1) {
            str2 = str2 + "/" + this.nports;
        }
        if (this.proto != null) {
            str2 = str2 + " " + this.proto;
        }
        if (this.formats != null) {
            str2 = str2 + " " + encodeFormats();
        }
        return str2 + "\r\n";
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        MediaField mediaField = (MediaField) super.clone();
        Vector vector = this.formats;
        if (vector != null) {
            mediaField.formats = (Vector) vector.clone();
        }
        return mediaField;
    }
}
