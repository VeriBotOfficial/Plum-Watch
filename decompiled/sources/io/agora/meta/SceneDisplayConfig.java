package io.agora.meta;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class SceneDisplayConfig {
    public byte[] extraInfo;
    public int height;
    public int width;

    public SceneDisplayConfig() {
        this.width = 0;
        this.height = 0;
        this.extraInfo = null;
    }

    public SceneDisplayConfig(int width, int height, byte[] extraInfo) {
        this.width = width;
        this.height = height;
        this.extraInfo = extraInfo;
    }

    public byte[] getExtraInfo() {
        return this.extraInfo;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SceneDisplayConfig{width=" + this.width + ", height=" + this.height + ", extraInfo=" + Arrays.toString(this.extraInfo) + AbstractJsonLexerKt.END_OBJ;
    }
}
