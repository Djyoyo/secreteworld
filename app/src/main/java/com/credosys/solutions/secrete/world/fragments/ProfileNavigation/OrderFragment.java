package com.credosys.solutions.secrete.world.fragments.ProfileNavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.credosys.solutions.secrete.world.Adapters.NormalScroll.OrderSellerAdapter;
import com.credosys.solutions.secrete.world.MainActivity;
import com.credosys.solutions.secrete.world.Pojos.OrdersSellers;
import com.credosys.solutions.secrete.world.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by win7 on 12-Jan-18.
 */

public class OrderFragment extends Fragment {
    RecyclerView rvOrder;

    public static OrderFragment newInstance() {

        Bundle args = new Bundle();

        OrderFragment fragment = new OrderFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_orders_seller,null,false);
        ((MainActivity)getActivity()).setActionBarTitle("MY ORDER");
        ((MainActivity)getActivity()).setExpandableTitle(Gravity.CENTER);
        ((MainActivity)getActivity()).setAppBarLayoutExpand(true,true);
        ((MainActivity)getActivity()).showBackButton(true);

        rvOrder=v.findViewById(R.id.rv_order);


        List<OrdersSellers> orders=new ArrayList<>();
        orders.add(new OrdersSellers(true));
        orders.add(new OrdersSellers(true));
        orders.add(new OrdersSellers(true));
        orders.add(new OrdersSellers(true));
        orders.add(new OrdersSellers(true));
        orders.add(new OrdersSellers(true));

        OrderSellerAdapter oa=new OrderSellerAdapter(getActivity(),orders);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvOrder.setAdapter(oa);
        rvOrder.setLayoutManager(llm);
        rvOrder.setNestedScrollingEnabled(true);
        return v;
    }

}
