class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
	public long five_ten(long n)
	{
			long a = n%5;
			int count = 0;
			if(a == 0)
			{
				count++;
				count += five_ten(n/5);
			}
			else if(a == 5)
			{
				count++;
				count += five_ten(n/5);
			}
			return count;
	}
    public long trailingZeros(long n) 
	{
        // write your code here
		int count = 0;
		long i = 5;
		while(i <= n)
		{	
			count += five_ten(i);
			i += 5;
		}
		return count;
    }
};
