package com.example.recyclerview;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Chat> chats = generateDummyChats();

    private static ArrayList<Chat> generateDummyChats(){
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));
        chats.add(new Chat(R.drawable.baseline_error_24, "Nuril", "halo", "23.59"));

        return chats;
    }
}
