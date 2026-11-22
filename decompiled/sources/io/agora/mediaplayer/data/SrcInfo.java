package io.agora.mediaplayer.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class SrcInfo {
    private int bitrateInKbps;
    private String name;

    public SrcInfo() {
    }

    public SrcInfo(int bitrateInKbps, String name) {
        this.bitrateInKbps = bitrateInKbps;
        this.name = name;
    }

    public int getBitrateInKbps() {
        return this.bitrateInKbps;
    }

    public String getName() {
        return this.name;
    }

    public void setBitrateInKbps(int bitrateInKbps) {
        this.bitrateInKbps = bitrateInKbps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "SrcInfo{bitrateInKbps=" + this.bitrateInKbps + ", name=" + this.name + AbstractJsonLexerKt.END_OBJ;
    }
}
