public class Publisher
{
    private String name;
    private String city;

    public Publisher(String name, String city) throws IllegalArgumentException
    {
        if(name==null || city==null)
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.city = city;
    }
}
