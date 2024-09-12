
// # Ensure the server quality by:

// # • Each of the packets must be sent via a Single Channel.
// # • Each of the channels must transfer at least one packet.

// # The quality of the transfer for a channel is defined by the median of the sizes of all the data packets sent through that channel.

// # Note: The median of an array is the middle element if the array is sorted in non-decreasing order. If the number of elements in the array is even, the median is the average of the two middle elements.

// # Find the maximum possible sum of the qualities of all channels. If the answer is a floating-point value, round it to the next higher integer.

// # Example
// # packets = [1, 2, 3, 4, 5]
// # channels = 2
// # At least one packet has to go through each of the 2 channels. One maximal solution is to transfer packets {1, 2, 3, 4} through channel
// # The quality of transfer for channel 1 is (2 + 3)/2 = 2.5 and that of channel 2 is 5. Their sum is 2.5 + 5 = 7.5 which rounds up to 8.

// # packets = [2, 2, 1, 5, 3]
// # channels = 2
// # output = 7

// # packets = [89, 48, 14]
// # channels = 3
// # output = 151
public class Main {
    public static void main(String[] args) {
        System.out.println("case1"+" "+solve(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println("case2"+" "+solve(new int[]{2, 2, 1, 5, 3}, 2));
        System.out.println("case3"+" "+solve(new int[]{89, 48, 14}, 3));
        
    }
    
    public static int solve(int packets[], int ch) {
        Arrays.sort(packets);
        double sum = 0;
        // divide the array into subset of k; and give only 1 element  to the maximum channel till possible;
        int n = packets.length;
        int j = n-1;
        while(j>=0 && ch>1) {
            sum = sum + packets[j];
            j--;
            ch--;
        }
        
        // now there will 1 channel left;
        int i = 0;
        if((j-i+1)%2==0) {
            // even;
            int m = (j-i)/2;
            sum += ((double)(packets[m]+packets[m+1]))/2;
        } else {
            // odd;
            int mid = (j-i)/2;
            sum = sum + packets[mid];
        }
        
        return (int)Math.ceil(sum);
          
    }
}
