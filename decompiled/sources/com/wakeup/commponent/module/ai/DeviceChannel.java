package com.wakeup.commponent.module.ai;

import android.text.TextUtils;
import com.alipay.sdk.m.n.c;
import com.google.gson.Gson;
import com.heytap.mcssdk.constant.a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.Constants;
import com.wakeup.common.network.entity.ai.AppLLMConfig2;
import com.wakeup.common.network.host.EvnMgr;
import com.wakeup.common.network.host.Host;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.common.storage.model.DeviceModel;
import com.wakeup.commponent.module.ai.roam.SwitchHostMgr;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: DeviceChannel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001_B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J8\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u000fJ,\u00103\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u000fJ,\u00106\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u00020\u000fJ\u0006\u00109\u001a\u00020\u0005J\u001e\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\u0005J\u0006\u0010?\u001a\u00020\u0005J\u0006\u0010@\u001a\u00020\u0005J\u0006\u0010A\u001a\u00020\u0005J\u0006\u0010B\u001a\u00020\u0005J\u0006\u0010C\u001a\u00020\u0005J\u0006\u0010D\u001a\u00020\u0005J.\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u0005J\u0006\u0010J\u001a\u00020\u0005J\u0006\u0010K\u001a\u00020\u0005J\u0006\u0010L\u001a\u00020\u0005J4\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00052\u0014\u0010R\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020O0SJ\u0006\u0010U\u001a\u00020OJ\u001a\u0010V\u001a\u0004\u0018\u00010T2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0016\u0010W\u001a\u00020O2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u0005J\u0010\u0010X\u001a\u00020\u00052\b\b\u0002\u0010Y\u001a\u00020/J\u0006\u0010Z\u001a\u00020\u0005J\u0006\u0010[\u001a\u00020\u0005J\u000e\u0010\\\u001a\u00020\u00052\u0006\u0010]\u001a\u00020^R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/wakeup/commponent/module/ai/DeviceChannel;", "", "<init>", "()V", "TAG", "", "mScope", "Lkotlinx/coroutines/CoroutineScope;", "mLLMConfigJob", "Lkotlinx/coroutines/Job;", "getProductId", "getChannelId", "getHeads", "", "projectId", "", "getUrl", "getUrl2", "getAsrSingleUrl", "languageId", "getAsrURL", "meetingNo", "versionNo", "getRealTimeURL", "sign", "getTTTUrl", "getTTSUrl", "getTsListUrl", "getTsUrl", "getRandomLyricUrl", "getTtmUrl", "getSaveTtmUrl", "getTtmByIdUrl", "getTtmListUrl", "postAudioUrl", "postBigFileAsrUrl", "getBigFileAsrResult", "getAudioResult", "getNewSummaryUrl", "getSummaryToWordUrl", "generateNewXMindUrl", "getOcrUrl", "getOneClickTransUrl", "getSpeechRecognitionUrl", "sourceLanId", "transLanId", "isTrans", "", "isTts", "isMutualTrans", c.m, "getSpeechRecognitionUrl2", "audioType", "startEndFlag", "getStreamAsrRecognitionUrl", "opusDecodeType", "version", "getTsStreamUrl", "getTsAsrListUrl", "pageNum", "pageSize", "getTTSStreamUrl", "getTextGenerationTextStream", "textGenerationImage", "aiStyleList", "getImgUploadUrl", "getIRUrl", "getTTSFile", "getImageTransUrl", "getAsrLlmTts", JsonStorageKeyNames.SESSION_ID_KEY, "isDialogue", "isTextFlag", "inputText", "getGlassChatCase", "getImageAndTextUrl", "getWakeLLMUrl", "cacheKey", "getAppLLMConfig", "", "mac", "code", "run", "Lkotlin/Function1;", "Lcom/wakeup/common/network/entity/ai/AppLLMConfig2;", "cancelLLMConfig", "getConfigCache", "refreshConfigCache", "getAppLlmDefAiDomain", "isGlasses", "getAiUrlQuery", "licenseVerify", "getLanguageListUrl", "channel", "Lcom/wakeup/commponent/module/ai/DeviceChannel$LanguageChannel;", "LanguageChannel", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceChannel {
    private static Job mLLMConfigJob;
    public static final DeviceChannel INSTANCE = new DeviceChannel();
    private static final String TAG = "DeviceChannel";
    private static final CoroutineScope mScope = CoroutineScopeKt.MainScope();
    private static final String cacheKey = "appllm_config_cache_key_";

    private DeviceChannel() {
    }

    public final String getProductId() {
        DeviceModel lastDevice = DeviceDao.getLastDevice();
        return lastDevice == null ? "0" : String.valueOf(lastDevice.getProductId());
    }

    public final String getChannelId() {
        DeviceModel lastDevice = DeviceDao.getLastDevice();
        if (lastDevice != null) {
            if (lastDevice.getProductId() == 7 || lastDevice.getProductId() == 23 || lastDevice.getProductId() == 15) {
                return "9";
            }
            return "0";
        }
        return "0";
    }

    public final Map<String, String> getHeads(int projectId) {
        String str;
        String string = CacheManager.INSTANCE.getString(Constants.SPKey.DEVICE_SN + DeviceDao.getLastDeviceMac());
        DeviceModel lastDevice = DeviceDao.getLastDevice();
        if (lastDevice != null) {
            lastDevice.getCode();
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("Channel-Id", getChannelId());
        pairArr[1] = TuplesKt.to("Product-Id", getProductId());
        pairArr[2] = TuplesKt.to("Model-Type", "2");
        pairArr[3] = TuplesKt.to("Client-Type", "2");
        pairArr[4] = TuplesKt.to("Rule-Content-Type", String.valueOf(projectId));
        pairArr[5] = TuplesKt.to("Sn-Code", string);
        DeviceModel lastDevice2 = DeviceDao.getLastDevice();
        if (lastDevice2 == null || (str = lastDevice2.getCode()) == null) {
            str = "";
        }
        pairArr[6] = TuplesKt.to("Device-Code", str);
        return MapsKt.mapOf(pairArr);
    }

    private final String getUrl() {
        return SwitchHostMgr.INSTANCE.getAiHost() + "gateway/machine/v2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUrl2() {
        return SwitchHostMgr.INSTANCE.getAiHost() + "gateway/machine";
    }

    public final String getAsrSingleUrl(int languageId) {
        return getUrl() + "/bj/stt/v1/getSpeechToText?languageId=" + languageId;
    }

    public final String getAsrURL(String meetingNo, String versionNo) {
        Intrinsics.checkNotNullParameter(meetingNo, "meetingNo");
        Intrinsics.checkNotNullParameter(versionNo, "versionNo");
        return SwitchHostMgr.INSTANCE.getAiASRHost() + "machine/websocket/speechIdentify?meetingNo=" + meetingNo + "&versionNo=" + versionNo;
    }

    public final String getRealTimeURL(String meetingNo, String versionNo, String sign) {
        Intrinsics.checkNotNullParameter(meetingNo, "meetingNo");
        Intrinsics.checkNotNullParameter(versionNo, "versionNo");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return SwitchHostMgr.INSTANCE.getAiASRHost() + "machine/websocket/realTimeCommunication?meetingNo=" + meetingNo + "&versionNo=" + versionNo + "&sign=" + sign;
    }

    public final String getTTTUrl() {
        return getUrl() + "/function/getStreamCompletions";
    }

    public final String getTTSUrl() {
        return getUrl() + "/ms/tts/v1/getTextToSpeech";
    }

    public final String getTsListUrl() {
        return getUrl() + "/ms/translate/v1/getTransLateDict";
    }

    public final String getTsUrl() {
        return getUrl() + "/aiatoms/v1/getTransLate";
    }

    public final String getRandomLyricUrl() {
        return getUrl() + "/ms/ttm/v1/getMusicRandomLyric";
    }

    public final String getTtmUrl() {
        return getUrl() + "/aiatoms/v1/getTextToMusic";
    }

    public final String getSaveTtmUrl() {
        return getUrl() + "/ms/ttm/v1/inertMusicResult";
    }

    public final String getTtmByIdUrl() {
        return getUrl() + "/sound/ttm/v1/getTextToMusicById";
    }

    public final String getTtmListUrl() {
        return getUrl() + "/ms/ttm/v1/getMusicPiazza";
    }

    public final String postAudioUrl() {
        return getUrl() + "/aiatoms/v1/speechBigFileToText";
    }

    public final String postBigFileAsrUrl() {
        return getUrl() + "/function/bigFileSpeechRecognition";
    }

    public final String getBigFileAsrResult() {
        return getUrl() + "/function/getBigFileSpeechRecognitionResult";
    }

    public final String getAudioResult() {
        return getUrl() + "/aiatoms/v1/getSpeechBigFileToText";
    }

    public final String getNewSummaryUrl() {
        return getUrl() + "/function/summary/text";
    }

    public final String getSummaryToWordUrl() {
        return getUrl() + "/aiatoms/v1/summaryToWordFile";
    }

    public final String generateNewXMindUrl() {
        return getUrl() + "/function/mindMap/text";
    }

    public final String getOcrUrl() {
        return getUrl() + "/ocr/ocrDocumentFile";
    }

    public final String getOneClickTransUrl() {
        return getUrl() + "/aiatoms/v1/oneClickTranslationFile";
    }

    public static /* synthetic */ String getSpeechRecognitionUrl$default(DeviceChannel deviceChannel, String str, String str2, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            i = 2;
        }
        return deviceChannel.getSpeechRecognitionUrl(str, str2, z, z2, z3, i);
    }

    public final String getSpeechRecognitionUrl(String sourceLanId, String transLanId, boolean isTrans, boolean isTts, boolean isMutualTrans, int apiVersion) {
        Intrinsics.checkNotNullParameter(sourceLanId, "sourceLanId");
        Intrinsics.checkNotNullParameter(transLanId, "transLanId");
        return getUrl() + "/function/speechRecognition?fromLanguageId=" + sourceLanId + "&toLanguageId=" + transLanId + "&transFlag=" + isTrans + "&ttsFlag=" + isTts + "&mutualTranslationFlag=" + isMutualTrans + "&apiVersion=" + apiVersion;
    }

    public static /* synthetic */ String getSpeechRecognitionUrl2$default(DeviceChannel deviceChannel, String str, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            i2 = 2;
        }
        return deviceChannel.getSpeechRecognitionUrl2(str, i, z, i2);
    }

    public final String getSpeechRecognitionUrl2(String sourceLanId, int audioType, boolean startEndFlag, int apiVersion) {
        Intrinsics.checkNotNullParameter(sourceLanId, "sourceLanId");
        return getUrl() + "/function/singleSpeechRecognition?languageId=" + sourceLanId + "&audioType=" + audioType + "&startEndFlag=" + startEndFlag + "&apiVersion=" + apiVersion;
    }

    public static /* synthetic */ String getStreamAsrRecognitionUrl$default(DeviceChannel deviceChannel, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 5;
        }
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = 1;
        }
        return deviceChannel.getStreamAsrRecognitionUrl(i, i2, i3, i4);
    }

    public final String getStreamAsrRecognitionUrl(int languageId, int audioType, int opusDecodeType, int version) {
        return getUrl() + "/function/streamAsrRecognition?streamFlag=true&audioType=" + audioType + "&version=" + version + "&languageId=" + languageId + "&opusDecodeType=" + opusDecodeType;
    }

    public final String getTsStreamUrl() {
        return getUrl() + "/function/transLateStream";
    }

    public final String getTsAsrListUrl(int pageNum, int pageSize, int languageId) {
        return getUrl() + "/aiChargeClient/languageList?pageNum=" + pageNum + "&pageSize=" + pageSize + "&languageId=" + languageId;
    }

    public final String getTTSStreamUrl() {
        return getUrl() + "/function/ttsStreamChunk";
    }

    public final String getTextGenerationTextStream() {
        return getUrl() + "/gpt/textGenerationText";
    }

    public final String textGenerationImage() {
        return getUrl() + "/gpt/textGenerationImage";
    }

    public final String aiStyleList() {
        return getUrl() + "/gpt/aiStyleList";
    }

    public final String getImgUploadUrl() {
        return getUrl() + "/aiChargeClient/imageUploads";
    }

    public final String getIRUrl() {
        return getUrl() + "/function/getIntentionIdentify";
    }

    public final String getTTSFile() {
        return getUrl() + "/function/ttsStreamSseFile";
    }

    public final String getImageTransUrl() {
        return getUrl() + "/function/imageTranslate";
    }

    public final String getAsrLlmTts(String sessionId, int languageId, int isDialogue, int isTextFlag, String inputText) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getUrl() + "/function/asrLlmTtsStream?");
        if (!TextUtils.isEmpty(sessionId)) {
            stringBuffer.append("sessionId=" + sessionId + "&");
        }
        stringBuffer.append("languageId=" + languageId + "&");
        stringBuffer.append("ttsFlag=false&retuenSentenceFlag=true&inputAudioType=1&outputAudioType=1&ttsFormat=1&");
        stringBuffer.append("isDialogue=" + isDialogue + "&");
        stringBuffer.append("isTextFlag=" + isTextFlag + "&");
        stringBuffer.append("inputText=" + inputText);
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final String getGlassChatCase() {
        return getUrl() + "/function/initDialogueText";
    }

    public final String getImageAndTextUrl() {
        return getUrl() + "/function/imageAndTextGenerationTextStream";
    }

    public final String getWakeLLMUrl() {
        if (EvnMgr.isTest()) {
            return "wss://ai-cloud-hk.4paradigm.com/preview/ac-adapter/chat/ws";
        }
        return "wss://ai-cloud-hk.4paradigm.com/ac-adapter/chat/ws";
    }

    public final void getAppLLMConfig(String mac, String languageId, String code, Function1<? super AppLLMConfig2, Unit> run) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(languageId, "languageId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(run, "run");
        launch$default = BuildersKt__Builders_commonKt.launch$default(mScope, Dispatchers.getIO(), null, new DeviceChannel$getAppLLMConfig$1(mac, languageId, code, run, null), 2, null);
        mLLMConfigJob = launch$default;
    }

    public final void cancelLLMConfig() {
        Job job = mLLMConfigJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        mLLMConfigJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLLMConfig2 getConfigCache(String languageId, String code) {
        String string = CacheManager.INSTANCE.getString(cacheKey + code + "_" + languageId);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        AppLLMConfig2 appLLMConfig2 = (AppLLMConfig2) new Gson().fromJson(string, AppLLMConfig2.class);
        if (System.currentTimeMillis() - appLLMConfig2.getCreateTime() >= a.g) {
            return null;
        }
        return appLLMConfig2;
    }

    public final void refreshConfigCache(String languageId, String code) {
        Intrinsics.checkNotNullParameter(languageId, "languageId");
        Intrinsics.checkNotNullParameter(code, "code");
        CacheManager.INSTANCE.saveString(cacheKey + code + "_" + languageId, "");
    }

    public static /* synthetic */ String getAppLlmDefAiDomain$default(DeviceChannel deviceChannel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return deviceChannel.getAppLlmDefAiDomain(z);
    }

    public final String getAppLlmDefAiDomain(boolean isGlasses) {
        if (isGlasses) {
            return "wss://agent-en-dm.vkcto.com:9441/ws";
        }
        return "wss://agent-en.vkcto.com:9440/ws";
    }

    public final String getAiUrlQuery() {
        String str;
        if (EvnMgr.isTest()) {
            str = "https://test-ai-howear.iwhop.cn/howeartest";
        } else {
            str = "https://micro-life.iwhop.com";
        }
        return str.concat("/microLife/button-tab-config/getConfigByChannelAndVersion");
    }

    public final String licenseVerify() {
        return Host.INSTANCE.getAiHost() + "gateway/user/license/api/v1/function/authentication";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceChannel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/commponent/module/ai/DeviceChannel$LanguageChannel;", "", "path", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "RTC", "NCA", "NSI", "NOCT", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LanguageChannel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LanguageChannel[] $VALUES;
        private final String path;
        public static final LanguageChannel RTC = new LanguageChannel("RTC", 0, "meetingRtc");
        public static final LanguageChannel NCA = new LanguageChannel("NCA", 1, "meetingNca");
        public static final LanguageChannel NSI = new LanguageChannel("NSI", 2, "meetingNsi");
        public static final LanguageChannel NOCT = new LanguageChannel("NOCT", 3, "meetingNoct");

        private static final /* synthetic */ LanguageChannel[] $values() {
            return new LanguageChannel[]{RTC, NCA, NSI, NOCT};
        }

        public static EnumEntries<LanguageChannel> getEntries() {
            return $ENTRIES;
        }

        private LanguageChannel(String str, int i, String str2) {
            this.path = str2;
        }

        public final String getPath() {
            return this.path;
        }

        static {
            LanguageChannel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static LanguageChannel valueOf(String str) {
            return (LanguageChannel) Enum.valueOf(LanguageChannel.class, str);
        }

        public static LanguageChannel[] values() {
            return (LanguageChannel[]) $VALUES.clone();
        }
    }

    public final String getLanguageListUrl(LanguageChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return SwitchHostMgr.INSTANCE.getAiHost() + "gateway/machine/v2/" + channel.getPath() + "/languageList";
    }
}
