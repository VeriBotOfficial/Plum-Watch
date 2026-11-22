package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/ai/CreateMusicBean;", "", "gpt_description_prompt", "", "businessId", "make_instrumental", "", "wait_audio", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getGpt_description_prompt", "()Ljava/lang/String;", "getBusinessId", "getMake_instrumental", "()Z", "getWait_audio", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateMusicBean {
    private final String businessId;
    private final String gpt_description_prompt;
    private final boolean make_instrumental;
    private final boolean wait_audio;

    public static /* synthetic */ CreateMusicBean copy$default(CreateMusicBean createMusicBean, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createMusicBean.gpt_description_prompt;
        }
        if ((i & 2) != 0) {
            str2 = createMusicBean.businessId;
        }
        if ((i & 4) != 0) {
            z = createMusicBean.make_instrumental;
        }
        if ((i & 8) != 0) {
            z2 = createMusicBean.wait_audio;
        }
        return createMusicBean.copy(str, str2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGpt_description_prompt() {
        return this.gpt_description_prompt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMake_instrumental() {
        return this.make_instrumental;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getWait_audio() {
        return this.wait_audio;
    }

    public final CreateMusicBean copy(String gpt_description_prompt, String businessId, boolean make_instrumental, boolean wait_audio) {
        Intrinsics.checkNotNullParameter(gpt_description_prompt, "gpt_description_prompt");
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        return new CreateMusicBean(gpt_description_prompt, businessId, make_instrumental, wait_audio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMusicBean)) {
            return false;
        }
        CreateMusicBean createMusicBean = (CreateMusicBean) other;
        return Intrinsics.areEqual(this.gpt_description_prompt, createMusicBean.gpt_description_prompt) && Intrinsics.areEqual(this.businessId, createMusicBean.businessId) && this.make_instrumental == createMusicBean.make_instrumental && this.wait_audio == createMusicBean.wait_audio;
    }

    public int hashCode() {
        return (((((this.gpt_description_prompt.hashCode() * 31) + this.businessId.hashCode()) * 31) + Boolean.hashCode(this.make_instrumental)) * 31) + Boolean.hashCode(this.wait_audio);
    }

    public String toString() {
        return "CreateMusicBean(gpt_description_prompt=" + this.gpt_description_prompt + ", businessId=" + this.businessId + ", make_instrumental=" + this.make_instrumental + ", wait_audio=" + this.wait_audio + Separators.RPAREN;
    }

    public CreateMusicBean(String gpt_description_prompt, String businessId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(gpt_description_prompt, "gpt_description_prompt");
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        this.gpt_description_prompt = gpt_description_prompt;
        this.businessId = businessId;
        this.make_instrumental = z;
        this.wait_audio = z2;
    }

    public /* synthetic */ CreateMusicBean(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final String getGpt_description_prompt() {
        return this.gpt_description_prompt;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final boolean getMake_instrumental() {
        return this.make_instrumental;
    }

    public final boolean getWait_audio() {
        return this.wait_audio;
    }
}
