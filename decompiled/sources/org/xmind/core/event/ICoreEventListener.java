package org.xmind.core.event;

/* loaded from: classes7.dex */
public interface ICoreEventListener {
    public static final ICoreEventListener NULL = new NullCoreEventListener();

    public static class NullCoreEventListener implements ICoreEventListener {
        @Override // org.xmind.core.event.ICoreEventListener
        public void handleCoreEvent(CoreEvent coreEvent) {
        }
    }

    void handleCoreEvent(CoreEvent coreEvent);
}
