package com.yandex.div2;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPatch;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: DivPatch.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cBI\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0002\u0010\fJJ\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004J \u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div2/DivPatch;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/data/Hashable;", "changes", "", "Lcom/yandex/div2/DivPatch$Change;", DOMConstants.ATTR_MODE, "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivPatch$Mode;", "onAppliedActions", "Lcom/yandex/div2/DivAction;", "onFailedActions", "(Ljava/util/List;Lcom/yandex/div/json/expressions/Expression;Ljava/util/List;Ljava/util/List;)V", "_hash", "", "Ljava/lang/Integer;", "copy", "equals", "", "other", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "otherResolver", "hash", "writeToJSON", "Lorg/json/JSONObject;", "Change", "Companion", "Mode", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivPatch implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List<Change> changes;
    public final Expression<Mode> mode;
    public final List<DivAction> onAppliedActions;
    public final List<DivAction> onFailedActions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Expression<Mode> MODE_DEFAULT_VALUE = Expression.INSTANCE.constant(Mode.PARTIAL);
    private static final Function2<ParsingEnvironment, JSONObject, DivPatch> CREATOR = new Function2<ParsingEnvironment, JSONObject, DivPatch>() { // from class: com.yandex.div2.DivPatch$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public final DivPatch invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return DivPatch.INSTANCE.fromJson(env, it);
        }
    };

    @JvmStatic
    public static final DivPatch fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return INSTANCE.fromJson(parsingEnvironment, jSONObject);
    }

    public DivPatch(List<Change> changes, Expression<Mode> mode, List<DivAction> list, List<DivAction> list2) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.changes = changes;
        this.mode = mode;
        this.onAppliedActions = list;
        this.onFailedActions = list2;
    }

    public /* synthetic */ DivPatch(List list, Expression expression, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? MODE_DEFAULT_VALUE : expression, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        Iterator<T> it = this.changes.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Change) it.next()).hash();
        }
        int hashCode2 = hashCode + i3 + this.mode.hashCode();
        List<DivAction> list = this.onAppliedActions;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((DivAction) it2.next()).hash();
            }
        } else {
            i = 0;
        }
        int i4 = hashCode2 + i;
        List<DivAction> list2 = this.onFailedActions;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                i2 += ((DivAction) it3.next()).hash();
            }
        }
        int i5 = i4 + i2;
        this._hash = Integer.valueOf(i5);
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0096, code lost:
    
        if (r7.onAppliedActions == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(com.yandex.div2.DivPatch r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "otherResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            if (r7 != 0) goto Le
            return r0
        Le:
            java.util.List<com.yandex.div2.DivPatch$Change> r1 = r6.changes
            java.util.List<com.yandex.div2.DivPatch$Change> r2 = r7.changes
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L1e
            goto Ld9
        L1e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L36
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L36:
            java.lang.Object r3 = r2.get(r3)
            com.yandex.div2.DivPatch$Change r3 = (com.yandex.div2.DivPatch.Change) r3
            com.yandex.div2.DivPatch$Change r4 = (com.yandex.div2.DivPatch.Change) r4
            boolean r3 = r4.equals(r3, r8, r9)
            if (r3 != 0) goto L46
            goto Ld9
        L46:
            r3 = r5
            goto L25
        L48:
            com.yandex.div.json.expressions.Expression<com.yandex.div2.DivPatch$Mode> r1 = r6.mode
            java.lang.Object r1 = r1.evaluate(r8)
            com.yandex.div.json.expressions.Expression<com.yandex.div2.DivPatch$Mode> r2 = r7.mode
            java.lang.Object r2 = r2.evaluate(r9)
            if (r1 != r2) goto Ld9
            java.util.List<com.yandex.div2.DivAction> r1 = r6.onAppliedActions
            if (r1 == 0) goto L94
            java.util.List<com.yandex.div2.DivAction> r2 = r7.onAppliedActions
            if (r2 != 0) goto L5f
            return r0
        L5f:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L6b
            goto Ld9
        L6b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L72:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L83
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L83:
            java.lang.Object r3 = r2.get(r3)
            com.yandex.div2.DivAction r3 = (com.yandex.div2.DivAction) r3
            com.yandex.div2.DivAction r4 = (com.yandex.div2.DivAction) r4
            boolean r3 = r4.equals(r3, r8, r9)
            if (r3 != 0) goto L92
            goto Ld9
        L92:
            r3 = r5
            goto L72
        L94:
            java.util.List<com.yandex.div2.DivAction> r1 = r7.onAppliedActions
            if (r1 != 0) goto Ld9
        L98:
            java.util.List<com.yandex.div2.DivAction> r1 = r6.onFailedActions
            java.util.List<com.yandex.div2.DivAction> r7 = r7.onFailedActions
            if (r1 == 0) goto Ld5
            if (r7 != 0) goto La1
            return r0
        La1:
            int r2 = r1.size()
            int r3 = r7.size()
            if (r2 == r3) goto Lac
            goto Ld9
        Lac:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        Lb3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld7
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto Lc4
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lc4:
            java.lang.Object r2 = r7.get(r2)
            com.yandex.div2.DivAction r2 = (com.yandex.div2.DivAction) r2
            com.yandex.div2.DivAction r3 = (com.yandex.div2.DivAction) r3
            boolean r2 = r3.equals(r2, r8, r9)
            if (r2 != 0) goto Ld3
            goto Ld9
        Ld3:
            r2 = r4
            goto Lb3
        Ld5:
            if (r7 != 0) goto Ld9
        Ld7:
            r7 = 1
            return r7
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.DivPatch.equals(com.yandex.div2.DivPatch, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivPatch copy$default(DivPatch divPatch, List list, Expression expression, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = divPatch.changes;
        }
        if ((i & 2) != 0) {
            expression = divPatch.mode;
        }
        if ((i & 4) != 0) {
            list2 = divPatch.onAppliedActions;
        }
        if ((i & 8) != 0) {
            list3 = divPatch.onFailedActions;
        }
        return divPatch.copy(list, expression, list2, list3);
    }

    public final DivPatch copy(List<Change> changes, Expression<Mode> mode, List<DivAction> onAppliedActions, List<DivAction> onFailedActions) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new DivPatch(changes, mode, onAppliedActions, onFailedActions);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonEntityParser().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0010R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/DivPatch$Companion;", "", "()V", "CREATOR", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lorg/json/JSONObject;", "Lcom/yandex/div2/DivPatch;", "getCREATOR", "()Lkotlin/jvm/functions/Function2;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivPatch$Mode;", "invoke", "env", BodyData.TYPE_JSON, "fromJson", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DivPatch fromJson(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonEntityParser().getValue().deserialize((ParsingContext) env, json);
        }

        public final Function2<ParsingEnvironment, JSONObject, DivPatch> getCREATOR() {
            return DivPatch.CREATOR;
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivPatch$Mode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TRANSACTIONAL", "PARTIAL", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");

        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Function1<Mode, String> TO_STRING = new Function1<Mode, String>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(DivPatch.Mode value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DivPatch.Mode.INSTANCE.toString(value);
            }
        };
        public static final Function1<String, Mode> FROM_STRING = new Function1<String, Mode>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public final DivPatch.Mode invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DivPatch.Mode.INSTANCE.fromString(value);
            }
        };

        Mode(String str) {
            this.value = str;
        }

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivPatch$Mode$Converter;", "", "()V", "FROM_STRING", "Lkotlin/Function1;", "", "Lcom/yandex/div2/DivPatch$Mode;", "TO_STRING", "fromString", "value", "toString", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.yandex.div2.DivPatch$Mode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Mode obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.value;
            }

            public final Mode fromString(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, Mode.TRANSACTIONAL.value)) {
                    return Mode.TRANSACTIONAL;
                }
                if (Intrinsics.areEqual(value, Mode.PARTIAL.value)) {
                    return Mode.PARTIAL;
                }
                return null;
            }
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\"\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J \u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div2/DivPatch$Change;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/data/Hashable;", "id", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/yandex/div2/Div;", "(Ljava/lang/String;Ljava/util/List;)V", "_hash", "", "Ljava/lang/Integer;", "_propertiesHash", "copy", "equals", "", "other", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "otherResolver", "hash", "propertiesHash", "writeToJSON", "Lorg/json/JSONObject;", "Companion", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Change implements JSONSerializable, Hashable {
        private Integer _hash;
        private Integer _propertiesHash;
        public final String id;
        public final List<Div> items;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Function2<ParsingEnvironment, JSONObject, Change> CREATOR = new Function2<ParsingEnvironment, JSONObject, Change>() { // from class: com.yandex.div2.DivPatch$Change$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public final DivPatch.Change invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return DivPatch.Change.INSTANCE.fromJson(env, it);
            }
        };

        @JvmStatic
        public static final Change fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return INSTANCE.fromJson(parsingEnvironment, jSONObject);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Change(String id2, List<? extends Div> list) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.items = list;
        }

        public /* synthetic */ Change(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : list);
        }

        @Override // com.yandex.div.data.Hashable
        public int propertiesHash() {
            Integer num = this._propertiesHash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode() + this.id.hashCode();
            this._propertiesHash = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int propertiesHash = propertiesHash();
            List<Div> list = this.items;
            int i = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    i += ((Div) it.next()).hash();
                }
            }
            int i2 = propertiesHash + i;
            this._hash = Integer.valueOf(i2);
            return i2;
        }

        public final boolean equals(Change other, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (other != null && Intrinsics.areEqual(this.id, other.id)) {
                List<Div> list = this.items;
                List<Div> list2 = other.items;
                if (list != null) {
                    if (list2 != null && list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((Div) obj).equals(list2.get(i), resolver, otherResolver)) {
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (list2 == null) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Change copy$default(Change change, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = change.id;
            }
            if ((i & 2) != 0) {
                list = change.items;
            }
            return change.copy(str, list);
        }

        public final Change copy(String id2, List<? extends Div> items) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Change(id2, items);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonEntityParser().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\rR#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/DivPatch$Change$Companion;", "", "()V", "CREATOR", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lorg/json/JSONObject;", "Lcom/yandex/div2/DivPatch$Change;", "getCREATOR", "()Lkotlin/jvm/functions/Function2;", "invoke", "env", BodyData.TYPE_JSON, "fromJson", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Change fromJson(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonEntityParser().getValue().deserialize((ParsingContext) env, json);
            }

            public final Function2<ParsingEnvironment, JSONObject, Change> getCREATOR() {
                return Change.CREATOR;
            }
        }
    }
}
