package ChapterEleven;

public abstract class Animal
{
    private String name;
    public abstract void speak();

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }
}
