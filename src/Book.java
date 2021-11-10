public class Book
{
    private String name;
    private short year;
    private String[] authors;
    private Publisher publishedBy;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException
    {
        if(name==null)
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) throws IllegalArgumentException
    {
        if(year<=0)
        {
            throw new IllegalArgumentException();
        }
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) throws IllegalArgumentException
    {
        for(String s: authors)
        {
            if(s==null)
            {
                throw new NullPointerException();
            }
        }
        this.authors = authors;
    }

    public Publisher getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(Publisher publishedBy) throws IllegalArgumentException
    {
        if(publishedBy==null)
        {
            throw new IllegalArgumentException();
        }
        this.publishedBy = publishedBy;
    }

    public int authorsAmount()
    {
        return authors.length;
    }

    public String getSpecificAuthor(int pos) throws IllegalArgumentException
    {
        if(authors[pos]==null)
        {
            throw new IllegalArgumentException();
        }
        return authors[pos];
    }



}
