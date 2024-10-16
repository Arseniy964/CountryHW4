package com.arseniy.countryhw4;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCountry;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountry = itemView.findViewById(R.id.rv_country);
    }
    public void onBind(String music) {
        tvCountry.setText(music);
    }
}
