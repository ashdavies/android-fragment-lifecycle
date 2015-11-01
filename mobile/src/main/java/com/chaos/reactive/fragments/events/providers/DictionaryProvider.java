package com.chaos.reactive.fragments.events.providers;

import android.content.Context;
import android.content.res.AssetManager;

import com.chaos.reactive.fragments.events.utils.Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DictionaryProvider implements Provides<Dictionary> {
    private static final String DICTIONARY_FILE = "dictionary.txt";

    private final Context context;

    public DictionaryProvider(Context context) {
        this.context = context;
    }

    @Override
    public Dictionary getInstance() {
        Dictionary dictionary = new Dictionary();

        try {
            AssetManager assets = context.getAssets();
            InputStreamReader reader = new InputStreamReader(assets.open(DICTIONARY_FILE));
            BufferedReader bufferedReader = new BufferedReader(reader);

            String word;
            while ((word = bufferedReader.readLine()) != null) {
                dictionary.put(word);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return dictionary;
    }
}
