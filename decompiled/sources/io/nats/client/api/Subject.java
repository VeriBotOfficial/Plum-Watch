package io.nats.client.api;

import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class Subject implements Comparable<Subject> {
    private final long count;
    private final String name;

    static List<Subject> listOf(JsonValue jsonValue) {
        ArrayList arrayList = new ArrayList();
        if (jsonValue != null && jsonValue.map != null) {
            for (String str : jsonValue.map.keySet()) {
                Long l = JsonValueUtils.getLong(jsonValue.map.get(str));
                if (l != null) {
                    arrayList.add(new Subject(str, l.longValue()));
                }
            }
        }
        return arrayList;
    }

    private Subject(String str, long j) {
        this.name = str;
        this.count = j;
    }

    public String getName() {
        return this.name;
    }

    public long getCount() {
        return this.count;
    }

    public String toString() {
        return "Subject{name='" + this.name + "', count=" + this.count + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Comparable
    public int compareTo(Subject subject) {
        return this.name.compareTo(subject.name);
    }
}
