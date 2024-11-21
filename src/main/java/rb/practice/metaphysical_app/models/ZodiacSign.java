package rb.practice.metaphysical_app.models;

import java.time.MonthDay;

public enum ZodiacSign {


    //User can enter the birthday (date type input) and then a conditional can be written to evaluate which sign the month and date falls between. I can just leave out
    // the year in the conditional when trying to figure out the user's sign. -----> Found a MonthDay to use, and then I can write a utility method to check if the date of birth is withing range

    //? Do I want to add the elemental sign here for each zodiac sign? It would probably be easier. I just need the conditional to find out the zodiac sign and would
    //? already have access to the elemental sign if it was declared as part of the value. Wouldn't need to write an additional conditional for it.

    ARIES("Aries", MonthDay.of(3, 21), MonthDay.of(4, 19), "Mar 21 - Apr 19", Element.FIRE),
    TAURUS("Taurus",MonthDay.of(4, 20), MonthDay.of(5, 20), "Apr 20 - May 20", Element.EARTH),
    GEMINI("Gemini", MonthDay.of(5, 21), MonthDay.of(6, 20), "May 21 - Jun 20", Element.AIR),
    CANCER("Cancer", MonthDay.of(6, 21), MonthDay.of(7, 22), "Jun 21 - Jul 22", Element.WATER),
    LEO("Leo", MonthDay.of(7, 23), MonthDay.of(8, 22), "Jul 23 - Aug 22", Element.FIRE),
    VIRGO("Virgo", MonthDay.of(8,23), MonthDay.of(9, 22), "Aug 23 - Sep 22", Element.EARTH),
    LIBRA("Libra", MonthDay.of(9, 23), MonthDay.of(10, 22), "Sep 23 - Oct 22", Element.AIR),
    SCORPIO("Scorpio", MonthDay.of(10,23), MonthDay.of(11, 21), "Oct 23 - Nov 21", Element.WATER),
    SAGITTARIUS("Sagittarius", MonthDay.of(11, 22), MonthDay.of(12, 21), "Nov 22 - Dec 21", Element.FIRE),
    CAPRICORN("Capricorn", MonthDay.of(12, 22), MonthDay.of(1, 19), "Dec 22 - Jan 19", Element.EARTH),
    AQUARIUS("Aquarius", MonthDay.of(1, 20), MonthDay.of(2, 18), "Jan 20 - Feb 18", Element.AIR),
    PISCES("Pisces", MonthDay.of(2, 19), MonthDay.of(3, 20),"Feb 19 - Mar 20", Element.WATER);

    private final String displayName;
    private final MonthDay startDate;
    private final MonthDay endDate;
    private final String dateRange;
    private final Element elementalSign;

    ZodiacSign(String displayName,MonthDay startDate, MonthDay endDate, String dateRange, Element elementalSign) {
        this.displayName = displayName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateRange = dateRange;
        this.elementalSign = elementalSign;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDateRange() {
        return dateRange;
    }

    public Element getElementalSign() {
        return elementalSign;
    }

    @Override
    public String toString() {
        return "You are a " + displayName + "(" + dateRange +
                ") and your elemental sign is " + elementalSign + ".";
    }


    //I believe this should return true if the birthdate is between the start and end date (or on either of those dates)
    public boolean isWithinRange(MonthDay birthdate) {
        return (birthdate.isBefore(startDate) && birthdate.isAfter(endDate));
    }
}
