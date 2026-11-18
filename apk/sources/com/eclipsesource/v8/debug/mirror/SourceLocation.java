package com.eclipsesource.v8.debug.mirror;

/* JADX INFO: loaded from: classes11.dex */
public class SourceLocation {
    private final int column;
    private final int line;
    private final int position;
    private final String scriptName;
    private String sourceText;

    public SourceLocation(String str, int r2, int r3, int r4, String str2) {
        this.scriptName = str;
        this.position = r2;
        this.line = r3;
        this.column = r4;
        this.sourceText = str2;
    }

    public String toString() {
        return this.scriptName + " : " + this.position + " : " + this.line + " : " + this.column + " : " + this.sourceText;
    }

    public String getScriptName() {
        return this.scriptName;
    }

    public int getPosition() {
        return this.position;
    }

    public int getLine() {
        return this.line;
    }

    public int getColumn() {
        return this.column;
    }

    public String getSourceText() {
        return this.sourceText;
    }
}
