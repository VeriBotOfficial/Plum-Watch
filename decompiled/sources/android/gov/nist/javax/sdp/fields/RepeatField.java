package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.RepeatTime;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class RepeatField extends SDPField implements RepeatTime {
    private static final long serialVersionUID = -6415338212212641819L;
    protected TypedTime activeDuration;
    protected SDPObjectList offsets;
    protected TypedTime repeatInterval;

    @Override // android.javax.sdp.RepeatTime
    public boolean getTypedTime() throws SdpParseException {
        return true;
    }

    @Override // android.javax.sdp.RepeatTime
    public void setTypedTime(boolean z) {
    }

    public RepeatField() {
        super(SDPFieldNames.REPEAT_FIELD);
        this.offsets = new SDPObjectList();
    }

    public void setRepeatInterval(TypedTime typedTime) {
        this.repeatInterval = typedTime;
    }

    public void setActiveDuration(TypedTime typedTime) {
        this.activeDuration = typedTime;
    }

    public void addOffset(TypedTime typedTime) {
        this.offsets.add((SDPObject) typedTime);
    }

    public LinkedList getOffsets() {
        return this.offsets;
    }

    @Override // android.javax.sdp.RepeatTime
    public int getRepeatInterval() throws SdpParseException {
        TypedTime typedTime = this.repeatInterval;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    @Override // android.javax.sdp.RepeatTime
    public void setRepeatInterval(int i) throws SdpException {
        if (i < 0) {
            throw new SdpException("The repeat interval is <0");
        }
        if (this.repeatInterval == null) {
            this.repeatInterval = new TypedTime();
        }
        this.repeatInterval.setTime(i);
    }

    @Override // android.javax.sdp.RepeatTime
    public int getActiveDuration() throws SdpParseException {
        TypedTime typedTime = this.activeDuration;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    @Override // android.javax.sdp.RepeatTime
    public void setActiveDuration(int i) throws SdpException {
        if (i < 0) {
            throw new SdpException("The active Duration is <0");
        }
        if (this.activeDuration == null) {
            this.activeDuration = new TypedTime();
        }
        this.activeDuration.setTime(i);
    }

    @Override // android.javax.sdp.RepeatTime
    public int[] getOffsetArray() throws SdpParseException {
        LinkedList offsets = getOffsets();
        int[] iArr = new int[offsets.size()];
        for (int i = 0; i < offsets.size(); i++) {
            iArr[i] = ((TypedTime) offsets.get(i)).getTime();
        }
        return iArr;
    }

    @Override // android.javax.sdp.RepeatTime
    public void setOffsetArray(int[] iArr) throws SdpException {
        for (int i : iArr) {
            TypedTime typedTime = new TypedTime();
            typedTime.setTime(i);
            addOffset(typedTime);
        }
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb = new StringBuilder(SDPFieldNames.REPEAT_FIELD);
        sb.append(this.repeatInterval.encode()).append(" ").append(this.activeDuration.encode());
        ListIterator listIterator = this.offsets.listIterator();
        while (listIterator.hasNext()) {
            sb.append(" ").append(((TypedTime) listIterator.next()).encode());
        }
        sb.append("\r\n");
        return sb.toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        RepeatField repeatField = (RepeatField) super.clone();
        TypedTime typedTime = this.repeatInterval;
        if (typedTime != null) {
            repeatField.repeatInterval = (TypedTime) typedTime.clone();
        }
        TypedTime typedTime2 = this.activeDuration;
        if (typedTime2 != null) {
            repeatField.activeDuration = (TypedTime) typedTime2.clone();
        }
        SDPObjectList sDPObjectList = this.offsets;
        if (sDPObjectList != null) {
            repeatField.offsets = (SDPObjectList) sDPObjectList.clone();
        }
        return repeatField;
    }
}
