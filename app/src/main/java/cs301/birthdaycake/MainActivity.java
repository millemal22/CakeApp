package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeV = findViewById(R.id.cakeview);
        CakeController cakeCont = new CakeController(cakeV);

        Button blowOut = findViewById(R.id.blowOut);
        blowOut.setOnClickListener(cakeCont);
    }

    public void goodbye(View button) {
        //System.out.println("Goodbye");
        Log.i("goodbye","Goodbye");
    }
}
