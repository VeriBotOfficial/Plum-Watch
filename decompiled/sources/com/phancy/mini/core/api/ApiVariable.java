package com.phancy.mini.core.api;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: ApiVariable.kt */
@Target({ElementType.PARAMETER})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BX\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003R\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011R\u000f\u0010\r\u001a\u00020\u000e¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012R\u000f\u0010\u000b\u001a\u00020\f¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0014R\u000f\u0010\u0010\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015R\u000f\u0010\u000f\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015R\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u0016R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0015R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/phancy/mini/core/api/ApiVariable;", "", "name", "", "initString", "initBoolean", "", "initInt", "", "initLong", "", "initFloat", "", "initDouble", "", "initJSONObject", "initJSONArray", "()Z", "()D", "()F", "()I", "()Ljava/lang/String;", "()J", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
/* loaded from: classes17.dex */
public @interface ApiVariable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean initBoolean() default false;

    double initDouble() default 0.0d;

    float initFloat() default 0.0f;

    int initInt() default 0;

    String initJSONArray() default "";

    String initJSONObject() default "";

    long initLong() default 0;

    String initString() default "";

    String name();

    /* compiled from: ApiVariable.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/phancy/mini/core/api/ApiVariable$Companion;", "", "()V", "from", "Lcom/phancy/mini/core/api/ApiVariable;", "annotations", "", "", "([Ljava/lang/annotation/Annotation;)Lcom/phancy/mini/core/api/ApiVariable;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ApiVariable from(Annotation[] annotations) {
            if (annotations == null) {
                return null;
            }
            for (Annotation annotation : annotations) {
                if (annotation instanceof ApiVariable) {
                    return (ApiVariable) annotation;
                }
            }
            return null;
        }
    }
}
