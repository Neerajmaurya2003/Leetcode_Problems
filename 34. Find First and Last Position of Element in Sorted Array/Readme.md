
<h2><a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-arrays">34. Find First and Last Position of Elements in Sorted Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-Yellow' alt='Difficulty: Medium' /><hr>


<p>Given an array of integers <code>nums</code> sorted in non-decreasing order, find the starting and ending position of a given <code>target</code> value.</p>
<p>If <code>target</code> is not found in the array, return <code>[-1, -1]</code>.</p>
<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,7,7,8,8,10], target = 8
<strong>Output:</strong> [3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,7,7,8,8,10], target = 6
<strong>Output:</strong> [-1,-1]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [], target = 0
<strong>Output:</strong> [-1,-1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
  <li><code>0 <= nums.length <= 10<sup>5</sup></code></li>
  <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
    <li><code>nums</code> is a non-decreasing array.</li>
      <li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(log n)</code><font face="monospace">&nbsp;</font>time complexity?
