package demo.ht.com.drawabletext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import demo.ht.com.drawabletext.adapter.SelectorAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

/**
 * 选择器
 */
public class SelectorActivity extends AppCompatActivity {

    private RecyclerView rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        setTitle("Selector 选择器");

    }


    /**
     *  Button 点击事件
     */
    public void OnSelectorClick(View view) {

    }
}