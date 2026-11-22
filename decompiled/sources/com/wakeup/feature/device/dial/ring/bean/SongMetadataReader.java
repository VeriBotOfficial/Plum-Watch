package com.wakeup.feature.device.dial.ring.bean;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class SongMetadataReader {
    public Context mActivity;
    public String mFilename;
    public String mTitle;
    public Uri GENRES_URI = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;
    public String mArtist = "";
    public String mAlbum = "";
    public String mGenre = "";
    public int mYear = -1;

    public SongMetadataReader(Context context, String str) {
        this.mTitle = "";
        this.mActivity = context;
        this.mFilename = str;
        this.mTitle = getBasename(str);
        try {
            ReadMetadata();
        } catch (Exception unused) {
        }
    }

    private void ReadMetadata() {
        char c;
        HashMap hashMap = new HashMap();
        char c2 = 2;
        Cursor query = this.mActivity.getContentResolver().query(this.GENRES_URI, new String[]{"_id", "name"}, null, null, null);
        query.moveToFirst();
        while (!query.isAfterLast()) {
            hashMap.put(query.getString(0), query.getString(1));
            query.moveToNext();
        }
        query.close();
        this.mGenre = "";
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                c = c2;
                break;
            }
            String str = (String) it.next();
            c = c2;
            Cursor query2 = this.mActivity.getContentResolver().query(makeGenreUri(str), new String[]{"_data"}, "_data LIKE \"" + this.mFilename + "\"", null, null);
            if (query2.getCount() != 0) {
                this.mGenre = (String) hashMap.get(str);
                break;
            } else {
                query2.close();
                c2 = c;
            }
        }
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(this.mFilename);
        ContentResolver contentResolver = this.mActivity.getContentResolver();
        String[] strArr = new String[6];
        strArr[0] = "_id";
        strArr[1] = "title";
        strArr[c] = "artist";
        strArr[3] = "album";
        strArr[4] = "year";
        strArr[5] = "_data";
        Cursor query3 = contentResolver.query(contentUriForPath, strArr, "_data LIKE \"" + this.mFilename + "\"", null, null);
        if (query3.getCount() == 0) {
            this.mTitle = getBasename(this.mFilename);
            this.mArtist = "";
            this.mAlbum = "";
            this.mYear = -1;
            return;
        }
        query3.moveToFirst();
        String stringFromColumn = getStringFromColumn(query3, "title");
        this.mTitle = stringFromColumn;
        if (stringFromColumn == null || stringFromColumn.length() == 0) {
            this.mTitle = getBasename(this.mFilename);
        }
        this.mArtist = getStringFromColumn(query3, "artist");
        this.mAlbum = getStringFromColumn(query3, "album");
        this.mYear = getIntegerFromColumn(query3, "year");
        query3.close();
    }

    private Uri makeGenreUri(String str) {
        return Uri.parse(this.GENRES_URI.toString() + "/" + str + "/members");
    }

    private String getStringFromColumn(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    private int getIntegerFromColumn(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    private String getBasename(String str) {
        return str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
    }
}
