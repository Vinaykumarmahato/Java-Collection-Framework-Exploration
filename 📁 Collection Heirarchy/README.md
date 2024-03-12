![Project Image](/📁%20Collection%20Heirarchy/collection.jpeg)

# 🚀 Java Collections Framework Hierarchy

Welcome to the Java Collections Framework (JCF) hierarchy guide! 🌟 This structure outlines the relationship between different collection types in Java.

## 🔄 Iterable
- The root interface for all collection classes. Provides a way to iterate over a collection.

### 📦 Collection
- Subinterface of `Iterable`. Represents a group of objects known as elements.
  
  #### 📜 List
  - An ordered collection that allows duplicate elements.
    - **ArrayList:** Implements dynamic arrays.
    - **LinkedList:** Implements doubly-linked lists.
    - **Vector:** A synchronized version of ArrayList.
      - **Stack:** Represents a last-in, first-out (LIFO) stack.

  #### 🎲 Set
  - An unordered collection that does not allow duplicate elements.
    - **HashSet:** Uses a hash table for storage.
    - **LinkedHashSet:** Maintains insertion order.
    - **TreeSet:** Implements a sorted set.

  #### ⏰ Queue
  
  - A collection designed for holding elements prior to processing.
    - **PriorityQueue:** Orders elements by priority.
    - **LinkedList:** Can function as a queue or a deque (double-ended queue).

Explore each section to understand the features and use cases of these classes. 
Happy coding! 🎓



