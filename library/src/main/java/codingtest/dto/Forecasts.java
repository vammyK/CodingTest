package codingtest.dto;

public class Forecasts
{
    private Forecast[] forecast;

    public Forecast[] getForecast ()
    {
        return forecast;
    }

    public void setForecast (Forecast[] forecast)
    {
        this.forecast = forecast;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [forecast = "+forecast+"]";
    }
}
