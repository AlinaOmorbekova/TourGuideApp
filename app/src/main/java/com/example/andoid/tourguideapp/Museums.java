package com.example.andoid.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Museums extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Hermitage",
                "The State Hermitage Museum is one of the largest artistic and cultural and historical museums in Russia and one of the largest in the world.The museum starts its history from collections of works of art which were gained by Russian empress Catherine II in private capacity. \n" +
                        " Opening Hours:\n" +
                        "Tuesday, Thursday, Saturday, Sunday: 10.30-18.00\n" +
                        "Wednesday, Friday: 10.30-21.00",
                         "Saint-Petersburg, Hermitage "
                , R.drawable.hermitage,
                "59.939848,30.314616"
                 ));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);

                    word.isOpen = true;
                }



            }
        });


        words.add(new Word("St. Isaac's Cathedral",
                " St. Isaac's Cathedral was originally the city's main church and the largest cathedral in Russia. It was built between 1818 and 1858, by the French-born architect Auguste Montferrand, to be one of the most impressive landmarks of the Russian Imperial capital. \n" +
                        "Open: Daily 10.30 am to 6 pm", "Saint-Petersburg, St. Isaac's Cathedral. "
                , R.drawable.isaakscathedral,
                "59.933970,30.306490"
                 ));
        WordAdapter adapter1 = new WordAdapter(getActivity(), words);
        ListView listView1 = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView1.setAdapter(adapter1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);

                    word.isOpen = true;
                }


            }
        });


        words.add(new Word("Central Naval Museum",
                "Russia's main naval museum tells the fascinating story of the development, growth and achievements of the Russian navy. With a collection of over 800 thousand exhibits, the museum displays some fascinating naval memorabilia, armaments, authentic maritime equipment, quality models of historically significant vessels and numerous paintings by marine artists \n" +
                        "Museum working hours:10 am – 6 pm", "Saint-Petersburg, Central Naval Museum "
                , R.drawable.navalmuseum,
                "59.930167,30.293393"
                 ));
        WordAdapter adapter2 = new WordAdapter(getActivity(), words);
        ListView listView2 = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView2.setAdapter(adapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);

                    word.isOpen = true;
                }








            }
        });



        return rootView;
    }
}
