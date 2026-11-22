package com.wakeup.common.logger.core.entity;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class GLogEntity implements Serializable {
    private String className = "";
    private String typeName = "";
    private String moduleName = "";
    private boolean forceShow = false;
    private int defaultLevel = 1;
    private int jsonLevel = 1;
    private boolean formatJson = false;
    private int traceCount = 0;
    private boolean showDivide = false;
    private boolean showAll = true;
    private int maxLengthCount = 1;

    public String getClassName() {
        return this.className;
    }

    public GLogEntity initClassName(String className) {
        this.className = className;
        return this;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public GLogEntity initTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public GLogEntity initModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    public boolean isForceShow() {
        return this.forceShow;
    }

    public GLogEntity initForceShow(boolean forceShow) {
        this.forceShow = forceShow;
        return this;
    }

    public int getDefaultLevel() {
        return this.defaultLevel;
    }

    public GLogEntity initDefaultLevel(int defaultLevel) {
        this.defaultLevel = defaultLevel;
        return this;
    }

    public int getJsonLevel() {
        return this.jsonLevel;
    }

    public GLogEntity initJsonLevel(int jsonLevel) {
        this.jsonLevel = jsonLevel;
        return this;
    }

    public boolean isFormatJson() {
        return this.formatJson;
    }

    public GLogEntity initFormatJson(boolean formatJson) {
        this.formatJson = formatJson;
        return this;
    }

    public int getTraceCount() {
        return this.traceCount;
    }

    public GLogEntity initTraceCount(int traceCount) {
        this.traceCount = traceCount;
        return this;
    }

    public boolean isShowDivide() {
        return this.showDivide;
    }

    public GLogEntity initShowDivide(boolean showDivide) {
        this.showDivide = showDivide;
        return this;
    }

    public boolean isShowAll() {
        return this.showAll;
    }

    public GLogEntity initShowAll(boolean showAll) {
        this.showAll = showAll;
        return this;
    }

    public int getMaxLengthCount() {
        return this.maxLengthCount;
    }

    public GLogEntity initMaxLengthCount(int maxLengthCount) {
        this.maxLengthCount = maxLengthCount;
        return this;
    }
}
