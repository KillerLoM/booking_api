package meu.booking.service;

import org.springframework.stereotype.Service;

@Service
public class StringHandle {
    public  String removeAccents(String input) {
        return java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
