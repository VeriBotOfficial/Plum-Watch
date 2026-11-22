package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes6.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND("background"),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final String f17682a;

    ApplicationState(String str) {
        this.f17682a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f17682a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.f17682a;
    }
}
