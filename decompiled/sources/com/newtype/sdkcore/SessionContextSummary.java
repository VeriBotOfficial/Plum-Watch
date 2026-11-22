package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, d2 = {"Lcom/newtype/sdkcore/SessionContextSummary;", "", "now", "", "goal", "focus", "teacherNote", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNow", "()Ljava/lang/String;", "getGoal", "getFocus", "getTeacherNote", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$newtypesdkcore_release", "$serializer", "Companion", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
public final /* data */ class SessionContextSummary {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String focus;
    private final String goal;
    private final String now;
    private final String teacherNote;

    public static /* synthetic */ SessionContextSummary copy$default(SessionContextSummary sessionContextSummary, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionContextSummary.now;
        }
        if ((i & 2) != 0) {
            str2 = sessionContextSummary.goal;
        }
        if ((i & 4) != 0) {
            str3 = sessionContextSummary.focus;
        }
        if ((i & 8) != 0) {
            str4 = sessionContextSummary.teacherNote;
        }
        return sessionContextSummary.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNow() {
        return this.now;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGoal() {
        return this.goal;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFocus() {
        return this.focus;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTeacherNote() {
        return this.teacherNote;
    }

    public final SessionContextSummary copy(String now, String goal, String focus, String teacherNote) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(teacherNote, "teacherNote");
        return new SessionContextSummary(now, goal, focus, teacherNote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionContextSummary)) {
            return false;
        }
        SessionContextSummary sessionContextSummary = (SessionContextSummary) other;
        return Intrinsics.areEqual(this.now, sessionContextSummary.now) && Intrinsics.areEqual(this.goal, sessionContextSummary.goal) && Intrinsics.areEqual(this.focus, sessionContextSummary.focus) && Intrinsics.areEqual(this.teacherNote, sessionContextSummary.teacherNote);
    }

    public int hashCode() {
        return (((((this.now.hashCode() * 31) + this.goal.hashCode()) * 31) + this.focus.hashCode()) * 31) + this.teacherNote.hashCode();
    }

    public String toString() {
        return "SessionContextSummary(now=" + this.now + ", goal=" + this.goal + ", focus=" + this.focus + ", teacherNote=" + this.teacherNote + Separators.RPAREN;
    }

    /* compiled from: NewTypeModels.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/SessionContextSummary$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/newtype/sdkcore/SessionContextSummary;", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SessionContextSummary> serializer() {
            return SessionContextSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SessionContextSummary(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, SessionContextSummary$$serializer.INSTANCE.getDescriptor());
        }
        this.now = str;
        this.goal = str2;
        this.focus = str3;
        this.teacherNote = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$newtypesdkcore_release(SessionContextSummary self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.now);
        output.encodeStringElement(serialDesc, 1, self.goal);
        output.encodeStringElement(serialDesc, 2, self.focus);
        output.encodeStringElement(serialDesc, 3, self.teacherNote);
    }

    public SessionContextSummary(String now, String goal, String focus, String teacherNote) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(teacherNote, "teacherNote");
        this.now = now;
        this.goal = goal;
        this.focus = focus;
        this.teacherNote = teacherNote;
    }

    public final String getNow() {
        return this.now;
    }

    public final String getGoal() {
        return this.goal;
    }

    public final String getFocus() {
        return this.focus;
    }

    public final String getTeacherNote() {
        return this.teacherNote;
    }
}
