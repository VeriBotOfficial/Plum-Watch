package sg.bigo.ads.core.g.a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import sg.bigo.ads.core.h.d;

/* loaded from: classes9.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f20056a;

    public c(String str) {
        this.f20056a = str;
    }

    private WebResourceResponse a() {
        try {
            return new WebResourceResponse("text/javascript", "UTF-8", new FileInputStream(this.f20056a));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // sg.bigo.ads.core.h.d
    public void a(RenderProcessGoneDetail renderProcessGoneDetail) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0.equals("vpaid_iframe.html") == false) goto L6;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "shouldInterceptRequest, url="
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r0.concat(r1)
            r1 = 3
            r2 = 0
            java.lang.String r3 = "VPAIDWebView"
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r0)
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r6)
            if (r0 == 0) goto L8f
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r6.toLowerCase(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getLastPathSegment()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = -1
            switch(r1) {
                case -1823930312: goto L55;
                case -1308589451: goto L4a;
                case 2130164587: goto L3f;
                default: goto L3d;
            }
        L3d:
            r2 = r3
            goto L5e
        L3f:
            java.lang.String r1 = "vpaid_creative.js"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r2 = 2
            goto L5e
        L4a:
            java.lang.String r1 = "vpaid.js"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L3d
        L53:
            r2 = 1
            goto L5e
        L55:
            java.lang.String r1 = "vpaid_iframe.html"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L3d
        L5e:
            java.lang.String r0 = "UTF-8"
            switch(r2) {
                case 0: goto L7c;
                case 1: goto L69;
                case 2: goto L64;
                default: goto L63;
            }
        L63:
            goto L8f
        L64:
            android.webkit.WebResourceResponse r5 = r4.a()
            return r5
        L69:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            java.lang.String r6 = "javascript:'use strict';\nvar VPAIDWrapper = function(VPAIDCreative, VPAIDContainer, slot, videoSlot) {\n    if (!checkVPAIDInterface(VPAIDCreative)) {\n        console.log(\"invalid VPAIDCreative: \" + VPAIDCreative);\n        return\n    }\n    this.creative = VPAIDCreative;\n    this.VPAIDContainer = VPAIDContainer;\n    this.slot = slot;\n    this.videoSlot = videoSlot;\n    this.nativeCallQueue = [];\n    this.nativeCallInFlight = false;\n    this.setCallbacksForCreative();\n\n    function isFunction(str) {\n        return typeof str === 'function';\n    }\n\n    function canSubscribeToEvents(adCreative) {\n        return isFunction(adCreative.subscribe) || isFunction(adCreative.addEventListener) || isFunction(adCreative.on);\n    }\n\n    function canUnsubscribeFromEvents(adCreative) {\n        return isFunction(adCreative.unsubscribe) || isFunction(adCreative.removeEventListener) || isFunction(adCreative.off);\n    }\n\n    function checkVPAIDInterface(VPAIDCreative) {\n        //NOTE: skipAd is not part of the method list because it only appears in VPAID 2.0 and we support VPAID 1.0\n        var VPAIDInterfaceMethods = [\n            'handshakeVersion', 'initAd', 'startAd', 'stopAd', 'resizeAd', 'pauseAd', 'expandAd', 'collapseAd'\n        ];\n\n        for (var i = 0, len = VPAIDInterfaceMethods.length; i < len; i++) {\n            if (!VPAIDCreative || !isFunction(VPAIDCreative[VPAIDInterfaceMethods[i]])) {\n                return false;\n            }\n        }\n        return canSubscribeToEvents(VPAIDCreative) && canUnsubscribeFromEvents(VPAIDCreative);\n    }\n};\n\nVPAIDWrapper.prototype.nativeCallComplete = function(command) {\n    if (this.nativeCallQueue.length === 0) {\n        this.nativeCallInFlight = false;\n        return;\n    }\n\n    var nextCall = this.nativeCallQueue.pop();\n    window.location = nextCall;\n};\n\nVPAIDWrapper.prototype.isVPAIDCreativeReady = function(args) {\n    if (this.creative) {\n        return true;\n    }\n    if (args) {\n        var command = args.shift();\n        var msg = 'rejecting ' + command + ' because vpaid is not ready.'\n        console.log(msg);\n        this.executeNativeCall(['VPAIDCreativeError',\n            'command', command,\n            'message', msg]);\n    }\n    return false;\n};\n\nVPAIDWrapper.prototype.executeNativeCall = function(args) {\n    var command = args.shift();\n    var call = 'vpaid://' + command;\n\n    var key, value;\n    var isFirstArgument = true;\n\n    for (var i = 0; i < args.length; i += 2) {\n        key = args[i];\n        value = args[i + 1];\n\n        if (value === null) continue;\n\n        if (isFirstArgument) {\n            call += '?';\n            isFirstArgument = false;\n        } else {\n            call += '&';\n        }\n\n        call += encodeURIComponent(key) + '=' + encodeURIComponent(value);\n    }\n\n    if (this.nativeCallInFlight) {\n        this.nativeCallQueue.push(call);\n    } else {\n        this.nativeCallInFlight = true;\n        window.location = call;\n    }\n};\n\nVPAIDWrapper.prototype.callbackVPAIDEvent = function(args) {\n    if (this.isVPAIDCreativeReady(args)) {\n        this.executeNativeCall(args);\n    }\n};\n\nVPAIDWrapper.prototype.updateVPIADContainer = function(width, height) {\n    this.VPAIDContainer.style.width = width;\n    this.VPAIDContainer.style.height = height;\n};\n\nVPAIDWrapper.prototype.setCallbacksForCreative = function() {\n    var callbacks = {\n        AdStarted: this.onStartAd,\n        AdStopped: this.onStopAd,\n        AdSkipped: this.onSkipAd,\n        AdLoaded: this.onAdLoaded,\n        AdLinearChange: this.onAdLinearChange,\n        AdSizeChange: this.onAdSizeChange,\n        AdExpandedChange: this.onAdExpandedChange,\n        AdSkippableStateChange: this.onAdSkippableStateChange,\n        AdDurationChange: this.onAdDurationChange,\n        AdRemainingTimeChange: this.onAdRemainingTimeChange,\n        AdVolumeChange: this.onAdVolumeChange,\n        AdImpression: this.onAdImpression,\n        AdClickThru: this.onAdClickThru,\n        AdInteraction: this.onAdInteraction,\n        AdVideoStart: this.onAdVideoStart,\n        AdVideoFirstQuartile: this.onAdVideoFirstQuartile,\n        AdVideoMidpoint: this.onAdVideoMidpoint,\n        AdVideoThirdQuartile: this.onAdVideoThirdQuartile,\n        AdVideoComplete: this.onAdVideoComplete,\n        AdUserAcceptInvitation: this.onAdUserAcceptInvitation,\n        AdUserMinimize: this.onAdUserMinimize,\n        AdUserClose: this.onAdUserClose,\n        AdPaused: this.onAdPaused,\n        AdPlaying: this.onAdPlaying,\n        AdError: this.onAdError,\n        AdLog: this.onAdLog\n    };\n    for (var eventName in callbacks) {\n        this.creative.subscribe(callbacks[eventName], eventName, this);\n    }\n};\n\n/////////////////////////// receive events //////////////////////////////\n// Pass through for initAd - when the video player wants to call the ad\nVPAIDWrapper.prototype.initAd = function(width, height, viewMode, desiredBitrate, creativeData) {\n    if (this.isVPAIDCreativeReady(['initAd'])) {\n        this.updateVPIADContainer(width, height);\n        this.videoSlot.videoSlotCanAutoPlay = true;\n        this.creative.initAd(width, height, viewMode, desiredBitrate, creativeData, {\n            slot:this.slot,\n            videoSlot:this.videoSlot\n        });\n    }\n};\n\nVPAIDWrapper.prototype.handshakeVersion = function (version) {\n    if (this.isVPAIDCreativeReady(['handshakeVersion'])) {\n        return this.creative.handshakeVersion(version)\n    } else {\n        return \"\";\n    }\n};\n\nVPAIDWrapper.prototype.resizeAd = function(width, height, viewMode) {\n    if (this.isVPAIDCreativeReady(['resizeAd'])) {\n        this.updateVPIADContainer(width, height);\n        this.creative.resizeAd(width, height, viewMode);\n    }\n};\n\nVPAIDWrapper.prototype.startAd = function() {\n    if (this.isVPAIDCreativeReady(['startAd'])) {\n        this.creative.startAd();\n    }\n};\n\nVPAIDWrapper.prototype.pauseAd = function() {\n    if (this.isVPAIDCreativeReady(['pauseAd'])) {\n        this.creative.pauseAd();\n    }\n};\n\nVPAIDWrapper.prototype.resumeAd = function() {\n    if (this.isVPAIDCreativeReady(['resumeAd'])) {\n        this.creative.resumeAd();\n    }\n};\n\nVPAIDWrapper.prototype.stopAd = function() {\n    if (this.isVPAIDCreativeReady(['stopAd'])) {\n        this.creative.stopAd();\n    }\n};\n\nVPAIDWrapper.prototype.expandAd = function() {\n    if (this.isVPAIDCreativeReady(['expandAd'])) {\n        this.creative.expandAd();\n    }\n};\n\nVPAIDWrapper.prototype.collapseAd = function() {\n    if (this.isVPAIDCreativeReady(['collapseAd'])) {\n        this.creative.collapseAd();\n    }\n};\n\nVPAIDWrapper.prototype.setAdVolume = function(val) {\n    if (this.isVPAIDCreativeReady(['setAdVolume'])) {\n        this.creative.setAdVolume(val);\n    }\n};\n\n/////////////////////////// callbck events //////////////////////////////\nVPAIDWrapper.prototype.onAdError = function(message) {\n    this.callbackVPAIDEvent(['onAdError',\n        'message', message\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdLog = function(message) {\n    this.callbackVPAIDEvent(['onAdLog',\n        'message', message\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdSizeChange = function() {\n    this.callbackVPAIDEvent(['onAdSizeChange',\n        'w', this.creative.getAdWidth(),\n        'h', this.creative.getAdHeight()\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdImpression = function() {\n    this.callbackVPAIDEvent(['onAdImpression']);\n};\n\nVPAIDWrapper.prototype.onAdVideoStart = function() {\n    this.callbackVPAIDEvent(['onAdVideoStart']);\n};\n\nVPAIDWrapper.prototype.onAdVideoFirstQuartile = function() {\n    this.callbackVPAIDEvent(['onAdVideoFirstQuartile']);\n};\n\nVPAIDWrapper.prototype.onAdVideoMidpoint = function() {\n    this.callbackVPAIDEvent(['onAdVideoMidpoint']);\n};\n\nVPAIDWrapper.prototype.onAdVideoThirdQuartile = function() {\n    this.callbackVPAIDEvent(['onAdVideoThirdQuartile']);\n};\n\nVPAIDWrapper.prototype.onAdVideoComplete = function() {\n    this.callbackVPAIDEvent(['onAdVideoComplete']);\n};\n\nVPAIDWrapper.prototype.onAdSkippableStateChange = function() {\n    this.callbackVPAIDEvent(['onAdSkippableStateChange',\n        'state', this.creative.getAdSkippableState()\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdLoaded = function() {\n    this.callbackVPAIDEvent(['onAdLoaded']);\n};\n\nVPAIDWrapper.prototype.onAdPlaying = function() {\n    this.callbackVPAIDEvent(['onAdPlaying']);\n};\n\nVPAIDWrapper.prototype.onStartAd = function() {\n    this.callbackVPAIDEvent(['onStartAd']);\n};\n\nVPAIDWrapper.prototype.onStopAd = function() {\n    this.callbackVPAIDEvent(['onStopAd']);\n};\n\nVPAIDWrapper.prototype.onSkipAd = function() {\n    this.callbackVPAIDEvent(['onSkipAd']);\n};\n\nVPAIDWrapper.prototype.onAdPaused = function() {\n    this.callbackVPAIDEvent(['onAdPaused']);\n};\n\nVPAIDWrapper.prototype.onAdDurationChange = function() {\n    this.callbackVPAIDEvent(['onAdDurationChange',\n        'duration', this.creative.getAdDuration()\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdRemainingTimeChange = function() {\n    this.callbackVPAIDEvent(['onAdRemainingTimeChange',\n        'remaining', this.creative.getAdRemainingTime()\n    ]);\n}\n\nVPAIDWrapper.prototype.onAdUserAcceptInvitation = function() {\n    this.callbackVPAIDEvent(['onAdUserAcceptInvitation']);\n};\n\nVPAIDWrapper.prototype.onAdUserMinimize = function() {\n    this.callbackVPAIDEvent(['onAdUserMinimize']);\n};\n\nVPAIDWrapper.prototype.onAdUserClose = function() {\n    this.callbackVPAIDEvent(['onAdUserClose']);\n};\n\nVPAIDWrapper.prototype.onAdExpandedChange = function() {\n    this.callbackVPAIDEvent(['onAdExpandedChange',\n        'expanded', this.creative.getAdExpanded()\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdClickThru = function(url, id, playerHandles) {\n    this.callbackVPAIDEvent(['onAdClickThru',\n        'url', url,\n        'id', id,\n        'playerHandles', playerHandles\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdInteraction = function(id) {\n    this.callbackVPAIDEvent(['onAdInteraction',\n        'id', id\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdLinearChange = function() {\n    this.callbackVPAIDEvent(['onAdLinearChange',\n        'adLinear', this.creative.getAdLinear()\n    ]);\n};\n\nVPAIDWrapper.prototype.onAdVolumeChange = function() {\n    var volume = this.creative.getAdVolume();\n    if (volume <= 0) {\n        console.log(\"muted\");\n        this.videoSlot.muted = true;\n        this.videoSlot.volume = 0;\n    } else {\n        console.log(\"unmuted\");\n        this.videoSlot.muted = false;\n        this.videoSlot.volume = volume;\n    }\n    this.callbackVPAIDEvent(['onAdVolumeChange',\n        'volume', volume\n    ]);\n};\n\n/////////////////////////// getter events //////////////////////////////\nVPAIDWrapper.prototype.getAdVolume = function() {\n    var volume = this.creative.getAdVolume();\n    return volume;\n};\n\nVPAIDWrapper.prototype.getAdLinear = function() {\n    var adLinear = this.creative.getAdLinear();\n    return adLinear;\n};\n\nVPAIDWrapper.prototype.getAdExpanded = function() {\n    var expanded = this.creative.getAdExpanded();\n    return expanded;\n};\n\nVPAIDWrapper.prototype.getAdSkippableState = function() {\n    var state = this.creative.getAdSkippableState();\n    return state;\n};\n\nVPAIDWrapper.prototype.getAdRemainingTime = function() {\n    var remaining = this.creative.getAdRemainingTime();\n    return remaining;\n};\n\nVPAIDWrapper.prototype.getAdWidth = function() {\n    var adWidth = this.creative.getAdWidth();\n    return adWidth;\n};\n\nVPAIDWrapper.prototype.getAdHeight = function() {\n    var adHeight = this.creative.getAdHeight();\n    return adHeight;\n};\n\nVPAIDWrapper.prototype.getAdDuration = function() {\n    var duration = this.creative.getAdDuration();\n    return duration;\n};\n\nVPAIDWrapper.prototype.getAdCompanions = function() {\n    return this.creative.getAdCompanions();\n};\n\nVPAIDWrapper.prototype.getAdIcons = function() {\n    return this.creative.getAdIcons();\n};"
            byte[] r6 = r6.getBytes()
            r5.<init>(r6)
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
            java.lang.String r1 = "text/javascript"
            r6.<init>(r1, r0, r5)
            return r6
        L7c:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            java.lang.String r6 = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title></title>\n</head>\n<body style=\"width: 100%; height: 100%;\">\n<script src=\"vpaid_creative.js\" type=\"text/javascript\"></script>\n<div id=\"slot\"\n     style=\"width: 100vw; height: 100vh; margin: 0px; padding: 0px; border: none;\"></div>\n</body>\n</html>"
            byte[] r6 = r6.getBytes()
            r5.<init>(r6)
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
            java.lang.String r1 = "text/html"
            r6.<init>(r1, r0, r5)
            return r6
        L8f:
            android.webkit.WebResourceResponse r5 = super.shouldInterceptRequest(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.c.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }
}
