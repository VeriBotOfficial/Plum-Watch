package com.mbridge.msdk.util;

import android.text.TextUtils;

/* JADX INFO: compiled from: AllTypeErrorMsgToCodeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static int a(int r17, String str) {
        int r0;
        try {
            if (TextUtils.isEmpty(str)) {
                return r17;
            }
            int r3 = 15;
            if (str.startsWith("errorCode: ") && str.length() > 16) {
                return Integer.parseInt(str.substring(11, 15));
            }
            if (!str.equals("do not have sorceList")) {
                if (!str.equals("Network error,UnknownHostException")) {
                    if (!str.equals("v3 is timeout")) {
                        if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                            if (!str.equals("Network error,I/O exception response null")) {
                                if (!str.equals("Network error,ConnectException")) {
                                    if (!str.equals("Network error,socket timeout exception")) {
                                        if (!str.equals("Network error,disconnected network exception")) {
                                            if (!str.equals("Network error,timeout exception")) {
                                                if (!str.startsWith("Network error,please check state code")) {
                                                    if (!str.equals("Network error,I/O exception contents null")) {
                                                        if (!str.equals("Network unknown error")) {
                                                            if (str.equals("Network error,I/O exception")) {
                                                                r0 = r17 + 600;
                                                                r3 = 13;
                                                            } else if (str.equals("web env is not support")) {
                                                                r0 = r17 + 600;
                                                                r3 = 14;
                                                            } else if (str.equals("Network error,unknown")) {
                                                                r0 = r17 + 600;
                                                            } else if (str.equals("Network error，sslp exception")) {
                                                                r0 = r17 + 600;
                                                                r3 = 16;
                                                            } else if (str.startsWith("Cast exception, return data")) {
                                                                r0 = r17 + 600;
                                                                r3 = 17;
                                                            } else if (str.equals("REQUEST_TIMEOUT")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.startsWith("The server returns an exception")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals(com.anythink.expressad.reward.a.d.f5042a) || str.equals("Need show campaign list is NULL!")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.startsWith("load no ad")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("No video campaign")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                                                                r0 = r17 + 700;
                                                            } else if (str.equals(com.anythink.expressad.mbbanner.a.a.c)) {
                                                                r0 = r17 + 800;
                                                            } else if (str.equals("resource load timeout is tpl: false")) {
                                                                r0 = r17 + 800;
                                                            } else if (str.startsWith("resource download failed")) {
                                                                r0 = r17 + 800;
                                                            } else if (str.equals("temp preload success but isReady false")) {
                                                                r0 = r17 + 800;
                                                            } else if (str.equals("temp resource download failed")) {
                                                                r0 = r17 + 800;
                                                            } else if (str.equals("tpl temp resource download failed")) {
                                                                r0 = r17 + 800;
                                                            } else if (str.equals("resource load timeout is tpl: true")) {
                                                                r0 = r17 + 800;
                                                            } else {
                                                                if (!str.startsWith("https://") && !str.startsWith("http://")) {
                                                                    if (str.equals("mraid resource write fail")) {
                                                                        r0 = r17 + 800;
                                                                    } else if (str.startsWith("data save failed:")) {
                                                                        r0 = r17 + 800;
                                                                    } else {
                                                                        if (!str.equals("resource load timeout")) {
                                                                            if (str.startsWith("tpl temp preload failed")) {
                                                                                r0 = r17 + 800;
                                                                            }
                                                                            return r17;
                                                                        }
                                                                        r0 = r17 + 800;
                                                                    }
                                                                }
                                                                r0 = r17 + 800;
                                                            }
                                                            return r0 + r3;
                                                        }
                                                        r0 = r17 + 600;
                                                        r3 = 12;
                                                        return r0 + r3;
                                                    }
                                                    r0 = r17 + 600;
                                                    r3 = 11;
                                                    return r0 + r3;
                                                }
                                                r0 = r17 + 600;
                                                r3 = 10;
                                                return r0 + r3;
                                            }
                                            r0 = r17 + 600;
                                            r3 = 9;
                                            return r0 + r3;
                                        }
                                        r0 = r17 + 600;
                                        r3 = 8;
                                        return r0 + r3;
                                    }
                                    r0 = r17 + 600;
                                    r3 = 7;
                                    return r0 + r3;
                                }
                                r0 = r17 + 600;
                                r3 = 6;
                                return r0 + r3;
                            }
                            r0 = r17 + 600;
                            r3 = 5;
                            return r0 + r3;
                        }
                        r0 = r17 + 600;
                        r3 = 4;
                        return r0 + r3;
                    }
                    r0 = r17 + 600;
                    r3 = 3;
                    return r0 + r3;
                }
                r0 = r17 + 600;
                r3 = 2;
                return r0 + r3;
            }
            r0 = r17 + 600;
            r3 = 1;
            return r0 + r3;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int b(int r0, String str) {
        return r0 + 900;
    }
}
