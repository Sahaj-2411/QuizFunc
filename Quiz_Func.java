// Dont compile at very first go. First make the questions and store their answers line-wise in the answer array..
// then make a diiferent class with printing questions followed by these using these objects by object reference

class Quiz_Func
{
    public static void printOption(String a,String b,String c,String d)
    {
        a = "A)"+a;
        b = "B)"+b;
        c = "C)"+c;
        d = "D)"+d;
        System.out.format("%-10s  %10s\n",a,b);
        System.out.format("%-10s  %10s\n",c,d);
        
    }
    
    public static void checkAnswer(int Question,char Option)
    {
        //char ans[15]= {};               //Isme Answers ke option store kr diyo phir compile krio..
        if(ans[Question] == Option)
        {
            System.out.println("Right Answer");
        }
        else
        {
            System.out.println("Wrong Answer");
        }
    }
    
}