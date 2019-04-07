package com.example.user.postmemespammer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentAccount3 extends Fragment {
    View v;
    private Button btn_logout, btnEdit;
    EditText isi, nomor;
    SharedPreferences sharedPreferences;
    TextView userrr;
    Boolean savelogin;
    String kata,email,hp;
    public FragmentAccount3() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.account_fragment3, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnEdit = view.findViewById(R.id.edit);
        isi = view.findViewById(R.id.isie);
        nomor = view.findViewById(R.id.number);
        userrr = view.findViewById(R.id.nama);
        String name = getActivity().getIntent().getStringExtra("username");
        String text = name;
        userrr.setText(text);

        SharedPreferences pref = getActivity().getApplicationContext().getSharedPreferences("Save save an", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = pref.edit();
        kata = pref.getString("Nama", "");
        if (!kata.equals("")) {
            userrr.setText(kata);
        }
        email = pref.getString("Email", "");
        if (!kata.equals("")) {
            isi.setText(email);
        }

        hp = pref.getString("Telpon", "");
        if (!kata.equals("")) {
            nomor.setText(hp);
        }

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ganti = new Intent(getActivity().getApplicationContext(), EditActivity.class);
                startActivity(ganti);
            }
        });

    }

}
