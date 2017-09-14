package david.support.demos.base;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by chendingwei on 17/9/14.
 */

public class TestTextView extends TextView {

    private static int[] sColors = {
            Color.rgb(252,157,154),
            Color.rgb(249,200,173),
            Color.rgb(200,200,169),
            Color.rgb(131,175,154),
    };



    public TestTextView(Context context) {
        super(context);

    }

    public void setIndex(int index) {
        this.setGravity(Gravity.CENTER);
        this.setText("Text:"+index);
        this.setTextSize(15);
        this.setBackgroundColor(sColors[index % sColors.length]);
    }
}
