package com.example.user.postmemespammer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentHot3 extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<News> fH3;
    public FragmentHot3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.hot_fragment3, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview_hot3fragmen);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), fH3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fH3 = new ArrayList<>();
        fH3.add(new News("No One",R.drawable.hot1));
        fH3.add(new News("What The",R.drawable.hot2));
        fH3.add(new News("Literally Us",R.drawable.hot3));
        fH3.add(new News("Everyone needs a nap",R.drawable.hot4));
        fH3.add(new News("So TRUE AF",R.drawable.hot5));
        fH3.add(new News("That Mercy...",R.drawable.hot6));
        fH3.add(new News("You're Under Arrested",R.drawable.hot7));
        fH3.add(new News("It reminds me of me",R.drawable.hot8));
    }
}
