/*
You use this pattern if you need to dynamically change an algorithm used by an object at run time.
For more details: https://it.wikipedia.org/wiki/Strategy_pattern 
https://en.wikipedia.org/wiki/Strategy_pattern

I implement this pattern with java generics so the SortStrategy is decoupled by a specific implementation.
You can use any class that implements comparable.
*/