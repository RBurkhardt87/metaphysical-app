package rb.practice.metaphysical_app.models;




import java.util.ArrayList;
import java.util.List;



public enum Element {



    //NOTE: by having an arraylist of associated zodiac signs for each element, I should be able to use if/else statements when looping through the list to search if the
    //users zodiac sign is present. If it is, then that is the elemental sign of the user.


    FIRE("Fire", new ZodiacSign[]{ZodiacSign.ARIES, ZodiacSign.LEO, ZodiacSign.SAGITTARIUS}, "Fire signs are brave, artistic, confident, passionate and independent."),
    EARTH("Earth", new ZodiacSign[]{ZodiacSign.TAURUS, ZodiacSign.VIRGO, ZodiacSign.CAPRICORN}, "Earth signs are detail-oriented, down-to-earth, cultivates, grounded and practical."),
    AIR("Air", new ZodiacSign[]{ZodiacSign.GEMINI, ZodiacSign.LIBRA, ZodiacSign.AQUARIUS}, "Air signs are witty, social, a bit spacey, intellectual and good listeners."),
    WATER("Water", new ZodiacSign[]{ZodiacSign.CANCER, ZodiacSign.SCORPIO, ZodiacSign.PISCES}, "Water signs are imaginative, empathetic, emotional, nurturing and intuitive.");

    public final String displayName;
    public final List<ZodiacSign> signs = new ArrayList<>();
    public final String characteristic;



    Element(String displayName, ZodiacSign[] zodiacSigns, String characteristic) {
        this.displayName = displayName;
        this.characteristic = characteristic;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<ZodiacSign> getSigns() {
        return signs;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString(){
        return "Your elemental sign is " + displayName + "." + characteristic;

    }


}

