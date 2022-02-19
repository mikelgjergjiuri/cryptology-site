---
title: Fermat's Little Theorem
layout: default
header_js:
  - "https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"
---

## Fermat's Little Theorem

Fermat's Little Theorem states that for a prime number \\(p\\), and any integer \\(a\\)

$$a^p \equiv a \mod{p}$$

Dividing both sides by \\(a\\) gives us

$$a^{p-1} \equiv 1 \mod{p}$$     

Why this is important?

Fermat's Little Theorem allows us to drastically speed up computation time for large exponents where it is applicable.

Here's an example:

$$561^{996001} \equiv X \mod{997}$$

Even using an efficient method for computing large exponents such as the binary method, still requires a lot of work. 

But using the theorem, we know that we can drastically reduce the exponent by dividing our exponent by \\((p-1)\\), where \\(p\\) is 997.

Doing so we are able to rewrite the equation as

$$561^{996*1000 + 1} \equiv X \mod{997}$$

Further reducing our problem we can rewrite this as

$$561^{1}*561^{996*1000} \equiv X \mod{997}$$

Now we can exploit Fermat's Little Theorem by realizing the \\(561^{996*1000} \equiv 1\\) and we have

$$561 \equiv X \mod{997}$$

