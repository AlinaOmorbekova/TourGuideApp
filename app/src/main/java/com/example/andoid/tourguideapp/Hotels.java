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



public class Hotels extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Kravt hotel",
                "KRAVT HOTEL is a modern category 3 star hotel including 49 rooms of different categories. Our guests especially appreciate the hotel location in the historical and business center of St. Petersburg, on Sadovaya street, in favorable availability from the basic tourist sights \n" +
                        " Contact us anytime, we work 24/7", "St.-Petersburg, Hotel Kravt "
                 , R.drawable.kravt,
                "59.929806, 30.323901",
                " +7(812) 310 02 01" ));
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
        words.add(new Word("Lahta Plaza Hotel",
                "Lahta Plaza is a 4* hotel that is situated in Primorsky district on the Gulf Finland bank in the new business center of Saint Petersburg.\n" +
                        " Work 24/7 ", "St.-Petersburg, Hotel Kravt "
                 , R.drawable.lahtahotel,
                "59.987549, 30.190454",
                "+7 812 635 - 05 - 55" ));
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

        words.add(new Word("Lotte hotel",
                "The luxury LOTTE HOTEL ST. PETERSBURG is located in a historical mansion on St. Isaac’s Square in the very heart of the city. The first LOTTE HOTEL ever to be housed in a historical building is equipped with the latest XXI century technology and offers 150 elegant rooms, decorated in classic and contemporary styles, as well as four exquisite gastronomic concepts. For the most luxurious experience, we invite guests to the award-winning authentic Mandara Spa with native Balinese therapists. \n" +
                        " Work 24/7", "St.-Petersburg, Hotel Kravt "
                 , R.drawable.lottehotel,
                "59.931312, 30.310481",
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
