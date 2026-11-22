package com.wakeup.common.network.entity.oral;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/oral/AgentMemory;", "", "persona", "", "teachingPrinciples", "", "correctionStyle", "languagePolicy", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getPersona", "()Ljava/lang/String;", "getTeachingPrinciples", "()Ljava/util/List;", "getCorrectionStyle", "getLanguagePolicy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AgentMemory {
    private final String correctionStyle;
    private final String languagePolicy;
    private final String persona;
    private final List<String> teachingPrinciples;

    public AgentMemory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentMemory copy$default(AgentMemory agentMemory, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentMemory.persona;
        }
        if ((i & 2) != 0) {
            list = agentMemory.teachingPrinciples;
        }
        if ((i & 4) != 0) {
            str2 = agentMemory.correctionStyle;
        }
        if ((i & 8) != 0) {
            str3 = agentMemory.languagePolicy;
        }
        return agentMemory.copy(str, list, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPersona() {
        return this.persona;
    }

    public final List<String> component2() {
        return this.teachingPrinciples;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCorrectionStyle() {
        return this.correctionStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLanguagePolicy() {
        return this.languagePolicy;
    }

    public final AgentMemory copy(String persona, List<String> teachingPrinciples, String correctionStyle, String languagePolicy) {
        Intrinsics.checkNotNullParameter(teachingPrinciples, "teachingPrinciples");
        return new AgentMemory(persona, teachingPrinciples, correctionStyle, languagePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentMemory)) {
            return false;
        }
        AgentMemory agentMemory = (AgentMemory) other;
        return Intrinsics.areEqual(this.persona, agentMemory.persona) && Intrinsics.areEqual(this.teachingPrinciples, agentMemory.teachingPrinciples) && Intrinsics.areEqual(this.correctionStyle, agentMemory.correctionStyle) && Intrinsics.areEqual(this.languagePolicy, agentMemory.languagePolicy);
    }

    public int hashCode() {
        String str = this.persona;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.teachingPrinciples.hashCode()) * 31;
        String str2 = this.correctionStyle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.languagePolicy;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AgentMemory(persona=" + this.persona + ", teachingPrinciples=" + this.teachingPrinciples + ", correctionStyle=" + this.correctionStyle + ", languagePolicy=" + this.languagePolicy + Separators.RPAREN;
    }

    public AgentMemory(String str, List<String> teachingPrinciples, String str2, String str3) {
        Intrinsics.checkNotNullParameter(teachingPrinciples, "teachingPrinciples");
        this.persona = str;
        this.teachingPrinciples = teachingPrinciples;
        this.correctionStyle = str2;
        this.languagePolicy = str3;
    }

    public final String getPersona() {
        return this.persona;
    }

    public /* synthetic */ AgentMemory(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final List<String> getTeachingPrinciples() {
        return this.teachingPrinciples;
    }

    public final String getCorrectionStyle() {
        return this.correctionStyle;
    }

    public final String getLanguagePolicy() {
        return this.languagePolicy;
    }
}
