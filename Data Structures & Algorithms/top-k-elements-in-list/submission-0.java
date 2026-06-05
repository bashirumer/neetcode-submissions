class Solution {
     public int[] topKFrequent(int[] nums, int k) {
    // hasmaps to count the frequency of eahc chcartcer:
    Map<Integer, Integer> count = new HashMap<>();

    List<Integer>[] freq = new List[nums.length +1];

    for (int i =0; i<freq.length; i++) // defienity an empty array lsit in each slot.
    {
        freq [i]= new ArrayList<>();
    }

    for (int n : nums) // count the frequyency of ech chcrater,
    {
        count.put(n,count.getOrDefault(n,0) +1);

    }

    // count.entrySet list the list of entries int he hashmap as an array
    // if map contains: {1=3, 2=2, 3=1}
    // entryset --> [1=3, 2=2, 3=1] --> so make it eaiser to iterate ove in a loop

    for (Map.Entry<Integer, Integer> entry : count.entrySet())
    {
        freq[entry.getValue()].add(entry.getKey());

        // entry.getValue gives us the frequuency such as 3 for the number
        // since frquency is an integer array of lists
        // we add the count value 1 into index 3


    };
    // now we have our arr which is something like this:
    // [(0,..) (1,...) (2,2) (3,1) (4, ...) (5, ...) (6, ...)]
    // freq = [[], [1], [2], [3], [], [], []]

    int result [] = new int [k];

    int index =0;

    // iterato from highest to lowest frequecncy
    // start from highest frequency and stops when it reaches 1, as no element will l be in index 0
    // when index is greater than k, then w ehave enough items
    for (int i = freq.length - 1; i > 0 && index <k ; i--)
    {
       for (int n: freq[i]) // goes thgorugh frequency array, when elemtn is empty, then skips the for loop
        {
            result[index++] = n;
            // uses current value of index
            // then inctmenets afterwards
            // so will store the number at index 5 in to result [0]
            // then will store the value at index 4 to result [1]
            if (index == k) // when we have our desier array
            {
                return result;
            }

        }

    }
    return result;



}
}
