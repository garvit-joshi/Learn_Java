interface A 
{  
    boolean isEven(int nos); 
}
interface B
{
    double product(int a,int b); 
}
interface C
{
    int sumOfArray(int[] a);
}
interface D
{
    void show(int a,double b);
}
class Z_Z_F_LambdaExpression
{ 
    public static void main(String args[]) 
    { 
        A Even = (nos) -> (nos % 2)==0;
        if(Even.isEven(10)) 
        {
            System.out.println("10 is even");
        }
        B Pro = (a,b) -> a*b;
        System.out.println("Product Is:"+Pro.product(4, 5));
        int arr[] = {3, 1, 2, 5, 4}; 
        C sumOf = (a) ->{
            int sum=0;
            for (int i = 0; i < a.length; i++) {  
                sum = sum + a[i];  
            }  
            return sum;
        };
        System.out.println("Sum is:"+sumOf.sumOfArray(arr));
        D sho = (a,b) -> System.out.println("a:"+a+" b:"+b);
        sho.show(5, 6);
    } 
} 