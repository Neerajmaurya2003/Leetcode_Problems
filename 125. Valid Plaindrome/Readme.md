
<h2><a href="https://leetcode.com/problems/valid-palindrome">125. Valid Palindrome</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>A phrase is a <code>palindrome</code> if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.</p>

<p>Given a string <code>s</code>, return <code>true</code> if it is a <strong>Palindrome</strong>, or <code>false</code> otherwise.</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input: s = "A man, a plan, a canal: Panama"
<strong>Output:</strong> true
<strong>Explaination:</strong> "amanaplanacanalpanama" is a palindrome.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "race a car"
<strong>Output:</strong> false
<strong>Explaination:</strong> "raceacar" is not a palindrome.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = " "
<strong>Output:</strong> true
<strong>Explaination:</strong> s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= s.length <= 2 * 10<sup>5</sup></code></li>
 <li><code>s</code> consists only of printable ASCII characters.</li>

</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n)</code><font face="monospace">&nbsp;</font>time complexity?
