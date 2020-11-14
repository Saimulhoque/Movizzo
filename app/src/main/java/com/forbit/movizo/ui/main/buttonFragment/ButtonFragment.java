package com.forbit.movizo.ui.main.buttonFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.forbit.movizo.ui.main.categorie.CategoryActivity;
import com.forbit.movizo.R;
import com.forbit.movizo.utils.Constant;


public class ButtonFragment extends Fragment implements View.OnClickListener {
    private Button button1, button2, button3, button4, button5, button6, button7, button8;


    public ButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button, container, false);

        button1 = view.findViewById(R.id.banglamovies);
        button2 = view.findViewById(R.id.indianmovies);
        button3 = view.findViewById(R.id.koreanmovies);
        button4 = view.findViewById(R.id.chinesemovies);
        button5 = view.findViewById(R.id.englishmovies);
        button6 = view.findViewById(R.id.turkishmovies);
        button7 = view.findViewById(R.id.bangladrama);
        button8 = view.findViewById(R.id.tvshows);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        String value = null;
        switch (v.getId()) {
            case R.id.banglamovies:
               value = button1.getText().toString();
                break;

            case R.id.indianmovies:
                value = button2.getText().toString();
                break;

                case R.id.koreanmovies:
                    value = button3.getText().toString();
                break;

                case R.id.chinesemovies:
                    value = button4.getText().toString();
                break;

            case R.id.englishmovies:
                value = button5.getText().toString();
                break;

            case R.id.turkishmovies:
                value = button6.getText().toString();
                break;

            case R.id.bangladrama:
                value = button7.getText().toString();
                break;

            case R.id.tvshows:
                value = button8.getText().toString();
                break;
        }
        Intent intent = new Intent(getActivity(), CategoryActivity.class);
        intent.putExtra(Constant.CATEGORY,value);
        startActivity(intent);
    }
}
