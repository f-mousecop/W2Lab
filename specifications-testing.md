# Ch 2 Specifications-based testing

## 7 step approach to derive systematic tests based on a specification

**mix of the category-partition method (Ostrand and Balcer) and *Domain Testing Workbook (2013)* (Kaner et al.)**

1. Understand the requirement
2. Explore the program
3. Identify the partitions
4. Analyze the boundaries
5. Devise test cases
6. Automate test cases
7. Augment (creativity and experience).

# Ch 3 Structural testing

## 5 step approach

1. perform specification-based testing
2. read the implementation and understand the main coding decisions
3. run the devised test suite with a code coverage tool
4. for each piece of code not covered:
	- *understand* why it was not tested
	- *decide* whether it deserves a test
	- if needed, *implement an automated test case*
5. Go back to the source code and look for other interesting tests you can devise.

# Ch 4 Designing contracts 

- contracts ensure classes can safely communicate with each other without surprises
- designing contracts boils down to explicitly defining pre/post conditions, and invariants of our classes and methods
- deciding to go for a weaker or stronger contract is a contextual decision
- design-by-contract does not remove the need for validation
- whenever changing a contract, reflect on the impact of the change (consider breaking changes)

## Pre/post conditions

**pre-conditions**: what the method needs to function properly
**post-conditions**: what the method guarantees as outcomes

### TaxCalculator example

A pre-condition: the method does not accept negative numbers
A post-condition: it also doesn't return negative numbers

```java
public class TaxCalculator {
	public double calculateTax(double value) {
		
		// pre-condition
		
		if(value < 0) {
			throw new RuntimeException("Value cannot be negative.");
		}

		double taxValue = 0;

		// some complex business rules here...
		// final value goes to 'taxValue'
		
		// post-condition
		if(taxValue < 0) {
			throw new RuntimeException("Calculated tax value cannot be negative.");
		}

		return taxValue;
	}
}
```
**Java offers *assert* - native way of writing assertions**

```java
// pre-condition
assert value >= 0 : "Value cannot be negative";

// post-condition
assert taxValue >= 0 : "Calculated tax value cannot be negative";
```

## Invariants

**Invariant**: conditions that must always hold before and after a method's execution


# Ch 6 Test doubles and mocks

## Summary

- test doubles help us test classes that depend on slow, complex, or external components that are hard to control/observe
- different test doubles: *stubs* return hard-coded values whenever methods are called; *mocks* like stubs but can define how we expect a mock to interact with other classes
- mocking can help, but has disadvantages: may differ from real impl
- tests that use mocks are more coupled with production code
- prod classes should allow for mock to be injected
- you do not (and should not) mock everything

# Ch 8 Test driven development TDD
