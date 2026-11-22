package com.qumeng.overseas.advlib.__remote__.core.proto.universe;

import android.view.View;
import com.qumeng.overseas.advlib.core.m;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class DumbMaterial extends MaterialImpl {
    private static DumbMaterial instance;

    private DumbMaterial() {
    }

    public static m getInstance() {
        if (instance == null) {
            instance = new DumbMaterial();
        }
        return instance;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void doClick(View view) {
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public String getAdm() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public List<String> getBmpUrlList() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public String getClickUrl() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public String getLogoUrl() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public String getMajorImageUrl() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public String getTitle() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onClickedReport() {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onClickedReportWithPosition(Map<String, Integer> map) {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onDpClickedReport() {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onPlayingStateChanged(int i, long j) {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onScaleShowedReportURL(int i) {
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public void onShowedDelayReportURL() {
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public void onShowedExposeReport(View view) {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public void onShowedReport() {
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public void onVideoExposeReport(View view, int i) {
    }

    @Override // com.qumeng.overseas.advlib.__remote__.core.proto.universe.MaterialImpl, com.qumeng.overseas.advlib.core.m
    public String getClickUrl(Map<String, Integer> map) {
        return "";
    }
}
