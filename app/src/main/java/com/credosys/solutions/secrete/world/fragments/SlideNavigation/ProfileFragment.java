package com.credosys.solutions.secrete.world.fragments.SlideNavigation;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.credosys.solutions.secrete.world.MainActivity;
import com.credosys.solutions.secrete.world.R;
import com.credosys.solutions.secrete.world.fragments.MainFragment;

/**
 * Created by win7 on 02-Jan-18.
 */

public class ProfileFragment extends MainFragment implements View.OnClickListener{
    LinearLayout LlWall,LlContents,LlFriends,LlMessages,LlRequest,LlOrders,LlSellers,LlExpert;
    NestedScrollView profileNestedScrollView;
     public static ProfileFragment newInstance() {
        Bundle args = new Bundle();
        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile,null,false);
        profileNestedScrollView = v.findViewById(R.id.profile_NestedScrollView);

        profileNestedScrollView.setNestedScrollingEnabled(false);

        ((MainActivity)getActivity()).setActionBarTitle("PROFILE");
        ((MainActivity)getActivity()).setExpandableTitle(Gravity.NO_GRAVITY);
        ((MainActivity)getActivity()).showBackButton(false);
        ((MainActivity)getActivity()).setAppBarLayoutExpand(false,false);
        ((MainActivity)getActivity()).setCollpsingImage(R.drawable.topbg);

        LlWall=v.findViewById(R.id.ll_wall);
        LlContents=v.findViewById(R.id.ll_contents);
        LlFriends=v.findViewById(R.id.ll_friends);
        LlMessages=v.findViewById(R.id.ll_messages);
        LlRequest=v.findViewById(R.id.ll_request);
        LlOrders=v.findViewById(R.id.ll_orders);
        LlExpert=v.findViewById(R.id.ll_expert);
        LlSellers=v.findViewById(R.id.ll_sellers);

        LlWall.setOnClickListener(this);
        LlContents.setOnClickListener(this);
        LlFriends.setOnClickListener(this);
        LlMessages.setOnClickListener(this);
        LlRequest.setOnClickListener(this);
        LlOrders.setOnClickListener(this);
        LlExpert.setOnClickListener(this);
        LlSellers.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.ll_wall:
                ((MainActivity)getActivity()).setFragments(7);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_contents:
                ((MainActivity)getActivity()).setFragments(6);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_friends:
                ((MainActivity)getActivity()).setFragments(8);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_messages:
                ((MainActivity)getActivity()).setFragments(9);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_request:
                ((MainActivity)getActivity()).setFragments(11);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_orders:
                ((MainActivity)getActivity()).setFragments(12);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_expert:
                ((MainActivity)getActivity()).setFragments(14);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
            case R.id.ll_sellers:
                ((MainActivity)getActivity()).setFragments(13);
                ((MainActivity)getActivity()).setUpTopHeader(R.drawable.topbg,Gravity.CENTER,true,true,true);
                break;
        }

    }
}
