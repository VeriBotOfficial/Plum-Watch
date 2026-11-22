package com.phancy.mini.utils;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.anythink.core.common.e.a;
import com.umeng.analytics.AnalyticsConfig;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiniCalendar.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002Jh\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u001e\u001a\u00020\u001f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/phancy/mini/utils/MiniCalendar;", "", "()V", "CALENDARS_ACCOUNT_NAME", "", "CALENDARS_ACCOUNT_TYPE", "CALENDARS_DISPLAY_NAME", "CALENDARS_NAME", "CALENDER_EVENT_URL", "CALENDER_REMINDER_URL", "CALENDER_URL", "addCalendarAccount", "", "context", "Landroid/content/Context;", "addCalendarEvent", "", "title", "description", "location", "allDay", NotificationCompat.CATEGORY_ALARM, AnalyticsConfig.RTD_START_TIME, "endTime", "alarmOffset", "repeatInterval", "repeatEndTime", "checkAndAddCalendarAccount", "", "checkCalendarAccount", "deleteCalendarEvent", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MiniCalendar {
    private static final String CALENDARS_ACCOUNT_NAME = "phancy@phancy.com";
    private static final String CALENDARS_ACCOUNT_TYPE = "com.phancy.mini";
    private static final String CALENDARS_DISPLAY_NAME = "phancy账户";
    private static final String CALENDARS_NAME = "phancy";
    private static final String CALENDER_EVENT_URL = "content://com.android.calendar/events";
    private static final String CALENDER_REMINDER_URL = "content://com.android.calendar/reminders";
    private static final String CALENDER_URL = "content://com.android.calendar/calendars";
    public static final MiniCalendar INSTANCE = new MiniCalendar();

    private MiniCalendar() {
    }

    private final int checkAndAddCalendarAccount(Context context) {
        int checkCalendarAccount = checkCalendarAccount(context);
        if (checkCalendarAccount >= 0) {
            return checkCalendarAccount;
        }
        if (addCalendarAccount(context) >= 0) {
            return checkCalendarAccount(context);
        }
        return -1;
    }

    private final int checkCalendarAccount(Context context) {
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(Uri.parse(CALENDER_URL), null, null, null, null);
                if (cursor == null) {
                    return -1;
                }
                int count = cursor.getCount();
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        if (i == 0) {
                            cursor.moveToFirst();
                        } else {
                            cursor.moveToNext();
                        }
                        if (Intrinsics.areEqual(cursor.getString(cursor.getColumnIndex("account_type")), "com.phancy.mini")) {
                            int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
                            cursor.close();
                            return i2;
                        }
                    }
                }
                cursor.close();
                return -1;
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
        } finally {
        }
    }

    private final long addCalendarAccount(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", "phancy");
        contentValues.put("account_name", CALENDARS_ACCOUNT_NAME);
        contentValues.put("account_type", "com.phancy.mini");
        contentValues.put("calendar_displayName", CALENDARS_DISPLAY_NAME);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", CALENDARS_ACCOUNT_NAME);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri insert = context.getContentResolver().insert(Uri.parse(CALENDER_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", MediaConstraintKeys.TRUE).appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", "com.phancy.mini").build(), contentValues);
        if (insert == null) {
            return -1L;
        }
        return ContentUris.parseId(insert);
    }

    public final boolean addCalendarEvent(Context context, String title, String description, String location, boolean allDay, boolean alarm, long startTime, long endTime, long alarmOffset, String repeatInterval, long repeatEndTime) {
        int checkAndAddCalendarAccount;
        String str;
        if (context == null || (checkAndAddCalendarAccount = checkAndAddCalendarAccount(context)) < 0) {
            return false;
        }
        Calendar.getInstance();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", title);
        contentValues.put("description", description);
        contentValues.put("calendar_id", Integer.valueOf(checkAndAddCalendarAccount));
        contentValues.put("eventLocation", location);
        long j = 1000;
        contentValues.put("dtstart", Long.valueOf(startTime * j));
        contentValues.put("dtend", Long.valueOf(endTime * j));
        contentValues.put("hasAlarm", Integer.valueOf(alarm ? 1 : 0));
        contentValues.put("allDay", Integer.valueOf(allDay ? 1 : 0));
        contentValues.put("eventTimezone", "Asia/Shanghai");
        String str2 = repeatInterval;
        if (str2 != null && str2.length() != 0) {
            if (repeatEndTime <= 0) {
                str = "";
            } else {
                str = ";UNTIL=" + new SimpleDateFormat("yyyyMMdd").format(new Date(repeatEndTime)) + "T000000Z";
            }
            if (repeatInterval != null) {
                int hashCode = repeatInterval.hashCode();
                if (hashCode != 99228) {
                    if (hashCode != 3645428) {
                        if (hashCode == 104080000 && repeatInterval.equals(a.C0193a.j)) {
                            contentValues.put("rrule", "FREQ=MONTHLY;INTERVAL=1" + str);
                        }
                    } else if (repeatInterval.equals("week")) {
                        contentValues.put("rrule", "FREQ=WEEKLY;INTERVAL=1" + str);
                    }
                } else if (repeatInterval.equals(a.C0193a.k)) {
                    contentValues.put("rrule", "FREQ=DAILY;INTERVAL=1" + str);
                }
            }
            contentValues.put("rrule", "FREQ=YEARLY;INTERVAL=1" + str);
        }
        Uri insert = context.getContentResolver().insert(Uri.parse(CALENDER_EVENT_URL), contentValues);
        if (insert == null) {
            return false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
        contentValues2.put("minutes", Long.valueOf(j * alarmOffset));
        contentValues2.put("method", (Integer) 1);
        return context.getContentResolver().insert(Uri.parse(CALENDER_REMINDER_URL), contentValues2) != null;
    }

    public final void deleteCalendarEvent(Context context, String title) {
        Cursor query;
        Intrinsics.checkNotNullParameter(title, "title");
        if (context == null || (query = context.getContentResolver().query(Uri.parse(CALENDER_EVENT_URL), null, null, null, null)) == null) {
            return;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            if (query.getCount() > 0) {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(query.getColumnIndex("title"));
                    if (title.length() > 0 && Intrinsics.areEqual(title, string)) {
                        Uri withAppendedId = ContentUris.withAppendedId(Uri.parse(CALENDER_EVENT_URL), query.getInt(query.getColumnIndex("_id")));
                        Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(Uri.parse…_EVENT_URL), id.toLong())");
                        if (context.getContentResolver().delete(withAppendedId, null, null) == -1) {
                            CloseableKt.closeFinally(cursor, null);
                            return;
                        }
                    }
                    query.moveToNext();
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursor, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }
}
