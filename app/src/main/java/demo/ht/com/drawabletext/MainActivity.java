package demo.ht.com.drawabletext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Shape / selector / layer-list Demo");

    }

    /**
     *  Shape 形状
     */
    public void onBt1Click(View view) {
        start(ShapeActivity.class);
    }



    /**
     *  Selector 选择器
     */
    public void OnSelectorClick(View view) {
            start(SelectorActivity.class);
    }

    /**
     * 图层列表
     */
    public void OnLayerListClick(View view) {
        start(layerListActivity.class);
    }
    private void start(Class<?> shapeActivityClass) {
        startActivity(new Intent(this,shapeActivityClass ));
    }


}