package android.gov.nist.javax.sip.header;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.GenericObjectList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class SIPObjectList extends GenericObjectList {
    private static final long serialVersionUID = -3015154738977508905L;

    public SIPObjectList(String str) {
        super(str);
    }

    public SIPObjectList() {
    }

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

    public void concatenate(SIPObjectList sIPObjectList) {
        super.concatenate((GenericObjectList) sIPObjectList);
    }

    public void concatenate(SIPObjectList sIPObjectList, boolean z) {
        super.concatenate((GenericObjectList) sIPObjectList, z);
    }

    @Override // android.gov.nist.core.GenericObjectList
    public GenericObject first() {
        return (SIPObject) super.first();
    }

    @Override // android.gov.nist.core.GenericObjectList
    public GenericObject next() {
        return (SIPObject) super.next();
    }

    @Override // android.gov.nist.core.GenericObjectList
    public String debugDump(int i) {
        return super.debugDump(i);
    }
}
