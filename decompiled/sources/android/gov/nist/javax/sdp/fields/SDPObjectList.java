package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.GenericObjectList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class SDPObjectList extends GenericObjectList {
    protected static final String SDPFIELDS_PACKAGE = "android.gov.nist.javax.sdp.fields";

    @Override // android.gov.nist.core.GenericObjectList
    public void mergeObjects(GenericObjectList genericObjectList) {
        ListIterator listIterator = listIterator();
        ListIterator listIterator2 = genericObjectList.listIterator();
        while (listIterator.hasNext()) {
            GenericObject genericObject = (GenericObject) listIterator.next();
            while (listIterator2.hasNext()) {
                genericObject.merge(listIterator2.next());
            }
        }
    }

    public void add(SDPObject sDPObject) {
        super.add((SDPObjectList) sDPObject);
    }

    public SDPObjectList(String str, String str2) {
        super(str, str2);
    }

    public SDPObjectList() {
        super((String) null, SDPObject.class);
    }

    public SDPObjectList(String str) {
        super(str, "android.gov.nist.javax.sdp.fields.SDPObject");
    }

    @Override // android.gov.nist.core.GenericObjectList
    public GenericObject first() {
        return (SDPObject) super.first();
    }

    @Override // android.gov.nist.core.GenericObjectList
    public GenericObject next() {
        return (SDPObject) super.next();
    }

    @Override // android.gov.nist.core.GenericObjectList
    public String encode() {
        StringBuilder sb = new StringBuilder();
        SDPObject sDPObject = (SDPObject) first();
        while (sDPObject != null) {
            sb.append(sDPObject.encode());
            sDPObject = (SDPObject) next();
        }
        return sb.toString();
    }

    @Override // android.gov.nist.core.GenericObjectList, java.util.AbstractCollection
    public String toString() {
        return encode();
    }
}
