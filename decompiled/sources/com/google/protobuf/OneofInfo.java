package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes15.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f10074id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int id2, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f10074id = id2;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public int getId() {
        return this.f10074id;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
