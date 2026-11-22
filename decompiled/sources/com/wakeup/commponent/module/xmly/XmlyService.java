package com.wakeup.commponent.module.xmly;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;

/* compiled from: XmlyService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/wakeup/commponent/module/xmly/XmlyService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "initSuccess", "", "open", "extendInfo", "", "showEntryFailure", "", "checkUserInfo", "getIndexPageUrl", "jumpParamsUrl", "url", "queryKey", "keyTxt", "play", "albumId", "trackId", TimerController.STOP_COMMAND, "handlerAppLLmData", "data", "initXmly", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface XmlyService extends IProvider {
    void checkUserInfo(String extendInfo);

    String getIndexPageUrl();

    void handlerAppLLmData(String data);

    void initSuccess();

    void initXmly();

    void jumpParamsUrl(String url);

    void open(String extendInfo);

    void open(String extendInfo, boolean showEntryFailure);

    void play(String albumId, String trackId);

    void queryKey(String keyTxt);

    void stop();
}
