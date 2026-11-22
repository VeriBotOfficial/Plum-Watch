package com.qumeng.overseas.advlib.core;

import android.view.View;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public interface m {
    void doClick(View view);

    String getAdm();

    List<String> getBmpUrlList();

    String getClickUrl();

    String getClickUrl(Map<String, Integer> map);

    Map<String, String> getGlobalRcvHeader();

    int getIdeaId();

    String getLogoUrl();

    String getMajorImageUrl();

    m getMaterial();

    m getMaterial(String str);

    <T extends Serializable> T getStash(String str);

    <T extends Serializable> T getStash(String str, T t);

    String getTitle();

    void onClickedReport();

    void onClickedReportWithPosition(Map<String, Integer> map);

    void onDpClickedReport();

    void onPlayingStateChanged(int i, long j);

    void onScaleShowedReportURL(int i);

    void onShowedDelayReportURL();

    void onShowedExposeReport(View view);

    void onShowedReport();

    void onVideoExposeReport(View view, int i);

    void post(Runnable runnable);

    void post(Runnable runnable, long j);

    <T extends Serializable> void putStash(String str, T t);

    void setGlobalRcvHeader(Map<String, String> map);

    ICliBundle toICliBundle();
}
