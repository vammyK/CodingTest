package codingtest.dto;

public class Day
{
    private String phenomenon;

    private String tempmax;

    private String tempmin;

    private String text;

    public String getPhenomenon ()
    {
        return phenomenon;
    }

    public void setPhenomenon (String phenomenon)
    {
        this.phenomenon = phenomenon;
    }

    public String getTempmax ()
    {
        return tempmax;
    }

    public void setTempmax (String tempmax)
    {
        this.tempmax = tempmax;
    }

    public String getTempmin ()
    {
        return tempmin;
    }

    public void setTempmin (String tempmin)
    {
        this.tempmin = tempmin;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phenomenon = "+phenomenon+", tempmax = "+tempmax+", tempmin = "+tempmin+", text = "+text+"]";
    }
}