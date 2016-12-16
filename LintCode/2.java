class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
/*	public long five_ten(long n)
	{
			long a = n%5;
			int count = 0;
			if(a == 0)
			{
				count++;
				count += five_ten(n/5);
			}
			return count;
	}   */
    public long trailingZeros(long n) 
	{
        // write your code here
		long count = 0;
		n = n / 5;
		while(n != 0)
		{	
			count += n;
			n = n/5;
		}
		return count;
    }
};
