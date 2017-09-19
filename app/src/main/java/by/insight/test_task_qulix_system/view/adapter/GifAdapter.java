package by.insight.test_task_qulix_system.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import by.insight.test_task_qulix_system.R;
import by.insight.test_task_qulix_system.databinding.ItemGifBinding;
import by.insight.test_task_qulix_system.model.Data;


public class GifAdapter extends RecyclerView.Adapter<GifItemViewHolder> {

    private List<Data> mDataList;


    public GifAdapter() {
        this.mDataList = Collections.emptyList();
    }

    @Override
    public GifItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGifBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_gif,
                parent, false);
        return new GifItemViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(GifItemViewHolder holder, int position) {
        holder.bindGif(mDataList.get(position));

    }

    @Override
    public int getItemCount() {
        if (mDataList == null)
            return 0;
        return mDataList.size();
    }

    public void clear() {
        mDataList.clear();
        notifyDataSetChanged();
    }

    public void setGifList(List<Data> datas) {
        this.mDataList = datas;
        notifyDataSetChanged();
    }

//    public static class ViewHolder extends RecyclerView.ViewHolder {
//
//        ItemGifBinding mItemGifBinding;
//
//        public ViewHolder(ItemGifBinding itemGifBinding) {
//            super(itemGifBinding.itemGif);
//
//            this.mItemGifBinding = itemGifBinding;
//        }
//
//        void bindGif(Data data) {
//            if (mItemGifBinding.getGifViewModel() == null) {
//                mItemGifBinding.setGifViewModel(
//                        new ItemGifViewModel(data, itemView.getContext()));
//            } else {
//                mItemGifBinding.getGifViewModel().setGif(data);
//            }
//
//        }
//    }
}
