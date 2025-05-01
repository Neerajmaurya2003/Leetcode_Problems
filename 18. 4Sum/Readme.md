
<h2><a href="https://leetcode.com/problems/4sum">18. 4Sum</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-Yellow' alt='Difficulty: Medium' /><hr>


<p>Given an array <code>nums</code> of <code>n</code> integers, return an array of all the unique quadruplets <code>[nums[a], nums[b], nums[c], nums[d]]</code> such that:</p>

<ul>
  <li><code>0 <= a, b, c, d < n</code></li>
  <li><code>a</code>, <code>b</code>, <code>c</code>, and <code>d</code> are <strong>distinct</strong>.</li>
  <li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li>
</ul>

<p>You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,0,-1,0,-2,2], target = 0
<strong>Output:</strong> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,2,2,2,2], target = 8
<strong>Output:</strong> [[2,2,2,2]]
</pre>


<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= nums.length <= 200</code></li>
  <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
  <li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n<sup>3</sup>)</code><font face="monospace">&nbsp;</font>time complexity?
