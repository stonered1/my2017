package my2017.custombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestButton testButton = (TestButton) findViewById(R.id.my_button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("stone", "test_button is onclick");
            }
        });

        testButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.i("stone", "testBtn-onTouch-ACTION_DOWN...");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("stone", "testBtn-onTouch-ACTION_UP...");
                        break;
                    default:break;
                }
                return false;
            }
        });

    }
}
