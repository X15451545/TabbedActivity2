package abc123.gmail.tabbedactivity2.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import abc123.gmail.tabbedactivity2.R;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_1, container, false);

        uiInit(rootView);

        return rootView;
    }

    TextView tx;

    private void uiInit(View v) {
        tx = v.findViewById(R.id.textView);
        tx.setText(R.string.Tab1);
        v.setBackgroundColor(Color.YELLOW);
    }
}