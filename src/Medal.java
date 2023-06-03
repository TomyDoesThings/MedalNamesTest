public class Medal
{
    private String medalName;
    private String imageLink;

    public static int medalCount = 0;

    public Medal(String medalName, String imageLink)
    {
        this.medalName = medalName;
        this.imageLink = imageLink;

        ++medalCount;
    }

    public String getMedalName()
    {
        return medalName;
    }

    public String getImageLink()
    {
        return imageLink;
    }
}
