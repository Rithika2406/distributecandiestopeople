class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        int i=0;
        while(candies>0)
        {
            int give;
            if(candies<i+1)
            {
            give=candies;
            }
            else
            {
            give=i+1;
            }
            arr[i%num_people]=arr[i%num_people]+give;
            candies=candies-give;
            i++;
        }
        return arr;
    }
}

        
    