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
| 🔴 Done | **Day 4** | [Stacks](#day-4-stacks) | 🟡 Medium | `Day4Stacks.java` |
| 🔴 Done | **Day 5** | [Stack Applications & Queues](#day-5-stack-applications--queues) | 🔴 Hard | `Day5Queues.java` |
| 🔴 Done | **Day 6** | [Two Pointers](#day-6-two-pointers) | 🟡 Medium | `Day6TwoPointers.java` |
| 🔴 Done | **Day 7** | [Recursion & Backtracking](#day-7-recursion--backtracking) | 🟡 Medium | `Day7Recursion.java` |
| 🔴 Done | **Day 8** | [Recursion](#day-8-recursion) | 🔴 Hard | `Day8Recursion.java` |

| 🔴 Done | **Day 8** | [Trees & Binary Trees](#day-8-trees--binary-trees) | 🔴 Hard | `Day8BT.java` |
| 🔴 Done | **Day 9** | [Binary Search Trees](#day-9-binary-search-trees) | 🔴 Hard | `Day9BST.java` |

| ⚪ Coming | **Day 10** | [Graphs](#day-10-graphs) | 🔴 Hard | `Day10Graph.java` |
| ⚪ Coming | **Day 11-12** | [DP](#day-11-12-dp) | 🔴 Hard | `Day11Graph.java` |

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
✅ **Master Recursion & Backtracking**: Solve complex problems using divide-and-conquer, merge sort, and path finding

### Prerequisites

- ✨ Solid understanding of **Java fundamentals** (variables, loops, conditionals, OOP basics)
- ✨ Comfort with **classes and objects**
- ✨ Basic understanding of **recursion** (will refresh if needed)
- ✨ Logical thinking & problem-solving mindset 🧠

### 12-Day Syllabus at a Glance

```
WEEK 1                          WEEK 2                           
Day 1: Singly LL           ├──────► Day 7: Recursion         
Day 2: Doubly/Circular LL  ├──────► Day 8: Binary Tree    
Day 3: Collections         ├──────► Day 9: Binary Search Tree  
Day 4: Stacks              ├──────► Day 10: Graphs         
Day 5: Stack Apps          ├──────► Day 11: Dynamic Programming
Day 6: Two Pointers        ├──────► Day 12: Dynamic Programming + Heap
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

## Day 4: Stacks

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟡 **Medium** | **File**: `Day4Stacks.java`

### 🎯 What You'll Learn
- Complete **Comparators** concepts using Lambda expressions (sorting strategies)
- Understand **Map Interface** deeply (HashMap, LinkedHashMap, TreeMap)
- Implement **Stacks using Arrays, ArrayList, and Linked List**
- Solve real stack problems: **Valid Parentheses** and **Next Greater Element**
- Master **LIFO (Last-In-First-Out)** principle and its applications

### 📚 Concepts Explained

#### Comparators - Sorting Strategies

A **Comparator** is a functional interface used to define custom sorting logic. It allows you to sort collections based on specific criteria using lambda expressions or anonymous classes.

**Comparator Basics:**
```
compare(a, b) returns:
  > 0  : a comes after b
  = 0  : a and b are equal
  < 0  : a comes before b
```

**Common Sorting Strategies:**

1. **Sort by Last Digit (Units Place)**
```
Array: [99, 19, 23, 56, 76, 10, 31]
By last digit: [10, 31, 23, 56, 76, 99, 19] (0,1,3,6,6,9,9)
```

2. **Sort by Odd/Even**
```
Odd numbers before even numbers (or vice versa)
[1, 3, 5, 7] before [2, 4, 6, 8]
```

**Lambda Expression Syntax:**
```
Comparator<Integer> comp = (Integer a, Integer b) -> {
    if (a % 10 > b % 10) return 1;   // a after b
    else return -1;                  // a before b
};
```

---

#### Map Interface Hierarchy

The Map interface provides key-value pair storage. Let's explore three implementations:

```
Map Interface
├─ HashMap: Fast lookup, random order, O(1) average
├─ TreeMap: Sorted by keys, O(log n), navigable
└─ LinkedHashMap: Maintains insertion order, O(1) average
```

**HashMap** - No Order Guarantee
```
HashMap:     {3→Sejal, 1→Mohini, 51→Mohini, 10→Mohini, 2→Shivam}
             (Random order)
```

**TreeMap** - Sorted by Keys
```
TreeMap:     {1→Mohini, 2→Shivam, 3→Sejal, 10→Mohini, 51→Mohini}
             (Sorted ascending)
```

**LinkedHashMap** - Insertion Order
```
LinkedHashMap: {3→Sejal, 1→Mohini, 51→Mohini, 10→Mohini, 2→Shivam}
               (Same order as insertion)
```

---

#### Stack Data Structure

A **Stack** is a **LIFO (Last-In-First-Out)** data structure where:
- Elements are added to the **top** (push)
- Elements are removed from the **top** (pop)
- The last element added is the first one removed

```
Push 3:    [3]
Push 2:    [3, 2]
Push 1:    [3, 2, 1]  ← Top
Pop:       [3, 2]     (Returns 1)
Pop:       [3]        (Returns 2)
```

**Stack Operations:**
- **Push** - Add element to top: O(1)
- **Pop** - Remove element from top: O(1)
- **Peek** - View top element: O(1)
- **isEmpty/isFull** - Check status: O(1)

---

### 💻 Key Code Snippets

#### Comparators - Sort by Last Digit (Lambda Expression)
```java
// Sorting by last digit of numbers
List<Integer> arrList = new ArrayList<>(Arrays.asList(99, 19, 23, 56, 76, 10, 31));

Comparator<Integer> comp = (Integer a, Integer b) -> {
    if (a % 10 > b % 10) {
        return 1;    // a should come after b (ascending by last digit)
    } else {
        return -1;   // a should come before b
    }
};

System.out.println(arrList);
Collections.sort(arrList, comp);
System.out.println(arrList);
// Result: [10, 31, 23, 56, 76, 99, 19] (sorted by last digit: 0,1,3,6,6,9,9)
```

#### Comparators - Sort by Odd/Even
```java
// Sort odd numbers before even numbers
Comparator<Integer> comp2 = (Integer a, Integer b) -> {
    if (a % 2 == 0) {
        return 1;    // Even numbers come after
    } else {
        return -1;   // Odd numbers come before
    }
};

System.out.println(arrList);
Collections.sort(arrList, comp2);
System.out.println(arrList);  
// Odd numbers appear first: [99, 19, 23, 31, 23, 56, 76, 10]
```

#### HashMap - Element Frequency (n/3 times)
```java
// Find all elements occurring more than n/3 times
public static void elementMoreThanN3() {
    Map<Integer, Integer> hashMap = new HashMap<>();
    int[] arr = {1, 4, 1, 4, 2, 1, 7, 9, 1};  // n = 9, n/3 = 3
    int n = arr.length;
    
    // Count frequency of each element
    for (int i = 0; i < arr.length; i++) {
        if (hashMap.containsKey(arr[i])) {
            hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
        } else {
            hashMap.put(arr[i], 1);
        }
    }
    
    // Find elements with frequency >= n/3
    for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
        if (e.getValue() >= (n / 3)) {
            System.out.print(e.getKey() + " ");
        }
    }
    // Output: 1 4 (both occur 4 times, which is > 3)
}
```

#### TreeMap - Built-in Methods
```java
Map<String, String> treeMap = new TreeMap<>();
treeMap.put("name", "Shivam");
treeMap.put("isTrainer", "True");
treeMap.put("topic", "Maps");

// Check key existence
System.out.println(treeMap.containsKey("names"));  // false

// Get value
System.out.println(treeMap.get("name"));  // Shivam

// Put if key doesn't exist
treeMap.putIfAbsent("author", "anonymous");

// Iterate through entries
for (Map.Entry<String, String> data: treeMap.entrySet()) {
    System.out.println(data.getKey() + " -> " + data.getValue());
}
// Output (sorted by key):
// author -> anonymous
// isTrainer -> True
// name -> Shivam
// topic -> Maps
```

#### Stack Implementation Using Array
```java
public class StackArray {
    int[] arr;
    int size;
    int top = -1;
    
    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }
    
    public boolean isFull() {
        return arr.length - 1 == top;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty || UNDERFLOW");
            return -1;
        }
        return arr[top];
    }
    
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full || OVERFLOW");
        } else {
            top++;
            arr[top] = data;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty || UNDERFLOW");
            return -1;
        }
        int lastEle = arr[top];
        top--;
        return lastEle;
    }
}
```

#### Stack Implementation Using ArrayList
```java
public class StackArrayList {
    List<Integer> arrList = new ArrayList<>();
    int top = -1;
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(int data) {
        arrList.add(data);
        top++;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return -1;
        }
        int lastEle = arrList.get(top);
        arrList.remove(top);
        top--;
        return lastEle;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return -1;
        }
        return arrList.get(top);
    }
}
```

#### Valid Parentheses - Method 1 (Basic Approach)
```java
// Check if string has valid parentheses
public class ValidParentheses1 {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        boolean flag = true;
        String s = "(({}))";  
        
        if (s.equals("")) {
            System.out.println("String is Empty !!!");
        } else {
            for (int i = 0; i < s.length(); i++) {
                // Push opening brackets
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stk.push(s.charAt(i));
                } 
                // Match closing brackets
                else {
                    if (!stk.isEmpty()) {
                        if ((stk.peek() == '(' && s.charAt(i) == ')') ||
                            (stk.peek() == '{' && s.charAt(i) == '}') ||
                            (stk.peek() == '[' && s.charAt(i) == ']')) {
                            stk.pop();
                        }
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println(flag ? "Valid Parentheses" : "Invalid Parentheses");
        }
    }
}
```

#### Valid Parentheses - Method 2 (Using HashMap)
```java
// More elegant approach using Map for bracket matching
public class ValidParentheses2 {
    public static boolean validParentheses(Stack<Character> stk, String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        if (s.equals(""))
            return false;
        
        for (int i = 0; i < s.length(); i++) {
            // Push opening brackets
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stk.push(s.charAt(i));
            }
            // Match closing brackets using map
            else {
                if (stk.isEmpty())
                    return false;
                if (stk.peek().equals(map.get(s.charAt(i)))) {
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();  // Stack should be empty for valid string
    }
    
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        String s = "(({}))";  
        boolean res = validParentheses(stk, s);
        System.out.println(res);  // Output: true
    }
}
```

#### Next Greater Element
```java
// Find the next greater element for each element in array
// Array: [4, 5, 2, 10, 8]
// Result: [5, 10, 10, -1, -1]  (Next greater to right, -1 if none)

public class NextGreaterElement {
    public static int[] nextGreaterElement(Stack<Integer> stk, int[] arr, int[] res) {
        // Traverse array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements smaller than current
            while (!stk.isEmpty()) {
                if (stk.peek() > arr[i]) {
                    res[i] = stk.peek();  // Found next greater
                    break;
                } else {
                    stk.pop();  // Remove smaller elements
                }
            }
            stk.push(arr[i]);  // Push current element
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);  // Initialize with -1
        
        res = nextGreaterElement(stk, arr, res);
        
        for (int val : res) {
            System.out.print(val + " ");
        }
        // Output: 5 10 10 -1 -1
    }
}
```

---

### 🔢 Complexity Analysis

| Operation | Array Stack | ArrayList Stack | LinkedList Stack | HashMap | TreeMap | LinkedHashMap |
|-----------|-------------|-----------------|------------------|---------|---------|---------------|
| **Push** | O(1) | O(1) amortized | O(1) | - | - | - |
| **Pop** | O(1) | O(1) | O(1) | - | - | - |
| **Peek** | O(1) | O(1) | O(1) | - | - | - |
| **Insert (Map)** | - | - | - | O(1) avg | O(log n) | O(1) avg |
| **Delete (Map)** | - | - | - | O(1) avg | O(log n) | O(1) avg |
| **Search (Map)** | - | - | - | O(1) avg | O(log n) | O(1) avg |
| **Space** | O(n) fixed | O(n) dynamic | O(n) dynamic | O(n) | O(n) | O(n) |

---

### 🎨 Visual Examples

**Valid Parentheses Matching:**
```
String: "(({}))"
        
Push '('    → Stack: [(]
Push '('    → Stack: [(, (]
Push '{'    → Stack: [(, (, {]
Push '}'    → Match! Pop '{' → Stack: [(, (]
Push ')'    → Match! Pop '(' → Stack: [(
Push ')'    → Match! Pop '(' → Stack: []
Result: VALID! ✓

Invalid: "(())" → Extra closing bracket → INVALID!
```

**Next Greater Element:**
```
Array:  [4, 5, 2, 10, 8]

For 8 (rightmost): No element > 8 to right → -1
For 10: No element > 10 to right → -1
For 2: 10 is greater and to right → 10
For 5: 10 is greater and to right → 10
For 4: 5 is greater and to right → 5

Result: [5, 10, 10, -1, -1]
```

**Map Comparison:**
```
Insertion Order: {3→Sejal, 1→Mohini, 51→Mohini, 10→Mohini, 2→Shivam}

HashMap:       {3→Sejal, 1→Mohini, 51→Mohini, 10→Mohini, 2→Shivam}  (Random)
TreeMap:       {1→Mohini, 2→Shivam, 3→Sejal, 10→Mohini, 51→Mohini}  (Sorted keys)
LinkedHashMap: {3→Sejal, 1→Mohini, 51→Mohini, 10→Mohini, 2→Shivam}  (Insertion)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Create a Comparator to sort numbers by their last digit
2. Create a Comparator to sort odd/even numbers
3. Count occurrences of elements using HashMap
4. Check if a string contains only valid parentheses

**🟡 Medium**
5. Implement stack using array and test push/pop/peek operations
6. Implement stack using ArrayList
7. Next Greater Element to the right in an array
8. Find all elements occurring more than n/3 times using HashMap
9. TreeMap operations and sorting by keys
10. Reverse a string using stack

**🔴 Hard**
11. Largest rectangle in histogram (uses stack)
12. Trapping rainwater (two-pointer + stack hybrid)
13. Daily temperatures (next greater variant)
14. Implement Min Stack (push, pop, peek, getMin all O(1))

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|-------------------|
| Confusing HashMap and TreeMap | Use HashMap for fast O(1) lookup, TreeMap when sorted order needed | Performance difference: O(1) vs O(log n) |
| Forgetting to decrement `top` in array stack pop | Always do `top--` after popping | Otherwise top doesn't move, stack breaks |
| Using wrong Map implementation | LinkedHashMap ≠ TreeMap (insertion vs sorted) | Different use cases! |
| Not checking isEmpty() before pop/peek | Always check first | Prevents null errors or wrong values |
| Using stack when queue would be better | Think LIFO vs FIFO requirement | Wrong data structure = wrong output |
| Parentheses matching logic reversed | Push opening, pop on closing, check match | Reversed logic gives opposite results |
| Not initializing result array in NGE | Use Arrays.fill(res, -1) | Otherwise shows 0 instead of -1 |
| Matching all bracket types at once | Use separate conditions for each type | Prevents cross-type matching errors |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Stack & Queue**: [Visualize Stack Operations](https://visualgo.net/en/list)
- 📖 **GeeksforGeeks - Stack**: [Complete Stack Guide](https://www.geeksforgeeks.org/stack-data-structure/)
- 📖 **GeeksforGeeks - Map**: [HashMap vs TreeMap](https://www.geeksforgeeks.org/differences-between-hashmap-and-treemap-in-java/)
- 💡 **LeetCode Problems**: 
  - Valid Parentheses (#20)
  - Next Greater Element (#496)
  - Min Stack (#155)
- 🎥 **YouTube**: "Stack Problems Explained" - Code Help

---

### 📌 Key Takeaways

💡 **Comparators control custom sorting** - Lambda expressions make the code clean and concise  
💡 **Choose your Map**: HashMap (fast O(1) lookup), TreeMap (sorted order O(log n)), LinkedHashMap (insertion order)  
💡 **LIFO is the key** - Stack reverses order (last in = first out)  
💡 **Valid Parentheses = Stack problem** - Push opening, pop on closing  
💡 **NGE pattern** - Traverse right to left, use stack to track greater elements  
💡 **Array vs ArrayList Stack** - Arrays are fixed size (overflow possible), ArrayList is dynamic  

---


---

## Day 5: Stack Applications & Queues

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🔴 **Hard** | **File**: `Day5Queues.java`

### 🎯 What You'll Learn
- Solve monotonic stack problems: **Next/Previous Greater/Smaller Element & Index**
- Apply stack patterns to solve **Largest Rectangle in Histogram**
- Implement **Queue using Arrays** (basic linear queue)
- Implement **Circular Queue** using arrays with wrap-around logic

---

### 📚 Concepts Explained

#### Monotonic Stack Patterns

All 6 variants follow the same template — the only differences are:
1. **Direction** — traverse left-to-right (Previous) or right-to-left (Next)
2. **Comparison** — `>` for Greater, `<` for Smaller
3. **What you push** — value (element problems) or index (index problems)

```
Pattern Template:
  for each element (from correct direction):
      while stack not empty:
          if stack.peek() satisfies condition → record result, break
          else → pop
      push current element (or index)
```

**6 Variants at a Glance:**

| Problem | Direction | Condition | Push |
|---------|-----------|-----------|------|
| Next Greater Element | Right → Left | `peek > arr[i]` | value |
| Next Smaller Element | Right → Left | `peek < arr[i]` | value |
| Previous Greater Element | Left → Right | `peek > arr[i]` | value |
| Previous Smaller Element | Left → Right | `peek < arr[i]` | value |
| Previous Smaller Index | Left → Right | `arr[peek] < arr[i]` | index |
| Next Smaller Index | Right → Left | `arr[peek] < arr[i]` | index |

---

#### Largest Rectangle in Histogram

Uses **Previous Smaller Index** (left boundary) + **Next Smaller Index** (right boundary) for each bar.

```
Histogram: [2, 1, 5, 6, 2, 3]

For each bar i:
  width  = nextSmallerIndex[i] - previousSmallerIndex[i] - 1
  area   = height[i] * width
  answer = max of all areas

Answer: 10  (bars of height 5 and 6, width 2)
```

---

#### Queue — Linear (Array-based)

```
FIFO: First In, First Out

Enqueue 10 → [10]
Enqueue 20 → [10, 20]
Enqueue 30 → [10, 20, 30]
Dequeue    → [20, 30]   (10 removed from front)

front = 0, rear tracks last element
```

**Problem with linear queue:** after several dequeue+enqueue cycles, rear hits the end even if front has moved — wasted space. Solved by Circular Queue.

---

#### Circular Queue — Array-based

Rear wraps around to index 0 when it reaches the end:

```
Size = 3

append(10) → [10, _, _]   front=0, rear=0
append(20) → [10, 20, _]  front=0, rear=1
append(30) → [10, 20, 30] front=0, rear=2  (FULL)
dequeue()  → [_, 20, 30]  front=1
append(50) → [50, 20, 30] rear wraps to 0!
```

**Key formulas:**
```
isFull  : (rear + 1) % size == front
enqueue : rear = (rear + 1) % size   (or wrap manually)
dequeue : front = (front + 1) % size
```

---

### 💻 Key Code Snippets

#### Next Greater Element
```java
public static int[] nextGreaterElement(Stack<Integer> stk, int[] arr, int[] res) {
    stk.clear();
    for (int i = arr.length - 1; i >= 0; i--) {
        while (!stk.isEmpty()) {
            if (stk.peek() > arr[i]) { res[i] = stk.peek(); break; }
            else stk.pop();
        }
        stk.push(arr[i]);
    }
    return res;
}
// arr = [4, 5, 2, 10, 8] → res = [5, 10, 10, -1, -1]
```

#### Previous Smaller Element
```java
public static int[] previousSmallerElement(Stack<Integer> stk, int[] arr, int[] res) {
    stk.clear();
    for (int i = 0; i < arr.length; i++) {
        while (!stk.isEmpty()) {
            if (stk.peek() < arr[i]) { res[i] = stk.peek(); break; }
            else stk.pop();
        }
        stk.push(arr[i]);
    }
    return res;
}
```

#### Previous Smaller Index & Next Smaller Index (used in Histogram)
```java
public static int[] previousSmallerIndex(Stack<Integer> stk, int[] arr, int[] res) {
    stk.clear();
    for (int i = 0; i < arr.length; i++) {
        while (!stk.isEmpty()) {
            if (arr[stk.peek()] < arr[i]) { res[i] = stk.peek(); break; }
            else stk.pop();
        }
        stk.push(i);   // Push INDEX not value
    }
    return res;
}

public static int[] nextSmallerIndex(Stack<Integer> stk, int[] arr, int[] res) {
    stk.clear();
    for (int i = arr.length - 1; i >= 0; i--) {
        while (!stk.isEmpty()) {
            if (arr[stk.peek()] < arr[i]) { res[i] = stk.peek(); break; }
            else stk.pop();
        }
        stk.push(i);   // Push INDEX not value
    }
    return res;
}
```

#### Largest Rectangle in Histogram
```java
// arr = {2, 1, 5, 6, 2, 3}
int[] leftRes = new int[n];   Arrays.fill(leftRes, -1);
int[] rightRes = new int[n];  Arrays.fill(rightRes, n);

leftRes  = previousSmallerIndex(stk, arr, leftRes);
rightRes = nextSmallerIndex(stk, arr, rightRes);

int maxArea = 0;
for (int i = 0; i < arr.length; i++) {
    int window = rightRes[i] - leftRes[i] - 1;
    maxArea = Math.max(maxArea, arr[i] * window);
}
// Output: 10
```

#### Circular Queue
```java
public boolean isFull()  { return (rear + 1) % arr.length == front; }
public boolean isEmpty() { return front == -1 && rear == -1; }

public int append(int data) {
    if (isFull())       { System.out.println("Queue is Full"); return 0; }
    else if (isEmpty()) { rear = 0; front = 0; }
    else                { rear = (rear == arr.length - 1) ? 0 : rear + 1; }
    arr[rear] = data;
    return data;
}

public int dequeue() {
    if (isEmpty()) { System.out.println("Queue is Empty !!!"); return -1; }
    int removed = arr[front];
    if (rear == front) { front = -1; rear = -1; }
    else               { front = (front + 1) % arr.length; }
    return removed;
}
```

---

### 🔢 Complexity Analysis

| Problem | Time | Space | Notes |
|---------|------|-------|-------|
| Next/Prev Greater/Smaller Element | O(n) | O(n) | Each element pushed/popped once |
| Next/Prev Smaller Index | O(n) | O(n) | Same pattern, push index |
| Largest Rectangle in Histogram | O(n) | O(n) | Two index passes + one area pass |
| Queue (Array) Enqueue | O(1) | O(1) | Direct rear insert |
| Queue (Array) Dequeue | O(n) | O(1) | Shifts all elements left ⚠️ |
| Circular Queue Enqueue | O(1) | O(1) | Wrap with modulo |
| Circular Queue Dequeue | O(1) | O(1) | No shifting needed ⚡ |

---

### 🎨 Visual Examples

**Monotonic Stack — Next Greater Element:**
```
arr = [4, 5, 2, 10, 8],  traverse right → left

i=4: stk=[]       → res[4]=-1, push 8    stk=[8]
i=3: 8 < 10, pop  → stk=[], res[3]=-1,   push 10  stk=[10]
i=2: 10 > 2       → res[2]=10, push 2    stk=[10,2]
i=1: 2 < 5, pop; 10 > 5 → res[1]=10, push 5  stk=[10,5]
i=0: 5 > 4        → res[0]=5,  push 4    stk=[10,5,4]

Result: [5, 10, 10, -1, -1]
```

**Circular Queue Wrap-around:**
```
size=3: append(10)→append(20)→append(30)→dequeue()→append(50)

Index:   0    1    2
         [50, 20, 30]
              ▲    ▲
            front  rear=0 (wrapped!)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Find Next Greater Element for every array element
2. Find Previous Smaller Element for every array element
3. Implement a basic Queue using array

**🟡 Medium**
4. Find Next Greater Element index (not value)
5. Implement Circular Queue with all edge cases
6. Daily Temperatures (LeetCode #739) — Next Greater variant

**🔴 Hard**
7. Largest Rectangle in Histogram (LeetCode #84)
8. Maximal Rectangle (LeetCode #85) — uses histogram approach per row
9. Sum of Subarray Minimums (LeetCode #907) — uses previous/next smaller

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution |
|-----------|-----------|
| Using value instead of index in histogram | Push `i` not `arr[i]` for index variants |
| Wrong default fill for index arrays | `fill(left, -1)` and `fill(right, n)` — boundaries matter |
| Linear queue "false full" | Use circular queue; rear wrapping fixes wasted space |
| Forgetting to reset `front=rear=-1` when last element dequeued | Check `front == rear` before advancing pointers |
| `isFull` check wrong in circular queue | Must be `(rear + 1) % size == front`, not `rear == size-1` |

---

### 📌 Key Takeaways

💡 **All 6 stack variants share one template** — change direction + comparison operator  
💡 **Histogram = Previous Smaller Index + Next Smaller Index** — two passes, one answer  
💡 **Circular Queue fixes wasted space** in linear queues using modulo wrap-around  
💡 **O(n) for monotonic stack** — each element is pushed and popped at most once  
💡 **Index variants** store indices on stack; compare `arr[stk.peek()]` not `stk.peek()`

---


---

## Day 6: Two Pointers

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟡 **Medium** | **File**: `Day6TwoPointers.java`

### 🎯 What You'll Learn
- Master the **Two Pointer Technique** across 4 different patterns
- Solve **String Problems**: Palindrome checking, character matching
- Implement **Array Merging**: Merge two sorted arrays efficiently
- Apply **Sliding Window**: Find longest substring without repeats
- Solve **Optimization Problems**: Container with Most Water

### 📚 Concepts Explained

#### What is the Two Pointer Technique?

The **Two Pointer Technique** uses two pointers (indices) that move through a data structure (usually an array or string) to solve problems efficiently. Instead of nested loops (O(n²)), we traverse smartly with two pointers, achieving O(n) in many cases.

**Core Idea:**
Instead of:   Nested loops → O(n²) ❌
Use:          Two pointers → O(n) ✅

#### 4 Types of Two Pointer Patterns

**Type 1: Opposite Direction Pointers** (Start and End)
Left pointer at start → Right pointer at end
They move TOWARDS each other until they meet
Use cases: Palindrome, reversal, container problems

**Type 2: Same Direction Pointers** (Slow and Fast)
Both start at beginning
Fast pointer moves ahead → Slow pointer follows
They maintain a window/gap
Use cases: Remove duplicates, linked list cycle detection

**Type 3: Sliding Window** (Variable Window)
Left and right pointers define a window
Window size changes based on conditions
Track max/min within the window
Use cases: Longest substring, max sum subarray

**Type 4: Fixed Window** (Constant Size)
Two pointers maintain fixed distance
Slide together across array
Calculate sum/avg for each window
Use cases: Maximum average subarray, k-size window

---

### 💻 Key Code Snippets

#### Type 1: Palindrome Check (Opposite Direction)
```java
public static void palindrome() {
    // Time: O(n) | Space: O(1)
    
    String original = "racecar";
    int left = 0;
    int right = original.length() - 1;
    boolean flag = true;
    
    while (left <= right) {
        if (original.charAt(left) != original.charAt(right)) {
            flag = false;
            break;
        }
        left++;      // Move left pointer forward
        right--;     // Move right pointer backward
    }
    
    System.out.println(flag ? "Palindrome" : "Not Palindrome");
    // Output: Palindrome ✓
}
```

**Why it works:**
"racecar"
^    ^
l    r   → Compare 'r' == 'r' ✓
^  ^
l  r    → Compare 'a' == 'a' ✓
^^
lr     → Compare 'c' == 'c' ✓
Pointers meet → All matched → Palindrome!

---

#### Type 2: Remove Duplicates (Same Direction - Slow & Fast)
```java
public static void removeDuplicates() {
    // Time: O(n) | Space: O(1)
    
    int[] arr = {2, 5, 2, 4, 4, 2, 5};
    Arrays.sort(arr);  // [2, 2, 2, 4, 4, 5, 5]
    
    int i = 0;  // Slow pointer - position to place unique element
    
    while (i < arr.length) {
        arr[i] added to result
        
        int j = i + 1;  // Fast pointer - find next different element
        while (j < arr.length && arr[j] == arr[i]) {
            j++;  // Skip duplicates
        }
        
        i = j;  // Move slow pointer to next different element
    }
    
    // Result: [2, 4, 5] - unique elements only
}
```

**Pointer Movement Visualization:**
Array:  [2, 2, 2, 4, 4, 5, 5]
i           (add 2)
j j j   (skip 2s, jump to 4)
     i       (add 4)
         j j (skip 4s)
    
     i       (add 5)
             (no more duplicates)

---

#### Type 3: Sliding Window - Longest Substring Without Repeats
```java
public static void longestSubstring() {
    // Time: O(n) | Space: O(1) - at most 26 characters
    
    Set<Character> set = new HashSet<>();
    String s = "abcabbcab";
    
    int left = 0;
    int maxLength = 0;
    
    for (int right = 0; right < s.length(); right++) {
        // If character already exists, shrink window from left
        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }
        
        // Add current character
        set.add(s.charAt(right));
        
        // Update max length
        int window = right - left + 1;
        maxLength = Math.max(window, maxLength);
    }
    
    System.out.println(maxLength);  // Output: 3 ("abc" or "cab")
}
```

**Window Expansion & Contraction:**
String: "abcabbcab"
Window progression:
"a"      → length 1
"ab"     → length 2
"abc"    → length 3 (maxLength = 3)
"cab"    → shrink: "ab" → "cab" → length 3
...
Answer: 3

---

#### Type 3: Max Average Subarray (Fixed Window)
```java
public static void maxAvgSubarray() {
    // Time: O(n) | Space: O(1)
    
    int[] arr = {1, 12, -5, -6, 50, 3};
    int k = 4;  // Window size
    
    int i = 0;
    int j = 0;
    int currentSum = 0;
    int maxSum = 0;
    
    // Build initial window
    while (j < k) {
        currentSum += arr[j];
        j++;
    }
    maxSum = currentSum;
    
    // Slide the window: add new element, remove old element
    while (j < arr.length) {
        currentSum += arr[j];        // Add new right element
        currentSum -= arr[i];        // Remove old left element
        maxSum = Math.max(currentSum, maxSum);
        i++;
        j++;
    }
    
    System.out.println(maxSum / k);  // Average
}
```

**Window Sliding Technique:**
Array: [1, 12, -5, -6, 50, 3], K = 4
Window 1: [1, 12, -5, -6]  → Sum = 2
Window 2: [12, -5, -6, 50] → Sum = 51  ✓ Max
Window 3: [-5, -6, 50, 3]  → Sum = 42
Answer: maxSum = 51, average = 51/4 = 12

---

#### Type 4: Merge Two Sorted Arrays (Opposite Direction - Merge Pattern)
```java
public static void mergeSortedArrays() {
    // Time: O(n + m) | Space: O(n + m)
    
    int[] arr1 = {2, 5, 9, 12};
    int[] arr2 = {4, 8, 16};
    int[] res = new int[arr1.length + arr2.length];
    
    int i = 0;      // Pointer for arr1
    int j = 0;      // Pointer for arr2
    int resIndex = 0;  // Pointer for result array
    
    // Merge while both arrays have elements
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            res[resIndex++] = arr1[i++];
        } else {
            res[resIndex++] = arr2[j++];
        }
    }
    
    // Add remaining elements from arr1
    while (i < arr1.length) {
        res[resIndex++] = arr1[i++];
    }
    
    // Add remaining elements from arr2
    while (j < arr2.length) {
        res[resIndex++] = arr2[j++];
    }
    
    // Result: [2, 4, 5, 8, 9, 12, 16]
}
```

**Merging Process:**
arr1 = [2, 5, 9, 12]
arr2 = [4, 8, 16]
Compare 2 vs 4 → 2 is smaller → Add 2
Compare 5 vs 4 → 4 is smaller → Add 4
Compare 5 vs 8 → 5 is smaller → Add 5
Compare 9 vs 8 → 8 is smaller → Add 8
Compare 9 vs 16 → 9 is smaller → Add 9
Compare 12 vs 16 → 12 is smaller → Add 12
arr2 still has 16 → Add 16
Result: [2, 4, 5, 8, 9, 12, 16] ✓

---

#### Type 4: Container with Most Water (Optimization)
```java
public static void containerWithMostWater() {
    // Time: O(n) | Space: O(1)
    
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    
    int left = 0;
    int right = height.length - 1;
    int maxWater = 0;
    
    while (left < right) {
        // Width = distance between pointers
        int width = right - left;
        
        // Height = minimum of two heights
        int h = Math.min(height[left], height[right]);
        
        // Area = width × height
        int currentWater = h * width;
        maxWater = Math.max(maxWater, currentWater);
        
        // Move the pointer with smaller height
        // Why? To find potentially taller bar
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    System.out.println(maxWater);  // Output: 49
}
```

**Why Move Smaller Pointer?**
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
^                          ^
left                       right
area = min(1, 7) × 8 = 1 × 8 = 8
Moving right won't help (width decreases, height capped at 1)
So move left to find taller bar:
^                       ^
left                  right
area = min(8, 7) × 7 = 7 × 7 = 49 ✓ Much better!

---

### 🔢 Complexity Comparison

| Problem | Type | Time | Space | Notes |
|---------|------|------|-------|-------|
| **Palindrome** | Opposite | O(n) | O(1) | Compare from ends |
| **Remove Duplicates** | Slow/Fast | O(n) | O(1) | In-place removal |
| **Longest Substring** | Sliding Window | O(n) | O(1)* | Window expands/shrinks |
| **Max Avg Subarray** | Fixed Window | O(n) | O(1) | Constant k-size window |
| **Merge Arrays** | Merge Pattern | O(n+m) | O(n+m) | Requires result array |
| **Container Water** | Greedy+Two Ptr | O(n) | O(1) | Move smaller height |

*O(m) where m = character set size (26 for English)

---

### 🎨 Visual Examples

**Palindrome Check Animation:**
"racecar"
↙   ↖
l   r   Match? YES
↙ ↖
l r    Match? YES
↙↖
lr    Match? YES
Pointers crossed → PALINDROME! ✓

**Sliding Window Growth & Shrink:**
String: "abcabbcab"
[a]         → length 1
[ab]        → length 2
[abc]       → length 3 ✓ MAX
[ab]c       → 'c' duplicate, shrink
[abc]ab     → length 3
[cab]       → length 3
[ab]ca      → 'a' duplicate, shrink
...
Final Answer: 3

**Container with Most Water Optimization:**
Heights: [1, 8, 6, 2, 5, 4, 8, 3, 7]
[0,    1,       2,       3,    8]
left=0, right=8
area = min(1,7) × 8 = 8
left=1, right=8
area = min(8,7) × 7 = 49 ← BEST!
left=2, right=8
area = min(6,7) × 6 = 36
Continue until pointers meet...
Answer: 49

---

### 🧪 Practice Problems

**🟢 Easy**
1. Check if string is palindrome
2. Reverse a string using two pointers
3. Merge two sorted arrays
4. Check if array is sorted

**🟡 Medium**
5. Longest substring without repeating characters
6. Maximum average subarray of size k
7. Container with most water
8. Remove duplicates from sorted array
9. Two sum (sorted array) - find two numbers that sum to target
10. Valid palindrome (ignore non-alphanumeric characters)

**🔴 Hard**
11. Trapping rain water (LeetCode #42)
12. Minimum window substring
13. Longest substring with k distinct characters
14. Three sum (find three numbers that sum to 0) - uses two pointers with loop

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|-------------------|
| Forgetting to move pointers | Always increment/decrement in loop | Infinite loop otherwise! |
| Wrong pointer movement direction | For palindrome: left++, right-- | Opposite directions needed |
| Comparing wrong characters in palindrome | Use `charAt(left)` not `arr[left]` | Strings need charAt() |
| Not handling overlapping window correctly | Use `while (set.contains())` before adding | Prevents duplicates in set |
| Moving wrong pointer in container problem | Move pointer with SMALLER height | Moving taller won't increase area |
| Forgetting remaining elements after merge | Always add leftover from both arrays | Incomplete merge otherwise |
| Using >= instead of > in comparisons | Be precise with boundary conditions | Off-by-one errors happen |
| Not tracking the correct window size | For fixed window: use `j - i + 1` | Incorrect area calculation |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Sorting**: [Visualize Two Pointer Merge](https://visualgo.net/en/sorting)
- 📖 **GeeksforGeeks**: [Two Pointer Technique](https://www.geeksforgeeks.org/two-pointers-technique/)
- 📖 **LeetCode Problems**:
  - Valid Palindrome (#125)
  - Container with Most Water (#11)
  - Longest Substring Without Repeating (#3)
  - Merge Sorted Array (#88)
- 🎥 **YouTube**: "Two Pointer Technique Explained" - Code with Harry

---

### 📌 Key Takeaways

💡 **Two Pointers = O(n) instead of O(n²)** for many problems  
💡 **Opposite direction** for palindrome, merging, water trapping  
💡 **Same direction (slow/fast)** for duplicates, cycle detection  
💡 **Sliding window** expands/shrinks based on condition  
💡 **Fixed window** has constant size, slides linearly  
💡 **Greedy choice** in container problem: move smaller height pointer  
💡 **Always check boundaries** with <= or < to avoid off-by-one errors  

---

<!-- End of Day 6: Two Pointers -->


## Day 7: Recursion & Backtracking

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🟡 **Medium** | **File**: `Day7Recursion.java`

### 🎯 What You'll Learn
- Master the **Call Stack** and how recursion works internally
- Implement **Base Cases** and **Recursive Cases** correctly
- Solve problems using **Tail Recursion** vs **Tree Recursion**
- Calculate **Permutations & Combinations** using factorial recursion
- Implement **Merge Sort** - O(n log n) divide-and-conquer algorithm
- Master **Backtracking** with path counting in grids
- Understand trade-offs: recursion vs iteration (time, space, readability)

### 📚 Concepts Explained

#### What is Recursion?

**Recursion** is a technique where a function calls itself to solve smaller instances of the same problem until reaching a base case.
Every Recursive Function Must Have:
┌─────────────────────────────────────┐
│ 1. BASE CASE (Stop condition)      │
│    if (n == 0) return 0;           │
│                                     │
│ 2. RECURSIVE CASE (Progress toward base)
│    return n + func(n-1);           │
│                                     │
│ 3. TRUST THE RECURSION             │
│    Don't overthink; trust it works │
└─────────────────────────────────────┘

#### The Call Stack Visualization

When you call a recursive function, each call is **pushed** onto the call stack:
printDescending(5):
print 5
Call → printDescending(4)
print 4
Call → printDescending(3)
print 3
Call → printDescending(2)
print 2
Call → printDescending(1)
print 1
Call → printDescending(0)
BASE CASE! Return
Return
Return
Return
Return
Return
Output: 5 4 3 2 1

**Key Insight:** Functions are executed in **LIFO order** (Last-In-First-Out) - just like a stack! 📚

#### BEFORE & AFTER Pattern

When you have code BEFORE and AFTER the recursive call:

```java
public static void function(int n) {
    if (n == 0) return;
    
    System.out.println("BEFORE: " + n);  ← Executes DESCENDING
    function(n - 1);
    System.out.println("AFTER: " + n);   ← Executes ASCENDING
}

function(3):
BEFORE: 3
BEFORE: 2
BEFORE: 1
AFTER: 1
AFTER: 2
AFTER: 3
```

This is because the AFTER code is in the **return phase** of the call stack!

---

### 💻 Key Code Snippets

#### Learning the Call Stack
```java
public static int learningCallStack(int n) {
    if (n == 0) {
        return 0;
    }
    
    System.out.println("BEFORE: " + n);
    learningCallStack(n - 1);
    System.out.println("AFTER: " + n);
    
    return 0;
}

// Call: learningCallStack(3)
// Output:
// BEFORE: 3
// BEFORE: 2
// BEFORE: 1
// AFTER: 1
// AFTER: 2
// AFTER: 3
```

#### Print Descending (1 to N)
```java
public static int printDescending(int n) {
    // BASE CASE
    if (n == 0) {
        return 0;
    }
    
    System.out.println(n);                 // Print current
    return printDescending(n - 1);         // Recurse smaller
}

// printDescending(5) → Output: 5 4 3 2 1
// Time: O(n) | Space: O(n) call stack depth
```

#### Print Ascending (1 to N)
```java
public static int printAscending(int n, int i) {
    // BASE CASE: when i exceeds n, stop
    if (i == n + 1) {
        return 0;
    }
    
    System.out.println(i);                 // Print current
    return printAscending(n, i + 1);       // Increment and recurse
}

// printAscending(5, 1) → Output: 1 2 3 4 5
// Time: O(n) | Space: O(n)
```

#### Sum of N Natural Numbers
```java
public static int sumOfNaturalNumbers(int n) {
    // BASE CASE
    if (n == 0) {
        return 0;
    }
    
    // RECURSIVE CASE: n + sum of (n-1) natural numbers
    return n + sumOfNaturalNumbers(n - 1);
}

// sumOfNaturalNumbers(5) = 5 + 4 + 3 + 2 + 1 = 15
// Time: O(n) | Space: O(n)
```

**Trace:**
sum(5) = 5 + sum(4)
= 5 + (4 + sum(3))
= 5 + (4 + (3 + sum(2)))
= 5 + (4 + (3 + (2 + sum(1))))
= 5 + (4 + (3 + (2 + (1 + sum(0)))))
= 5 + (4 + (3 + (2 + (1 + 0))))
= 15

#### Factorial (n!)
```java
public static int factorial(int n) {
    // BASE CASE
    if (n == 0) {
        return 1;  // 0! = 1
    }
    
    // RECURSIVE CASE: n! = n × (n-1)!
    return n * factorial(n - 1);
}

// factorial(5) = 5 × 4 × 3 × 2 × 1 = 120
// Time: O(n) | Space: O(n)
```

#### Permutations P(n, r) = n! / (n-r)!
```java
public static void permutation(int n, int r) {
    // P(n, r) = n! / (n-r)!
    int num = factorial(n);           // Get n!
    int denom = factorial(n - r);     // Get (n-r)!
    System.out.println("Permutation = " + num / denom);
}

// Example: P(5, 3) = 5! / 2! = 120 / 2 = 60
// Meaning: Ways to arrange 3 items from 5
```

#### Combinations C(n, r) = n! / (r! × (n-r)!)
```java
public static void combination(int n, int r) {
    // C(n, r) = n! / (r! × (n-r)!)
    int num = factorial(n);
    int denom = factorial(r) * factorial(n - r);
    System.out.println("Combination = " + num / denom);
}

// Example: C(5, 3) = 5! / (3! × 2!) = 120 / 12 = 10
// Meaning: Ways to choose 3 items from 5 (order doesn't matter)
```

#### Merge Sort - Divide & Conquer
```java
public static void mergeSort(int[] arr, int left, int right) {
    // BASE CASE: single element is sorted
    if (left >= right) {
        return;
    }
    
    // DIVIDE: find middle
    int mid = left + (right - left) / 2;
    
    // CONQUER: recursively sort left half
    mergeSort(arr, left, mid);
    
    // CONQUER: recursively sort right half
    mergeSort(arr, mid + 1, right);
    
    // COMBINE: merge two sorted halves
    merge(arr, left, mid, right);
}

// Example: mergeSort([5, 1, 2, 3, 10, 4], 0, 5)
// Output: [1, 2, 3, 4, 5, 10]
// Time: O(n log n) | Space: O(n)
```

**Merge Sort Visualization:**
[5, 1, 2, 3, 10, 4]
Divide Phase:
├─ [5, 1, 2]
│  ├─ [5, 1]
│  │  ├─ [5]
│  │  └─ [1]
│  └─ [2]
└─ [3, 10, 4]
├─ [3, 10]
│  ├─ [3]
│  └─ [10]
└─ [4]
Merge Phase (Combining):
├─ [1, 5] (from [5] and [1])
├─ [2]
├─ [1, 2, 5]
├─ [3, 10]
├─ [4]
└─ [1, 2, 3, 4, 5, 10]

#### Backtracking - Count Paths in Grid
```java
public static int countTotalPaths(int i, int j, int n, int m) {
    // DEAD END: Out of bounds
    if (i == n || j == m) {
        return 0;
    }
    
    // DESTINATION: Reached bottom-right corner
    if (i == n - 1 && j == m - 1) {
        return 1;
    }
    
    // MOVE RIGHT
    int right = countTotalPaths(i, j + 1, n, m);
    
    // MOVE DOWN
    int down = countTotalPaths(i + 1, j, n, m);
    
    return right + down;
}

// countTotalPaths(0, 0, 4, 4) = 20
// (Number of ways to reach (3,3) from (0,0))
// Can only move RIGHT or DOWN
```

**4×4 Grid Paths Visualization:**
Grid: 4 rows × 4 cols
Start: (0,0) → End: (3,3)
Only moves: RIGHT or DOWN
Total Paths = 20
(This is a combinatorial problem: C(6, 3) = 20)
Explanation: You need exactly 3 rights and 3 downs = 6 moves total
Choose 3 positions for RIGHT = C(6,3) = 20

---

### 🔢 Complexity Analysis

| Problem | Time | Space | Type | Notes |
|---------|------|-------|------|-------|
| **Print N to 1** | O(n) | O(n) | Linear | Call stack depth = n |
| **Factorial** | O(n) | O(n) | Linear | Compute n! |
| **Merge Sort** | O(n log n) | O(n) | Divide-Conquer | Best sorting algorithm |
| **Count Paths** | O(2^(n+m)) | O(n+m) | Exponential | Can be optimized with DP |
| **Sum of N** | O(n) | O(n) | Linear | Simple recursion |
| **Permutation** | O(n) | O(n) | Linear | Factorial computation |
| **Combination** | O(n) | O(n) | Linear | Factorial computation |

---

### 🎨 Visual Examples

**Factorial Tree:**
fact(5)
├─ 5 * fact(4)
│   ├─ 4 * fact(3)
│   │   ├─ 3 * fact(2)
│   │   │   ├─ 2 * fact(1)
│   │   │   │   ├─ 1 * fact(0)
│   │   │   │   │   └─ BASE: return 1
│   │   │   │   └─ 1 * 1 = 1
│   │   │   └─ 2 * 1 = 2
│   │   └─ 3 * 2 = 6
│   └─ 4 * 6 = 24
└─ 5 * 24 = 120

**Merge Sort Tree:**
[5, 1, 2, 3, 10, 4]
|
┌───┴───┐
[5,1,2] [3,10,4]
|         |
┌─┴─┐     ┌─┴─┐
[5,1] [2] [3,10] [4]
|              |
┌─┴─┐          ┌─┴─┐
[5] [1]       [3][10]
Merge phase combines: [1,5,2] → [1,2,5]
Then merges: [1,2,5,3,4,10] → [1,2,3,4,5,10]

---

### 🧪 Practice Problems

**🟢 Easy**
1. Print numbers 1 to N
2. Print numbers N to 1
3. Calculate factorial of a number
4. Sum of first N natural numbers
5. Count digits in a number

**🟡 Medium**
6. Permutation P(n, r)
7. Combination C(n, r)
8. Merge sort implementation
9. Count paths in an N×M grid (only RIGHT and DOWN)
10. Power of a number: x^n

**🔴 Hard**
11. N-Queens problem (place N queens on N×N board)
12. Rat in Maze (find all paths with obstacles)
13. Word Search (find word in 2D grid)
14. Palindrome Partitioning (partition string into palindromes)
15. Sudoku Solver (using backtracking)

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|------------------|
| Forgetting base case | Always define stopping condition | Infinite recursion → Stack overflow! |
| Wrong base case | Base case must handle smallest input | Infinite loops or wrong answers |
| Not progressing toward base | Ensure recursion "shrinks" problem | Otherwise never reach base case |
| Modifying problem input by accident | Be careful with array/object mutations | Changes affect all recursive calls |
| Stack overflow on deep recursion | Use iteration for large N or optimize with DP | RecursionError for N > 1000 |
| Returning wrong value from base | Base case should return correct identity | Wrong initial value ruins result |
| Not understanding call stack order | BEFORE/AFTER tell you execution order | Code after call runs in RETURN phase |
| Using too much memory | Recursion uses O(n) stack space | Not efficient for very large N |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Sorting**: [Merge Sort Visualization](https://visualgo.net/en/sorting)
- 📖 **GeeksforGeeks**: [Recursion Guide](https://www.geeksforgeeks.org/recursion/)
- 📖 **Backtracking Patterns**: [Backtracking Explained](https://www.geeksforgeeks.org/backtracking-algorithms/)
- 💡 **LeetCode Problems**:
  - Merge Intervals (#56)
  - Generate Parentheses (#22)
  - Permutations (#46)
  - Combinations (#77)
  - Sudoku Solver (#37)
  - N-Queens (#51)
- 🎥 **YouTube**: "Recursion & Backtracking Explained" - Abdul Bari

---

### 📌 Key Takeaways

💡 **Every recursive function needs a base case** — or infinite recursion!  
💡 **BEFORE/AFTER pattern** reveals call stack order — one descends, one ascends  
💡 **Merge Sort = O(n log n)** — Divide-and-conquer is powerful  
💡 **Backtracking = Recursion + Constraint checking** — Try all paths smartly  
💡 **Call stack depth = recursion depth** — Watch memory on deep recursions  
💡 **Trust the recursion!** — Solve the smaller problem; it will work  
💡 **Recursion vs Iteration** — Recursion is elegant but uses more memory  
💡 **Permutation (ordered) vs Combination (unordered)** — Know the difference for counting problems!

<!-- End of Day 7: Recursion -->

---

## Day 8: Trees & Binary Trees

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🔴 **Hard** | **File**: `Day8Recursion.java` & `Day8BT.java`

### 🎯 What You'll Learn
- Understand **Tree Data Structure** and terminology (root, leaf, parent, child)
- Master **Binary Trees** and how to construct them from arrays
- Implement **Tree Traversals**: Inorder, Preorder, and Postorder
- Solve **Spiral Matrix** problem using recursion with boundary tracking
- Build trees from **array representation** with -1 as null marker
- Understand **Recursion in Trees** - DFS (Depth-First Search)
- Calculate tree properties: height, diameter, path sum

### 📚 Concepts Explained

#### What is a Tree?

A **Tree** is a hierarchical data structure consisting of **nodes** connected by **edges**. Each node has:
- **Data**: The value stored
- **Children**: References to child nodes (0 or more)
   1 (Root - no parent)
  / \
 2   3
/ \
4   5
/
6 (Leaf - no children)

Terminology:

Root: Node with no parent (1)
Leaf: Node with no children (6, 3, 5)
Parent: Node with children (1, 2)
Child: Node with parent (2, 3, 4, 5, 6)
Height: Longest path from root to leaf
Depth: Distance from root
Edge: Connection between nodes

#### Binary Tree

A **Binary Tree** is a tree where each node has **at most 2 children** (left and right).
   1
  / \
 2   3  ← Binary (≤ 2 children per node)
/ \
4 5

NOT Binary: 1 /|
2 3 4 ← 3 children! Not binary


**Node Structure:**
```java
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

#### Tree Representation as Array

Trees can be represented as arrays where **-1 represents null**:
Array: [5, 3, -1, 8, -1, -1, 2, 1, -1, -1, 5, -1, -1]

Preorder traversal builds the tree: 5 (root) /
3 2 /
1 5


**Indexing Pattern (for complete binary trees):**
For node at index i:

Left child: index 2*i + 1
Right child: index 2*i + 2
Parent: index (i-1)/2

#### Tree Traversals - The Big Three

**1. Inorder (Left → Root → Right)**
Process sequence: Left subtree → Current node → Right subtree Useful for: Getting sorted output from BST Example tree: 2 /
1 3

Inorder: 1 2 3 ← Sorted!


**2. Preorder (Root → Left → Right)**
Process sequence: Current node → Left subtree → Right subtree Useful for: Copying tree, creating tree from array Example tree: 2 /
1 3

Preorder: 2 1 3 ← Root first!


**3. Postorder (Left → Right → Root)**
Process sequence: Left subtree → Right subtree → Current node Useful for: Deleting tree, calculating heights Example tree: 2 /
1 3

Postorder: 1 3 2 ← Root last!


**Visualization:**
  A
 / \
B   C
/
D E

Inorder:   D B E A C  (Left-Root-Right)
Preorder:  A B D E C  (Root-Left-Right)
Postorder: D E B C A  (Left-Right-Root)


#### Spiral Matrix Traversal

Traverse a 2D matrix in **spiral order** (clockwise from outside to inside):
Input Matrix:
1  2  3  5
8  9  4  65
7  6  5  11
87 56 15 110

Spiral Order:
1 → 2 → 3 → 5 → 65 → 11 → 110 → 15 → 56 → 87 → 7 → 8 → 9 → 4 → 6 → 5

Steps:

Traverse right (top row)
Traverse down (right column)
Traverse left (bottom row)
Traverse up (left column)
Shrink boundaries and repeat

---

### 💻 Key Code Snippets

#### Node Class Definition
```java
public class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

#### Create Tree from Array
```java
int i = -1;  // Global index tracker

public Node createTree(int[] nodes) {
    i++;
    
    // BASE CASE: -1 represents null/missing node
    if (nodes[i] == -1) {
        return null;
    }
    
    // Create node with current value
    Node newNode = new Node(nodes[i]);
    
    // Recursively create left subtree
    newNode.left = createTree(nodes);
    
    // Recursively create right subtree
    newNode.right = createTree(nodes);
    
    return newNode;
}

// Example:
// Array: [5, 3, -1, 8, -1, -1, 2, 1, -1, -1, 5, -1, -1]
// Creates preorder tree structure
```

**How it works:**
Array: [5, 3, -1, 8, -1, -1, 2, 1, -1, -1, 5, -1, -1]
Index: 0  1   2  3   4   5  6  7   8   9 10  11  12

i=0: nodes[0]=5 → Create node 5
i=1: nodes[1]=3 → Create left child 3
i=2: nodes[2]=-1 → left.left = null
i=3: nodes[3]=8 → Create left.right 8
i=4: nodes[4]=-1 → null
i=5: nodes[5]=-1 → null
i=6: nodes[6]=2 → Create right child 2
i=7: nodes[7]=1 → Create right.left 1
i=8: nodes[8]=-1 → null
i=9: nodes[9]=-1 → null
i=10: nodes[10]=5 → Create right.right 5
i=11: nodes[11]=-1 → null
i=12: nodes[12]=-1 → null

Result Tree: 5 /
3 2 \ /
8 1 5


#### Inorder Traversal (Left → Root → Right)
```java
public void inOrder(Node root) {
    // BASE CASE
    if (root == null) {
        return;
    }
    
    inOrder(root.left);           // Process left subtree
    System.out.print(root.data + " ");  // Process current node
    inOrder(root.right);          // Process right subtree
}

// Time: O(n) - Visit each node once
// Space: O(h) - Call stack depth = height
```

**Example:**
Tree: 2 /
1 3

Execution:
inOrder(2)
→ inOrder(1)
→ inOrder(null) → return
→ print 1
→ inOrder(null) → return
→ print 2
→ inOrder(3)
→ inOrder(null) → return
→ print 3
→ inOrder(null) → return

Output: 1 2 3


#### Preorder Traversal (Root → Left → Right)
```java
public void preOrder(Node root) {
    // BASE CASE
    if (root == null) {
        return;
    }
    
    System.out.print(root.data + " ");  // Process current node
    preOrder(root.left);          // Process left subtree
    preOrder(root.right);         // Process right subtree
}

// Time: O(n) | Space: O(h)
```

**Example:**
Tree: 2 /
1 3

Execution:
preOrder(2)
→ print 2 (root first!)
→ preOrder(1)
→ print 1
→ preOrder(null) → return
→ preOrder(null) → return
→ preOrder(3)
→ print 3
→ preOrder(null) → return
→ preOrder(null) → return

Output: 2 1 3


#### Postorder Traversal (Left → Right → Root)
```java
public void postOrder(Node root) {
    // BASE CASE
    if (root == null) {
        return;
    }
    
    postOrder(root.left);         // Process left subtree
    postOrder(root.right);        // Process right subtree
    System.out.print(root.data + " ");  // Process current node
}

// Time: O(n) | Space: O(h)
```

**Example:**
Tree: 2 /
1 3

Execution:
postOrder(2)
→ postOrder(1)
→ postOrder(null) → return
→ postOrder(null) → return
→ print 1
→ postOrder(3)
→ postOrder(null) → return
→ postOrder(null) → return
→ print 3
→ print 2 (root last!)

Output: 1 3 2


#### Spiral Matrix Traversal
```java
public static void spiralMatrix(int[][] mat, int left, int right, int top, int bottom) {
    
    // BASE CASE: No more rows or columns to process
    if (top > bottom || left > right) {
        return;
    }
    
    // STEP 1: Traverse right along top row
    for (int i = left; i <= right; i++) {
        System.out.print(mat[top][i] + " ");
    }
    
    // STEP 2: Traverse down along right column
    for (int i = top + 1; i <= bottom; i++) {
        System.out.print(mat[i][right] + " ");
    }
    
    // STEP 3: Traverse left along bottom row (if it exists)
    for (int i = right - 1; i >= left; i--) {
        System.out.print(mat[bottom][i] + " ");
    }
    
    // STEP 4: Traverse up along left column (if it exists)
    for (int i = bottom - 1; i > top; i--) {
        System.out.print(mat[i][left] + " ");
    }
    
    // STEP 5: Recursively process inner matrix
    spiralMatrix(mat, left + 1, right - 1, top + 1, bottom - 1);
}

// Example:
// Matrix:
// 1  2  3  5
// 8  9  4  65
// 7  6  5  11
// 87 56 15 110
//
// Output: 1 2 3 5 65 11 110 15 56 87 7 8 9 4 6 5
// Time: O(n×m) | Space: O(n×m) recursion stack
```

**Spiral Visualization:**
Matrix dimensions: 4×4
Initial: left=0, right=3, top=0, bottom=3

Round 1:
→ → → →  (top row, left to right)
↓
↓
↓
← ← ← ←  (bottom row, right to left)
↑
↑
(left column, bottom to top)

After shrinking: left=1, right=2, top=1, bottom=2

Round 2:
→ →
← ←
...continues until boundaries cross


---

### 🔢 Complexity Analysis

| Operation | Time | Space | Notes |
|-----------|------|-------|-------|
| **Create Tree from Array** | O(n) | O(n) | Process each element once |
| **Inorder Traversal** | O(n) | O(h) | Visit each node once |
| **Preorder Traversal** | O(n) | O(h) | Visit each node once |
| **Postorder Traversal** | O(n) | O(h) | Visit each node once |
| **Spiral Matrix** | O(n×m) | O(n×m) | Visit each cell once |
| **Tree Height** | O(n) | O(h) | Worst: O(n) for skewed tree |
| **Search in Tree** | O(n) | O(h) | No order guarantee |

**h = height, n = number of nodes, n×m = matrix dimensions**

---

### 🎨 Visual Examples

**Tree Construction from Array:**
Array: [1, 2, 3, 4, 5, -1, 6]

Building process (preorder):
Index 0: Create 1 (root)
Index 1: Create 2 (left of 1)
Index 2: Create 3 (right of 1)
Index 3: Create 4 (left of 2)
Index 4: Create 5 (right of 2)
Index 5: Skip -1 (null)
Index 6: Create 6 (right of 3)

Result: 1 /
2 3 / \
4 5 6


**All Three Traversals Compared:**
Tree: A /
B C /
D E

Inorder:   D B E A C  ← Good for BST sorted output
Preorder:  A B D E C  ← Root comes first
Postorder: D E B C A  ← Root comes last

Use each for:

Inorder: Get sorted sequence from BST
Preorder: Copy tree, serialize for storage
Postorder: Delete tree bottom-up, calculate heights

**Spiral Matrix Step-by-Step:**
Original 4×4:
1  2  3  5
8  9  4  65
7  6  5  11
87 56 15 110

Direction sequence:
1 → 2 → 3 → 5 ↓
65
11
110 ← 15 ← 56 ← 87
↑
7
8
9 → 4 → 6 → 5

Result: 1 2 3 5 65 11 110 15 56 87 7 8 9 4 6 5


---

### 🧪 Practice Problems

**🟢 Easy**
1. Build binary tree from array (preorder)
2. Implement inorder traversal
3. Implement preorder traversal
4. Implement postorder traversal
5. Count total nodes in tree

**🟡 Medium**
6. Spiral matrix traversal
7. Find height of binary tree
8. Find maximum value in tree
9. Level-order traversal (BFS)
10. Diameter of binary tree (longest path)

**🔴 Hard**
11. Serialize and deserialize binary tree
12. Lowest Common Ancestor (LCA)
13. Maximum path sum in tree
14. Construct tree from inorder and preorder
15. Flatten binary tree to linked list

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|------------------|
| Forgetting to handle null nodes | Always check `if (root == null)` first | Null pointer exception otherwise |
| Confusing traversal orders | Remember: **In**-order (left-root-right), **Pre**-order (root-left-right), **Post**-order (left-right-root) | Wrong order = wrong output |
| Array index out of bounds in spiral | Check boundaries: `if (top > bottom || left > right)` | ArrayIndexOutOfBounds error |
| Global index not reset | Declare `i` as class variable, reset before building new tree | Index carries over, builds wrong tree |
| Forgetting -1 as null marker | Check `if (nodes[i] == -1) return null;` | Will create nodes with -1 data |
| Wrong recursion order in array builder | Left subtree, then right subtree (preorder) | Tree structure completely wrong |
| Off-by-one errors in spiral directions | `right - 1` for left traversal, `bottom - 1` for up | Skips or duplicates elements |
| Not understanding call stack depth | Recursion depth = tree height | Stack overflow on very deep trees |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Binary Tree**: [Tree Traversal Visualization](https://visualgo.net/en/bst)
- 📖 **GeeksforGeeks**: [Binary Tree Traversals](https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/)
- 📖 **Binary Trees Explained**: [Complete Guide](https://www.geeksforgeeks.org/binary-tree-data-structure/)
- 💡 **LeetCode Problems**:
  - Binary Tree Inorder Traversal (#94)
  - Binary Tree Preorder Traversal (#144)
  - Binary Tree Postorder Traversal (#145)
  - Spiral Matrix (#54)
  - Level Order Traversal (#102)
- 🎥 **YouTube**: "Binary Trees & Traversals Explained" - Abdul Bari

---

### 📌 Key Takeaways

💡 **Binary Tree = At most 2 children per node** — Forms hierarchical structure  
💡 **Three traversals serve different purposes** — Choose based on what you need  
💡 **Inorder gives sorted output from BST** — Left-Root-Right is the magic order  
💡 **Array representation with -1 for null** — Compact way to define trees  
💡 **Spiral traversal = 4 directions + recursion** — Break matrix into layers  
💡 **Recursion depth = tree height** — Watch for stack overflow on deep trees  
💡 **Preorder for copying, Postorder for deleting** — Order matters!  
💡 **Time complexity is always O(n)** — Must visit every node at least once  

---

<!-- End of Day 8: BT -->


## Day 9: Binary Search Trees

**Status**: 🔴 **COMPLETED** | **Difficulty**: 🔴 **Hard** | **File**: `Day9BST.java`

### 🎯 What You'll Learn
- Understand **BST Property**: Left < Root < Right
- Implement **Insert** operation maintaining BST property
- Implement **Search** operation with O(log n) efficiency
- Implement **Delete** operation (0 children, 1 child, 2 children cases)
- Master **In-Order Successor** for deletion
- Traverse BST using **Level-Order (BFS)** with Queue
- Compare BST vs Binary Tree performance


### 📚 Key Concepts

#### BST Property
Every node must satisfy:
All values in LEFT subtree < Node value < All values in RIGHT subtree

**Valid BST:**
  20
 /  \
16    23
/ 
10  18

**Invalid (Not BST):**
  20
 /  \
25    15  ❌ 25 > 20 (left child > parent)

#### 4 Main Operations

1. **Insert** - Add node maintaining BST property: O(log n) average, O(n) worst
2. **Search** - Find node efficiently: O(log n) average, O(n) worst
3. **Delete** - Remove node with 3 cases: O(log n) average, O(n) worst
4. **Traversal** - Visit all nodes: O(n)

#### Delete Operation - 3 Cases

**Case 1: No Children (Leaf Node)**
Delete 10 from:    20              20
/  \    →       /  
16    23        16    23
/  \            /
10  18          18
Simply return null (remove node)

**Case 2: One Child**
Delete 16 from:    20              20
/  \    →       /  
16    23        18    23

18
Return the child (skip the node)

**Case 3: Two Children (Hardest)**
Delete 16 from:    20                20
/  \      →       /  
16    23        18    23
/  \           /  
10  18         10   19
Step 1: Find In-Order Successor (IOS) of 16
IOS = smallest node in RIGHT subtree = 18
Step 2: Replace 16's data with 18's data
Step 3: Delete the IOS node (which has 0 or 1 child)

#### In-Order Successor
The **smallest node in the right subtree** of a node is its In-Order Successor.

```java
public Node inOrderSuccessor(Node root) {
    while (root.left != null) {
        root = root.left;  // Keep going left to find smallest
    }
    return root;
}
```

### 💻 Key Code Snippets

#### Insert Operation
```java
public Node insert(int data, Node root) {
    if (root == null) {
        return new Node(data);  // Found position, create new node
    }
    
    if (data < root.data) {
        root.left = insert(data, root.left);     // Go left
    } else {
        root.right = insert(data, root.right);   // Go right
    }
    
    return root;
}
// Time: O(log n) average, O(n) worst (skewed tree)
// Space: O(h) recursion stack
```

#### Search Operation
```java
public boolean searchKey(Node root, int target) {
    if (root == null) {
        return false;  // Not found
    }
    
    if (target < root.data) {
        return searchKey(root.left, target);      // Search left
    } else if (target > root.data) {
        return searchKey(root.right, target);     // Search right
    } else {
        return true;  // Found!
    }
}
// Time: O(log n) average, O(n) worst
// Space: O(h) recursion stack
```

#### Delete Operation (Complete)
```java
public Node deleteNode(Node root, int val) {
    
    // Find the node to delete
    if (val > root.data) {
        root.right = deleteNode(root.right, val);  // Go right
    } else if (val < root.data) {
        root.left = deleteNode(root.left, val);    // Go left
    } else { 
        // Found node to delete
        
        // Case 1: No children (leaf node)
        if (root.left == null && root.right == null) {
            return null;
        }
        
        // Case 2: One child (left only)
        if (root.left == null) {
            return root.right;
        } 
        
        // Case 2: One child (right only)
        if (root.right == null) {
            return root.left;
        }
        
        // Case 3: Two children
        Node IOS = inOrderSuccessor(root.right);    // Find IOS
        root.data = IOS.data;                        // Replace data
        root.right = deleteNode(root.right, IOS.data); // Delete IOS
    }
    return root;
}
// Time: O(log n) average, O(n) worst
// Space: O(h) recursion stack
```

#### Level-Order Traversal (BFS)
```java
public void levelOrderBfs(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    
    while (!q.isEmpty()) {
        int qSize = q.size();
        
        for (int i = 0; i < qSize; i++) {
            Node current = q.poll();
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                q.offer(current.left);
            }
            if (current.right != null) {
                q.offer(current.right);
            }
        }
        System.out.println();  // New line for each level
    }
}
// Time: O(n) | Space: O(w) where w = max width
```

### 🔢 Complexity Comparison

| Operation | Average | Worst (Skewed) | Notes |
|-----------|---------|----------------|-------|
| **Insert** | O(log n) | O(n) | Balanced vs linear chain |
| **Search** | O(log n) | O(n) | Binary elimination |
| **Delete** | O(log n) | O(n) | Find node + handle 3 cases |
| **Traversal** | O(n) | O(n) | Must visit all nodes |
| **Space** | O(log n) | O(n) | Recursion stack depth |

**Why worst case is O(n)?**
If tree becomes skewed (all right children, like a linked list), every operation scans all n nodes!

### 🎨 Visual Examples

**Insert Sequence:**
Insert 20 → 16 → 23 → 10 → 18
Step 1: Insert 20
20
Step 2: Insert 16 (16 < 20, go left)
20
/
16
Step 3: Insert 23 (23 > 20, go right)
20
/  
16    23
Step 4: Insert 10 (10 < 20, go left; 10 < 16, go left)
20
/  
16    23
/
10
Step 5: Insert 18 (18 < 20, go left; 18 > 16, go right)
20
/  
16    23
/  
10   18

**Search Trace:**
Search for 18 in:    20
/  
16    23
/  
10   18
Start at 20:
18 < 20? YES → Go LEFT to 16
18 < 16? NO
18 > 16? YES → Go RIGHT to 18
18 == 18? YES → Found! Return true

**Delete with 2 Children:**
Delete 16:           20              20
/  \            /  
16    23   →    18    23
/  \           /  
10   18        10   19

19
Step 1: Find IOS of 16 (smallest in right subtree)
Start at 18, go left → 18 is smallest
IOS = 18
Step 2: Replace 16 with 18
Now tree has 18 instead of 16
Step 3: Delete node 18 from right subtree
18 has right child 19, so recursively delete 18
Return 19 as new right child

### 🧪 Practice Problems

**🟢 Easy**
1. Insert elements into BST
2. Search for an element in BST
3. In-order traversal of BST (should be sorted)
4. Find minimum and maximum elements

**🟡 Medium**
5. Delete node with no children
6. Delete node with one child
7. Delete node with two children
8. Find kth smallest element in BST
9. Validate if tree is a valid BST
10. Level-order traversal with levels

**🔴 Hard**
11. Lowest Common Ancestor (LCA) of two nodes
12. BST Iterator (in-order sequence)
13. Recover BST (two nodes swapped, restore it)
14. Count BSTs (how many structurally different BSTs?)
15. Merge two BSTs

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution | 💭 Why It Matters |
|-----------|-----------|------------------|
| Inserting without recursion assignment | Do `root.left = insert(...)` not just `insert(...)` | Node never actually connects to tree |
| Wrong IOS selection for delete | Always pick smallest in RIGHT subtree, not left | Picks wrong successor, breaks order |
| Not handling all 3 delete cases | Always check: 0 children, 1 child, 2 children | Incomplete deletion causes crashes |
| Skewed tree (all right or left) | Can't fix in deletion, but be aware O(n) possible | Performance degrades to linked list |
| Returning root after modifications | Always return root/modified node | Loss of reference, tree disconnects |
| Queue empty error in BFS | Always check `!q.isEmpty()` before `q.poll()` | NoSuchElementException |
| Forgetting to reset recursion variable | Each call should be independent | State carries over incorrectly |

### 🔗 External Resources

- 📺 **VisuAlgo - BST**: [Interactive BST Visualization](https://visualgo.net/en/bst)
- 📖 **GeeksforGeeks - BST**: [Complete BST Guide](https://www.geeksforgeeks.org/binary-search-tree-data-structure/)
- 💡 **LeetCode Problems**:
  - Validate BST (#98)
  - Delete Node in BST (#450)
  - Lowest Common Ancestor (#235)
  - Kth Smallest Element (#230)
  - Recover BST (#99)
- 🎥 **YouTube**: "BST Operations Explained" - Abdul Bari

### 📌 Key Takeaways

💡 **BST Property must be maintained** — Left < Root < Right at ALL levels  
💡 **Search is O(log n) because you eliminate half** — Binary elimination power!  
💡 **Delete has 3 cases** — Leaf, 1 child, 2 children; each handled differently  
💡 **In-Order Successor is smallest in right subtree** — Key to 2-child deletion  
💡 **Skewed tree = O(n) performance** — Know the worst case!  
💡 **BFS uses Queue** — Level-by-level traversal  
💡 **Self-balancing BSTs (AVL, RB-trees)** — Prevent skewing (advanced topic)  

---

<!-- End of Day 9: BST -->

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
