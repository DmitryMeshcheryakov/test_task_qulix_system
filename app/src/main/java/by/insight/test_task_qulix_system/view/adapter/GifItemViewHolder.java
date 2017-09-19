package by.insight.test_task_qulix_system.view.adapter;


import android.support.v7.widget.RecyclerView;
import by.insight.test_task_qulix_system.databinding.ItemGifBinding;
import by.insight.test_task_qulix_system.model.Data;
import by.insight.test_task_qulix_system.viewmodel.ItemGifViewModel;

public class GifItemViewHolder extends RecyclerView.ViewHolder{

    ItemGifBinding mItemGifBinding;

    public GifItemViewHolder(ItemGifBinding itemGifBinding) {
        super(itemGifBinding.itemGif);

        this.mItemGifBinding = itemGifBinding;
    }

    void bindGif(Data data) {
        if (mItemGifBinding.getGifViewModel() == null) {
            mItemGifBinding.setGifViewModel(
                    new ItemGifViewModel(data, itemView.getContext()));
        } else {
            mItemGifBinding.getGifViewModel().setGif(data);
        }

    }



}
