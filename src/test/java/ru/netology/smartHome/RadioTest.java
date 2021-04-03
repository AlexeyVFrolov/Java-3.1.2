package ru.netology.smartHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shoulGetAndSetName() {
        Radio radio = new Radio();
        String expected = "рАДио";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldSetValidRadioStationNumber() {
        Radio radio = new Radio();
        int expected = (radio.getMinRadioStationNumber() + radio.getMaxRadioStationNumber()) / 2;

        radio.setRadioStationNumber(expected);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetOverMaxRadioStationNumber() {
        Radio radio = new Radio();
        int expected = radio.getMaxRadioStationNumber();

        radio.setRadioStationNumber(expected);
        radio.setRadioStationNumber(expected + 1);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetBelowMinRadioStationNumber() {
        Radio radio = new Radio();
        int expected = radio.getMinRadioStationNumber();

        radio.setRadioStationNumber(expected);
        radio.setRadioStationNumber(expected - 1);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetValidNextRadioStationNumber() {
        Radio radio = new Radio();
        int expected;

        radio.setCurrentRadioStationNumber((radio.getMinRadioStationNumber() + radio.getMaxRadioStationNumber()) / 2);
        expected = radio.getCurrentRadioStationNumber() + 1;
        radio.setNextRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetMinAfterMaxNextRadioStationNumber() {
        Radio radio = new Radio();
        int expected = radio.getMinRadioStationNumber();

        radio.setCurrentRadioStationNumber(radio.getMaxRadioStationNumber());
        radio.setNextRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetValidPreviousRadioStationNumber() {
        Radio radio = new Radio();
        int expected;

        radio.setCurrentRadioStationNumber((radio.getMinRadioStationNumber() + radio.getMaxRadioStationNumber()) / 2);
        expected = radio.getCurrentRadioStationNumber() - 1;
        radio.setPreviousRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetMaxAfterMinPreviousRadioStationNumber() {
        Radio radio = new Radio();
        int expected = radio.getMaxRadioStationNumber();

        radio.setCurrentRadioStationNumber(radio.getMinRadioStationNumber());
        radio.setPreviousRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldIncreaseValidIncreaseSoundVolumeLevel() {
        Radio radio = new Radio();
        int expected;

        radio.setCurrentSoundVolumeLevel((radio.getMinSoundVolumeLevel() + radio.getMaxSoundVolumeLevel()) / 2);
        expected = radio.getCurrentSoundVolumeLevel() + 1;
        radio.increaseSoundVolumeLevel();
        assertEquals(expected, radio.getCurrentSoundVolumeLevel());
    }

    @Test
    public void shouldDecreaseValidIncreaseSoundVolumeLevel() {
        Radio radio = new Radio();
        int expected;

        radio.setCurrentSoundVolumeLevel((radio.getMinSoundVolumeLevel() + radio.getMaxSoundVolumeLevel()) / 2);
        expected = radio.getCurrentSoundVolumeLevel() - 1;
        radio.decreaseSoundVolumeLevel();
        assertEquals(expected, radio.getCurrentSoundVolumeLevel());
    }

    @Test
    public void shouldNotSetOverMaxSoundVolumeLevel() {
        Radio radio = new Radio();
        int expected = radio.getMaxSoundVolumeLevel();

        radio.setCurrentSoundVolumeLevel(expected);
        radio.increaseSoundVolumeLevel();
        assertEquals(expected, radio.getCurrentSoundVolumeLevel());
    }

    @Test
    public void shouldNotSetBelowMinSoundVolumeLevel() {
        Radio radio = new Radio();
        int expected = radio.getMinSoundVolumeLevel();

        radio.setCurrentSoundVolumeLevel(expected);
        radio.decreaseSoundVolumeLevel();
        assertEquals(expected, radio.getCurrentSoundVolumeLevel());
    }
}