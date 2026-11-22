package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ContentTypeHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class ContentType extends ParametersHeader implements ContentTypeHeader {
    private static final long serialVersionUID = 8475682204373446610L;
    protected MediaRange mediaRange;

    public ContentType() {
        super("Content-Type");
    }

    public ContentType(String str, String str2) {
        this();
        setContentType(str, str2);
    }

    public int compareMediaRange(String str) {
        return (this.mediaRange.type + "/" + this.mediaRange.subtype).compareToIgnoreCase(str);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        this.mediaRange.encode(sb);
        if (hasParameters()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    public MediaRange getMediaRange() {
        return this.mediaRange;
    }

    public String getMediaType() {
        return this.mediaRange.type;
    }

    public String getMediaSubType() {
        return this.mediaRange.subtype;
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentSubType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getSubtype();
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getType();
    }

    public String getCharset() {
        return getParameter("charset");
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    public void setContentType(String str, String str2) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
        this.mediaRange.setSubtype(str2);
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentType(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentSubType(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setSubtype(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ContentType contentType = (ContentType) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            contentType.mediaRange = (MediaRange) mediaRange.clone();
        }
        return contentType;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof ContentTypeHeader) {
            ContentTypeHeader contentTypeHeader = (ContentTypeHeader) obj;
            if (getContentType().equalsIgnoreCase(contentTypeHeader.getContentType()) && getContentSubType().equalsIgnoreCase(contentTypeHeader.getContentSubType()) && equalParameters(contentTypeHeader)) {
                return true;
            }
        }
        return false;
    }
}
