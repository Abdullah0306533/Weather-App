package com.project.weather3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.weather3.R;
import com.project.weather3.databinding.WeatherEachItemBinding;
import com.project.weather3.model.dataforrecyclerview.AdaptersDataSource;

import java.util.List;

/**
 * Adapter class for displaying weather forecast data in a RecyclerView.
 */
public class WeatherForeCastAdapter extends RecyclerView.Adapter<WeatherForeCastAdapter.ViewHolder> {
    private List<AdaptersDataSource> dataSources;
    private Context context;

    /**
     * Constructs a WeatherForeCastAdapter.
     *
     * @param dataSources List of data to be displayed in the RecyclerView.
     * @param context     Context for accessing resources and layout inflaters.
     */
    public WeatherForeCastAdapter(List<AdaptersDataSource> dataSources, Context context) {
        this.dataSources = dataSources;
        this.context = context;
    }

    /**
     * Creates and returns a ViewHolder object to hold the views.
     *
     * @param parent   The parent view group.
     * @param viewType The view type.
     * @return A new ViewHolder instance.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(WeatherEachItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    /**
     * Binds the data to the views in the ViewHolder.
     *
     * @param holder   The ViewHolder to bind data to.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AdaptersDataSource dataSource = dataSources.get(position);
        holder.binding.imageView.setImageResource(dataSource.getImageSource()); // Set the image resource (consider making this dynamic if needed)
        holder.binding.modernTextView.setText(dataSource.getText()); // Set text based on data source
    }

    /**
     * Returns the total number of items in the data set.
     *
     * @return The size of the data set.
     */
    @Override
    public int getItemCount() {
        return dataSources != null ? dataSources.size() : 0; // Return 0 if dataSources is null
    }

    /**
     * ViewHolder class for holding the views in the RecyclerView.
     */
    class ViewHolder extends RecyclerView.ViewHolder {
        WeatherEachItemBinding binding;

        /**
         * Constructs a ViewHolder instance.
         *
         * @param binding The binding object for the item view.
         */
        public ViewHolder(@NonNull WeatherEachItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding; // Initialize the binding variable
        }
    }
}
