package my2017.custombutton;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Stone on 17/3/2.
 */

public class TestButton extends Button {


    public TestButton(Context context) {
        super(context);
    }

    public TestButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("stone","onTouchEvent");
        switch (event.getAction()){
            case MotionEvent.ACTION_UP:
                Log.e("stone", "ACTION_UP");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.e("stone", "ACTION_DOWN");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("stone","dispatchTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                Log.e("stone","dispatchTouchEvent_ACTION_UP");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.e("stone","dispatchTouchEvent_ACTION_DOWN");
                return true;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }
}
