# Java-Concepts

## method overriding
If subclass is having same method as base class then it is known as method overriding Or in another words, If subclass provides specific implementation to any method which is present in its one of parents classes then it is known as method overriding

Rules for method overriding
| Argument | Rule Description |
| --- | --- |
| Arguments | Must not change |
| Return type | Can’t change except for covariant (subtype) returns |
| Access Modifier | Must not be more restrictive. Can be less restrictive. |
| Exceptions | Can reduce or eliminate but must not throw new/broader checked exceptions |
| Contructor | Can not be overriden |
| Static method | Can not be overriden |
| final method | Can not be overriden |
 
