import java.util.Scanner;
class Quiz
{
    public static void main()
    {
        //Store Questions in this...
        String Questions[] = {"Q1: Which day is celebrated as Gandhi Jayanti?",
                              "Q2: Which day is celebrated as Dussehra?",};
        //Store Answers in this...
        String Answers[] = {"a","c"};
        //Store Options in this..
        String Opt[][] = {{"2nd October","1st April","4th March","7 July"},
                          {"2nd October","9th April","30th September","7 July"}};
        String a;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Quiz");
        System.out.println("You have to enter the option for each answer.\n\n\n\n");
        for(int i = 0;i<=1;i++)
        {
            System.out.println(Questions[i]+"\n\n");
            printOption(Opt[i][0],Opt[i][1],Opt[i][2],Opt[i][3]);
            a = sc.next();
            if(Answers[i].equalsIgnoreCase(a))
            {
                System.out.println("Right Answer");
            }
            else
            {
                System.out.println("Wrong Answer");
            }
            System.out.println("\n\n\n");
        }
    }
    
    public static void printOption(String a,String b,String c,String d)
    {
        a = "A)"+a;
        b = "B)"+b;
        c = "C)"+c;
        d = "D)"+d;
        System.out.format("%-10s  %10s\n",a,b);
        System.out.format("%-10s  %10s\n",c,d);
        
    }
}