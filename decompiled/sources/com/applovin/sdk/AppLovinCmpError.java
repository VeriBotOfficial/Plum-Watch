package com.applovin.sdk;

/* loaded from: classes12.dex */
public interface AppLovinCmpError {

    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f6653a;

        Code(int i) {
            this.f6653a = i;
        }

        public int getValue() {
            return this.f6653a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
