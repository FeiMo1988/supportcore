package david.support.demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import david.support.demos.loopplay.LoopPlayDemo;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demoplayloop(View view) {
        Intent intent = new Intent(this, LoopPlayDemo.class);
        this.startActivity(intent);
    }

}
