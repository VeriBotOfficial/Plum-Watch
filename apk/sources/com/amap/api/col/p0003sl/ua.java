package com.amap.api.col.p0003sl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: EntityField.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ua {
    String fieldName();

    int fieldType();
}
