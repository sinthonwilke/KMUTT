class Bicycle 
{
    private String ownerName;
    private String tagNo;


    public Bicycle()
    {
        ownerName = "Unknown";
        tagNo = "Not registered";
    }


    public String getOwnerName() 
    {
        return ownerName;
    }
    public void setOwnerName(String name)
    {
        ownerName = name;
    }


    public String getTagNo()
    {
        return tagNo;
    }
    public void setTagNo(String no)
    {
        tagNo = no;
    }
}