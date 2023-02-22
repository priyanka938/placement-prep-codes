class permutation
{
public static void main(String args[])
{
String  str="abcd";
int n=str.length();
System.out.println("generate permutations of string :");
 generate(str,0,n);

}
static void generate(String str,int start,int end)
{
if (start == end-1)  
            System.out.println(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generate(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
}
		public static String swapString(String a, int i, int j) 
		{  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
}




