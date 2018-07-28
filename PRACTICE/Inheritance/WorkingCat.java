public class WorkingCat extends Cat implements Worker
{
    private String name;
    private int hoursOfTraining;
    
    public void work()
    {
        super.talk();
        super.talk();

        System.out.println("I am a cat who works");
        
        System.out.println("I have " + hoursOfTraining + 
            " of professional training");
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHoursOfTraining(int time)
    {
        hoursOfTraining = time;
    }
    public String getName()
    {
        return name;
    }
}