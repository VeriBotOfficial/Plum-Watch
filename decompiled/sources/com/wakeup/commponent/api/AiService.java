package com.wakeup.commponent.api;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.ai.AiLanguage;
import com.wakeup.commponent.module.ai.DeviceChannel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AiService.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH&J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u000eH&J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u000eH&J0\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH&J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H&J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0005H&J$\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00112\b\u0010#\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u000bH&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\b\u0010'\u001a\u00020\u000bH&¨\u0006("}, d2 = {"Lcom/wakeup/commponent/api/AiService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "startPlayTts", "", "languageId", "", "text", "function", "", "stopPlayTts", "isTtsPlaying", "", "setTtsPlayCallback", "callback", "Lcom/wakeup/common/base/BaseCallback;", "startAsrLan", "mac", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "getLanguageById", "requestSupportLan", "", "requestLanguageChannelLan", "channel", "Lcom/wakeup/commponent/module/ai/DeviceChannel$LanguageChannel;", "projectId", "getLanguageChannelById", "getLanguageStr", "mContext", "Landroid/content/Context;", "aiLanguage", "getSourceAiLanguage", "tag", "getTransAiLanguage", "saveAiLanguage", "sourceLanguage", "transLanguage", "setIsOutPlay", "isOutPlay", "sendAppLLMConfig", "isAiWorking", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiService extends IProvider {
    void getLanguageById(int languageId, int function, BaseCallback<AiLanguage> callback);

    void getLanguageChannelById(DeviceChannel.LanguageChannel channel, int projectId, int languageId, BaseCallback<AiLanguage> callback);

    String getLanguageStr(Context mContext, AiLanguage aiLanguage);

    AiLanguage getSourceAiLanguage(String tag);

    AiLanguage getTransAiLanguage(String tag);

    boolean isAiWorking();

    boolean isTtsPlaying();

    void requestLanguageChannelLan(DeviceChannel.LanguageChannel channel, int projectId, BaseCallback<List<AiLanguage>> callback);

    void requestSupportLan(int function, BaseCallback<List<AiLanguage>> callback);

    void saveAiLanguage(String tag, AiLanguage sourceLanguage, AiLanguage transLanguage);

    void sendAppLLMConfig(String mac);

    void setIsOutPlay(boolean isOutPlay);

    void setTtsPlayCallback(BaseCallback<String> callback);

    void startAsrLan(String mac, int function, BaseCallback<AiLanguage> callback);

    void startPlayTts(String languageId, String text, int function);

    void stopPlayTts();
}
