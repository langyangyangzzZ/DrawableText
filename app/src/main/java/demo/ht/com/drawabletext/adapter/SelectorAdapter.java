package demo.ht.com.drawabletext.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import androidx.annotation.Nullable;
import demo.ht.com.drawabletext.R;

/**
 * @author 正在蜕变的CV工程师
 * @ClassName SelectorAdapter
 * 时间: 2021/2/2 14:25
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class SelectorAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public SelectorAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv,item);
    }
}
