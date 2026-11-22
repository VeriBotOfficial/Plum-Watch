package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/plans/model/TemplatesResponse;", "", "templates", "", "Lcom/wakeup/feature/plans/model/PlanTemplate;", "<init>", "(Ljava/util/List;)V", "getTemplates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TemplatesResponse {
    private final List<PlanTemplate> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplatesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplatesResponse copy$default(TemplatesResponse templatesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = templatesResponse.templates;
        }
        return templatesResponse.copy(list);
    }

    public final List<PlanTemplate> component1() {
        return this.templates;
    }

    public final TemplatesResponse copy(List<PlanTemplate> templates) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        return new TemplatesResponse(templates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TemplatesResponse) && Intrinsics.areEqual(this.templates, ((TemplatesResponse) other).templates);
    }

    public int hashCode() {
        return this.templates.hashCode();
    }

    public String toString() {
        return "TemplatesResponse(templates=" + this.templates + Separators.RPAREN;
    }

    public TemplatesResponse(List<PlanTemplate> templates) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        this.templates = templates;
    }

    public /* synthetic */ TemplatesResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<PlanTemplate> getTemplates() {
        return this.templates;
    }
}
