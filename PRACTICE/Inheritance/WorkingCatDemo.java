public class WorkingCatDemo
{
    public static void main(String[] args)
    {
        WorkingCat cheshire = new WorkingCat();
        cheshire.setName("Simon");
        cheshire.setHoursOfTraining(40);
        System.out.println("Simon, the Cheshire Cat says");
        cheshire.work();
        
        System.out.println();
        
        WorkingCat tiger = new WorkingCat();
        tiger.setName("Tony");
        tiger.setHoursOfTraining(300);
        System.out.println("Tony, the Tiger says");
        tiger.work();
    }
}