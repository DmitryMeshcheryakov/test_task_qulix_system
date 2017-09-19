package by.insight.test_task_qulix_system.viewmodel;


import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import by.insight.test_task_qulix_system.model.Data;
public class ItemGifViewModel extends BaseObservable {

    private Data mData;
    private Context mContext;

    public ItemGifViewModel(Data data, Context context) {
        this.mData = data;
        this.mContext = context;
    }

    public String getPicture()
    {
        return mData.getImages().getFixedWidthSmall().getUrl();
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .asGif()
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).centerCrop())
                .load(url)
                .into(imageView);
    }

    public void setGif(Data data) {
        this.mData = data;
        notifyChange();
    }
}
