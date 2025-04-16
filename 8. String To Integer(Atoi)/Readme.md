
<h2><a href="https://leetcode.com/problems/string-to-integer-atoi">8. String To Integer(Atoi) </a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-Yellow' alt='Difficulty: Medium' /><hr>


<p>Implement the <code>myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer.</p>
<p>The algorithm for <code>myAtoi(string s)</code> is as follows:</p>

<ol>
  <li><strong>Whitespace:</strong> Ignore any leading whitespace (<code>" "</code>).</li>
  <li><strong>Signedness:</strong> Determine the sign by checking if the next character is <code>'-'</code> or <code>'+'</code>, assuming positivity if neither present.</li>
  <li><strong>Conversion:</strong> Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.</li>
  <li><strong>Rounding:</strong> If the integer is out of the 32-bit signed integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then round the integer to remain in the range. Specifically, integers less than -2<sup>31</sup> should be rounded to -2<sup>31</sup>, and integers greater than 2<sup>31</sup> - 1 should be rounded to 2<sup>31</sup> - 1.</li>
</ol>

<p>Return the integer as the final result.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "42"
<strong>Output:</strong> 42
<strong>Explaination:</strong>
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = " -042"
<strong>Output:</strong> -42
<strong>Explaination:</strong>
Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
               ^
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "1337c0d3"
<strong>Output:</strong> 1337
<strong>Explaination:</strong>
Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
             ^
</pre>

<p><strong class="example">Example 4:</strong></p>

<pre>
<strong>Input:</strong> s = "0-1"
<strong>Output:</strong> 0
<strong>Explaination:</strong>
Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
          ^
</pre>

<p><strong class="example">Example 5:</strong></p>

<pre>
<strong>Input:</strong> s = "words and 987"
<strong>Output:</strong> 0
<strong>Explaination:</strong>
Reading stops at the first non-digit character 'w'.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 <= s.length <= 200</code></li>
  <li><code>s</code> consists of English letters (lower-case and upper-case), digits (<code>0-9</code>), <code>' '</code>, <code>'+'</code>, <code>'-'</code>, and <code>'.'</code>.</li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n)</code><font face="monospace">&nbsp;</font>time complexity?
