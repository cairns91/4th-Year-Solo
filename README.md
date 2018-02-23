# 4th-Year-Solo (Ongoing)

My project is to design and implement a search-based algorithm to use in the automated testing of concurrent code.

I developed a set of Test Cases for each class under test, using random Input generator to produce data that will target concurrency coverage.

Separately, I developed a search-based algorithm to test the same classes and target the same concurrency coverage. 

I also applied a fitness function to the search-based approach to guide the test data towards a better coverage score.

The resulting coverage score from the random input method and the search-based approach was then compared against each other to ascertain which is better.

A further evaluation stage took place where the Class Under Test was be injected with concurrent bugs.

