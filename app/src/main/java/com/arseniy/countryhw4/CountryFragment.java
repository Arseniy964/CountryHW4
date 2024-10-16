package com.arseniy.countryhw4;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public class CountryFragment extends Fragment {
    private RecyclerView rvCountry;
    private ArrayList<String> continentList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_country, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCountry = requireActivity().findViewById(R.id.rv_country);
        loadData();
        CountryAdapter countryAdapter = new CountryAdapter();
        rvCountry.setAdapter(countryAdapter);
    }
    private void loadData() {
        continentList.add("Европа");
        continentList.add("Северная Америка");
        continentList.add("Южная Америка");
        continentList.add("Азия");
        continentList.add("Австралия");
        continentList.add("Африка");
        continentList.add("Антарктида");
    }
}