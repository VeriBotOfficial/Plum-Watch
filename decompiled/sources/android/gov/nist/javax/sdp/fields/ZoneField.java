package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;
import android.javax.sdp.TimeZoneAdjustment;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class ZoneField extends SDPField implements TimeZoneAdjustment {
    protected SDPObjectList zoneAdjustments;

    @Override // android.javax.sdp.TimeZoneAdjustment
    public boolean getTypedTime() {
        return false;
    }

    @Override // android.javax.sdp.TimeZoneAdjustment
    public void setTypedTime(boolean z) {
    }

    public ZoneField() {
        super(SDPFieldNames.ZONE_FIELD);
        this.zoneAdjustments = new SDPObjectList();
    }

    public void addZoneAdjustment(ZoneAdjustment zoneAdjustment) {
        this.zoneAdjustments.add((SDPObject) zoneAdjustment);
    }

    public SDPObjectList getZoneAdjustments() {
        return this.zoneAdjustments;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb = new StringBuilder(SDPFieldNames.ZONE_FIELD);
        ListIterator listIterator = this.zoneAdjustments.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) listIterator.next();
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(zoneAdjustment.encode());
            i++;
        }
        sb.append("\r\n");
        return sb.toString();
    }

    @Override // android.javax.sdp.TimeZoneAdjustment
    public Hashtable getZoneAdjustments(boolean z) throws SdpParseException {
        Hashtable hashtable = new Hashtable();
        SDPObjectList zoneAdjustments = getZoneAdjustments();
        if (zoneAdjustments == null) {
            if (z) {
                return new Hashtable();
            }
            return null;
        }
        while (true) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) zoneAdjustments.next();
            if (zoneAdjustment == null) {
                return hashtable;
            }
            hashtable.put(new Date(zoneAdjustment.getTime()), Integer.valueOf(Long.valueOf(zoneAdjustment.getTime()).toString()));
        }
    }

    @Override // android.javax.sdp.TimeZoneAdjustment
    public void setZoneAdjustments(Hashtable hashtable) throws SdpException {
        if (hashtable == null) {
            throw new SdpException("The map is null");
        }
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            if (nextElement instanceof Date) {
                ZoneAdjustment zoneAdjustment = new ZoneAdjustment();
                zoneAdjustment.setTime(((Date) nextElement).getTime());
                addZoneAdjustment(zoneAdjustment);
            } else {
                throw new SdpException("The map is not well-formated ");
            }
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneField zoneField = (ZoneField) super.clone();
        SDPObjectList sDPObjectList = this.zoneAdjustments;
        if (sDPObjectList != null) {
            zoneField.zoneAdjustments = (SDPObjectList) sDPObjectList.clone();
        }
        return zoneField;
    }
}
