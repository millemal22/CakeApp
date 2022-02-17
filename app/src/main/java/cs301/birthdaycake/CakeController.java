package cs301.birthdaycake;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView newCakeView;
    private CakeModel cm;


    public CakeController(CakeView cv) {
        cm = cv.getCakeModel();
        newCakeView = cv;


    }

    public void onClick(View v) {
        Log.d("blowOut", "Candles lit/unlit");
        cm.lit = !cm.lit;
        Button blowOut = v.findViewById(R.id.blowOut);
        if (cm.lit == false) {
            blowOut.setText("Relight Candles");
        } else if (cm.lit == true) {
            blowOut.setText("Blow Out Candles");
        }
        this.newCakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton cb, boolean b) {
        CharSequence name = cb.getText();
        CharSequence c = "Candles";
        CharSequence f = "Frosting";
        System.out.println("candles");

        if (name.equals(c)) {
            cm.candles = !cm.candles;
        }
        else if (name.equals(f)) {
            cm.frosting = !cm.frosting;
        }
        this.newCakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
        int num = seekBar.getProgress();
        cm.amountCandles = num;
        this.newCakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar){}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar){}
}

