package com.cpmx6.devf.cpmx6.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cpmx6.devf.cpmx6.ItemDetailActivity;
import com.cpmx6.devf.cpmx6.R;
import com.cpmx6.devf.cpmx6.model.GiphyItem;
import com.cpmx6.devf.cpmx6.nav.NavigationHelper;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hugo on 7/19/15.
 */
public class TrendingGiphyAdapter extends RecyclerView.Adapter<TrendingGiphyAdapter.TrendingViewHolder> {

    private List<GiphyItem.DataEntity> items;
    private Context context;

    public TrendingGiphyAdapter(List<GiphyItem.DataEntity> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public TrendingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.giphy_item_layout, parent, false);

        TrendingViewHolder viewHolder = new TrendingViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TrendingViewHolder holder, int position) {
        final GiphyItem.DataEntity item = items.get(position);

        final DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(item.getImages().getFixed_height_small().getWebp()))
                .setAutoPlayAnimations(true)
                .build();
        holder.giphyImageView.setController(controller);

        holder.giphyImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("id", item.getId());
                NavigationHelper.startActivity(context, bundle, ItemDetailActivity.class);
            }
        });

        holder.infoText.setText(item.getType());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setNewItems(List<GiphyItem.DataEntity> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }

    public class TrendingViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.giphy_image_view)
        SimpleDraweeView giphyImageView;
        @Bind(R.id.info_text)
        TextView infoText;

        public TrendingViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
