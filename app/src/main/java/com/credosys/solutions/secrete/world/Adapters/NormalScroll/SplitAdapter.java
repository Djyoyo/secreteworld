package com.credosys.solutions.secrete.world.Adapters.NormalScroll;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.credosys.solutions.secrete.world.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by win7 on 19-Jan-18.
 */

public class SplitAdapter extends RecyclerView.Adapter<SplitAdapter.SplitHolder> {
    private Context context;
    private List<Date> dateList;

    LinearLayout.LayoutParams params;

    //    static int viewCount=0;
    public SplitAdapter(Context context, List<Date> dateList) {
        this.context = context;
        this.dateList = dateList;

    }

    @Override
    public SplitHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_split_time, parent, false);
        return new SplitHolder(v);
    }

    @Override
    public void onBindViewHolder(SplitHolder holder, int position) {
        final SplitHolder hold = holder;

        params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(dateList.get(position));
        holder.txtPlanDate.setText(dateFormat.format(dateList.get(position)));
        holder.btnSplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold.llSplitTimeList.addView(addLayout());
            }
        });
    }

    View addLayout(){
        View inflate = LayoutInflater.from(context).inflate(R.layout.single_common_start_end_time, null, false);
        return inflate;
    }
    @Override
    public int getItemCount() {
        return dateList.size();
    }


    class SplitHolder extends RecyclerView.ViewHolder {
        TextView txtPlanDate;
        Button btnSplit;
        LinearLayout llSplitTimeList;

        private SplitHolder(View itemView) {
            super(itemView);
            txtPlanDate = itemView.findViewById(R.id.txt_plan_date);
            btnSplit = itemView.findViewById(R.id.btn_split);
            llSplitTimeList = itemView.findViewById(R.id.ll_split_time_list);

        }
    }
}
