package org.example.kolosTest;



import org.springframework.stereotype.Component;

@Component
public enum OrderStatus {
    BRAK("Nie ma takiego zamowienia"),
    NOWE("Zamowienie zostało stworzone"),
    W_REALIZACJI("Zamowienie jest w trakcie realizacji"),
    DOSTARCZONE("Zamowienie zostalo dostarczone"),
    ANULOWANE("Zamowienie zostalo anulowane");

    private final String feedback;

    OrderStatus(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback(){
        return feedback;
    }

}
