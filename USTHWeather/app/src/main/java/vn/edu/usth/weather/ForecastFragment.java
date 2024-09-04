package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#2000FF00"));

        TextView textView = new TextView(getActivity());
        textView.setText("Thursday");
        textView.setTextSize(30);

        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.cloudy); // Replace 'cloudy' with your icon name

        layout.addView(textView);
        layout.addView(imageView);

        return layout;
    }
}