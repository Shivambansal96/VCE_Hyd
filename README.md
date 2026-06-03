<div align="center">

# 🚀 Vardhaman College of Engineering 

![Java](https://img.shields.io/badge/Java-DSA-ED8B00?style=flat-square&logo=java)
![Level](https://img.shields.io/badge/Level-Intermediate-yellow?style=flat-square)
![Course](https://img.shields.io/badge/Course-VCE%204th%20Yr%20Sem%201-blue?style=flat-square)
![Days](https://img.shields.io/badge/Duration-12%20Days-brightgreen?style=flat-square)
![Status](https://img.shields.io/badge/Status-In%20Progress%20🔄-orange?style=flat-square)



### 🚀 *Welcome to the 12-day journey of mastering Data Structures & Algorithms in Java!* 🎯


**Resource Link - <a href="https://canva.link/dkoxwclci31dz0q" target="_blank"  style="text-decoration: none">👋 Click Me</a>**



This repository is your complete companion for understanding how data is organized, how algorithms manipulate it, and why this matters in real-world software engineering. By the end of Day 12, you'll have hands-on experience with the most fundamental DSA concepts that form the backbone of technical interviews and efficient software design.

---
</div>

## 📚 Quick Navigation

| Status | Day | Topic | Difficulty | File |
|--------|-----|-------|-----------|------|
| 🔴 Done | **Day 1** | [Singly Linked List](#day-1-singly-linked-list) | 🟢 Easy | `Day1LL.java` |
| 🔴 Done | **Day 2A** | [Doubly Linked List](#day-2-doubly--circular-linked-lists) | 🟡 Medium | `Day2DLL.java` |
| 🔴 Done | **Day 2B** | [Circular Linked List](#day-2-doubly--circular-linked-lists) | 🟡 Medium | `Day2CLL.java` |
| 🔴 Done | **Day 3** | [Collections Framework](#day-3-collections-framework) | 🟡 Medium | `Day3Collections.java` |
| ⚪ Coming | **Day 4-5** | [Stacks](#day-4-5-stacks) | 🟡 Medium | `Day4Stack.java` |
| ⚪ Coming | **Day 6-7** | [Queues](#day-6-7-queues) | 🟡 Medium | `Day6Queue.java` |
| ⚪ Coming | **Day 8-10** | [Trees & BST](#day-8-10-trees--binary-search-trees) | 🔴 Hard | `Day8Tree.java` |
| ⚪ Coming | **Day 11-12** | [Graphs](#day-11-12-graphs) | 🔴 Hard | `Day11Graph.java` |

---

## 🎯 Course Overview

### Learning Objectives

By the end of this 12-day intensive, you will be able to:

✅ **Understand Data Organization**: Master how different data structures store and organize information  
✅ **Analyze Performance**: Calculate and compare time & space complexity using Big O notation  
✅ **Implement from Scratch**: Build each data structure from the ground up using Java  
✅ **Solve Real Problems**: Apply DSA concepts to solve algorithmic challenges  
✅ **Ace Interviews**: Be confident in coding interviews that test DSA knowledge  
✅ **Write Efficient Code**: Optimize solutions for performance and memory usage  

### Prerequisites

- ✨ Solid understanding of **Java fundamentals** (variables, loops, conditionals, OOP basics)
- ✨ Comfort with **classes and objects**
- ✨ Basic understanding of **recursion** (will refresh if needed)
- ✨ Logical thinking & problem-solving mindset 🧠

### 12-Day Syllabus at a Glance

```
WEEK 1                          WEEK 2                           WEEK 3
Day 1: Singly LL       ├──────► Day 4: Stacks         ├──────► Day 8: Trees
Day 2: Doubly/Circ LL  ├──────► Day 5: Stack Apps    │         Day 9: BST
Day 3: Collections     ├──────► Day 6: Queues        │         Day 10: Tree Traversals
Day 4: Stacks          └──────► Day 7: Deque & PQ    └──────► Day 11-12: Graphs & DP
```

---

## 📖 How to Use This Repository

1. **Read the Day's Module** → Start with the "What You'll Learn" section
2. **Study Concepts & Diagrams** → Visual understanding comes first
3. **Review Code Snippets** → See actual Java implementations
4. **Open the Source File** → Examine `DayX.java` in detail
5. **Practice Problems** → Solve the provided exercises (start with 🟢 Easy)
6. **Check Resources** → Use external visualizers to reinforce learning
7. **Identify Pitfalls** → Learn what *not* to do from the "Common Mistakes" section

---

# 📚 Day-by-Day Learning Modules

---

## Day 1: Singly Linked List

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟢 **Easy** | **File**: `Day1LL.java`

### 🎯 What You'll Learn
- Create and manipulate a **singly linked list** (SLL)
- Implement **prepend** (add at beginning) and **append** (add at end) operations
- Navigate through linked lists using **node pointers**
- Compare arrays vs. linked lists: when to use which?
- Master the fundamentals that all other linked structures build upon

### 📚 Concepts Explained

#### What is a Singly Linked List?

A **Singly Linked List (SLL)** is a linear data structure where each element (called a **Node**) contains:
- **Data**: The actual value stored
- **Next Pointer**: A reference to the next node in the sequence

```
┌─────────────┐    ┌─────────────┐    ┌─────────────┐    ┌──────┐
│ Data | Next │───►│ Data | Next │───►│ Data | Next │───►│ NULL │
└─────────────┘    └─────────────┘    └─────────────┘    └──────┘
   Node 1             Node 2             Node 3          End Marker
```

**Key Characteristics:**
- 🔗 Unidirectional traversal (head → tail only)
- 💾 Dynamic size (grows/shrinks as needed)
- ⚡ No random access (must traverse from head)
- 🧠 Each node "remembers" only the next node

---

### 💻 Key Code Snippets

#### Node Class
```java
public static class Node {
    int data;
    Node next = null;
    
    Node(int data) {
        this.data = data;
    }
}
```

#### Append Operation
```java
public void append(int data) {
    // Time Complexity: O(n) - must traverse to end
    // Space Complexity: O(1) - only create one new node
    
    Node newNode = new Node(data);
    
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;  // Traverse to the end
        }
        current.next = newNode;  // Link the new node
    }
}
```

#### Prepend Operation
```java
public void prepend(int data) {
    // Time Complexity: O(1) - constant time!
    // Space Complexity: O(1)
    
    Node newNode = new Node(data);
    
    if (head == null) {
        head = newNode;
    } else {
        newNode.next = head;  // New node points to current head
        head = newNode;        // New node becomes the head
    }
}
```

---

### 🔢 Complexity Analysis

| Operation | Time Complexity | Space Complexity | Notes |
|-----------|-----------------|------------------|-------|
| **Prepend** | O(1) | O(1) | ⚡ Super fast! Add at front |
| **Append** | O(n) | O(1) | Slow on large lists (must find tail) |
| **Search** | O(n) | O(1) | Must check each node |
| **Delete** | O(n) | O(1) | Find + remove |
| **Access** | O(n) | O(1) | No random access 😞 |

---

### 🎨 Visual Examples

**Example: Building a list [10 → 20 → 30]**

```
Step 1: Create head = 10
┌──────────┐
│ 10 | ●───┼──► NULL
└──────────┘

Step 2: Append 20
┌──────────┐    ┌──────────┐
│ 10 | ●───┼──►│ 20 | ●───┼──► NULL
└──────────┘    └──────────┘

Step 3: Append 30
┌──────────┐    ┌──────────┐    ┌──────────┐
│ 10 | ●───┼──►│ 20 | ●───┼──►│ 30 | ●───┼──► NULL
└──────────┘    └──────────┘    └──────────┘
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Create a singly linked list and insert 5 numbers using prepend/append
2. Print all elements in the list
3. Find the largest element in the list

**🟡 Medium**
4. Delete the middle element from a singly linked list
5. Reverse a singly linked list
6. Detect if there's a cycle in the list

**🔴 Hard**
7. Remove duplicates from an unsorted linked list
8. Find the intersection point of two linked lists

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|-----------------|
| Forgetting to update `head` when prepending | Always do `head = newNode` after linking | Otherwise, your list never changes! |
| Infinite loop in append | Use `while (current.next != null)` not `while (current != null)` | Prevents accessing null pointer |
| Not checking if `head == null` | Always handle empty list case first | Null pointer exception otherwise |
| Creating new nodes unnecessarily | Only create when actually adding elements | Wastes memory |

---

### 🔗 External Resources

- 📺 **VisuAlgo**: [Visualize Linked Lists in Action](https://visualgo.net/en/list)
- 📖 **GeeksforGeeks**: [Singly Linked List Implementation](https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/)
- 💡 **YouTube**: "Linked Lists Explained" - Abdul Bari

---

### 📌 Key Takeaways

💡 **SLL is the foundation** for understanding all linked structures  
💡 **Prepend is O(1), Append is O(n)** - design accordingly  
💡 **Node pointers are everything** - master the "next" reference  
💡 **No random access** - is a trade-off for efficient insertion/deletion  

---

## Day 2: Doubly & Circular Linked Lists

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟡 **Medium** | **File**: `Day2DLL.java`

### 🎯 What You'll Learn
- Extend SLL with **bidirectional traversal** (Doubly Linked List)
- Implement **Circular Linked List** where tail loops back to head
- Master **two-pointer navigation** (previous & next)
- Understand trade-offs: more flexibility vs. more complexity
- Handle edge cases specific to doubly-linked structures

### 📚 Concepts Explained

#### Doubly Linked List (DLL)

Each node has TWO pointers:

```
   ┌─────────────────────────────────┐
   │                                 │
┌──┴──┐    ┌──────────┐    ┌──────────┐
│◄────┼───►│◄─ DLL ──►│◄───┼─────────►│
└─────┘    └──────────┘    └──────────┘
Prev|Next   Prev|Next       Prev|Next
 Node 1      Node 2          Node 3

Forward:  Node1 → Node2 → Node3
Backward: Node1 ← Node2 ← Node3
```

**Advantages over SLL:**
- ✅ Traverse both directions (forward & backward)
- ✅ Delete a node if you have its reference (don't need previous)
- ✅ Insert before a node (easier operations)

**Disadvantages:**
- ❌ Extra memory (two pointers per node)
- ❌ More complex code (maintain both pointers)

---

#### Circular Linked List (CLL)

The tail's `next` pointer points **back to head** (no NULL):

```
         ┌──► Tail = NULL doesn't exist!
         │
    ┌────▼────┐    ┌────────┐    ┌────────┐
    │   10    │───►│   20   │───►│   30   │
    └────▲────┘    └────────┘    └────────┘
         │                             │
         └─────────────────────────────┘
```

**Use Cases:**
- 🎮 Round-robin scheduling
- 💿 Album playlists (next song after last = first)
- 🕐 Clock/timer implementations

---

### 💻 Key Code Snippets

#### Doubly Linked List Node
```java
class Node {
    int data;
    Node prev = null;   // 👈 New! Previous node pointer
    Node next = null;
    
    Node(int data) {
        this.data = data;
    }
}
```

#### DLL Prepend
```java
public void prepend(int data) {
    // Time: O(1) | Space: O(1)
    
    Node newNode = new Node(data);
    length++;
    
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;  // ← Link previous pointer
        head = newNode;
    }
}
```

#### DLL Append
```java
public void append(int data) {
    // Time: O(1) | Space: O(1)
    // ⚡ FASTER than SLL! Because we track tail
    
    Node newNode = new Node(data);
    length++;
    
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;  // ← Link both directions
        tail = newNode;        // Update tail
    }
}
```

---

### 🔢 Complexity Comparison

| Operation | SLL | DLL | CLL | Notes |
|-----------|-----|-----|-----|-------|
| **Prepend** | O(1) | O(1) | O(1) | All same |
| **Append** | O(n) | O(1) ⚡ | O(1) ⚡ | DLL/CLL better with tail tracker |
| **Delete (with ref)** | O(n) | O(1) ⚡ | O(1) ⚡ | DLL advantage! |
| **Backward Traverse** | ❌ N/A | O(n) | O(n) | DLL/CLL feature |
| **Space/Node** | 1 pointer | 2 pointers | 1 pointer | DLL uses more memory |

---

### 🎨 Visual Walkthrough

**Building a DLL: [5 → 10 → 15]**

```
Prepend 5:        Append 10:         Append 15:
┌────────┐       ┌────────┐         ┌────────┐    ┌────────┐    ┌────────┐
│ 5|●|● │       │ 5|●|●──┼────────►│ 5|●|●──┼───►│10|●|●  │   │15|●|●  │
└────────┘       └────────┘         └────────┘    └────────┘    └────────┘
                                                        ▲            │
                                                        └────────────┘
                                                   (Backward links)
```

**Circular List: [A → B → C → A → ...]**

```
         ┌────────────────┐
         │                │
    ┌────▼────┐    ┌─────▼──┐    ┌─────────┐
    │    A    │───►│   B    │───►│    C    │
    └─────────┘    └────────┘    └────▲────┘
         ▲                              │
         └──────────────────────────────┘
    Tail.next = Head (creates the circle)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Display DLL elements forward and backward
2. Create a circular linked list and traverse it
3. Count total nodes in a DLL

**🟡 Medium**
4. Delete a node at a specific position in DLL
5. Insert a node after a given value in DLL
6. Check if a circular list has a cycle

**🔴 Hard**
7. Reverse a doubly linked list
8. Find pairs in a DLL that sum to a given value
9. Implement sorted insertion in a DLL

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution |
|-----------|-----------|
| Forgetting to update `prev` pointers | After linking `next`, also link `prev` |
| Using DLL when SLL suffices | Extra memory overhead; only use if you need backward traversal |
| Not tracking `tail` in DLL | Append becomes O(n) instead of O(1) |
| Infinite loops in circular lists | Must track visited nodes or use length counter |
| Not handling NULL properly in CLL | Remember: no node's next is NULL (except error cases) |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Linked List**: [Doubly & Circular LL Visualization](https://visualgo.net/en/list)
- 📖 **LeetCode**: Practice problems on linked lists (filter by easy/medium)
- 🎥 **YouTube**: "Doubly Linked Lists Explained" - Code Help

---

### 📌 Key Takeaways

💡 **DLL = SLL + Backward Navigation** at the cost of extra memory  
💡 **Always track tail** in DLL/CLL for O(1) append  
💡 **Circular lists loop forever** - be careful with traversal  
💡 **Trade-off thinking**: Extra pointers = More flexibility but more complexity  

---

## Day 3: Collections Framework

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟡 **Medium** | **File**: `Day3Collections.java`

### 🎯 What You'll Learn
- Master the **Collections Framework hierarchy**: Iterable → Collection → Specific types
- Understand and implement **Lists** (ArrayList, LinkedList, Stack)
- Work with **Sets** (HashSet, TreeSet, LinkedHashSet)
- Implement **Queues** (Queue, ArrayDeque, PriorityQueue)
- Use **Iterators** for traversing collections safely
- Create **custom Comparators** for sorting (Lambda & Non-Lambda expressions)
- Apply collections to solve real problems (duplicates, k-largest elements)

### 📚 Concepts Explained

#### Collections Framework Hierarchy

```
Iterable (Top Level)
    │
    └─► Collection (Interface)
        │
        ├─► List (Ordered, allows duplicates)
        │   ├─ ArrayList (Dynamic array-based)
        │   ├─ LinkedList (Node-based)
        │   └─ Stack (LIFO)
        │
        ├─► Set (Unique elements only)
        │   ├─ HashSet (Randomized order, O(1) lookup)
        │   ├─ TreeSet (Sorted order, O(log n) lookup)
        │   └─ LinkedHashSet (Insertion order)
        │
        └─► Queue (FIFO)
            ├─ LinkedList (Standard queue)
            ├─ ArrayDeque (Double-ended queue)
            └─ PriorityQueue (Min-heap by default)
```

#### Key Interfaces

**Iterable**: Allows use of enhanced for-loop and Iterator
```
Iterable → hasNext() / next() → iterate safely
```

**Collection**: Common methods for all collections
```
add(), remove(), contains(), size(), isEmpty(), clear()
```

#### Lists - Ordered Collections

| Type | Implementation | Time: Add/Remove/Get | Order | Use Case |
|------|-----------------|----------------------|-------|----------|
| **ArrayList** | Dynamic array | O(1) add end, O(n) middle | Insertion | Fast access, frequent reads |
| **LinkedList** | Doubly-linked | O(1) add/remove at ends, O(n) middle | Insertion | Frequent inserts/deletes |
| **Stack** | LIFO | O(1) push/pop | LIFO | Undo, recursion, parsing |

#### Sets - Unique Elements

| Type | Implementation | Time: Add/Remove/Lookup | Order | Use Case |
|------|-----------------|------------------------|-------|----------|
| **HashSet** | Hash table | O(1) average | Random | Fast duplicate detection |
| **TreeSet** | Red-Black Tree | O(log n) | Sorted | Sorted unique values |
| **LinkedHashSet** | Hash + LinkedList | O(1) average | Insertion | Maintain order, unique values |

#### Queues - FIFO Collections

| Type | Operations | Special Features | Use Case |
|------|-----------|-----------------|----------|
| **LinkedList Queue** | offer/poll/peek | Standard FIFO | Basic queueing |
| **ArrayDeque** | offerFirst/offerLast/pollFirst/pollLast | Deque (both ends) | Efficient double-ended ops |
| **PriorityQueue** | offer/poll/peek | Min-heap by default | Scheduling, k-largest |

---

### 💻 Key Code Snippets

#### Comparator with Lambda Expression
```java
// Sorting by last digit of numbers
List<Integer> arrList = new ArrayList<>(Arrays.asList(22, 33, 41, 55, 69, 90));

Comparator<Integer> comp = (Integer a, Integer b) -> {
    if (a % 10 > b % 10) {
        return 1;    // a should come after b (ascending by last digit)
    } else {
        return -1;   // a should come before b
    }
};

Collections.sort(arrList, comp);
// Result: [41, 33, 55, 22, 69, 90] (sorted by last digit: 1,3,5,2,9,0)
```

#### Comparator without Lambda (Traditional)
```java
Comparator<Integer> comp = new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 10 > b % 10) {
            return 1;
        } else {
            return -1;
        }
    }
};

Collections.sort(arrList, comp);
```

#### Set - Detecting Duplicates (O(n) vs O(n²))
```java
// METHOD 1: Brute Force - O(n²) Time Complexity
public static boolean checkDuplicatesM1(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                return true;  // Found duplicate
            }
        }
    }
    return false;
}

// METHOD 2: Using HashSet - O(n) Time Complexity ⚡
public static boolean checkDuplicatesM2(int[] arr) {
    Set<Integer> hashSet = new HashSet<>();
    for (int num : arr) {
        if (hashSet.contains(num)) {
            return true;  // Duplicate found
        } else {
            hashSet.add(num);
        }
    }
    return false;
}
```

#### Queue - Finding K Largest Elements
```java
// Using MinHeap (PriorityQueue)
Queue<Integer> pq = new PriorityQueue<>();
int[] arr = {5, 1, 10, 3, 12, 2, 8};
int k = 3;

for (int num : arr) {
    pq.add(num);
    if (k < pq.size()) {
        pq.poll();  // Remove smallest to keep k largest
    }
}

System.out.println(pq);  // Output: [3, 5, 8] (or similar - heap order)
```

#### Iterator - Safe Traversal
```java
Set<Integer> hashSet = new HashSet<>();
hashSet.add(4);
hashSet.add(9);
hashSet.add(300);
hashSet.add(1);

Iterator<Integer> it = hashSet.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

#### ArrayDeque - Deque Operations
```java
ArrayDeque<Integer> deque = new ArrayDeque<>();

// Add at both ends
deque.offerFirst(0);   // Add to front
deque.offer(91);       // Add to back (default)
deque.offerLast(99);   // Add to back

// Remove from both ends
int front = deque.pollFirst();  // Remove from front
int back = deque.pollLast();    // Remove from back

System.out.println(deque);  // Remaining elements
```

---

### 🔢 Complexity Comparison

| Operation | ArrayList | LinkedList | HashSet | TreeSet | PriorityQueue |
|-----------|-----------|------------|---------|---------|---------------|
| **Add** | O(1) amortized, O(n) at start | O(1) at ends, O(n) middle | O(1) avg | O(log n) | O(log n) |
| **Remove** | O(n) | O(1) at ends, O(n) middle | O(1) avg | O(log n) | O(log n) |
| **Search** | O(n) | O(n) | O(1) avg | O(log n) | O(n) |
| **Space** | O(n) | O(n) | O(n) | O(n) | O(n) |
| **Ordered** | ❌ Insertion | ❌ Insertion | ❌ No | ✅ Sorted | ✅ Heap |

---

### 🎨 Visual Examples

**Collections Framework Relationship:**
```
Iterable ← Top-level interface
    │
    └─► Collection ← All collections inherit
        │
        ├─► List (ArrayList, LinkedList, Stack)
        │   └─ [1, 2, 2, 3] ← Duplicates allowed, indexed
        │
        ├─► Set (HashSet, TreeSet, LinkedHashSet)
        │   └─ {1, 2, 3} ← No duplicates, no index
        │
        └─► Queue (PriorityQueue, ArrayDeque)
            └─ [1 → 2 → 3] ← FIFO/Priority order
```

**HashSet vs TreeSet vs LinkedHashSet:**
```
Original: 4, 9, 300, 1, 77

HashSet:         {1, 4, 9, 77, 300}      (Random order)
TreeSet:         {1, 4, 9, 77, 300}      (Sorted order) ⚡
LinkedHashSet:   {4, 9, 300, 1, 77}      (Insertion order)
```

**PriorityQueue K-Largest Example:**
```
Array: [5, 1, 10, 3, 12, 2, 8], K = 3

Step 1: Add all, remove smallest when size > k
Step 2: Min-heap keeps: [3, 5, 8]
        (These are the 3 largest elements)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Create a list, add elements, iterate using Iterator
2. Create a HashSet, add numbers with duplicates - verify duplicates are ignored
3. Sort a list using Collections.sort()
4. Find the maximum element using TreeSet

**🟡 Medium**
5. Detect duplicates in an array (use HashSet)
6. Find k largest elements from an array (use PriorityQueue)
7. Create custom Comparator to sort by last digit of number
8. Implement a queue using LinkedList

**🔴 Hard**
9. Find common elements between two lists (use Set intersection)
10. Implement LRU Cache using LinkedHashMap + HashMap
11. Sort objects using custom Comparator (compare multiple fields)
12. Find all pairs in array that sum to target (use HashSet for O(n))

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|------------------|
| Using ArrayList when frequent deletions needed | Use LinkedList for middle deletions | O(n) vs O(1) difference |
| Forgetting that Set doesn't allow duplicates | Use List if duplicates needed | Sets silently ignore duplicate adds |
| Creating HashSet with large objects | Override hashCode() and equals() | Default implementation may cause collisions |
| Sorting with wrong Comparator logic | Remember: return -1 (before), 0 (equal), 1 (after) | Reverse logic = reverse sort |
| Using Iterator.next() without hasNext() | Always check hasNext() first | Causes NoSuchElementException |
| Not knowing when to use each Set type | HashSet (fast), TreeSet (sorted), LinkedHashSet (order) | Choose based on requirement |
| Adding to PriorityQueue then sorting | PriorityQueue already maintains heap order | Sorting again is wasteful |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Hash Table & Heap**: [Visualize Set & Queue Operations](https://visualgo.net/)
- 📖 **Oracle Java Docs**: [Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)
- 📖 **GeeksforGeeks**: [Java Collections Framework](https://www.geeksforgeeks.org/collections-in-java-2/)
- 🎥 **YouTube**: "Collections Framework Explained" - Code with Harry
- 📘 **LeetCode**: Filter problems by "Design", "Hash Table", "Heap" tags

---

### 📌 Key Takeaways

💡 **Collections Framework = Iterable → Collection → List/Set/Queue** - Know the hierarchy!  
💡 **Choose wisely**: ArrayList (fast access), LinkedList (fast ops), Set (unique), Queue (ordered processing)  
💡 **HashSet is O(1)** - Use for duplicate detection and fast lookups  
💡 **Comparators control sorting** - Lambda expressions make code clean  
💡 **PriorityQueue is a min-heap** - Perfect for k-largest problems  
💡 **Iterator is safer** than for-loop when removing elements  

---

# 🔧 Reference Materials

## Big O Complexity Cheat Sheet

```
BEST CASE      AVERAGE CASE     WORST CASE      NAME
──────────────────────────────────────────────────────
O(1)           O(1)             O(1)            Constant
O(log n)       O(log n)         O(log n)        Logarithmic
O(n)           O(n)             O(n)            Linear
O(n log n)     O(n log n)       O(n log n)      Linearithmic
O(n²)          O(n²)            O(n²)           Quadratic
O(n³)          O(n³)            O(n³)           Cubic
O(2ⁿ)          O(2ⁿ)            O(2ⁿ)           Exponential
O(n!)          O(n!)            O(n!)           Factorial

Visual Comparison (which is faster?):
        O(1) ⚡⚡⚡
        O(log n) ⚡⚡
        O(n) ⚡
        O(n log n) ⚡
        O(n²) 🐢
        O(2ⁿ) 🐌🐌🐌 (AVOID!)
```

---

## Data Structure Complexity Quick Reference

| Structure | Insert | Delete | Search | Space | Best For |
|-----------|--------|--------|--------|-------|----------|
| Array | O(n) | O(n) | O(n) | O(n) | Indexed access, cache-friendly |
| Linked List | O(1)* | O(1)* | O(n) | O(n) | Dynamic size, frequent inserts |
| Stack | O(1) | O(1) | O(n) | O(n) | LIFO, undo/redo, function calls |
| Queue | O(1) | O(1) | O(n) | O(n) | FIFO, BFS, scheduling |
| BST | O(log n) | O(log n) | O(log n) | O(n) | Sorted data, fast lookup |
| Hash Table | O(1)** | O(1)** | O(1)** | O(n) | Fast lookups, no order needed |
| Heap | O(log n) | O(log n) | O(n) | O(n) | Priority, min/max |
| Graph | - | - | O(V+E) | O(V+E) | Networks, relationships |

*With reference to node  
**Average case; O(n) worst case if hash collisions  

---

## 💡 Key Interview Questions by Topic

### Linked Lists
1. **Reverse a linked list** - Classic! 🎯
2. **Detect cycle** - Floyd's algorithm (tortoise & hare)
3. **Merge two sorted lists** - Practice merging technique
4. **Find middle element** - Two pointer technique
5. **Remove Nth node from end** - Edge cases matter

### Stacks & Queues
1. **Valid parentheses** - Stack use case
2. **Min stack** - Track minimum while pushing
3. **Implement queue using stacks** - Learn trade-offs
4. **LRU Cache** - Combine hash map + doubly linked list

### Trees
1. **Inorder traversal** - Sorted output!
2. **Lowest Common Ancestor** - Recursive thinking
3. **Balanced tree check** - Recursion + height tracking
4. **Level-order traversal** - BFS practice
5. **Serialize/deserialize** - Tricky but important

### Graphs
1. **Number of islands** - DFS/BFS application
2. **Topological sort** - DAG processing
3. **Shortest path (Dijkstra)** - Priority queue needed
4. **Detect cycle** - DFS with color marking
5. **Connected components** - Union-Find data structure

### Dynamic Programming
1. **Climbing stairs** - Easy DP intro
2. **0/1 Knapsack** - Classic DP problem
3. **Longest increasing subsequence** - Pattern recognition
4. **Coin change** - Min coins for amount
5. **Edit distance** - String transformation

---

## 🛠️ Useful Tools & Visualizers

### Visualization Tools (Highly Recommended!)
- 🌐 **[VisuAlgo](https://visualgo.net/)** - Most comprehensive DSA visualizer
- 🌐 **[Thinkful](https://www.thinkful.com/learn/data-structures-part-one/)** - Excellent tutorials
- 🌐 **[PythonTutor](https://pythontutor.com/)** - Step-through execution (works for Java too!)
- 🌐 **[LeetCode](https://leetcode.com/)** - 2000+ practice problems, discuss solutions
- 🌐 **[HackerEarth](https://www.hackerearth.com/practice/data-structures/)** - Competitive programming focus

### Online Judges (Code & Test)
- **LeetCode** - Best for interviews
- **HackerRank** - Good tutorials + problems
- **CodeChef** - Competitive programming
- **AtCoder** - Educational content

### YouTube Channels (Free Learning!)
- 📺 **Abdul Bari** - Detailed DSA explanations
- 📺 **Code with Harry** - Hindi/English, beginner-friendly
- 📺 **Kunal Kushwaha** - Comprehensive DSA series
- 📺 **Striver** - Interview-focused content

---

## ⚡ Pro Tips & Best Practices

### 🎯 Before Writing Code
1. **Understand the problem** - Restate it in your own words
2. **Identify data structure** - Will you need array, tree, graph?
3. **Plan the algorithm** - Pseudocode first!
4. **Calculate complexity** - Will it be fast enough?

### 🏗️ While Writing Code
1. **Handle edge cases** - Empty, single element, maximum size
2. **Use meaningful names** - `head` > `h`, `append` > `add`
3. **Comment complex logic** - Future you will thank present you
4. **Test as you go** - Don't wait until the end

### ✅ Code Review Checklist
- [ ] Does it compile without errors?
- [ ] Does it handle null/empty cases?
- [ ] Is time complexity acceptable?
- [ ] Is space complexity optimized?
- [ ] Is the code readable (another dev can understand)?
- [ ] Are there any off-by-one errors?
- [ ] Did I test with multiple inputs?

### 🧠 Common Java Gotchas
```java
// ❌ Bad: Modifying object passed as parameter
public void modify(Node node) {
    node = null;  // Doesn't affect original!
}

// ✅ Good: Modify node's properties
public void modify(Node node) {
    node.data = 0;  // Changes the object
}

// ❌ Bad: NullPointerException risk
if (head.next != null) { }  // What if head is null?

// ✅ Good: Check for null first
if (head != null && head.next != null) { }

// ❌ Bad: Infinite loop
while (current != null) {
    current = current;  // Never advances!
}

// ✅ Good: Advance pointer
while (current != null) {
    current = current.next;  // Progress through list
}
```

---

## 🎓 Your Progress Tracker

Complete each day as you progress! 🚀

- [ ] **Day 1**: Singly Linked List ✏️
- [ ] **Day 2**: Doubly & Circular LL ✏️
- [ ] **Day 3**: Stack Operations ✏️
- [ ] **Day 4**: Stack Applications ✏️
- [ ] **Day 5**: Queue Operations ✏️
- [ ] **Day 6**: Circular & Deque ✏️
- [ ] **Day 7**: Binary Search Trees ✏️
- [ ] **Day 8**: Tree Traversals Part 1 ✏️
- [ ] **Day 9**: Tree Traversals Part 2 ✏️
- [ ] **Day 10**: Graphs & DFS/BFS ✏️
- [ ] **Day 11**: Shortest Path & Algorithms ✏️
- [ ] **Day 12**: Dynamic Programming ✏️

### Completion Score: [ ___ / 12 ]

---

## 📢 Tips for Success

### 🎯 How to Get the Most Out of This Course

1. **Code Along** - Don't just read! Type every example yourself 💻
2. **Experiment** - Break the code, fix it, understand why
3. **Visualize** - Use VisuAlgo for every data structure you learn
4. **Practice Problems** - Start with 🟢 Easy, work your way up 📈
5. **Teach Others** - Explaining to classmates deepens understanding 🗣️
6. **Connect to Reality** - Think of real-world uses for each concept
7. **Review Daily** - Spend 15 min each morning reviewing previous days
8. **Take Breaks** - Don't burn out! DSA is a marathon, not a sprint 🏃

### 💪 Growth Mindset

```
Day 1-2: "This is easy!" 😊
Day 3-4: "Getting trickier..." 🤔
Day 5-6: "Struggling a bit" 😅
Day 7: "What am I doing?!" 😫

BUT REMEMBER: This is NORMAL! 🎯
Every expert was once a beginner.
Keep pushing! You've got this! 🚀
```

---

## 📝 Additional Learning Resources

### Books (Classics)
- 📖 **"Introduction to Algorithms" (CLRS)** - The Bible of DSA (challenging but comprehensive)
- 📖 **"Cracking the Coding Interview"** - Interview-focused (practical)
- 📖 **"The Algorithm Design Manual" (Skiena)** - More accessible than CLRS

### Online Courses
- 🎓 **Coursera - Data Structures (UC San Diego)** - Excellent quality
- 🎓 **Udacity - Data Structures & Algorithms Nanodegree** - Project-based
- 🎓 **GeeksforGeeks - DSA Tutorial** - Free and comprehensive

### Competitive Programming
- ⚔️ **Codeforces** - Competitive programming problems
- ⚔️ **AtCoder** - Educational and fun
- ⚔️ **CodeChef Long Challenge** - Monthly contests

---

## ❓ FAQ

**Q: When should I memorize Big O complexities?**  
A: Don't memorize! Understand WHY each operation has its complexity. Once you understand, you'll remember naturally.

**Q: Can I skip easier days and jump to harder topics?**  
A: Not recommended. Linked Lists form the foundation for everything. Skip and you'll struggle later!

**Q: How long should I spend on each day?**  
A: Ideally 2-3 hours per day. That includes reading, coding, and practice problems. Don't rush!

**Q: Should I implement everything from scratch or use Java Collections?**  
A: For learning: **always implement from scratch**. This teaches you how things work internally. In real projects: use Collections (they're optimized and tested).

**Q: I'm stuck on a problem. What should I do?**  
A: 1) Step away for 15 min (fresh perspective), 2) Look up the concept (not solution), 3) Code along with tutorial, 4) Try problem again solo.

**Q: Is DP always necessary for optimization?**  
A: No! Use DP only when you have overlapping subproblems. Don't over-engineer simple solutions.

---

## 🤝 Contributing

Found an error in this README? Have a better explanation for a concept? Want to add practice problems?  

Please feel free to:
1. 📝 Create an issue with your suggestion
2. 🔀 Submit a pull request with improvements
3. 💬 Discuss in the discussions section

**Together, we make this better for the next batch of students!** 🌟

---

## 📧 Support & Communication

- **Questions during class?** Raise your hand 🙋
- **Questions after class?** Email or use discussion forum
- **Stuck on a problem?** Office hours (timing posted on class portal)
- **General feedback?** Anonymous survey link (shared periodically)

---

## 📜 License

This educational material is provided for learning purposes. Feel free to use, modify, and share for educational use.

---

## 🌟 Acknowledgments

Special thanks to:
- 🙏 My students for pushing me to explain better
- 🙏 VisuAlgo team for amazing visualizations
- 🙏 Open-source DSA communities worldwide

---

## 📈 Course Statistics

**Total Content:**
- 12 Days of comprehensive DSA teaching
- 50+ Code examples
- 100+ Practice problems
- 20+ Complex visualizations
- 15+ External resources

**Learning Outcomes:**
- 12 different data structures
- 20+ algorithms
- Real-world applications for each concept
- Interview preparation for top tech companies

---

**Last Updated**: June 2, 2026  
**Course Version**: 1.0  
**Maintained by**: VCE Java DSA Instructor  ([Shivam Bansal](https://shivambansal.co.in))

---

<div align="center">

### 🚀 Ready to Master DSA? Let's Go! 🎯

**Remember**: *The best time to plant a tree was 20 years ago. The second-best time is now.*

---

<div align="center">

### ✨ Created By ✨

## <a href="https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19" target="_blank">✨ **Shine_Beyond_Syntax** ✨</a>

<br>

[![WhatsApp Channel](https://img.shields.io/badge/Join%20My-WhatsApp%20Channel-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19)

<br>

</div>

Keep coding, keep learning, keep growing! 💪

[🔝 Back to Top](#-java-data-structures--algorithms---vce-semester-1)



</div>
