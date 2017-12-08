/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "toloosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.number_ten));

            /* create an ArrayAdapter whose data source is a list of Strings.
                The ADAPTER knows how to create LAYOUTS for each item in the LIST by using
                custom list_item.xml layout resource defined in the android framework.
                This list item layout contains a single TextView which the adapter will set to display a single word.
             */
        WordAdapter adapter = new WordAdapter(this, words);

        // find the ListView object in the view hierarchy of the ACTIVITY. There should be a ListView with the view ID called 'list'
        // which is declared in the word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use of the ArrayAdapter created so the ListView will display list items for each word in the list.
        // calls the setAdapter method on the ListView object and pass in 1 arg which is the ArrayAdapter with the var name 'itemsAdapter'
        listView.setAdapter(adapter);



    }
}
