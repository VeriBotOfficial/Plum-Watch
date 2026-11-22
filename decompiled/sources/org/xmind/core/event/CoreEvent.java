package org.xmind.core.event;

import java.util.EventObject;

/* loaded from: classes7.dex */
public class CoreEvent extends EventObject {
    private static final long serialVersionUID = -5729530103366986314L;
    private Object data;
    private int index;
    private Object newValue;
    private Object oldValue;
    private Object target;
    private String type;

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj) {
        this(iCoreEventSource, str, obj, null, null, -1);
    }

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj, int i) {
        this(iCoreEventSource, str, obj, null, null, i);
    }

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, Object obj3) {
        this(iCoreEventSource, str, obj, obj2, obj3, -1);
    }

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2) {
        this(iCoreEventSource, str, null, obj, obj2, -1);
    }

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, int i) {
        this(iCoreEventSource, str, null, obj, obj2, i);
    }

    public CoreEvent(ICoreEventSource iCoreEventSource, String str, Object obj, Object obj2, Object obj3, int i) {
        super(iCoreEventSource);
        this.type = str;
        this.oldValue = obj2;
        this.newValue = obj3;
        this.target = obj;
        this.index = i;
    }

    public ICoreEventSource getEventSource() {
        return (ICoreEventSource) getSource();
    }

    public String getType() {
        return this.type;
    }

    public Object getOldValue() {
        return this.oldValue;
    }

    public Object getNewValue() {
        return this.newValue;
    }

    public void setNewValue(Object obj) {
        this.newValue = obj;
    }

    public void setOldValue(Object obj) {
        this.oldValue = obj;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public Object getTarget() {
        return this.target;
    }

    public void setTarget(Object obj) {
        this.target = obj;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("{type=");
        sb.append(this.type);
        sb.append(",source=");
        sb.append(this.source);
        if (this.target != null) {
            sb.append(",target=");
            sb.append(this.target);
        }
        if (this.oldValue != null) {
            sb.append(",oldValue=");
            sb.append(this.oldValue);
        }
        if (this.newValue != null) {
            sb.append(",newValue=");
            sb.append(this.newValue);
        }
        if (this.index >= 0) {
            sb.append(",index=");
            sb.append(this.index);
        }
        if (this.data != null) {
            sb.append(",data=");
            sb.append(this.data);
        }
        sb.append("}");
        return sb.toString();
    }
}
