package com.chaos.reactive.fragments.providers;

import android.content.Context;
import android.content.res.AssetManager;

import com.chaos.reactive.fragments.utils.Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DictionaryProvider implements Provides<Dictionary> {
    private final Context context;
    private final String file;

    public DictionaryProvider(Context context, String file) {
        this.context = context;
        this.file = file;
    }

    @Override
    public Dictionary getInstance() {
        Dictionary dictionary = new Dictionary();

        try {
            AssetManager assets = context.getAssets();
            InputStreamReader reader = new InputStreamReader(assets.open(file));
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
