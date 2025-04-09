
<h2><a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parenthesis</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a string s containing just the characters <code>'('</code>,<code>')'</code>, <code>'{'</code>,<code>'}'</code>, <code>'['</code> and <code>']'</code>, determine if the input string is valid.</p>
<p>An input string is valid if:</p>
<ol>
  <li>Open brackets must be closed by the same type of brackets</li>
  <li>Open brackets must be closed in the correct order.</li>
  <li>Every close bracket has a corresponding open bracket of the same type.
</li>
</ol>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "()[]{}"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "(]"
<strong>Output:</strong> false
</pre>

<p><strong class="example">Example 4:</strong></p>

<pre>
<strong>Input:</strong> s = "([])"
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= s.length <= 104</code></li>
 <li><code>s</code> consists of parentheses only <code>'()[]{}'</code>. </li>

</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n)</code><font face="monospace">&nbsp;</font>time complexity?
