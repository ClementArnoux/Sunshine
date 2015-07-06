package com.come.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {
	ArrayAdapter<String> mForecastAdapter;
	public ForecastFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		String[] forecastArray = {
				"Today - Sunny - 88 - 63",
				"Tomorrow - Foggy - 70 - 46",
				"Weds - Cloudy - 72 - 63",
				"Thurs - Rainy - 64 - 51",
				"Sat - Sunny - 76 - 68"
			};
		List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));
		mForecastAdapter =
				new ArrayAdapter<>(
						getActivity(),
						R.layout.list_item_forecast,
						R.id.list_item_forecast_textview,
						weekForecast
				);
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
		listView.setAdapter(mForecastAdapter);
		return (rootView);
		}
	}
