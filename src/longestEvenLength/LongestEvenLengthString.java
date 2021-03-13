package longestEvenLength;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 13-03-2021
 * Time: 15:04
 */

public class LongestEvenLengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();
        int result [] = new int[test_cases];        // to store length value of each test cases
        for(int test_case = 0; test_case < test_cases; test_case++) {
            String S = sc.next();

            int length_of_substring = 0;

            for(int index = 0; index <= S.length()-2; index++){
                int left_sum = 0,right_sum = 0, left_index = index, right_index = index+1;

                while(left_index >= 0 && right_index < S.length()){     // traversing left and right of the current index

                    // converting each character integer and then adding it to the the left sum and right sum accordingly
                    left_sum += Integer.parseInt(String.valueOf(S.charAt(left_index)));
                    right_sum += Integer.parseInt(String.valueOf(S.charAt(right_index)));

                    // comparing left side sum with right side sum
                    if(left_sum == right_sum){
                        length_of_substring = length_of_substring < (right_index-left_index + 1) ? (right_index-left_index + 1) : length_of_substring;
                    }
                    left_index--;
                    right_index++;
                }

            }
            result[test_case] = length_of_substring;
        }
        for(int element : result) {
            System.out.println(element);
        }
    }
}
