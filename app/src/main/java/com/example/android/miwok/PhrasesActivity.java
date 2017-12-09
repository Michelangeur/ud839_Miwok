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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset"));
        words.add(new Word("How are you feeling?", "michәksәs"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I'm coming.", "hәә’ әәnәm"));
        words.add(new Word("I'm coming", "әәnәm"));
        words.add(new Word("Let's go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

            /* create an ArrayAdapter whose data source is a list of Strings.
                The ADAPTER knows how to create LAYOUTS for each item in the LIST by using
                custom list_item.xml layout resource defined in the android framework.
                This list item layout contains a single TextView which the adapter will set to display a single word.
             */                                                   //sets the background color of the category to the childView.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // find the ListView object in the view hierarchy of the ACTIVITY. There should be a ListView with the view ID called 'list'
        // which is declared in the word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use of the ArrayAdapter created so the ListView will display list items for each word in the list.
        // calls the setAdapter method on the ListView object and pass in 1 arg which is the ArrayAdapter with the var name 'itemsAdapter'
        listView.setAdapter(adapter);

    }
}
