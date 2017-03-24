<h1 align = "center">Task 4. Collections using</h1>
<table align = "center"  border="1">
   <tr align = "center">
      <td><b>Interface</b></td>
      <td><b>Functionality</b></td>
      <td><b>Examples</b></td>
   </tr>
   <tr>
      <td>Set</td>
      <td>
         <table border="1">
            <tr>
               <th class="colFirst" scope="col">Modifier and Type</th>
               <th class="colLast" scope="col">Method and Description</th>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#add(E)">add</a></strong>(<a href="../../java/util/Set.html" title="type parameter in Set">E</a>&nbsp;e)</code>
                  <div class="block">Adds the specified element to this set if it is not already present
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#addAll(java.util.Collection)">addAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;? extends <a href="../../java/util/Set.html" title="type parameter in Set">E</a>&gt;&nbsp;c)</code>
                  <div class="block">Adds all of the elements in the specified collection to this set if
                     they're not already present (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>void</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#clear()">clear</a></strong>()</code>
                  <div class="block">Removes all of the elements from this set (optional operation).</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#contains(java.lang.Object)">contains</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Returns <tt>true</tt> if this set contains the specified element.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#containsAll(java.util.Collection)">containsAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Returns <tt>true</tt> if this set contains all of the elements of the
                     specified collection.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#equals(java.lang.Object)">equals</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Compares the specified object with this set for equality.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#hashCode()">hashCode</a></strong>()</code>
                  <div class="block">Returns the hash code value for this set.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#isEmpty()">isEmpty</a></strong>()</code>
                  <div class="block">Returns <tt>true</tt> if this set contains no elements.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/Iterator.html" title="interface in java.util">Iterator</a>&lt;<a href="../../java/util/Set.html" title="type parameter in Set">E</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#iterator()">iterator</a></strong>()</code>
                  <div class="block">Returns an iterator over the elements in this set.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#remove(java.lang.Object)">remove</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Removes the specified element from this set if it is present
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#removeAll(java.util.Collection)">removeAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Removes from this set all of its elements that are contained in the
                     specified collection (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#retainAll(java.util.Collection)">retainAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Retains only the elements in this set that are contained in the
                     specified collection (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#size()">size</a></strong>()</code>
                  <div class="block">Returns the number of elements in this set (its cardinality).</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/lang/Object.html" title="class in java.lang">Object</a>[]</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#toArray()">toArray</a></strong>()</code>
                  <div class="block">Returns an array containing all of the elements in this set.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>&lt;T&gt;&nbsp;T[]</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Set.html#toArray(T[])">toArray</a></strong>(T[]&nbsp;a)</code>
                  <div class="block">Returns an array containing all of the elements in this set; the
                     runtime type of the returned array is that of the specified array.
                  </div>
               </td>
            </tr>
         </table>
      </td>
      <td>A collection that contains no duplicate elements.</td>
   </tr>
   <tr>
      <td>
         List
      </td>
      <td>
         <table border="1">
            <tr>
               <th class="colFirst" scope="col">Modifier and Type</th>
               <th class="colLast" scope="col">Method and Description</th>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#add(E)">add</a></strong>(<a href="../../java/util/List.html" title="type parameter in List">E</a>&nbsp;e)</code>
                  <div class="block">Appends the specified element to the end of this list (optional
                     operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>void</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#add(int,%20E)">add</a></strong>(int&nbsp;index,
                  <a href="../../java/util/List.html" title="type parameter in List">E</a>&nbsp;element)</code>
                  <div class="block">Inserts the specified element at the specified position in this list
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#addAll(java.util.Collection)">addAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;? extends <a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;&nbsp;c)</code>
                  <div class="block">Appends all of the elements in the specified collection to the end of
                     this list, in the order that they are returned by the specified
                     collection's iterator (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#addAll(int,%20java.util.Collection)">addAll</a></strong>(int&nbsp;index,
                  <a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;? extends <a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;&nbsp;c)</code>
                  <div class="block">Inserts all of the elements in the specified collection into this
                     list at the specified position (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>void</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#clear()">clear</a></strong>()</code>
                  <div class="block">Removes all of the elements from this list (optional operation).</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#contains(java.lang.Object)">contains</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Returns <tt>true</tt> if this list contains the specified element.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#containsAll(java.util.Collection)">containsAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Returns <tt>true</tt> if this list contains all of the elements of the
                     specified collection.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#equals(java.lang.Object)">equals</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Compares the specified object with this list for equality.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/List.html" title="type parameter in List">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#get(int)">get</a></strong>(int&nbsp;index)</code>
                  <div class="block">Returns the element at the specified position in this list.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#hashCode()">hashCode</a></strong>()</code>
                  <div class="block">Returns the hash code value for this list.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#indexOf(java.lang.Object)">indexOf</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Returns the index of the first occurrence of the specified element
                     in this list, or -1 if this list does not contain the element.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#isEmpty()">isEmpty</a></strong>()</code>
                  <div class="block">Returns <tt>true</tt> if this list contains no elements.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/Iterator.html" title="interface in java.util">Iterator</a>&lt;<a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#iterator()">iterator</a></strong>()</code>
                  <div class="block">Returns an iterator over the elements in this list in proper sequence.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#lastIndexOf(java.lang.Object)">lastIndexOf</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Returns the index of the last occurrence of the specified element
                     in this list, or -1 if this list does not contain the element.
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/ListIterator.html" title="interface in java.util">ListIterator</a>&lt;<a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#listIterator()">listIterator</a></strong>()</code>
                  <div class="block">Returns a list iterator over the elements in this list (in proper
                     sequence).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/ListIterator.html" title="interface in java.util">ListIterator</a>&lt;<a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#listIterator(int)">listIterator</a></strong>(int&nbsp;index)</code>
                  <div class="block">Returns a list iterator over the elements in this list (in proper
                     sequence), starting at the specified position in the list.
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/List.html" title="type parameter in List">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#remove(int)">remove</a></strong>(int&nbsp;index)</code>
                  <div class="block">Removes the element at the specified position in this list (optional
                     operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#remove(java.lang.Object)">remove</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Removes the first occurrence of the specified element from this list,
                     if it is present (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#removeAll(java.util.Collection)">removeAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Removes from this list all of its elements that are contained in the
                     specified collection (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#retainAll(java.util.Collection)">retainAll</a></strong>(<a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;?&gt;&nbsp;c)</code>
                  <div class="block">Retains only the elements in this list that are contained in the
                     specified collection (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/List.html" title="type parameter in List">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#set(int,%20E)">set</a></strong>(int&nbsp;index,
                  <a href="../../java/util/List.html" title="type parameter in List">E</a>&nbsp;element)</code>
                  <div class="block">Replaces the element at the specified position in this list with the
                     specified element (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#size()">size</a></strong>()</code>
                  <div class="block">Returns the number of elements in this list.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/List.html" title="interface in java.util">List</a>&lt;<a href="../../java/util/List.html" title="type parameter in List">E</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#subList(int,%20int)">subList</a></strong>(int&nbsp;fromIndex,
                  int&nbsp;toIndex)</code>
                  <div class="block">Returns a view of the portion of this list between the specified
                     <tt>fromIndex</tt>, inclusive, and <tt>toIndex</tt>, exclusive.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/lang/Object.html" title="class in java.lang">Object</a>[]</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#toArray()">toArray</a></strong>()</code>
                  <div class="block">Returns an array containing all of the elements in this list in proper
                     sequence (from first to last element).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>&lt;T&gt;&nbsp;T[]</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/List.html#toArray(T[])">toArray</a></strong>(T[]&nbsp;a)</code>
                  <div class="block">Returns an array containing all of the elements in this list in
                     proper sequence (from first to last element); the runtime type of
                     the returned array is that of the specified array.
                  </div>
               </td>
            </tr>
         </table>
      </td>
      <td>
         An ordered collection (also known as a sequence).<br>
         The user of this interface has precise control over where in the list each element is inserted.<br>
         The user can access elements by their integer index (position in the list), and search for elements in the list.
      </td>
   </tr>
   <tr>
      <td>
         Queqe
      </td>
      <td>
         <table border = "1">
            <tr>
               <th class="colFirst" scope="col">Modifier and Type</th>
               <th class="colLast" scope="col">Method and Description</th>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#add(E)">add</a></strong>(<a href="../../java/util/Queue.html" title="type parameter in Queue">E</a>&nbsp;e)</code>
                  <div class="block">Inserts the specified element into this queue if it is possible to do so
                     immediately without violating capacity restrictions, returning
                     <tt>true</tt> upon success and throwing an <tt>IllegalStateException</tt>
                     if no space is currently available.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Queue.html" title="type parameter in Queue">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#element()">element</a></strong>()</code>
                  <div class="block">Retrieves, but does not remove, the head of this queue.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#offer(E)">offer</a></strong>(<a href="../../java/util/Queue.html" title="type parameter in Queue">E</a>&nbsp;e)</code>
                  <div class="block">Inserts the specified element into this queue if it is possible to do
                     so immediately without violating capacity restrictions.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Queue.html" title="type parameter in Queue">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#peek()">peek</a></strong>()</code>
                  <div class="block">Retrieves, but does not remove, the head of this queue,
                     or returns <tt>null</tt> if this queue is empty.
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/Queue.html" title="type parameter in Queue">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#poll()">poll</a></strong>()</code>
                  <div class="block">Retrieves and removes the head of this queue,
                     or returns <tt>null</tt> if this queue is empty.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Queue.html" title="type parameter in Queue">E</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Queue.html#remove()">remove</a></strong>()</code>
                  <div class="block">Retrieves and removes the head of this queue.</div>
               </td>
            </tr>
         </table>
      </td>
      <td>
         A collection designed for holding elements prior to processing.
      </td>
   </tr>
   <tr>
      <td>Map</td>
      <td>
         <table border = "1">
            <tr>
               <th class="colFirst" scope="col">Modifier and Type</th>
               <th class="colLast" scope="col">Method and Description</th>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>void</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#clear()">clear</a></strong>()</code>
                  <div class="block">Removes all of the mappings from this map (optional operation).</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#containsKey(java.lang.Object)">containsKey</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;key)</code>
                  <div class="block">Returns <tt>true</tt> if this map contains a mapping for the specified
                     key.
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#containsValue(java.lang.Object)">containsValue</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;value)</code>
                  <div class="block">Returns <tt>true</tt> if this map maps one or more keys to the
                     specified value.
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Set.html" title="interface in java.util">Set</a>&lt;<a href="../../java/util/Map.Entry.html" title="interface in java.util">Map.Entry</a>&lt;<a href="../../java/util/Map.html" title="type parameter in Map">K</a>,<a href="../../java/util/Map.html" title="type parameter in Map">V</a>&gt;&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#entrySet()">entrySet</a></strong>()</code>
                  <div class="block">Returns a <a href="../../java/util/Set.html" title="interface in java.util"><code>Set</code></a> view of the mappings contained in this map.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#equals(java.lang.Object)">equals</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;o)</code>
                  <div class="block">Compares the specified object with this map for equality.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Map.html" title="type parameter in Map">V</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#get(java.lang.Object)">get</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;key)</code>
                  <div class="block">Returns the value to which the specified key is mapped,
                     or <code>null</code> if this map contains no mapping for the key.
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#hashCode()">hashCode</a></strong>()</code>
                  <div class="block">Returns the hash code value for this map.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code>boolean</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#isEmpty()">isEmpty</a></strong>()</code>
                  <div class="block">Returns <tt>true</tt> if this map contains no key-value mappings.</div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code><a href="../../java/util/Set.html" title="interface in java.util">Set</a>&lt;<a href="../../java/util/Map.html" title="type parameter in Map">K</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#keySet()">keySet</a></strong>()</code>
                  <div class="block">Returns a <a href="../../java/util/Set.html" title="interface in java.util"><code>Set</code></a> view of the keys contained in this map.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Map.html" title="type parameter in Map">V</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#put(K,%20V)">put</a></strong>(<a href="../../java/util/Map.html" title="type parameter in Map">K</a>&nbsp;key,
                  <a href="../../java/util/Map.html" title="type parameter in Map">V</a>&nbsp;value)</code>
                  <div class="block">Associates the specified value with the specified key in this map
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>void</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#putAll(java.util.Map)">putAll</a></strong>(<a href="../../java/util/Map.html" title="interface in java.util">Map</a>&lt;? extends <a href="../../java/util/Map.html" title="type parameter in Map">K</a>,? extends <a href="../../java/util/Map.html" title="type parameter in Map">V</a>&gt;&nbsp;m)</code>
                  <div class="block">Copies all of the mappings from the specified map to this map
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Map.html" title="type parameter in Map">V</a></code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#remove(java.lang.Object)">remove</a></strong>(<a href="../../java/lang/Object.html" title="class in java.lang">Object</a>&nbsp;key)</code>
                  <div class="block">Removes the mapping for a key from this map if it is present
                     (optional operation).
                  </div>
               </td>
            </tr>
            <tr class="altColor">
               <td class="colFirst"><code>int</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#size()">size</a></strong>()</code>
                  <div class="block">Returns the number of key-value mappings in this map.</div>
               </td>
            </tr>
            <tr class="rowColor">
               <td class="colFirst"><code><a href="../../java/util/Collection.html" title="interface in java.util">Collection</a>&lt;<a href="../../java/util/Map.html" title="type parameter in Map">V</a>&gt;</code></td>
               <td class="colLast">
                  <code><strong><a href="../../java/util/Map.html#values()">values</a></strong>()</code>
                  <div class="block">Returns a <a href="../../java/util/Collection.html" title="interface in java.util"><code>Collection</code></a> view of the values contained in this map.</div>
               </td>
            </tr>
         </table>
      </td>
      <td>An object that maps keys to values.<br>
         A map cannot contain duplicate keys; each key can map to at most one value.
      </td>
   </tr>
</table>