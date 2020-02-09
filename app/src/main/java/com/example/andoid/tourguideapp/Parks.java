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



public class Parks extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Peterhof",
                "One of St. Petersburg's most famous and popular visitor attractions, the palace and park at Peterhof (also known as Petrodvorets) are often referred to as \"the Russian Versailles\", although many visitors conclude that the comparison does a disservice to the grandeur and scope of this majestic estate. \n" +
                        "Open: Daily 9 am to 8 pm", "Location:St.-Petersburg, Petergof "
                 , R.drawable.petergof,
                "59.884283,29.887152"
                 ));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
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

        words.add(new Word("Alexander Garden",
                "The Alexander Garden is located in the very center of St. Petersburg, next to Palace Square and behind the Admiralty. Until 1806, the area was covered by the Admiralty's fortifications, but after these were removed it became Admiralty Square. The avenue even made it into Russian literature, when the country's favorite poet, Alexander Pushkin, mentioned it in is immortal novel-in-verse Evgeny Onegin."
                       , "Location:St.-Petersburg, Alexander Garden "
                , R.drawable.alexgarden,
                "59.935820,30.305260"
        ));
        WordAdapter adapter1 = new WordAdapter(getActivity(), words);
        ListView listView1 = (ListView) rootView.findViewById(R.id.list);
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
        words.add(new Word("Summer Garden",
                "The oldest park in St. Petersburg, the Summer Garden was laid out in 1704 by order of Peter the Great around his first summer residence. Peter also drew up the original plan for the garden, which is home to Russia's oldest collection of park sculptures."
                        , "Location:St.-Petersburg, Summer garden "
                , R.drawable.summergarden,
                "59.945027,30.335548"
        ));
        WordAdapter adapter2 = new WordAdapter(getActivity(), words);
        ListView listView2 = (ListView) rootView.findViewById(R.id.list);
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
