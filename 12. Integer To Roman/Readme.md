
<h2><a href="https://leetcode.com/problems/integer-to-roman">12. Integer To Roman</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-Yellow' alt='Difficulty: Medium' /><hr>


<p>Seven different symbols represent Roman numerals with the following values:</p>

<table>
  <thead>
    <tr>
      <th>Symbol</th>
      <th>Value</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>I</td>
      <td>1</td>
    </tr>
    <tr>
      <td>V</td>
      <td>5</td>
    </tr>
    <tr>
      <td>X</td>
      <td>10</td>
    </tr>
    <tr>
      <td>L</td>
      <td>50</td>
    </tr>
    <tr>
      <td>C</td>
      <td>100</td>
    </tr>
    <tr>
      <td>D</td>
      <td>500</td>
    </tr>
    <tr>
      <td>M</td>
      <td>1000</td>
    </tr>
  </tbody>
</table>

<p>Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:</p>

<ul>
  <li>If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.</li>
  <li>If the value starts with 4 or 9 use the <strong>subtractive form</strong> representing one symbol subtracted from the following symbol, for example, 4 is 1 (<code>I</code>) less than 5 (<code>V</code>): <code>IV</code> and 9 is 1 (<code>I</code>) less than 10 (<code>X</code>): <code>IX</code>. Only the following subtractive forms are used: 4 (<code>IV</code>), 9 (<code>IX</code>), 40 (<code>XL</code>), 90 (<code>XC</code>), 400 (<code>CD</code>) and 900 (<code>CM</code>).</li>
  <li>Only powers of 10 (<code>I</code>, <code>X</code>, <code>C</code>, <code>M</code>) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (<code>V</code>), 50 (<code>L</code>), or 500 (<code>D</code>) multiple times. If you need to append a symbol 4 times use the <strong>subtractive form</strong>.</li>
</ul>

<p>Given an integer, convert it to a Roman numeral.</p>


<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 3749
<strong>Output:</strong> "MMMDCCXLIX"
<strong>Explaination:</strong>

  3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong>  num = 58
<strong>Output:</strong> "LVIII"
<strong>Explanation:</strong>  
50 = L
8 = VIII
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong>  num = 1994
<strong>Output:</strong> "MCMXCIV"
<strong>Explaination:</strong>
1000 = M
 900 = CM
  90 = XC
   4 = IV
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= num <= 3999</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(1)</code><font face="monospace">&nbsp;</font>time complexity?
