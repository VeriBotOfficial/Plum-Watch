package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: classes17.dex */
public class ReactSlidingStartEvent extends Event<ReactSlidingStartEvent> {
    public static final String EVENT_NAME = "onRNCSliderSlidingStart";
    private final double mValue;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    public ReactSlidingStartEvent(int i, double d) {
        super(i);
        this.mValue = d;
    }

    public double getValue() {
        return this.mValue;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return serializeEventData();
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", getValue());
        return createMap;
    }
}
