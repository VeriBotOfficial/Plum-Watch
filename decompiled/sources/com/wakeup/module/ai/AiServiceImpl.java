package com.wakeup.module.ai;

import android.content.Context;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.ai.AiLanguage;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.api.AiService;
import com.wakeup.commponent.module.ai.DeviceChannel;
import com.wakeup.module.ai.appllm.AppLLM;
import com.wakeup.module.ai.appllm.order.AppLLMAnalyzer;
import com.wakeup.module.ai.appllm.order.AppLLMOrderKt;
import com.wakeup.module.ai.port.AiPortFactory;
import com.wakeup.module.ai.robot.WearFitAiMgr;
import com.wakeup.module.ai.simInter.AiBusyManager;
import com.wakeup.module.ai.simInter.DeviceSimInterMgr;
import com.wakeup.module.ai.simInter.order.DeviceOneTransAnalyzer;
import com.wakeup.module.ai.simInter.order.DeviceSimInterAnalyzer;
import com.wakeup.module.ai.trans.BluetoothAssistantHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiServiceImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0016J(\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0016J$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0015H\u0016J,\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0015H\u0016J0\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0016J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\fH\u0016J$\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/wakeup/module/ai/AiServiceImpl;", "Lcom/wakeup/commponent/api/AiService;", "<init>", "()V", "ttsQueue", "Lcom/wakeup/module/ai/TTSQueue;", "init", "", "context", "Landroid/content/Context;", "startPlayTts", "languageId", "", "text", "function", "", "stopPlayTts", "isTtsPlaying", "", "setTtsPlayCallback", "callback", "Lcom/wakeup/common/base/BaseCallback;", "startAsrLan", "mac", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "getLanguageById", "requestSupportLan", "", "requestLanguageChannelLan", "channel", "Lcom/wakeup/commponent/module/ai/DeviceChannel$LanguageChannel;", "projectId", "getLanguageChannelById", "getLanguageStr", "mContext", "aiLanguage", "getSourceAiLanguage", "tag", "getTransAiLanguage", "saveAiLanguage", "sourceLanguage", "transLanguage", "setIsOutPlay", "isOutPlay", "sendAppLLMConfig", "isAiWorking", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiServiceImpl implements AiService {
    private final TTSQueue ttsQueue = new TTSQueue(AiPortFactory.INSTANCE.createTTSStream());

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        AppLLM.INSTANCE.init();
        ServiceManager.getDeviceService().addAnalyzer(new AppLLMAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new DeviceSimInterAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new DeviceOneTransAnalyzer());
        WearFitAiMgr.INSTANCE.init();
        BluetoothAssistantHelper.INSTANCE.init();
        DeviceSimInterMgr.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.api.AiService
    public void startPlayTts(String languageId, String text, int function) {
        Intrinsics.checkNotNullParameter(languageId, "languageId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.ttsQueue.start(text, languageId, function);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void stopPlayTts() {
        this.ttsQueue.destroy();
    }

    @Override // com.wakeup.commponent.api.AiService
    public boolean isTtsPlaying() {
        return this.ttsQueue.isPlaying();
    }

    @Override // com.wakeup.commponent.api.AiService
    public void setTtsPlayCallback(BaseCallback<String> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.ttsQueue.setCallBack(callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void startAsrLan(String mac, int function, BaseCallback<AiLanguage> callback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AiLanguageMgr.INSTANCE.startAsrLan(mac, function, callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void getLanguageById(int languageId, int function, BaseCallback<AiLanguage> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AiLanguageMgr.INSTANCE.getLanguageById(languageId, function, callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void requestSupportLan(int function, BaseCallback<List<AiLanguage>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AiLanguageMgr.INSTANCE.requestAsrLangList(function, callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void requestLanguageChannelLan(DeviceChannel.LanguageChannel channel, int projectId, BaseCallback<List<AiLanguage>> callback) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AiLanguageChannelMgr.INSTANCE.requestLanguageList(channel, projectId, callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void getLanguageChannelById(DeviceChannel.LanguageChannel channel, int projectId, int languageId, BaseCallback<AiLanguage> callback) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AiLanguageChannelMgr.INSTANCE.getLanguageById(channel, projectId, languageId, callback);
    }

    @Override // com.wakeup.commponent.api.AiService
    public String getLanguageStr(Context mContext, AiLanguage aiLanguage) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(aiLanguage, "aiLanguage");
        return AiLanguageMgr.INSTANCE.getLanguageStr(mContext, aiLanguage);
    }

    @Override // com.wakeup.commponent.api.AiService
    public AiLanguage getSourceAiLanguage(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return AiLanguageMgr.INSTANCE.getSourceAiLanguage(tag);
    }

    @Override // com.wakeup.commponent.api.AiService
    public AiLanguage getTransAiLanguage(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return AiLanguageMgr.INSTANCE.getTransAiLanguage(tag);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void saveAiLanguage(String tag, AiLanguage sourceLanguage, AiLanguage transLanguage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        AiLanguageMgr.INSTANCE.saveAiLanguage(tag, sourceLanguage, transLanguage);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void setIsOutPlay(boolean isOutPlay) {
        this.ttsQueue.setIsOutPlay(isOutPlay);
    }

    @Override // com.wakeup.commponent.api.AiService
    public void sendAppLLMConfig(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        ServiceManager.getDeviceService().sendData(AppLLMOrderKt.sendSearchStatus(CacheManager.getBoolean("appLlm_search_status_" + mac, true)));
    }

    @Override // com.wakeup.commponent.api.AiService
    public boolean isAiWorking() {
        return AiBusyManager.INSTANCE.isBusy();
    }
}
