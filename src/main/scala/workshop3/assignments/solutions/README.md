FileIO notes
============

Developing readCustomers, readProducts, readOrders or: refactoring tools
------------------------------------------------------------------------

The read methods look a lot like one another. Just start with developing one. Then look how to avoid simple copy-paste. The varying part is not in the head or tail of the code we want to reuse, so we need some generic method with a callback to perform the varying part. Creating call backs can involve a daunting syntax for novices. Refactoring tools can help a lot. A screen cast of 1:34 minutes demonstrates the next steps.

* first select the code you want to call in multiple situations
* refactor - extract method 
* then select the part that varies per call
* refactor - extract parameter
* move the default parameter value to the caller, make use of highlighting corresponding brackets to find your way in the complex declaration
* make the extracted method generic