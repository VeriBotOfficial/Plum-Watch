package com.yandex.div2;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;

/* compiled from: DivData.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u008b\u0001\b\u0007\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0018\u00010\u0004¢\u0006\u0002\u0010\u0016Jx\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004J \u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u000e\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/yandex/div2/DivData;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/data/Hashable;", "functions", "", "Lcom/yandex/div2/DivFunction;", "logId", "", "states", "Lcom/yandex/div2/DivData$State;", "timers", "Lcom/yandex/div2/DivTimer;", "transitionAnimationSelector", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTransitionSelector;", "variableTriggers", "Lcom/yandex/div2/DivTrigger;", "variables", "Lcom/yandex/div2/DivVariable;", "parsingErrors", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/json/expressions/Expression;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "_hash", "", "Ljava/lang/Integer;", "copy", "equals", "", "other", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "otherResolver", "hash", "writeToJSON", "Lorg/json/JSONObject;", "Companion", "State", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivData implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List<DivFunction> functions;
    public final String logId;
    public final List<Exception> parsingErrors;
    public final List<State> states;
    public final List<DivTimer> timers;
    public final Expression<DivTransitionSelector> transitionAnimationSelector;
    public final List<DivTrigger> variableTriggers;
    public final List<DivVariable> variables;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Expression<DivTransitionSelector> TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.INSTANCE.constant(DivTransitionSelector.NONE);
    private static final Function2<ParsingEnvironment, JSONObject, DivData> CREATOR = new Function2<ParsingEnvironment, JSONObject, DivData>() { // from class: com.yandex.div2.DivData$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public final DivData invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return DivData.INSTANCE.fromJson(env, it);
        }
    };

    @JvmStatic
    public static final DivData fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return INSTANCE.fromJson(parsingEnvironment, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivData(List<DivFunction> list, String logId, List<State> states, List<DivTimer> list2, Expression<DivTransitionSelector> transitionAnimationSelector, List<DivTrigger> list3, List<? extends DivVariable> list4, List<? extends Exception> list5) {
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        this.functions = list;
        this.logId = logId;
        this.states = states;
        this.timers = list2;
        this.transitionAnimationSelector = transitionAnimationSelector;
        this.variableTriggers = list3;
        this.variables = list4;
        this.parsingErrors = list5;
    }

    public /* synthetic */ DivData(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, str, list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE : expression, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : list6);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        int i3;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        List<DivFunction> list = this.functions;
        int i4 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivFunction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = hashCode + i + this.logId.hashCode();
        Iterator<T> it2 = this.states.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += ((State) it2.next()).hash();
        }
        int i6 = hashCode2 + i5;
        List<DivTimer> list2 = this.timers;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                i2 += ((DivTimer) it3.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int hashCode3 = i6 + i2 + this.transitionAnimationSelector.hashCode();
        List<DivTrigger> list3 = this.variableTriggers;
        if (list3 != null) {
            Iterator<T> it4 = list3.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                i3 += ((DivTrigger) it4.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i7 = hashCode3 + i3;
        List<DivVariable> list4 = this.variables;
        if (list4 != null) {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                i4 += ((DivVariable) it5.next()).hash();
            }
        }
        int i8 = i7 + i4;
        this._hash = Integer.valueOf(i8);
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x004f, code lost:
    
        if (r7.functions == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0126, code lost:
    
        if (r7.variableTriggers == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d6, code lost:
    
        if (r7.timers == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(com.yandex.div2.DivData r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.DivData.equals(com.yandex.div2.DivData, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public static /* synthetic */ DivData copy$default(DivData divData, List list, String str, List list2, List list3, Expression expression, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = divData.functions;
        }
        if ((i & 2) != 0) {
            str = divData.logId;
        }
        if ((i & 4) != 0) {
            list2 = divData.states;
        }
        if ((i & 8) != 0) {
            list3 = divData.timers;
        }
        if ((i & 16) != 0) {
            expression = divData.transitionAnimationSelector;
        }
        if ((i & 32) != 0) {
            list4 = divData.variableTriggers;
        }
        if ((i & 64) != 0) {
            list5 = divData.variables;
        }
        List list6 = list4;
        List list7 = list5;
        Expression expression2 = expression;
        List list8 = list2;
        return divData.copy(list, str, list8, list3, expression2, list6, list7);
    }

    public final DivData copy(List<DivFunction> functions, String logId, List<State> states, List<DivTimer> timers, Expression<DivTransitionSelector> transitionAnimationSelector, List<DivTrigger> variableTriggers, List<? extends DivVariable> variables) {
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        return new DivData(functions, logId, states, timers, transitionAnimationSelector, variableTriggers, variables, null, 128, null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonEntityParser().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivData.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0010R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/DivData$Companion;", "", "()V", "CREATOR", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lorg/json/JSONObject;", "Lcom/yandex/div2/DivData;", "getCREATOR", "()Lkotlin/jvm/functions/Function2;", "TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTransitionSelector;", "invoke", "env", BodyData.TYPE_JSON, "fromJson", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DivData fromJson(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonEntityParser().getValue().deserialize((ParsingContext) env, json);
        }

        public final Function2<ParsingEnvironment, JSONObject, DivData> getCREATOR() {
            return DivData.CREATOR;
        }
    }

    /* compiled from: DivData.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J \u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div2/DivData$State;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/data/Hashable;", "div", "Lcom/yandex/div2/Div;", "stateId", "", "(Lcom/yandex/div2/Div;J)V", "_hash", "", "Ljava/lang/Integer;", "copy", "equals", "", "other", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "otherResolver", "hash", "writeToJSON", "Lorg/json/JSONObject;", "Companion", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Div div;
        public final long stateId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Function2<ParsingEnvironment, JSONObject, State> CREATOR = new Function2<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivData$State$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public final DivData.State invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return DivData.State.INSTANCE.fromJson(env, it);
            }
        };

        @JvmStatic
        public static final State fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return INSTANCE.fromJson(parsingEnvironment, jSONObject);
        }

        public State(Div div, long j) {
            Intrinsics.checkNotNullParameter(div, "div");
            this.div = div;
            this.stateId = j;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode() + this.div.hash() + Long.hashCode(this.stateId);
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        public final boolean equals(State other, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return other != null && this.div.equals(other.div, resolver, otherResolver) && this.stateId == other.stateId;
        }

        public static /* synthetic */ State copy$default(State state, Div div, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                div = state.div;
            }
            if ((i & 2) != 0) {
                j = state.stateId;
            }
            return state.copy(div, j);
        }

        public final State copy(Div div, long stateId) {
            Intrinsics.checkNotNullParameter(div, "div");
            return new State(div, stateId);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonEntityParser().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivData.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\rR#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/DivData$State$Companion;", "", "()V", "CREATOR", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lorg/json/JSONObject;", "Lcom/yandex/div2/DivData$State;", "getCREATOR", "()Lkotlin/jvm/functions/Function2;", "invoke", "env", BodyData.TYPE_JSON, "fromJson", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromJson(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonEntityParser().getValue().deserialize((ParsingContext) env, json);
            }

            public final Function2<ParsingEnvironment, JSONObject, State> getCREATOR() {
                return State.CREATOR;
            }
        }
    }
}
