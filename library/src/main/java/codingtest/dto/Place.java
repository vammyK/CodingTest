package codingtest.dto;

public class Place
{
    private String phenomenon;

    private String tempmin;

    private String name;

    public String getPhenomenon ()
    {
        return phenomenon;
    }

    public void setPhenomenon (String phenomenon)
    {
        this.phenomenon = phenomenon;
    }

    public String getTempmin ()
    {
        return tempmin;
    }

    public void setTempmin (String tempmin)
    {
        this.tempmin = tempmin;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phenomenon = "+phenomenon+", tempmin = "+tempmin+", name = "+name+"]";
    }
}