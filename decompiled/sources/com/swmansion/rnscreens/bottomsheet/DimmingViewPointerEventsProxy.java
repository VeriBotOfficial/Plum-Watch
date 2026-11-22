package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import kotlin.Metadata;

/* compiled from: DimmingViewPointerEvents.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsProxy;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "pointerEventsImpl", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;)V", "getPointerEventsImpl", "()Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;", "setPointerEventsImpl", "getPointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DimmingViewPointerEventsProxy implements ReactPointerEventsView {
    private DimmingViewPointerEventsImpl pointerEventsImpl;

    public DimmingViewPointerEventsProxy(DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }

    public final DimmingViewPointerEventsImpl getPointerEventsImpl() {
        return this.pointerEventsImpl;
    }

    public final void setPointerEventsImpl(DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl = this.pointerEventsImpl;
        return (dimmingViewPointerEventsImpl == null || (pointerEvents = dimmingViewPointerEventsImpl.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
    }
}
