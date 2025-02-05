    Problem No 1:- Vowel-Substring
    Given a string of lowercase English letters and an integer k of the substring length, determine the substring of that length that contains the most vowels. Vowels are in the set {a, e, i, o, u}. If there is more than one substring with the maximum number of vowels, return the one that starts at the lowest index. If there are no vowels in the input string, return the string 'Not found!' without quotes.
    
    Example 1
    s = 'caberqiitefg'
    k = 5
    The substring of length k = 5 that contains the maximum number of vowels is 'erqii' with 3 vowels.
    The final answer is 'erqii'.
    
    Example 2
    s = 'aeiouia'
    k = 3

    Problem No 2:- Parallel Processing
    A computer has a certain number of cores and a list of files that need to be executed. If a file is executed by a single core, the execution time equals the number of lines of code in the file. If the lines of code can be divided by the number of cores, another option is to execute the file in parallel using all the cores, in which case the execution time is divided by the number of cores. However, there is a limit as to how many files can be executed in parallel. Given the lengths of the code files, the number of cores, and the limit, what is the minimum amount of time needed to execute all the files?
    For example, let's say that there are n = 5 files, where files = [4, 1, 3, 2, 8] (indicating the number of lines of code in each file), numCores = 4, and limit = 1. Even though both the first and fifth files can be executed in parallel, you must choose only one of them because the limit is 1. The optimal way is to parallelize the last file, so the minimum execution time required is 4 + 1 + 3 + 2 + (8/4) = 12. Therefore, the answer is 12.

    Sample Input For Custom Testing: 3 5 3 1 5 5
    Sample Output: 5
     
    Explanation
    Here, there are n = 3 files on the computer, where files = [5, 3, 1], numCores = 5, and limit = 5. Even though we can parallelize up to 5 pieces of code, we only parallelize the first file because the lines of code can be divided between cores equally. So, the minimum time required is (5/5) + 3 + 1 = 5. Therefore, the answer is 5.



