package com.gameapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gameapp.R;
import com.gameapp.adapter.HomePastTourAdapter;
import com.gameapp.adapter.MainTopAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rv_top, rvPastTour, rvUpcomingTour;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        rvPastTour = root.findViewById(R.id.rvPastTour);
        rvUpcomingTour = root.findViewById(R.id.rvUpcomingTour);
        rv_top = root.findViewById(R.id.rv_main_top);
        rv_top.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        rvPastTour.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvUpcomingTour.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://wallpapercave.com/wp/wp2516033.jpg");
        arrayList.add("https://www.geeknoob.com/wp-content/uploads/PUBG-wallpapers-HD-images-4K.jpg");
        arrayList.add("https://images.news18.com/ibnlive/uploads/2019/10/Call-of-Duty-Mobile-1.jpg");
        arrayList.add("https://fiverr-res.cloudinary.com/images/q_auto,f_auto/gigs/122870059/original/7212835f63226672be9b72e4b8f00af96891aa32/pubg-youtube-chanel-art-or-banner.jpg");
        arrayList.add("https://techburner.in/wp-content/uploads/2019/02/eight_person_squads_i_guess.0.jpg");
        rv_top.setAdapter(new MainTopAdapter(getActivity(), arrayList));
        rvPastTour.setAdapter(new HomePastTourAdapter(getActivity(), arrayList));
        rvUpcomingTour.setAdapter(new HomePastTourAdapter(getActivity(), arrayList));
        return root;
    }
}