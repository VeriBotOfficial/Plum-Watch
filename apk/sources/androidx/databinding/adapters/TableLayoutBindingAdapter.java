package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray columns = parseColumns(charSequence);
        for (int r1 = 0; r1 < 20; r1++) {
            boolean z = columns.get(r1, false);
            if (z != tableLayout.isColumnCollapsed(r1)) {
                tableLayout.setColumnCollapsed(r1, z);
            }
        }
    }

    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int r0 = 0; r0 < size; r0++) {
            int r2 = columns.keyAt(r0);
            boolean zValueAt = columns.valueAt(r0);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(r2, zValueAt);
            }
        }
    }

    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int r0 = 0; r0 < size; r0++) {
            int r2 = columns.keyAt(r0);
            boolean zValueAt = columns.valueAt(r0);
            if (zValueAt) {
                tableLayout.setColumnStretchable(r2, zValueAt);
            }
        }
    }

    private static SparseBooleanArray parseColumns(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : sColumnPattern.split(charSequence)) {
            try {
                int r3 = Integer.parseInt(str);
                if (r3 >= 0) {
                    sparseBooleanArray.put(r3, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }
}
