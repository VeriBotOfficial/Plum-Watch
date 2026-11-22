package com.wakeup.common.event;

import android.content.Intent;

/* loaded from: classes2.dex */
public class NavigationEvent {
    public static final int EVENT_TYPE_JUMP_PAGE = 2;
    public static final int EVENT_TYPE_OTHER = 0;
    public static final int EVENT_TYPE_SELECT_TAB = 1;
    private NavigationType classify;
    private int eventType;
    private Intent intent = new Intent();
    private int page = 0;

    private NavigationEvent(int eventType) {
        this.eventType = 0;
        this.eventType = eventType;
    }

    public static NavigationEvent createEvent(NavigationType classify) {
        NavigationEvent navigationEvent = new NavigationEvent(0);
        navigationEvent.classify = classify;
        return navigationEvent;
    }

    public static NavigationEvent createSelectTab(int page) {
        NavigationEvent navigationEvent = new NavigationEvent(1);
        navigationEvent.page = page;
        return navigationEvent;
    }

    public static NavigationEvent createJump(Intent intent) {
        NavigationEvent navigationEvent = new NavigationEvent(2);
        navigationEvent.intent = intent;
        return navigationEvent;
    }

    public int getEventType() {
        return this.eventType;
    }

    public Intent getIntent() {
        return this.intent;
    }

    public int getPage() {
        return this.page;
    }

    public NavigationType getClassify() {
        return this.classify;
    }
}
