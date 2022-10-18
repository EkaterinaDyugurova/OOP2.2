package ru.netology.java.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shoulderSetRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(2);

        int expected = 2;
        int actual = radio.getCurrentRadio();


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitMaxSetRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitMinSetRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void switchNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadio();


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchMaxNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadio();


        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void switchNextLimitMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadio();


        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void switchPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        radio.prev();


        int expected = 4;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchMinPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchMaxPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.prev();


        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulderSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void limitMaxSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitMinSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void limitIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void increaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.increaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void decreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void limitIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }



}


