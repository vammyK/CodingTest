package codingtest.dto;

public class Forecast
{
    private Night night;

    private Day day;

    private String date;

    public Night getNight ()
    {
        return night;
    }

    public void setNight (Night night)
    {
        this.night = night;
    }

    public Day getDay ()
    {
        return day;
    }

    public void setDay (Day day)
    {
        this.day = day;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [night = "+night+", day = "+day+", date = "+date+"]";
    }
}