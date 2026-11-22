package io.nats.client.api;

import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.util.List;
import java.util.function.Function;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class Replica extends PeerInfo {
    static List<Replica> optionalListOf(JsonValue jsonValue) {
        return JsonValueUtils.optionalListOf(jsonValue, new Function() { // from class: io.nats.client.api.Replica$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Replica((JsonValue) obj);
            }
        });
    }

    Replica(JsonValue jsonValue) {
        super(jsonValue);
    }

    public String toString() {
        return "Replica{name='" + getName() + "', current=" + isCurrent() + ", offline=" + isOffline() + ", active=" + getActive() + ", lag=" + getLag() + AbstractJsonLexerKt.END_OBJ;
    }
}
