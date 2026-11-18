package com.applovin.impl;

import android.javax.sip.header.WarningHeader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.wakeup.common.DeviceFeatures;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes16.dex */
public abstract class u6 {
    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int r2 = num.intValue();
        if (r2 == 2) {
            return "SFBX CMP";
        }
        if (r2 == 3) {
            return "Liveramp CMP";
        }
        if (r2 == 5) {
            return "UserCentrics CMP";
        }
        if (r2 == 6) {
            return "Sourcepoint Dialogue CMP";
        }
        if (r2 == 7) {
            return "Didomi CMP";
        }
        if (r2 == 27) {
            return "Associated Newspapers Ltd CMP";
        }
        if (r2 == 28) {
            return "Onetrust / Cookiepro CMP";
        }
        if (r2 == 104) {
            return "AdOcean CMP";
        }
        if (r2 == 105) {
            return "Dailymotion CMP";
        }
        if (r2 == 302) {
            return "Gravito CMP";
        }
        if (r2 == 303) {
            return "Impala CMP";
        }
        if (r2 == 414) {
            return "MBEX LTD CMP";
        }
        if (r2 == 415) {
            return "Match Group LLC CMP";
        }
        switch (r2) {
            case 10:
                return "InMobi Choice CMP";
            case 14:
                return "Yahoo EMEA CMP";
            case 21:
                return "Traffective CMP";
            case 31:
                return "Consentmanager CMP";
            case 35:
                return "BurdaForward GmbH CMP";
            case 59:
                return "Deezer CMP";
            case 68:
                return "Uniconsent CMP";
            case 72:
                return "Wirtualna Polska Media S.A. CMP";
            case 76:
                return "Sibbo CMP";
            case 79:
                return "SFR CMP";
            case 84:
                return "Alma CMP";
            case 90:
                return "Commanders Act CMP";
            case 123:
                return "Iubenda CMP";
            case 125:
                return "Ebay CMP";
            case 134:
                return "Cookiebot CMP";
            case 167:
                return "1&1 Mail & Media GmbH CMP";
            case DeviceFeatures.AI_AUDIO_SEARCH /* 171 */:
                return "Viber Media CMP";
            case 198:
                return "Microsoft Corporation CMP";
            case 212:
                return "Singlespot";
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                return "Interia CMP";
            case 237:
                return "ALPRED SL CMP";
            case TelnetCommand.AYT /* 246 */:
                return "Overwolf Ltd. CMP";
            case 258:
                return "Automattic, Inc. CMP";
            case 260:
                return "Axeptio";
            case 273:
                return "One Consent CMP";
            case 280:
                return "Ringier Axel Springer Polska";
            case 300:
                return "Google LLC CMP";
            case 306:
                return "mobile.de CMP";
            case 309:
                return "eBay Kleinanzeigen GmbH CMP";
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                return "Seven.One Entertainment Group GmbH CMP";
            case 327:
                return "FunCorp CMP";
            case 329:
                return "wetter.com GmbH CMP";
            case NNTPReply.SEND_ARTICLE_TO_POST /* 340 */:
                return "Ketch CMP";
            case 345:
                return "Axel Springer Deutschland GmbH CMP";
            case 348:
                return "Outfit7 CMP";
            case 355:
                return "Onesecondbefore B.V. CMP";
            case 371:
                return "Société Éditrice du Monde";
            case 385:
                return "freenet.de GmbH CMP";
            case 387:
                return "Learnings CMP";
            case 397:
                return "Autoscout24 CMP";
            case WarningHeader.MISCELLANEOUS_WARNING /* 399 */:
                return "Transcend CMP";
            case 409:
                return "adjoe GmbH CMP";
            case 421:
                return "Moonee Publishing LTD CMP";
            case Videoio.CAP_PROP_XI_DECIMATION_VERTICAL /* 432 */:
                return "Appodeal Inc CMP";
            case 436:
                return "X-FLOW LTD CMP";
            default:
                switch (r2) {
                    case FTPReply.FILE_ACTION_PENDING /* 350 */:
                        return "Easybrain CMP";
                    case 351:
                        return "TVP S.A. CMP";
                    case 352:
                        return "Pubtech CMP";
                    default:
                        return null;
                }
        }
    }
}
