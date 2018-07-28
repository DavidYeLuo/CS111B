public class TwoDArray
{
    int[][] array = {{29, 80},{45, 70}};
    
    public void printSumCol()
    {
        int sum = 0;
        for(int y=0; y<array.length; y++)
        {
            for(int x=0; x<array[0].length; x++) 
            {
                sum += array[x][y];
            }
            System.out.println("Sum of Col " + y + ": " + sum);
            sum = 0;
        }
    }
    
    public void printSumRow()
    {
        int sum = 0;
        for(int y=0; y<array.length; y++)
        {
            for(int x=0; x<array[0].length; x++)
            {
                sum += array[y][x];
            }
            System.out.println("Sum of row " + y + ": " + sum);
            sum = 0;
        }
    }
    public static void main(String[] args) 
    {
        TwoDArray a = new TwoDArray();
        a.printSumCol();
        a.printSumRow();
    }
}