package android.gov.nist.javax.sip.header;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class AllowEventsList extends SIPHeaderList<AllowEvents> {
    private static final long serialVersionUID = -684763195336212992L;

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        AllowEventsList allowEventsList = new AllowEventsList();
        allowEventsList.clonehlist(this.hlist);
        return allowEventsList;
    }

    public AllowEventsList() {
        super(AllowEvents.class, "Allow-Events");
    }

    public ListIterator<String> getMethods() {
        ListIterator listIterator = this.hlist.listIterator();
        LinkedList linkedList = new LinkedList();
        while (listIterator.hasNext()) {
            linkedList.add(((AllowEvents) listIterator.next()).getEventType());
        }
        return linkedList.listIterator();
    }

    public void setMethods(List<String> list) throws ParseException {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AllowEvents allowEvents = new AllowEvents();
            allowEvents.setEventType(listIterator.next());
            add((AllowEventsList) allowEvents);
        }
    }
}
