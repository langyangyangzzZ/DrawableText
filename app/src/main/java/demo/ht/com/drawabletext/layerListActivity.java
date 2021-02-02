package demo.ht.com.drawabletext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Random;

/**
 * 图层列表
 */
public class layerListActivity extends AppCompatActivity {

    private ProgressBar progress;
    int index = 0;
    public Handler mHandler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                if (index++ < 100) {
                    mHandler.sendEmptyMessageDelayed(1,100);
                    progress.setProgress(index);
                }else{
                    //执行完之后返回到0
                    index = 0;
                    progress.setProgress(0);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_list);
        progress = findViewById(R.id.progress);
    }


    /**
     * 开始执行按钮
     */
    public void onLayerClick(View view) {
        mHandler.sendEmptyMessageDelayed(1,100);
    }
}