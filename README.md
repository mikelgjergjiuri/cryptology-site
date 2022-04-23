# A Web-Based Toolkit for Exploring Cryptography

A set of [**web-based tools**](https://www.cs.uri.edu/cryptography) has been developed to assist in teaching and learning **cryptography**. The website provides a uniform environment for exploring topics commonly taught in introductory courses.
- Classical Ciphers (Shift, Affine, Transposition, Substitution, Hill, Vigenère)
- Block Ciphers (DES, AES)
- Public-Key Cryptography (Diffie-Hellman Key Agreement, RSA)
- Hashing
- Number Theory (Modular Arithmetic, Euclidean Algorithm)

```
@article{10.5555/3470135.3470140,
author = {Gjergji, Mikel and Lamagna, Edmund A.},
title = {A Web-Based Toolkit for Exploring Cryptography},
year = {2021},
issue_date = {April 2021},
publisher = {Consortium for Computing Sciences in Colleges},
address = {Evansville, IN, USA},
volume = {36},
number = {8},
issn = {1937-4771},
abstract = {A set of web-based tools has been developed to assist in teaching and learning cryptography. The website provides a uniform environment for exploring topics commonly taught in introductory courses. These include substitution and transposition ciphers, block ciphers (DES), public-key infrastructure and encryption (Diffie-Hellman key agreement, RSA), and hashing. There are also tools for investigating number theoretic concepts such as modular arithmetic and the Euclidean algorithm. The applets allow users to explore visually how the methods operate. An instructor can use the tools in the classroom to explain the algorithms and present examples. Students use the site to explore methods on their own, solve problems, and crack cryptographic challenges. The tools eliminate the need for students to write programs to perform these computational tasks, enabling them to focus on important algorithmic and mathematical ideas.},
journal = {J. Comput. Sci. Coll.},
month = {apr},
pages = {53–62},
numpages = {10}
}
```


## Building the site from source
You can recreate the site from the original jekyll source code by issuing the command
```
git clone https://github.com/mikelgjergjiuri/cryptology-site
cd cryptology-site/src
bundle exec jekyll build # "bundle exec jekyll serve" to build and serve site
```

## Browsing through the site
If you wish to view the built website without compiling using jekyll, the compiled website is regularly pushed to the site directory.
```
git clone https://github.com/mikelgjergjiuri/cryptology-site
cd cryptology-site/site
```
You can also visit the official [site hosted on the URI Computer Science & Statistics Department](https://www.cs.uri.edu/cryptography)
