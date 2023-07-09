package com.example.bookapp;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.Locale;

public class filterClass extends Filter {
    //Arraylist in which we want to search
    ArrayList<ModelCategory> filterList;
    //Adapter in which filter needs to be implemented
    AdapterCategory adapterCategory;

    //constructor
    public filterClass(ArrayList<ModelCategory> filterList, AdapterCategory adapterCategory) {
        this.filterList = filterList;
        this.adapterCategory = adapterCategory;
    }


    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        //value should not be null or empty
        if(constraint!=null && constraint.length() > 0){
            //change to uppercase or lower
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelCategory> filterModels = new ArrayList<>();
            for (int i=0; i<filterList.size();i++){
                //validate
                if(filterList.get(i).getCategory().toUpperCase().contains(constraint)){
                    //add to filtered list
                    filterModels.add((filterList.get(i)));
                }

            }
            results.count = filterModels.size();
            results.values = filterModels;
        }
        else{
            results.count = filterList.size();
            results.values = filterList;
        }
        return results; //important
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        //apply filter
        adapterCategory.categoryArrayList = (ArrayList<ModelCategory>)results.values;

        //notify changes
        adapterCategory.notifyDataSetChanged();
    }
}
