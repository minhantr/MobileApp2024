package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WeatherAndForecastFragment extends Fragment {
    int layoutId;

    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }


    public WeatherAndForecastFragment (int layoutId){
        this.layoutId=layoutId;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(layoutId, container, false);
    }
}