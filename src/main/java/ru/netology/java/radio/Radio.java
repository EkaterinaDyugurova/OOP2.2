package ru.netology.java.radio;

public class Radio {

    private int currentRadio;
    //Radio radio = new Radio();

    private int currentVolume;


    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;

    }


    public void next() {
        if (currentRadio == 9) {
            currentRadio = 0;
        } else {
            currentRadio++;
        }
    }

    public void prev() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio = getCurrentRadio() - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
