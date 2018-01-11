package com.credosys.solutions.secrete.world.Adapters.NormalScroll;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.credosys.solutions.secrete.world.R;

/**
 * Created by win7 on 10-Jan-18.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.ImageHolder>{


    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_friend_card,parent, false);
        return new FriendsAdapter.ImageHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ImageHolder  extends RecyclerView.ViewHolder{

        public ImageHolder(View itemView) {
            super(itemView);
        }
    }
}
