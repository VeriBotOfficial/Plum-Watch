package org.apache.commons.net;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* loaded from: classes8.dex */
public class ProtocolCommandSupport implements Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final ListenerList listeners = new ListenerList();
    private final Object source;

    public ProtocolCommandSupport(Object obj) {
        this.source = obj;
    }

    public void addProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        this.listeners.addListener(protocolCommandListener);
    }

    public void fireCommandSent(String str, String str2) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.source, str, str2);
        Iterator<EventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ProtocolCommandListener) it.next()).protocolCommandSent(protocolCommandEvent);
        }
    }

    public void fireReplyReceived(int i, String str) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.source, i, str);
        Iterator<EventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ProtocolCommandListener) it.next()).protocolReplyReceived(protocolCommandEvent);
        }
    }

    public int getListenerCount() {
        return this.listeners.getListenerCount();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    public void removeProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        this.listeners.removeListener(protocolCommandListener);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
