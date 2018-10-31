

public class Loops
{
    public static void main(String[] args)
    {
        
    }
    
    public static int numX(String str)
    {
        int num = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.substring(i, i+1).equalsIgnoreCase("x"))
            {
                num++;
            }
        }
        
        return num;
    }
    
    public static int numXX(String str)
    {
        int num = 0;
        
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.substring(i, i+1).equalsIgnoreCase("x") &&
                    str.substring(i+1, i+2).equalsIgnoreCase("x"))
            {
                num++;
            }
        }
        
        return num;
    }
}









