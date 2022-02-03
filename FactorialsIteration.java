public class FactorialsIteration
{
    public long calulateFactorial(long N) //use long data type
    {
        long result = 1;
	for (long counter = 1; counter <= N; counter++) {
            result = result * counter;
	}
	return result;
    }
}
