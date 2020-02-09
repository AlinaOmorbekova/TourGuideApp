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



public class Cafes extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Bekitzer",
                "The most successful discovery of St. Petersburg so far is a cafe 'like in Tel Aviv' with Israeli street food (hummus, falafel, shvarma, shakshuk) and a serious team of bartenders. Nothing much seems to happen here but it is always full of people, there is cheerful atmosphere and rave reviews. When you don't know what to do - come here at the Rubinstein street./n" +
                        " Working hours: 12:00pm–06:00am", "St.-Petersburg, Rubinshteina str., 40/11 "
                , R.drawable.bekitzer1,
                "59.926717, 30.342751",
                " +7 812 926-43-42" ));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                TextView callText= view.findViewById(R.id.call_textView);
                ImageView callImage= view.findViewById(R.id.call_imageView);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);
                    callText.setVisibility(View.VISIBLE);
                    callImage.setVisibility(View.VISIBLE);


                    word.isOpen = true;
                }



            }
        });
        words.add(new Word("Jack & Chan",
                "The cafe organically combines American and Pan-Asian atmosphere and cuisine. However,\n" +
                        "it is known that the chief gives preference to the latter, therefore people come here mainly for woks, spring rolls and curry.\n" +
                        " Working hours: 11:00–00:00 ", "St.-Petersburg, Injenernaya str., 7 "
                , R.drawable.jackand,
                "59.937248, 30.336976",
                "+7 812 982-05-35" ));
        WordAdapter adapter1 = new WordAdapter(getActivity(), words);
        ListView listVieww = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                TextView callText= view.findViewById(R.id.call_textView);
                ImageView callImage= view.findViewById(R.id.call_imageView);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);
                    callText.setVisibility(View.VISIBLE);
                    callImage.setVisibility(View.VISIBLE);


                    word.isOpen = true;
                }



            }
        });

        words.add(new Word("Clean Plates Café",
                "One of the first gastro-hipster cafés of St. Petersburg has already become the classics\n" +
                        "which is recommended to any guest just in case. And this is the right place to recommend. \n" +
                        " Working hours: 11:00–01:00", "St.-Petersburg,  Gorohovaya str., 13 "
                , R.drawable.lottehotel,
                "59.929321, 30.347059",
                " +7-812-336-10-00" ));
        WordAdapter adapter2 = new WordAdapter(getActivity(), words);
        ListView listView2 = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter2);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                TextView titleName = view.findViewById(R.id.place_name);
                RelativeLayout descriptionLayout= view.findViewById(R.id.expandable);
                TextView callText= view.findViewById(R.id.call_textView);
                ImageView callImage= view.findViewById(R.id.call_imageView);
                if (word.isOpen) {
                    descriptionLayout.setVisibility(View.GONE);


                    word.isOpen = false;

                }else if (!word.isOpen) {
                    descriptionLayout.setVisibility(View.VISIBLE);
                    callText.setVisibility(View.VISIBLE);
                    callImage.setVisibility(View.VISIBLE);


                    word.isOpen = true;
                }



            }
        });


        return rootView;





    }

}
