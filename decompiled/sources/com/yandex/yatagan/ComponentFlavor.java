package com.yandex.yatagan;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.appmetrica.analytics.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* compiled from: ComponentFlavor.kt */
@Target({ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/yatagan/ComponentFlavor;", "", TypedValues.Custom.S_DIMENSION, "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", BuildConfig.SDK_BUILD_FLAVOR}, k = 1, mv = {1, 8, 0}, xi = 48)
@VariantApi
@Documented
/* loaded from: classes5.dex */
public @interface ComponentFlavor {
    Class<? extends Annotation> dimension();
}
