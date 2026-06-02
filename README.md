# 🚀 Java Data Structures & Algorithms - VCE Semester 1

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=java)
![Level](https://img.shields.io/badge/Level-Intermediate-yellow?style=flat-square)
![Course](https://img.shields.io/badge/Course-VCE%204th%20Yr%20Sem%201-blue?style=flat-square)
![Days](https://img.shields.io/badge/Duration-12%20Days-brightgreen?style=flat-square)
![Status](https://img.shields.io/badge/Status-In%20Progress%20🔄-orange?style=flat-square)

> **Welcome to the 12-day journey of mastering Data Structures & Algorithms in Java!** 🎯
> 
> This repository is your complete companion for understanding how data is organized, how algorithms manipulate it, and why this matters in real-world software engineering. By the end of Day 12, you'll have hands-on experience with the most fundamental DSA concepts that form the backbone of technical interviews and efficient software design.

---

## 📚 Quick Navigation

| Status | Day | Topic | Difficulty | File |
|--------|-----|-------|-----------|------|
| 🔴 Done | **Day 1** | [Singly Linked List](#day-1-singly-linked-list) | 🟢 Easy | `Day1LL.java` |
| 🔴 Done | **Day 2** | [Doubly & Circular LL](#day-2-doubly--circular-linked-lists) | 🟡 Medium | `Day2DLL.java` |
| ⚪ Coming | **Day 3-4** | [Stacks](#day-3-4-stacks) | 🟡 Medium | `Day3Stack.java` |
| ⚪ Coming | **Day 5-6** | [Queues](#day-5-6-queues) | 🟡 Medium | `Day5Queue.java` |
| ⚪ Coming | **Day 7-9** | [Trees & BST](#day-7-9-trees--binary-search-trees) | 🔴 Hard | `Day7Tree.java` |
| ⚪ Coming | **Day 10-11** | [Graphs](#day-10-11-graphs) | 🔴 Hard | `Day10Graph.java` |
| ⚪ Coming | **Day 12** | [Dynamic Programming](#day-12-dynamic-programming) | 🔴 Hard | `Day12DP.java` |

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
Day 1: Singly LL       ├──────► Day 5: Queues         ├──────► Day 10: Graphs
Day 2: Doubly/Circ LL  ├──────► Day 6: Circular Q    │         Day 11: Graph Algorithms
Day 3: Stacks         ├──────► Day 7: BST            │         Day 12: Dynamic Programming
Day 4: Stack Apps     └──────► Day 8-9: Tree Traversals
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

## Day 3-4: Stacks

**Status**: ⚪ **COMING SOON** | **Difficulty**: 🟡 **Medium** | **File**: `Day3Stack.java`

### 🎯 What You'll Learn
- Understand **LIFO (Last In First Out)** principle
- Implement stacks using arrays and linked lists
- Master **push, pop, peek** operations
- Solve classic problems: balanced parentheses, undo/redo, function call stack
- Analyze real-world applications

### 📚 Concepts Explained

#### What is a Stack?

Imagine a **stack of plates**: You add plates on top and remove from the top. Last plate you put is first one you take out.

```
       TOP
        ↓
    ┌───────┐
    │   D   │  ← Pop takes this
    ├───────┤
    │   C   │
    ├───────┤
    │   B   │
    ├───────┤
    │   A   │  ← Push adds here
    └───────┘
   BOTTOM (First pushed)

Operations:
- Push: Add to top
- Pop: Remove from top
- Peek: See top without removing
- isEmpty: Check if empty
```

**Real-World Examples:**
- 🔙 Browser back button (undo history)
- 📞 Function call stack in programs
- 📋 Expression evaluation (infix → postfix)
- 🎮 Game undo/redo systems

---

### 💻 Key Operations

#### Push (Add Element)
```java
public void push(int data) {
    // Time: O(1) | Space: O(1)
    Node newNode = new Node(data);
    if (top == null) {
        top = newNode;
    } else {
        newNode.next = top;
        top = newNode;
    }
}
```

#### Pop (Remove Element)
```java
public int pop() {
    // Time: O(1) | Space: O(1)
    if (top == null) {
        throw new EmptyStackException();
    }
    int data = top.data;
    top = top.next;  // Move top pointer
    return data;
}
```

#### Peek (View Top)
```java
public int peek() {
    // Time: O(1) | Space: O(1)
    if (top == null) {
        throw new EmptyStackException();
    }
    return top.data;
}
```

---

### 🔢 Complexity Table

| Operation | Time | Space | Notes |
|-----------|------|-------|-------|
| **Push** | O(1) | O(1) | Always add to top |
| **Pop** | O(1) | O(1) | Always remove from top |
| **Peek** | O(1) | O(1) | Just look, don't modify |
| **Search** | O(n) | O(1) | Must scan from top |

---

### 🎨 Example: Balanced Parentheses

**Problem**: Check if brackets are balanced: `{[()]}` ✅ vs `{[(])}` ❌

```
Input: "{[()]}"

Step 1: Push '{'     Stack: ['{']
Step 2: Push '['     Stack: ['{', '[']
Step 3: Push '('     Stack: ['{', '[', '(']
Step 4: See ')', Pop and match  ✓  Stack: ['{', '[']
Step 5: See ']', Pop and match  ✓  Stack: ['{']
Step 6: See '}', Pop and match  ✓  Stack: []

Result: BALANCED! ✅
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Implement a stack and test push/pop operations
2. Reverse a string using a stack
3. Check if parentheses are balanced

**🟡 Medium**
4. Evaluate postfix expressions
5. Convert infix to postfix notation
6. Implement min/max stack (track minimum element efficiently)

**🔴 Hard**
7. Largest rectangle in histogram
8. Trapping rain water problem

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution |
|-----------|-----------|
| Pop from empty stack | Check `isEmpty()` before popping |
| Forgetting to update top pointer | Update `top` when push/pop |
| Confusing stack with queue | Stack = LIFO (top/bottom), Queue = FIFO (front/rear) |

---

### 🔗 External Resources

- 📺 **VisuAlgo - Stack**: [Interactive Stack Visualization](https://visualgo.net/en/stack)
- 🎥 **YouTube**: "Stack Data Structure" - Code With Harry
- 📖 **GeeksforGeeks**: Stack implementation tutorials

---

## Day 5-6: Queues

**Status**: ⚪ **COMING SOON** | **Difficulty**: 🟡 **Medium** | **File**: `Day5Queue.java`

### 🎯 What You'll Learn
- Understand **FIFO (First In First Out)** principle
- Implement simple, circular, and double-ended queues
- Master **enqueue, dequeue, peek** operations
- Real-world applications: print queues, process scheduling, BFS
- Optimize queue performance with circular buffers

### 📚 Concepts Explained

#### What is a Queue?

Like a **line at a store**: First person in line is first to checkout. Last person in line is last to checkout.

```
        REAR (add here)
            ↓
    ┌───────────────┐
    │ C │ B │ A │   │  ← A leaves first (FRONT)
    └───────────────┘
            ↑
        FRONT (remove here)

LIFO? NO! We remove from FRONT, add to REAR
(A, B, C) → Order: A exits, then B, then C
```

**Real-World Applications:**
- 🖨️ Print queue (print jobs processed in order)
- 🎫 Ticket counter (first come, first served)
- 🚶 BFS graph traversal
- 📞 Customer service queues

---

### 💻 Key Operations

#### Enqueue (Add to Rear)
```java
public void enqueue(int data) {
    // Time: O(1) | Space: O(1)
    Node newNode = new Node(data);
    if (rear == null) {
        front = rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }
}
```

#### Dequeue (Remove from Front)
```java
public int dequeue() {
    // Time: O(1) | Space: O(1)
    if (front == null) {
        throw new EmptyQueueException();
    }
    int data = front.data;
    front = front.next;
    if (front == null) rear = null;  // Queue empty
    return data;
}
```

---

### 🎨 Visual Example

```
Start: Empty
    FRONT: null
    REAR: null

Enqueue 10:
    FRONT: ┌──────┐
           │ 10   │
           └──────┘
           REAR: ┌──────┐

Enqueue 20:
    FRONT: ┌──────┐    ┌──────┐
           │ 10   │───►│ 20   │
           └──────┘    └──────┘
           REAR: ┌──────┐

Enqueue 30:
    FRONT: ┌──────┐    ┌──────┐    ┌──────┐
           │ 10   │───►│ 20   │───►│ 30   │
           └──────┘    └──────┘    └──────┘
           REAR: ┌──────┐

Dequeue (removes 10):
    FRONT: ┌──────┐    ┌──────┐
           │ 20   │───►│ 30   │
           └──────┘    └──────┘
```

---

### 🔢 Complexity Table

| Operation | Time | Notes |
|-----------|------|-------|
| **Enqueue** | O(1) | Add to rear (if tracking tail) |
| **Dequeue** | O(1) | Remove from front |
| **Peek** | O(1) | Just look at front |

---

### 🧪 Practice Problems

**🟢 Easy**
1. Implement a simple queue
2. Implement a circular queue
3. Print queue elements in order

**🟡 Medium**
4. Implement a deque (double-ended queue)
5. Reverse elements of a queue
6. Implement queue using two stacks

**🔴 Hard**
7. Sliding window maximum problem
8. First unique character in a stream

---

## Day 7-9: Trees & Binary Search Trees

**Status**: ⚪ **COMING SOON** | **Difficulty**: 🔴 **Hard** | **File**: `Day7Tree.java`

### 🎯 What You'll Learn
- Understand tree terminology and properties
- Implement **Binary Search Tree (BST)** from scratch
- Master all **tree traversals**: inorder, preorder, postorder, level-order
- Solve tree problems: find height, check balance, LCA (Lowest Common Ancestor)
- Analyze why BSTs are fundamental in computer science

### 📚 Concepts Explained

#### What is a Tree?

A **hierarchical data structure** where data is organized in branches (think of an upside-down real tree).

```
           ROOT (No parent)
            ↙ ↘
         /        \
       Node1      Node2
       ↙   ↘      ↙   ↘
      N3   N4    N5   N6  ← Leaves (no children)

Key Terms:
- Parent: Node with children
- Child: Node with a parent
- Leaf: Node with no children
- Height: Longest path from root to leaf
- Depth: Path from root to a specific node
```

---

#### Binary Search Tree (BST)

A special tree where:
- ✅ Each node has **at most 2 children** (left & right)
- ✅ **Left child < Parent < Right child** (ordering property!)
- ✅ Perfect for fast searching!

```
         50  ← ROOT
        ↙  ↘
       30   70
      ↙  ↘  ↙
    20  40 60

Why it's awesome:
- Search: Start at root, go left if target < current, right if target > current
- This gives us O(log n) search! (like binary search)
```

---

### 💻 Key Operations

#### Insert into BST
```java
public void insert(int data) {
    // Time: O(log n) average | O(n) worst case (unbalanced)
    // Space: O(log n) recursion depth
    
    if (root == null) {
        root = new Node(data);
    } else {
        insertHelper(root, data);
    }
}

private void insertHelper(Node node, int data) {
    if (data < node.data) {
        if (node.left == null) {
            node.left = new Node(data);
        } else {
            insertHelper(node.left, data);
        }
    } else {
        if (node.right == null) {
            node.right = new Node(data);
        } else {
            insertHelper(node.right, data);
        }
    }
}
```

---

### 🎨 Tree Traversals

**Inorder (Left → Root → Right)** - Gives sorted output!
```
Tree:        50
           ↙    ↘
         30      70
        ↙  ↘    ↙
       20  40  60

Inorder: 20 → 30 → 40 → 50 → 60 → 70  ← SORTED! 🎯
```

**Preorder (Root → Left → Right)** - Good for copying tree
```
Preorder: 50 → 30 → 20 → 40 → 70 → 60
```

**Postorder (Left → Right → Root)** - Good for deletion
```
Postorder: 20 → 40 → 30 → 60 → 70 → 50
```

**Level-order (BFS)** - Process level by level
```
Level 0: 50
Level 1: 30, 70
Level 2: 20, 40, 60
```

---

### 🔢 Complexity Table

| Operation | Time (Balanced) | Time (Unbalanced) | Space |
|-----------|-----------------|------------------|-------|
| **Search** | O(log n) ⚡ | O(n) 😞 | O(1) |
| **Insert** | O(log n) ⚡ | O(n) 😞 | O(log n) |
| **Delete** | O(log n) ⚡ | O(n) 😞 | O(log n) |
| **Traversal** | O(n) | O(n) | O(h) |

---

### 🧪 Practice Problems

**🟢 Easy**
1. Insert values into BST and traverse inorder
2. Find minimum and maximum element
3. Search for a value in BST

**🟡 Medium**
4. Check if a tree is balanced
5. Find Lowest Common Ancestor (LCA) of two nodes
6. Level-order traversal (BFS)

**🔴 Hard**
7. Validate BST (ensure it follows BST properties)
8. Convert sorted array to balanced BST
9. Kth smallest element in BST

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution |
|-----------|-----------|
| Confusing tree with graph | Trees = no cycles, Graphs = can have cycles |
| Not handling unbalanced trees | Worst case: O(n) if tree is skewed like linked list |
| Forgetting base cases in recursion | Always handle null nodes |
| Wrong traversal order | Memorize: In/Pre/Post = different orders |

---

## Day 10-11: Graphs

**Status**: ⚪ **COMING SOON** | **Difficulty**: 🔴 **Hard** | **File**: `Day10Graph.java`

### 🎯 What You'll Learn
- Model real-world problems as **graphs**
- Master **graph representations**: adjacency matrix & adjacency list
- Implement **DFS (Depth-First Search)** and **BFS (Breadth-First Search)**
- Find shortest paths with **Dijkstra's algorithm**
- Detect cycles and strongly connected components

### 📚 Concepts Explained

#### What is a Graph?

A **set of nodes (vertices) connected by edges**. Think of a **road network** where cities are nodes and roads are edges.

```
    A ─── B
    │     │
    │     │
    C ─── D

Nodes: {A, B, C, D}
Edges: {A-B, A-C, B-D, C-D}
```

**Types of Graphs:**
- 🔗 **Undirected**: Edges work both ways (roads)
- 🔀 **Directed**: Edges have direction (one-way streets)
- 🪜 **Weighted**: Edges have values (distance, cost)
- 🔀 **Cyclic**: Contains cycles (A→B→C→A)
- 🌳 **Acyclic**: No cycles (trees are acyclic graphs!)

---

#### Graph Representations

**Adjacency Matrix** (2D array):
```
    A  B  C  D
A [ 0  1  1  0 ]
B [ 1  0  0  1 ]
C [ 1  0  0  1 ]
D [ 0  1  1  0 ]

Pros: Fast lookup, dense graphs
Cons: Uses O(n²) space
```

**Adjacency List** (HashMap/LinkedList):
```
A → [B, C]
B → [A, D]
C → [A, D]
D → [B, C]

Pros: Space-efficient for sparse graphs
Cons: Slower lookup
```

---

### 💻 Key Algorithms

#### DFS (Depth-First Search) - Go Deep!
```java
public void dfs(Node node, HashSet<Node> visited) {
    // Time: O(V + E) | Space: O(V) for recursion stack
    
    visited.add(node);
    System.out.println(node.value);  // Process node
    
    for (Node neighbor : node.neighbors) {
        if (!visited.contains(neighbor)) {
            dfs(neighbor, visited);  // Recursive call
        }
    }
}

// Traversal: A → B → D → C (go deep first)
```

#### BFS (Breadth-First Search) - Go Wide!
```java
public void bfs(Node start) {
    // Time: O(V + E) | Space: O(V) for queue
    
    Queue<Node> queue = new LinkedList<>();
    HashSet<Node> visited = new HashSet<>();
    
    queue.add(start);
    visited.add(start);
    
    while (!queue.isEmpty()) {
        Node node = queue.poll();
        System.out.println(node.value);  // Process
        
        for (Node neighbor : node.neighbors) {
            if (!visited.contains(neighbor)) {
                queue.add(neighbor);
                visited.add(neighbor);
            }
        }
    }
}

// Traversal: A → B C → D (go wide first)
```

---

### 🎨 Visual Example: DFS vs BFS

```
Graph:
        A
       ↙ ↘
      B   C
      ↓   ↓
      D   E

DFS: A → B → D, backtrack → C → E
Order: A, B, D, C, E (explores deep before wide)

BFS: A → B, C → D, E
Order: A, B, C, D, E (explores level by level)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Implement graph using adjacency list
2. Implement DFS traversal
3. Implement BFS traversal

**🟡 Medium**
4. Number of islands problem
5. Detect cycle in undirected graph
6. Path exists between two nodes

**🔴 Hard**
7. Dijkstra's shortest path algorithm
8. Topological sort
9. Strongly connected components (Kosaraju's algorithm)

---

## Day 12: Dynamic Programming

**Status**: ⚪ **COMING SOON** | **Difficulty**: 🔴 **Hard** | **File**: `Day12DP.java`

### 🎯 What You'll Learn
- Understand **optimal substructure** and **overlapping subproblems**
- Master **memoization** (top-down DP) vs **tabulation** (bottom-up DP)
- Solve classic DP problems: Fibonacci, LCS, knapsack, coin change
- Recognize when to apply DP (interview questions!)
- Optimize exponential algorithms to polynomial time!

### 📚 Concepts Explained

#### What is Dynamic Programming?

**DP = Breaking a problem into overlapping subproblems and storing results to avoid recomputation.**

Think of it like doing homework:
```
❌ Naive: Solve same problem multiple times
✅ Smart: Solve once, write down answer, reuse!
```

---

#### When to Use DP?

Ask yourself:
1. **Can I break this into smaller subproblems?** → YES
2. **Do those subproblems repeat?** → YES
3. **Can I build up from small solutions?** → YES

Then: **Use DP!** 🚀

---

#### Example: Fibonacci

```
❌ Naive Recursion (SLOW - O(2^n)):
fib(5) = fib(4) + fib(3)
       = (fib(3) + fib(2)) + (fib(2) + fib(1))
       = (fib(2) + fib(1) + fib(2)) + ...
       
Notice: fib(2), fib(3) computed MULTIPLE TIMES! 🔴

✅ DP with Memoization (FAST - O(n)):
Remember: fib(2) = 1 (computed once)
When we need fib(2) again, just look it up! ✅

Or DP with Tabulation (build bottom-up):
fib[0] = 0
fib[1] = 1
fib[2] = fib[1] + fib[0] = 1
fib[3] = fib[2] + fib[1] = 2
fib[4] = fib[3] + fib[2] = 3
fib[5] = fib[4] + fib[3] = 5
```

---

### 💻 Two Approaches

#### Approach 1: Memoization (Top-Down)
```java
public long fib(int n, Map<Integer, Long> memo) {
    // Time: O(n) | Space: O(n)
    
    if (n <= 1) return n;
    if (memo.containsKey(n)) return memo.get(n);  // Lookup
    
    long result = fib(n - 1, memo) + fib(n - 2, memo);
    memo.put(n, result);  // Store for later
    return result;
}
```

#### Approach 2: Tabulation (Bottom-Up)
```java
public long fib(int n) {
    // Time: O(n) | Space: O(n)
    
    if (n <= 1) return n;
    long[] dp = new long[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];  // Build from previous
    }
    return dp[n];
}
```

---

### 🎨 DP Problem Patterns

**Pattern 1: Max/Min Optimization**
```
Example: Max sum of non-adjacent elements
dp[i] = max(dp[i-1], dp[i-2] + arr[i])
```

**Pattern 2: Counting**
```
Example: Number of ways to climb stairs
dp[i] = dp[i-1] + dp[i-2]  (1-step or 2-step)
```

**Pattern 3: Game Theory**
```
Example: Can player 1 win?
dp[i][j] = (player can make winning move)
```

---

### 🧪 Practice Problems

**🟢 Easy**
1. Fibonacci sequence
2. Climbing stairs (how many ways to reach top)
3. House robber (max money, can't rob adjacent)

**🟡 Medium**
4. Longest common subsequence (LCS)
5. 0/1 Knapsack problem
6. Coin change (minimum coins)

**🔴 Hard**
7. Matrix chain multiplication
8. Longest increasing subsequence
9. Edit distance (Levenshtein distance)

---

### ⚠️ Common Mistakes

| ❌ Mistake | ✅ Solution |
|-----------|-----------|
| Using DP when unnecessary | DP has overhead; only use if overlapping subproblems exist |
| Wrong base cases | Incorrect base cases = incorrect results; test carefully |
| Not storing computed results | Defeats the purpose of DP! Use memo/dp array |
| Mixing up indices | Off-by-one errors are common; trace through examples |

---

### 📌 Key Takeaways

💡 **DP = Optimization**: Transform exponential into polynomial  
💡 **Two Approaches**: Memoization (top-down) vs Tabulation (bottom-up)  
💡 **Recognize Patterns**: Overlapping subproblems = Consider DP  
💡 **Interview Favorite**: DP questions separate good from great developers  

---

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
