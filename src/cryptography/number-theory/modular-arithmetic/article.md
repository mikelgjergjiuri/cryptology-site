---
title: Modular Arithmetic
layout: default
header_js:
  - "https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"
subpages:
  - article:
    title: Demo
    link: /cryptography/number-theory/modular-arithmetic/demo.html
---
## Modular Arithmetic
A common analogy used to describe modular arithmetic is the 12 hour clock. When we reach 12:00, we do not move to 13:00, instead we wrap back around to 1:00. This is the same idea as modular arithmetic.

In modular arithmetic, we are left with the remainder from dividing any equation or number by our modulus.
		
A simple example can be seen in the equivalence below.
		
$$19 \equiv 3  \mod{8}$$
		
This is true because 19 divided twice 8 leaves a remainder of 3.
		
The same is true for equations in modular arithmetic. Some examples are shown below.
		
$$2*4 \equiv 2 \mod{3}$$
		
$$2+5 \equiv 1 \mod{3}$$
		
More abstractly, all numbers can be written in the form
		
$$a = kn + b$$
		
where \\(a\\) is any number, \\(k\\) is the number of times n can be divided out of \\(a\\), and \\(b\\) is the remainder.
So writing the equation $$a \equiv b \mod{n}$$ is saying that both \\(a\\) and \\(b\\) have the same remainder after being divided by \\(n\\).

