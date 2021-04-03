package ru.netology.smartHome;

public class Radio {
    String name;
    private int currentRadioStationNumber;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int currentSoundVolumeLevel;
    private int minSoundVolumeLevel = 0;
    private int maxSoundVolumeLevel = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinSoundVolumeLevel() {
        return minSoundVolumeLevel;
    }

    public int getMaxSoundVolumeLevel() {
        return maxSoundVolumeLevel;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void setNextRadioStationNumber() {
        setCurrentRadioStationNumber((getCurrentRadioStationNumber() != maxRadioStationNumber) ? getCurrentRadioStationNumber() + 1 : minRadioStationNumber);
    }

    public void setPreviousRadioStationNumber() {
        setCurrentRadioStationNumber((getCurrentRadioStationNumber() != minRadioStationNumber) ? getCurrentRadioStationNumber() - 1 : maxRadioStationNumber);
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if ((newRadioStationNumber >= minRadioStationNumber) & (newRadioStationNumber <= maxRadioStationNumber)) {
            setCurrentRadioStationNumber(newRadioStationNumber);
        }
    }

    public int getCurrentSoundVolumeLevel() {
        return currentSoundVolumeLevel;
    }

    public void setCurrentSoundVolumeLevel(int currentSoundVolumeLevel) {
        this.currentSoundVolumeLevel = currentSoundVolumeLevel;
    }

    public void increaseSoundVolumeLevel() {
        if (getCurrentSoundVolumeLevel() != maxSoundVolumeLevel) {
            setCurrentSoundVolumeLevel(getCurrentSoundVolumeLevel() + 1);
        }
    }

    public void decreaseSoundVolumeLevel() {
        if (getCurrentSoundVolumeLevel() != minSoundVolumeLevel) {
            setCurrentSoundVolumeLevel(getCurrentSoundVolumeLevel() - 1);
        }
    }
}
