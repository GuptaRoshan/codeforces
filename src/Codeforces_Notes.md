# Dynamic Programming


## Problems List

[Vitamins](https://codeforces.com/gym/302977/problem/C) - Find the minimum total cost to buy juices whose combined vitamins cover all three types: A, B, and C.

![Dynamic Programming](https://img.shields.io/badge/SetCover-blue)
![Dynamic Programming](https://img.shields.io/badge/BitMasking-blue)

This is basically a **set cover problem** with only three elements.

1. Each juice corresponds to a **set of vitamins** and has a cost.
2. You want the cheapest way to combine sets so that the union is `{A, B, C}`.

Since there are only 3 vitamins, there are **only 2³ = 8 possible vitamin combinations** (including the empty set, which we don’t need).
For example:

* "A" → 001 (only A)
* "BC" → 110 (B and C)
* "ABC" → 111 (A, B, and C)

You can **try all possible combinations** of these juice sets and pick the one with smallest sum where the union covers all three vitamins.
