package cs301.birthdaycake;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView newCakeView;
    private CakeModel cm;

    public CakeController(CakeView cv) {
        cm = cv.getCakeModel();
        newCakeView = cv;
    }

    public void onClick(View v){
        Log.d("blowOut", "Click");
        cm.lit = !cm.lit;
        this.newCakeView.invalidate();
    }
}
