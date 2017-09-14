package david.support.demos.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by chendingwei on 17/9/14.
 */

public abstract class AbsBaseAdapter extends BaseAdapter {

    @Override
    @Deprecated
    public final Object getItem(int i) {
        return null;
    }

    @Override
    @Deprecated
    public final long getItemId(int i) {
        return 0;
    }
}
