package io.agora.musiccontentcenter;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MusicChartInfo {
    public String name;
    public int type;

    public MusicChartInfo() {
    }

    public MusicChartInfo(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "MusicChartInfo{name='" + this.name + "', type=" + this.type + AbstractJsonLexerKt.END_OBJ;
    }
}
