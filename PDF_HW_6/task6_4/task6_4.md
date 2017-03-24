<h1 align = "center">Task 4. Collections using</h1>
<table align = "center"  border="1">
   <tr align = "center">
      <td><b>Name</b></td>
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
</table>