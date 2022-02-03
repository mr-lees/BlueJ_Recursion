public class FactorialRecursion
{
    public long calulateFactorial(long N) //use long data type
    {
        long result;
        if (N==1) {
            result = 1;
        }
        else {
            result = N * calulateFactorial(N-1);
        }
        return result;
    }
}
