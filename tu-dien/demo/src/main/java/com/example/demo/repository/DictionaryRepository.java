package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository implements IDictionaryRepository {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("apple", "quả táo");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
    }

    @Override
    public String translate(String english) {
        if (english == null || english.trim().isEmpty()) {
            return "Vui lòng nhập từ để tra cứu.";
        }

        String result = dictionary.get(english.trim().toLowerCase());
        if (result == null) {
            return "Không tìm thấy từ này trong từ điển.";
        }
        return result;
    }
}
