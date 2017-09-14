package david.support.demos.loopplay;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import david.support.demos.R;
import david.support.demos.base.AbsBaseAdapter;
import david.support.demos.base.TestTextView;
import david.support.widget.LoopPlayerLayout;

/**
 * Created by chendingwei on 17/9/14.
 */

public class LoopPlayDemo extends Activity implements LoopPlayerLayout.OnLoopPlayListener {

    private LoopPlayerLayout layout = null;
    private TextView info = null;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.demo_loop_play);
        layout = this.findViewById(R.id.loop);
        info = this.findViewById(R.id.info);
        layout.setOnLoopPlayListener(this);
        layout.setAdapter(new DemoAdapter());
        performInfoChange();
    }

    private void performInfoChange() {
        StringBuilder builder = new StringBuilder();
        builder.append("layout.dir = ")
                .append(layout.getDirection())
                .append("\n");
        builder.append("position = ")
                .append(layout.getCurrentPosition())
                .append(", datacount = ")
                .append(layout.getDataCount())
                .append("\n");
        info.setText(builder.toString());
    }

    private class DemoAdapter extends AbsBaseAdapter {
        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TestTextView tv = null;
            if (view == null) {
                tv = new TestTextView(LoopPlayDemo.this);
            } else {
                tv = (TestTextView)view;
            }
            tv.setIndex(i);
            return tv;
        }
    }


    public void changedir(View view) {
        if (layout.getDirection() == LoopPlayerLayout.Direction.HORIZONTAL) {
            layout.setDirection(LoopPlayerLayout.Direction.VERTICAL);
        } else {
            layout.setDirection(LoopPlayerLayout.Direction.HORIZONTAL);
        }
    }

    @Override
    public void onPositionChange(int position, int count) {
        performInfoChange();
    }

    @Override
    public void onDirectionChange(LoopPlayerLayout.Direction dir) {
        performInfoChange();
    }

    @Override
    public void onAnimationTimeChange() {

    }
}
