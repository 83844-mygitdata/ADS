/*Brute Force Method:
Approach: Compare the string with its reverse.
Time Complexity: 
𝑂
(
𝑛
)
O(n), where 
𝑛
n is the length of the string. Reversing the string takes 
𝑂
(
𝑛
)
O(n) time, and comparing each character takes 
𝑂
(
𝑛
)
O(n) time.
Space Complexity: 
𝑂
(
𝑛
)
O(n). Extra space is required for the reversed string.
Two-Pointer Method:
Approach: Use two pointers, one starting from the beginning of the string and the other starting from the end, and compare characters at each position.
Time Complexity: 
𝑂
(
𝑛
)
O(n), where 
𝑛
n is the length of the string. We only need to traverse the string once.
Space Complexity: 
𝑂
(
1
)
O(1). No extra space is required.
Recursive Method:
Approach: Recursively check if the first and last characters are equal, then move inward.
Time Complexity: 
𝑂
(
𝑛
)
O(n), where 
𝑛
n is the length of the string. In the worst case, the recursion depth is 
𝑛
/
2
n/2.
Space Complexity: 
𝑂
(
𝑛
)
O(n). Recursion stack may use up to 
𝑂
(
𝑛
)
O(n) space.
Using StringBuilder or StringBuffer:
Approach: Reverse the string using StringBuilder or StringBuffer and compare it with the original string.
Time Complexity: 
𝑂
(
𝑛
)
O(n), where 
𝑛
n is the length of the string. Reversing the string takes 
𝑂
(
𝑛
)
O(n) time, and comparing each character takes 
𝑂
(
𝑛
)
O(n) time.
Space Complexity: 
𝑂
(
𝑛
)
O(n). Extra space is required for the reversed string.
Using Character Array:
Approach: Convert the string to a character array, then compare characters from start and end indices.
Time Complexity: 
𝑂
(
𝑛
)
O(n), where 
𝑛
n is the length of the string. Converting the string to a character array takes 
𝑂
(
𝑛
)
O(n) time, and comparing each character takes 
𝑂
(
𝑛
)
O(n) time.
Space Complexity: 
𝑂
(
𝑛
)
O(n). Extra space is required for the character array.*/