package com.baidu.mapapi.walknavi.model;

/* JADX INFO: loaded from: classes15.dex */
public class WalkSimpleMapInfo {
    private int distToNextGP;
    private String nextRouteName;
    private boolean nextStepTurnMsg;
    private int paragraphLength;

    public int getDistToNextGP() {
        return this.distToNextGP;
    }

    public String getNextRouteName() {
        return this.nextRouteName;
    }

    public int getParagraphLength() {
        return this.paragraphLength;
    }

    public boolean isNextStepTurnMsg() {
        return this.nextStepTurnMsg;
    }

    public void setDistToNextGP(int r1) {
        this.distToNextGP = r1;
    }

    public void setNextRouteName(String str) {
        this.nextRouteName = str;
    }

    public void setNextStepTurnMsg(boolean z) {
        this.nextStepTurnMsg = z;
    }

    public void setParagraphLength(int r1) {
        this.paragraphLength = r1;
    }
}
