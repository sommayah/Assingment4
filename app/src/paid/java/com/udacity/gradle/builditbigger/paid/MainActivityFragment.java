package com.udacity.gradle.builditbigger.paid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.udacity.gradle.builditbigger.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainActivityFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainActivityFragment extends Fragment {
    private ProgressBar spinner;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        spinner = (ProgressBar) root.findViewById(R.id.progressBar);
        spinner.setVisibility(View.GONE);
        return root;
    }
}