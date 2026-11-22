package com.anythink.expressad.h;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.anythink.expressad.reward.a.d;
import io.agora.rtc2.Constants;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4957a = 1000;
    public static final int b = 2000;
    public static final int c = 3000;
    public static final int d = 3000;
    public static final int e = 5000;
    public static final int f = 6000;
    private static final int g = 600;
    private static final int h = 700;
    private static final int i = 800;
    private static final int j = 900;

    private static int a(int i2) {
        return i2 + 900;
    }

    private static int a(int i2, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("errorCode: ") && str.length() > 16) {
                    return Integer.parseInt(str.substring(11, 15));
                }
                if (str.equals("do not have sorceList")) {
                    return i2 + 601;
                }
                if (str.equals("Network error,UnknownHostException")) {
                    return i2 + 602;
                }
                if (str.equals("v3 is timeout")) {
                    return i2 + 603;
                }
                if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                    if (str.equals("Network error,I/O exception response null")) {
                        return i2 + TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO;
                    }
                    if (str.equals("Network error,ConnectException")) {
                        return i2 + 606;
                    }
                    if (str.equals("Network error,socket timeout exception")) {
                        return i2 + TypedValues.MotionType.TYPE_PATHMOTION_ARC;
                    }
                    if (str.equals("Network error,disconnected network exception")) {
                        return i2 + TypedValues.MotionType.TYPE_DRAW_PATH;
                    }
                    if (str.equals("Network error,timeout exception")) {
                        return i2 + TypedValues.MotionType.TYPE_POLAR_RELATIVETO;
                    }
                    if (str.startsWith("Network error,please check state code")) {
                        return i2 + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                    }
                    if (str.equals("Network error,I/O exception contents null")) {
                        return i2 + TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE;
                    }
                    if (str.equals("Network unknown error")) {
                        return i2 + TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID;
                    }
                    if (str.equals("Network error,I/O exception")) {
                        return i2 + 613;
                    }
                    if (str.equals("web env is not support")) {
                        return i2 + 614;
                    }
                    if (str.equals("Network error,unknown")) {
                        return i2 + 615;
                    }
                    if (str.equals("Network error，sslp exception")) {
                        return i2 + 616;
                    }
                    if (str.startsWith("Cast exception, return data")) {
                        return i2 + 617;
                    }
                    if (str.equals("REQUEST_TIMEOUT")) {
                        return i2 + 701;
                    }
                    if (str.startsWith("The server returns an exception")) {
                        return i2 + 702;
                    }
                    if (!str.equals(d.f5042a) && !str.equals("Need show campaign list is NULL!")) {
                        if (str.startsWith("load no ad")) {
                            return i2 + 704;
                        }
                        if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                            return i2 + TypedValues.TransitionType.TYPE_INTERPOLATOR;
                        }
                        if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                            return i2 + TypedValues.TransitionType.TYPE_STAGGERED;
                        }
                        if (str.equals("No video campaign")) {
                            return i2 + TypedValues.TransitionType.TYPE_TRANSITION_FLAGS;
                        }
                        if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                            return i2 + 708;
                        }
                        if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                            return i2 + 709;
                        }
                        if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                            return i2 + Constants.AUDIO_MIXING_STATE_PLAYING;
                        }
                        if (str.equals(com.anythink.expressad.mbbanner.a.a.c)) {
                            return i2 + 801;
                        }
                        if (str.equals("resource load timeout is tpl: false")) {
                            return i2 + 802;
                        }
                        if (str.startsWith("resource download failed")) {
                            return i2 + 803;
                        }
                        if (str.equals("temp preload success but isReady false")) {
                            return i2 + 804;
                        }
                        if (str.equals("temp resource download failed")) {
                            return i2 + 805;
                        }
                        if (str.equals("tpl temp resource download failed")) {
                            return i2 + 806;
                        }
                        if (str.equals("resource load timeout is tpl: true")) {
                            return i2 + 807;
                        }
                        if (!str.startsWith("https://") && !str.startsWith("http://")) {
                            if (str.equals("mraid resource write fail")) {
                                return i2 + 809;
                            }
                            if (str.startsWith("data save failed:")) {
                                return i2 + Constants.RHYTHM_PLAYER_STATE_IDLE;
                            }
                            if (str.equals("resource load timeout")) {
                                return i2 + Constants.RHYTHM_PLAYER_STATE_OPENING;
                            }
                            if (str.startsWith("tpl temp preload failed")) {
                                return i2 + Constants.RHYTHM_PLAYER_STATE_DECODING;
                            }
                        }
                        return i2 + 808;
                    }
                    return i2 + 703;
                }
                return i2 + 604;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return i2;
    }
}
