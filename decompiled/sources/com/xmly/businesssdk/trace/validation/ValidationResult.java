package com.xmly.businesssdk.trace.validation;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraceDataValidator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/trace/validation/ValidationResult;", "", "isValid", "", "message", "", "(ZLjava/lang/String;)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ValidationResult {
    private final boolean isValid;
    private final String message;

    public ValidationResult(boolean z, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.isValid = z;
        this.message = message;
    }

    public static /* synthetic */ ValidationResult copy$default(ValidationResult validationResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validationResult.isValid;
        }
        if ((i & 2) != 0) {
            str = validationResult.message;
        }
        return validationResult.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ValidationResult copy(boolean isValid, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ValidationResult(isValid, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationResult)) {
            return false;
        }
        ValidationResult validationResult = (ValidationResult) other;
        return this.isValid == validationResult.isValid && Intrinsics.areEqual(this.message, validationResult.message);
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z = this.isValid;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.message.hashCode() + (r0 * 31);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("ValidationResult(isValid=").append(this.isValid).append(", message="), this.message, ')');
    }
}
