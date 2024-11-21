package rb.practice.metaphysical_app.models;

public enum ZodiacSign {

    ARIES("Aries","Mar 21 - Apr 19"),
    TAURUS("Taurus","Apr 20 - May 20"),
    GEMINI("Gemini","May 21 - Jun 20"),
    CANCER("Cancer","Jun 21 - Jul 22"),
    LEO("Leo","Jul 23 - Aug 22"),
    VIRGO("Virgo","Aug 23 - Sep 22"),
    LIBRA("Libra","Sep 23 - Oct 22"),
    SCORPIO("Scorpio","Oct 23 - Nov 21"),
    SAGITTARIUS("Sagittarius","Nov 22-Dec 21"),
    CAPRICORN("Capricorn","Dec 22 - Jan 19"),
    AQUARIUS("Aquarius","Jan 20 - Feb 18"),
    PISCES("Pisces","Feb 19 - Mar 20");

    private final String displayName;
    private final String dates;

    ZodiacSign(String displayName, String dates) {
        this.displayName = displayName;
        this.dates = dates;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDates() {
        return dates;
    }
}
