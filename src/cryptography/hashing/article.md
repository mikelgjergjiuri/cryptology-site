---
title: Article
layout: default
subpages:
  - article:
    title: Demo
    link: /cryptography/hashing/demo.html
---

## Hashing

A cryptographical hash algorithm takes an arbitrary sized block of data and maps it to a fixed size block of data.

### Desired elements for a good cryptographical hash algorithm are:
- It is infeasible to find the original input to the hash function given its output; a hash function should be "one way" and ideally irreversible.
- Collisions are unlikely. A collision occurs when two different blocks of data produce the same hash.

### What are hashes good for?

Hashes can be used to verify that a block of data is what it is intended to be, and has not been corrupted or tamperwed with.

If we take a message such as:
_"Sally bought some oranges."_
and modify a single character to make the message:
_"Sally bought some some oranges!"_
and run both of these messages through the SHA-256 hashing algorithm we find the following results:

_"Sally bought some oranges."_ :
c7d5d423900d447a14790b23c51b03f1daceaaf0dc0748332ad4ff4010e11576

_"Sally bought some oranges!"_ :
54adc935c48d8bd63a1ce14e1be32746c720f9efc86b6f825e1d4fcbf41ab12e

As can be seen, a small modification completely changes the hash produced.
